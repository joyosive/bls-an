/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package supranational.blst;

public class SecretKey {
  private transient long[] swigCPtr;

  protected SecretKey(long[] cPtr) { swigCPtr = cPtr; }

  protected static long[] getCPtr(SecretKey obj) {
    return obj != null ? obj.swigCPtr : null;
  }

  public SecretKey dup() { return new SecretKey(swigCPtr.clone()); }

  public void keygen(byte[] IKM, String info) {
    blstJNI.SecretKey_keygen__SWIG_0(swigCPtr, IKM, info);
  }

  public void keygen(byte[] IKM) {
    blstJNI.SecretKey_keygen__SWIG_1(swigCPtr, IKM);
  }

  public void from_bendian(byte[] in) {
    blstJNI.SecretKey_from_bendian(swigCPtr, in);
  }

  public void from_lendian(byte[] in) {
    blstJNI.SecretKey_from_lendian(swigCPtr, in);
  }

  public byte[] to_bendian() { return blstJNI.SecretKey_to_bendian(swigCPtr); }

  public byte[] to_lendian() { return blstJNI.SecretKey_to_lendian(swigCPtr); }

  public SecretKey() { this(blstJNI.new_SecretKey()); }

}
