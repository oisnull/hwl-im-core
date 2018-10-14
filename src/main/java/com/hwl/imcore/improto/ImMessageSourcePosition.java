// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf enum {@code ImMessageSourcePosition}
 */
public enum ImMessageSourcePosition
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>None = 0;</code>
   */
  None(0),
  /**
   * <code>RealTime = 1;</code>
   */
  RealTime(1),
  /**
   * <code>Offline = 2;</code>
   */
  Offline(2),
  /**
   * <code>Retry = 3;</code>
   */
  Retry(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>None = 0;</code>
   */
  public static final int None_VALUE = 0;
  /**
   * <code>RealTime = 1;</code>
   */
  public static final int RealTime_VALUE = 1;
  /**
   * <code>Offline = 2;</code>
   */
  public static final int Offline_VALUE = 2;
  /**
   * <code>Retry = 3;</code>
   */
  public static final int Retry_VALUE = 3;


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
  public static ImMessageSourcePosition valueOf(int value) {
    return forNumber(value);
  }

  public static ImMessageSourcePosition forNumber(int value) {
    switch (value) {
      case 0: return None;
      case 1: return RealTime;
      case 2: return Offline;
      case 3: return Retry;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImMessageSourcePosition>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ImMessageSourcePosition> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ImMessageSourcePosition>() {
          public ImMessageSourcePosition findValueByNumber(int number) {
            return ImMessageSourcePosition.forNumber(number);
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
    return com.hwl.imcore.improto.ImMessage.getDescriptor().getEnumTypes().get(2);
  }

  private static final ImMessageSourcePosition[] VALUES = values();

  public static ImMessageSourcePosition valueOf(
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

  private ImMessageSourcePosition(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ImMessageSourcePosition)
}
