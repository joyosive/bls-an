/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package supranational.blst;

import java.io.*;
import java.nio.file.*;

public class blstJNI {

    final static String libName = System.mapLibraryName("blst");
    final static String resName = System.getProperty("os.name").replaceFirst(" .*","")
                                + "/" + System.getProperty("os.arch")
                                + "/" + libName;
    static {
        InputStream res = blstJNI.class.getResourceAsStream(resName);
        if (res == null) {
            try {
                System.loadLibrary("blst");
            } catch (UnsatisfiedLinkError e) {
                String[] cmd = System.getProperty("sun.java.command").split("/");
        	if (!"blstJNI".equals(cmd[cmd.length-1]))
                    // suppress exception if 'main' below is executed
                    throw new RuntimeException(e.getMessage());
	    }
        } else {
            // unpack shared library into a temporary directory and load it
            try {
                Path tmpdir = Files.createTempDirectory("blst@");
                tmpdir.toFile().deleteOnExit();
                Path tmpdll = Paths.get(tmpdir.toString(), libName);
                tmpdll.toFile().deleteOnExit();
                Files.copy(res, tmpdll, StandardCopyOption.REPLACE_EXISTING);
                res.close();
                System.load(tmpdll.toString());
            } catch (IOException e) {
                throw new RuntimeException(e.getMessage());
            }
        }
    }
    public static void main(String argv[]) {
        System.out.println(resName);
    }

