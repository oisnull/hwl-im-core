// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * <pre>
 *near circle operate message
 * </pre>
 *
 * Protobuf enum {@code ImNearCircleOperateType}
 */
public enum ImNearCircleOperateType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>NearCircleOperateNone = 0;</code>
   */
  NearCircleOperateNone(0),
  /**
   * <code>AddLike = 1;</code>
   */
  AddLike(1),
  /**
   * <code>CancelLike = 2;</code>
   */
  CancelLike(2),
  /**
   * <code>PostComment = 3;</code>
   */
  PostComment(3),
  /**
   * <code>CancelComment = 4;</code>
   */
  CancelComment(4),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>NearCircleOperateNone = 0;</code>
   */
  public static final int NearCircleOperateNone_VALUE = 0;
  /**
   * <code>AddLike = 1;</code>
   */
  public static final int AddLike_VALUE = 1;
  /**
   * <code>CancelLike = 2;</code>
   */
  public static final int CancelLike_VALUE = 2;
  /**
   * <code>PostComment = 3;</code>
   */
  public static final int PostComment_VALUE = 3;
  /**
   * <code>CancelComment = 4;</code>
   */
  public static final int CancelComment_VALUE = 4;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ImNearCircleOperateType valueOf(int value) {
    return forNumber(value);
  }

  public static ImNearCircleOperateType forNumber(int value) {
    switch (value) {
      case 0: return NearCircleOperateNone;
      case 1: return AddLike;
      case 2: return CancelLike;
      case 3: return PostComment;
      case 4: return CancelComment;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImNearCircleOperateType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImNearCircleOperateType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImNearCircleOperateType>() {
          public ImNearCircleOperateType findValueByNumber(int number) {
            return ImNearCircleOperateType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.hwl.imcore.improto.ImMessage.getDescriptor().getEnumTypes().get(5);
  }

  private static final ImNearCircleOperateType[] VALUES = values();

  public static ImNearCircleOperateType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ImNearCircleOperateType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ImNearCircleOperateType)
}
