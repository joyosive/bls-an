package com.dandelion.blssecurity;


import supranational.blst.*;


public class Runnable {
    public static String secure() {

        final byte[] msg = "assertion".getBytes();
        final String DST = "MY-DST";

        SecretKey SK = new SecretKey();
//        SK.keygen("*".repeat(32).getBytes());
        SK.keygen("********************************".getBytes());

        // generate public key and serialize it...
        P1 pk_ = new P1(SK);
        byte[] pk_for_wire = pk_.serialize();

        // sign |msg| and serialize the signature...
        P2 sig_ = new P2();
        byte[] sig_for_wire = sig_.hash_to(msg, DST, pk_for_wire)
                .sign_with(SK)
                .serialize();

        // now on "receiving" side, start with deserialization...
        P2_Affine _sig = new P2_Affine(sig_for_wire);
        P1_Affine _pk = new P1_Affine(pk_for_wire);
        if (!_pk.in_group())
            throw new RuntimeException("disaster");
        Pairing ctx = new Pairing(true, DST);
        ctx.aggregate(_pk, _sig, msg, pk_for_wire);
        ctx.commit();
        if (!ctx.finalverify())
            throw new RuntimeException("disaster");
        System.out.println("OK");
        return "OK";
    }

    // helpers...
    final protected static char[] HEXARRAY = "0123456789abcdef".toCharArray();

    protected static String toHexString(byte[] bytes) {
        char[] hexChars = new char[bytes.length<<1];

        for (int j = 0, k = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[k++] = HEXARRAY[v >>> 4];
            hexChars[k++] = HEXARRAY[v & 0x0F];
        }

        return new String(hexChars);
    }

    protected static int fromHexChar(char c) {
        if      (c>='0' && c<='9')  return c - '0';
        else if (c>='a' && c<='f')  return c - 'a' + 10;
        else if (c>='A' && c<='F')  return c - 'A' + 10;
        throw new IndexOutOfBoundsException("non-hex character");
    }

    protected static byte[] fromHexString(String str) {
        byte[] bytes = new byte[str.length() >>> 1];

        for (int j = 0, k = 0; j < bytes.length; j++) {
            int hi = fromHexChar(str.charAt(k++));
            int lo = fromHexChar(str.charAt(k++));
            bytes[j] = (byte)((hi << 4) | lo);
        }

        return bytes;
    }

}
