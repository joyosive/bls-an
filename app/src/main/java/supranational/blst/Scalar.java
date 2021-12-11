/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package supranational.blst;

public class Scalar {
  private transient long[] swigCPtr;

  protected Scalar(long[] cPtr) { swigCPtr = cPtr; }

  protected static long[] getCPtr(Scalar obj) {
    return obj != null ? obj.swigCPtr : null;
  }

  public Scalar dup() { return new Scalar(swigCPtr.clone()); }

  public Scalar() { this(blstJNI.new_Scalar__SWIG_0()); }

  public Scalar(java.math.BigInteger scalar) { this(blstJNI.new_Scalar__SWIG_1(scalar.toByteArray())); }

  public Scalar from_bendian(byte[] msg) { blstJNI.Scalar_from_bendian(swigCPtr, msg); return this; }

  public Scalar from_lendian(byte[] msg) { blstJNI.Scalar_from_lendian(swigCPtr, msg); return this; }

  public byte[] to_bendian() { return blstJNI.Scalar_to_bendian(swigCPtr); }

  public byte[] to_lendian() { return blstJNI.Scalar_to_lendian(swigCPtr); }

  public Scalar add(Scalar a) { blstJNI.Scalar_add__SWIG_0(swigCPtr, Scalar.getCPtr(a)); return this; }

  public Scalar add(SecretKey a) { blstJNI.Scalar_add__SWIG_1(swigCPtr, SecretKey.getCPtr(a)); return this; }

  public Scalar sub(Scalar a) { blstJNI.Scalar_sub(swigCPtr, Scalar.getCPtr(a)); return this; }

  public Scalar mul(Scalar a) { blstJNI.Scalar_mul(swigCPtr, Scalar.getCPtr(a)); return this; }

  public Scalar inverse() { blstJNI.Scalar_inverse(swigCPtr); return this; }

}