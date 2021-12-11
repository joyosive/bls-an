/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package supranational.blst;

public class Pairing {
  private transient long[] swigCPtr;

  protected Pairing(long[] cPtr) { swigCPtr = cPtr; }

  protected static long[] getCPtr(Pairing obj) {
    return obj != null ? obj.swigCPtr : null;
  }

  public Pairing dup() { return new Pairing(swigCPtr.clone()); }

  public BLST_ERROR aggregate(P1_Affine pk, P2_Affine sig, byte[] msg, byte[] aug) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_aggregate__SWIG_0(swigCPtr, P1_Affine.getCPtr(pk), P2_Affine.getCPtr(sig), msg, aug));
  }

  public BLST_ERROR aggregate(P1_Affine pk, P2_Affine sig, byte[] msg) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_aggregate__SWIG_2(swigCPtr, P1_Affine.getCPtr(pk), P2_Affine.getCPtr(sig), msg));
  }

  public BLST_ERROR aggregate(P2_Affine pk, P1_Affine sig, byte[] msg, byte[] aug) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_aggregate__SWIG_3(swigCPtr, P2_Affine.getCPtr(pk), P1_Affine.getCPtr(sig), msg, aug));
  }

  public BLST_ERROR aggregate(P2_Affine pk, P1_Affine sig, byte[] msg) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_aggregate__SWIG_5(swigCPtr, P2_Affine.getCPtr(pk), P1_Affine.getCPtr(sig), msg));
  }

  public BLST_ERROR mul_n_aggregate(P1_Affine pk, P2_Affine sig, java.math.BigInteger scalar, byte[] msg, byte[] aug) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_mul_n_aggregate__SWIG_0(swigCPtr, P1_Affine.getCPtr(pk), P2_Affine.getCPtr(sig), scalar.toByteArray(), msg, aug));
  }

  public BLST_ERROR mul_n_aggregate(P1_Affine pk, P2_Affine sig, java.math.BigInteger scalar, byte[] msg) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_mul_n_aggregate__SWIG_2(swigCPtr, P1_Affine.getCPtr(pk), P2_Affine.getCPtr(sig), scalar.toByteArray(), msg));
  }

  public BLST_ERROR mul_n_aggregate(P2_Affine pk, P1_Affine sig, java.math.BigInteger scalar, byte[] msg, byte[] aug) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_mul_n_aggregate__SWIG_3(swigCPtr, P2_Affine.getCPtr(pk), P1_Affine.getCPtr(sig), scalar.toByteArray(), msg, aug));
  }

  public BLST_ERROR mul_n_aggregate(P2_Affine pk, P1_Affine sig, java.math.BigInteger scalar, byte[] msg) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_mul_n_aggregate__SWIG_5(swigCPtr, P2_Affine.getCPtr(pk), P1_Affine.getCPtr(sig), scalar.toByteArray(), msg));
  }

  public void commit() {
    blstJNI.Pairing_commit(swigCPtr);
  }

  public BLST_ERROR merge(Pairing ctx) {
    return BLST_ERROR.swigToEnum(blstJNI.Pairing_merge(swigCPtr, Pairing.getCPtr(ctx)));
  }

  public boolean finalverify(PT sig) {
    return blstJNI.Pairing_finalverify__SWIG_0(swigCPtr, PT.getCPtr(sig));
  }

  public boolean finalverify() {
    return blstJNI.Pairing_finalverify__SWIG_1(swigCPtr);
  }

  public Pairing(boolean hash_or_encode, String DST) { this(blstJNI.new_Pairing(hash_or_encode, DST)); }

}