  public final static native void SecretKey_keygen__SWIG_0(long[] jarg1, byte[] jarg2, String jarg4);
  public final static native void SecretKey_keygen__SWIG_1(long[] jarg1, byte[] jarg2);
  public final static native void SecretKey_from_bendian(long[] jarg1, byte[] jarg2);
  public final static native void SecretKey_from_lendian(long[] jarg1, byte[] jarg2);
  public final static native byte[] SecretKey_to_bendian(long[] jarg1);
  public final static native byte[] SecretKey_to_lendian(long[] jarg1);
  public final static native long[] new_SecretKey();
  public final static native long[] new_Scalar__SWIG_0();
  public final static native long[] new_Scalar__SWIG_1(byte[] jarg1);
  public final static native void Scalar_from_bendian(long[] jarg1, byte[] jarg2);
  public final static native void Scalar_from_lendian(long[] jarg1, byte[] jarg2);
  public final static native byte[] Scalar_to_bendian(long[] jarg1);
  public final static native byte[] Scalar_to_lendian(long[] jarg1);
  public final static native void Scalar_add__SWIG_0(long[] jarg1, long[] jarg2);
  public final static native void Scalar_add__SWIG_1(long[] jarg1, long[] jarg2);
  public final static native void Scalar_sub(long[] jarg1, long[] jarg2);
  public final static native void Scalar_mul(long[] jarg1, long[] jarg2);
  public final static native void Scalar_inverse(long[] jarg1);
  public final static native long[] new_P1_Affine__SWIG_0();
  public final static native long[] new_P1_Affine__SWIG_1(byte[] jarg1);
  public final static native long[] new_P1_Affine__SWIG_2(long[] jarg1);
  public final static native long[] P1_Affine_to_jacobian(long[] jarg1);
  public final static native byte[] P1_Affine_serialize(long[] jarg1);
  public final static native byte[] P1_Affine_compress(long[] jarg1);
  public final static native boolean P1_Affine_on_curve(long[] jarg1);
  public final static native boolean P1_Affine_in_group(long[] jarg1);
  public final static native boolean P1_Affine_is_inf(long[] jarg1);
  public final static native boolean P1_Affine_is_equal(long[] jarg1, long[] jarg2);
  public final static native int P1_Affine_core_verify__SWIG_0(long[] jarg1, long[] jarg2, boolean jarg3, byte[] jarg4, String jarg6, byte[] jarg7);
  public final static native int P1_Affine_core_verify__SWIG_2(long[] jarg1, long[] jarg2, boolean jarg3, byte[] jarg4, String jarg6);
  public final static native int P1_Affine_core_verify__SWIG_3(long[] jarg1, long[] jarg2, boolean jarg3, byte[] jarg4);
  public final static native long[] P1_Affine_generator();
  public final static native long[] new_P1__SWIG_0();
  public final static native long[] new_P1__SWIG_1(long[] jarg1);
  public final static native long[] new_P1__SWIG_2(byte[] jarg1);
  public final static native long[] new_P1__SWIG_3(long[] jarg1);
  public final static native long[] P1_to_affine(long[] jarg1);
  public final static native byte[] P1_serialize(long[] jarg1);
  public final static native byte[] P1_compress(long[] jarg1);
  public final static native boolean P1_on_curve(long[] jarg1);
  public final static native boolean P1_in_group(long[] jarg1);
  public final static native boolean P1_is_inf(long[] jarg1);
  public final static native boolean P1_is_equal(long[] jarg1, long[] jarg2);
  public final static native void P1_aggregate(long[] jarg1, long[] jarg2);
  public final static native void P1_sign_with__SWIG_0(long[] jarg1, long[] jarg2);
  public final static native void P1_sign_with__SWIG_1(long[] jarg1, long[] jarg2);
  public final static native void P1_hash_to__SWIG_0(long[] jarg1, byte[] jarg2, String jarg4, byte[] jarg5);
  public final static native void P1_hash_to__SWIG_2(long[] jarg1, byte[] jarg2, String jarg4);
  public final static native void P1_hash_to__SWIG_3(long[] jarg1, byte[] jarg2);
  public final static native void P1_encode_to__SWIG_0(long[] jarg1, byte[] jarg2, String jarg4, byte[] jarg5);
  public final static native void P1_encode_to__SWIG_2(long[] jarg1, byte[] jarg2, String jarg4);
  public final static native void P1_encode_to__SWIG_3(long[] jarg1, byte[] jarg2);
  public final static native void P1_mult__SWIG_0(long[] jarg1, byte[] jarg2);
  public final static native void P1_mult__SWIG_1(long[] jarg1, long[] jarg2);
  public final static native void P1_cneg(long[] jarg1, boolean jarg2);
  public final static native void P1_neg(long[] jarg1);
  public final static native void P1_add__SWIG_0(long[] jarg1, long[] jarg2);
  public final static native void P1_add__SWIG_1(long[] jarg1, long[] jarg2);
  public final static native void P1_dbl(long[] jarg1);
  public final static native long[] P1_generator();
  public final static native long[] new_P2_Affine__SWIG_0();
  public final static native long[] new_P2_Affine__SWIG_1(byte[] jarg1);
  public final static native long[] new_P2_Affine__SWIG_2(long[] jarg1);
  public final static native long[] P2_Affine_to_jacobian(long[] jarg1);
  public final static native byte[] P2_Affine_serialize(long[] jarg1);
  public final static native byte[] P2_Affine_compress(long[] jarg1);
  public final static native boolean P2_Affine_on_curve(long[] jarg1);
  public final static native boolean P2_Affine_in_group(long[] jarg1);
  public final static native boolean P2_Affine_is_inf(long[] jarg1);
  public final static native boolean P2_Affine_is_equal(long[] jarg1, long[] jarg2);
  public final static native int P2_Affine_core_verify__SWIG_0(long[] jarg1, long[] jarg2, boolean jarg3, byte[] jarg4, String jarg6, byte[] jarg7);
  public final static native int P2_Affine_core_verify__SWIG_2(long[] jarg1, long[] jarg2, boolean jarg3, byte[] jarg4, String jarg6);
  public final static native int P2_Affine_core_verify__SWIG_3(long[] jarg1, long[] jarg2, boolean jarg3, byte[] jarg4);
  public final static native long[] P2_Affine_generator();
  public final static native long[] new_P2__SWIG_0();
  public final static native long[] new_P2__SWIG_1(long[] jarg1);
  public final static native long[] new_P2__SWIG_2(byte[] jarg1);
  public final static native long[] new_P2__SWIG_3(long[] jarg1);
  public final static native long[] P2_to_affine(long[] jarg1);
  public final static native byte[] P2_serialize(long[] jarg1);
  public final static native byte[] P2_compress(long[] jarg1);
  public final static native boolean P2_on_curve(long[] jarg1);
  public final static native boolean P2_in_group(long[] jarg1);
  public final static native boolean P2_is_inf(long[] jarg1);
  public final static native boolean P2_is_equal(long[] jarg1, long[] jarg2);
  public final static native void P2_aggregate(long[] jarg1, long[] jarg2);
  public final static native void P2_sign_with__SWIG_0(long[] jarg1, long[] jarg2);
  public final static native void P2_sign_with__SWIG_1(long[] jarg1, long[] jarg2);
  public final static native void P2_hash_to__SWIG_0(long[] jarg1, byte[] jarg2, String jarg4, byte[] jarg5);
  public final static native void P2_hash_to__SWIG_2(long[] jarg1, byte[] jarg2, String jarg4);
  public final static native void P2_hash_to__SWIG_3(long[] jarg1, byte[] jarg2);
  public final static native void P2_encode_to__SWIG_0(long[] jarg1, byte[] jarg2, String jarg4, byte[] jarg5);
  public final static native void P2_encode_to__SWIG_2(long[] jarg1, byte[] jarg2, String jarg4);
  public final static native void P2_encode_to__SWIG_3(long[] jarg1, byte[] jarg2);
  public final static native void P2_mult__SWIG_0(long[] jarg1, byte[] jarg2);
  public final static native void P2_mult__SWIG_1(long[] jarg1, long[] jarg2);
  public final static native void P2_cneg(long[] jarg1, boolean jarg2);
  public final static native void P2_neg(long[] jarg1);
  public final static native void P2_add__SWIG_0(long[] jarg1, long[] jarg2);
  public final static native void P2_add__SWIG_1(long[] jarg1, long[] jarg2);
  public final static native void P2_dbl(long[] jarg1);
  public final static native long[] P2_generator();
  public final static native long[] G1();
  public final static native long[] G2();
  public final static native long[] new_PT__SWIG_0(long[] jarg1);
  public final static native long[] new_PT__SWIG_1(long[] jarg1);
  public final static native long[] new_PT__SWIG_2(long[] jarg1, long[] jarg2);
  public final static native boolean PT_is_one(long[] jarg1);
  public final static native boolean PT_is_equal(long[] jarg1, long[] jarg2);
  public final static native void PT_sqr(long[] jarg1);
  public final static native void PT_mul(long[] jarg1, long[] jarg2);
  public final static native void PT_final_exp(long[] jarg1);
  public final static native boolean PT_finalverify(long[] jarg1, long[] jarg2);
  public final static native int Pairing_aggregate__SWIG_0(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4, byte[] jarg6);
  public final static native int Pairing_aggregate__SWIG_2(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4);
  public final static native int Pairing_aggregate__SWIG_3(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4, byte[] jarg6);
  public final static native int Pairing_aggregate__SWIG_5(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4);
  public final static native int Pairing_mul_n_aggregate__SWIG_0(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4, byte[] jarg6, byte[] jarg8);
  public final static native int Pairing_mul_n_aggregate__SWIG_2(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4, byte[] jarg6);
  public final static native int Pairing_mul_n_aggregate__SWIG_3(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4, byte[] jarg6, byte[] jarg8);
  public final static native int Pairing_mul_n_aggregate__SWIG_5(long[] jarg1, long[] jarg2, long[] jarg3, byte[] jarg4, byte[] jarg6);
  public final static native void Pairing_commit(long[] jarg1);
  public final static native int Pairing_merge(long[] jarg1, long[] jarg2);
  public final static native boolean Pairing_finalverify__SWIG_0(long[] jarg1, long[] jarg2);
  public final static native boolean Pairing_finalverify__SWIG_1(long[] jarg1);
  public final static native long[] new_Pairing(boolean jarg1, String jarg2);
  public final static native long[] BLS12_381_G1_get();
  public final static native long[] BLS12_381_NEG_G1_get();
  public final static native long[] BLS12_381_G2_get();
  public final static native long[] BLS12_381_NEG_G2_get();
}
