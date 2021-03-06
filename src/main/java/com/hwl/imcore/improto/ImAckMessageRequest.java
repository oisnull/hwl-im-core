// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * <pre>
 * ack message
 * </pre>
 *
 * Protobuf type {@code ImAckMessageRequest}
 */
public  final class ImAckMessageRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ImAckMessageRequest)
    ImAckMessageRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImAckMessageRequest.newBuilder() to construct.
  private ImAckMessageRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImAckMessageRequest() {
    fromUserId_ = 0L;
    messageid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImAckMessageRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            fromUserId_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            messageid_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImAckMessageRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImAckMessageRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hwl.imcore.improto.ImAckMessageRequest.class, com.hwl.imcore.improto.ImAckMessageRequest.Builder.class);
  }

  public static final int FROMUSERID_FIELD_NUMBER = 1;
  private long fromUserId_;
  /**
   * <code>uint64 fromUserId = 1;</code>
   */
  public long getFromUserId() {
    return fromUserId_;
  }

  public static final int MESSAGEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object messageid_;
  /**
   * <code>string messageid = 2;</code>
   */
  public java.lang.String getMessageid() {
    java.lang.Object ref = messageid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageid_ = s;
      return s;
    }
  }
  /**
   * <code>string messageid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageidBytes() {
    java.lang.Object ref = messageid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (fromUserId_ != 0L) {
      output.writeUInt64(1, fromUserId_);
    }
    if (!getMessageidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, messageid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fromUserId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, fromUserId_);
    }
    if (!getMessageidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, messageid_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hwl.imcore.improto.ImAckMessageRequest)) {
      return super.equals(obj);
    }
    com.hwl.imcore.improto.ImAckMessageRequest other = (com.hwl.imcore.improto.ImAckMessageRequest) obj;

    boolean result = true;
    result = result && (getFromUserId()
        == other.getFromUserId());
    result = result && getMessageid()
        .equals(other.getMessageid());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FROMUSERID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getFromUserId());
    hash = (37 * hash) + MESSAGEID_FIELD_NUMBER;
    hash = (53 * hash) + getMessageid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImAckMessageRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hwl.imcore.improto.ImAckMessageRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * ack message
   * </pre>
   *
   * Protobuf type {@code ImAckMessageRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ImAckMessageRequest)
      com.hwl.imcore.improto.ImAckMessageRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImAckMessageRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImAckMessageRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hwl.imcore.improto.ImAckMessageRequest.class, com.hwl.imcore.improto.ImAckMessageRequest.Builder.class);
    }

    // Construct using com.hwl.imcore.improto.ImAckMessageRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      fromUserId_ = 0L;

      messageid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImAckMessageRequest_descriptor;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImAckMessageRequest getDefaultInstanceForType() {
      return com.hwl.imcore.improto.ImAckMessageRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImAckMessageRequest build() {
      com.hwl.imcore.improto.ImAckMessageRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImAckMessageRequest buildPartial() {
      com.hwl.imcore.improto.ImAckMessageRequest result = new com.hwl.imcore.improto.ImAckMessageRequest(this);
      result.fromUserId_ = fromUserId_;
      result.messageid_ = messageid_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hwl.imcore.improto.ImAckMessageRequest) {
        return mergeFrom((com.hwl.imcore.improto.ImAckMessageRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hwl.imcore.improto.ImAckMessageRequest other) {
      if (other == com.hwl.imcore.improto.ImAckMessageRequest.getDefaultInstance()) return this;
      if (other.getFromUserId() != 0L) {
        setFromUserId(other.getFromUserId());
      }
      if (!other.getMessageid().isEmpty()) {
        messageid_ = other.messageid_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hwl.imcore.improto.ImAckMessageRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hwl.imcore.improto.ImAckMessageRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long fromUserId_ ;
    /**
     * <code>uint64 fromUserId = 1;</code>
     */
    public long getFromUserId() {
      return fromUserId_;
    }
    /**
     * <code>uint64 fromUserId = 1;</code>
     */
    public Builder setFromUserId(long value) {
      
      fromUserId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 fromUserId = 1;</code>
     */
    public Builder clearFromUserId() {
      
      fromUserId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object messageid_ = "";
    /**
     * <code>string messageid = 2;</code>
     */
    public java.lang.String getMessageid() {
      java.lang.Object ref = messageid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string messageid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageidBytes() {
      java.lang.Object ref = messageid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string messageid = 2;</code>
     */
    public Builder setMessageid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string messageid = 2;</code>
     */
    public Builder clearMessageid() {
      
      messageid_ = getDefaultInstance().getMessageid();
      onChanged();
      return this;
    }
    /**
     * <code>string messageid = 2;</code>
     */
    public Builder setMessageidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageid_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ImAckMessageRequest)
  }

  // @@protoc_insertion_point(class_scope:ImAckMessageRequest)
  private static final com.hwl.imcore.improto.ImAckMessageRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hwl.imcore.improto.ImAckMessageRequest();
  }

  public static com.hwl.imcore.improto.ImAckMessageRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImAckMessageRequest>
      PARSER = new com.google.protobuf.AbstractParser<ImAckMessageRequest>() {
    @java.lang.Override
    public ImAckMessageRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImAckMessageRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImAckMessageRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImAckMessageRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hwl.imcore.improto.ImAckMessageRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

