// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf type {@code ImMessageRequestHead}
 */
public  final class ImMessageRequestHead extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ImMessageRequestHead)
    ImMessageRequestHeadOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImMessageRequestHead.newBuilder() to construct.
  private ImMessageRequestHead(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImMessageRequestHead() {
    timestamp_ = 0L;
    client_ = "";
    session_ = "";
    language_ = "";
    version_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImMessageRequestHead(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            timestamp_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            client_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            session_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            language_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            version_ = s;
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
    return com.hwl.imcore.improto.ImMessage.internal_static_ImMessageRequestHead_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImMessageRequestHead_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hwl.imcore.improto.ImMessageRequestHead.class, com.hwl.imcore.improto.ImMessageRequestHead.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private long timestamp_;
  /**
   * <code>uint64 timestamp = 1;</code>
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int CLIENT_FIELD_NUMBER = 2;
  private volatile java.lang.Object client_;
  /**
   * <code>string client = 2;</code>
   */
  public java.lang.String getClient() {
    java.lang.Object ref = client_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      client_ = s;
      return s;
    }
  }
  /**
   * <code>string client = 2;</code>
   */
  public com.google.protobuf.ByteString
      getClientBytes() {
    java.lang.Object ref = client_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      client_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SESSION_FIELD_NUMBER = 3;
  private volatile java.lang.Object session_;
  /**
   * <code>string session = 3;</code>
   */
  public java.lang.String getSession() {
    java.lang.Object ref = session_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      session_ = s;
      return s;
    }
  }
  /**
   * <code>string session = 3;</code>
   */
  public com.google.protobuf.ByteString
      getSessionBytes() {
    java.lang.Object ref = session_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      session_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LANGUAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object language_;
  /**
   * <code>string language = 4;</code>
   */
  public java.lang.String getLanguage() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      language_ = s;
      return s;
    }
  }
  /**
   * <code>string language = 4;</code>
   */
  public com.google.protobuf.ByteString
      getLanguageBytes() {
    java.lang.Object ref = language_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      language_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 5;
  private volatile java.lang.Object version_;
  /**
   * <code>string version = 5;</code>
   */
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   * <code>string version = 5;</code>
   */
  public com.google.protobuf.ByteString
      getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (timestamp_ != 0L) {
      output.writeUInt64(1, timestamp_);
    }
    if (!getClientBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, client_);
    }
    if (!getSessionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, session_);
    }
    if (!getLanguageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, language_);
    }
    if (!getVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, version_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, timestamp_);
    }
    if (!getClientBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, client_);
    }
    if (!getSessionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, session_);
    }
    if (!getLanguageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, language_);
    }
    if (!getVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, version_);
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
    if (!(obj instanceof com.hwl.imcore.improto.ImMessageRequestHead)) {
      return super.equals(obj);
    }
    com.hwl.imcore.improto.ImMessageRequestHead other = (com.hwl.imcore.improto.ImMessageRequestHead) obj;

    boolean result = true;
    result = result && (getTimestamp()
        == other.getTimestamp());
    result = result && getClient()
        .equals(other.getClient());
    result = result && getSession()
        .equals(other.getSession());
    result = result && getLanguage()
        .equals(other.getLanguage());
    result = result && getVersion()
        .equals(other.getVersion());
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + CLIENT_FIELD_NUMBER;
    hash = (53 * hash) + getClient().hashCode();
    hash = (37 * hash) + SESSION_FIELD_NUMBER;
    hash = (53 * hash) + getSession().hashCode();
    hash = (37 * hash) + LANGUAGE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguage().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImMessageRequestHead parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hwl.imcore.improto.ImMessageRequestHead prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code ImMessageRequestHead}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ImMessageRequestHead)
      com.hwl.imcore.improto.ImMessageRequestHeadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImMessageRequestHead_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImMessageRequestHead_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hwl.imcore.improto.ImMessageRequestHead.class, com.hwl.imcore.improto.ImMessageRequestHead.Builder.class);
    }

    // Construct using com.hwl.imcore.improto.ImMessageRequestHead.newBuilder()
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
    public Builder clear() {
      super.clear();
      timestamp_ = 0L;

      client_ = "";

      session_ = "";

      language_ = "";

      version_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImMessageRequestHead_descriptor;
    }

    public com.hwl.imcore.improto.ImMessageRequestHead getDefaultInstanceForType() {
      return com.hwl.imcore.improto.ImMessageRequestHead.getDefaultInstance();
    }

    public com.hwl.imcore.improto.ImMessageRequestHead build() {
      com.hwl.imcore.improto.ImMessageRequestHead result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.hwl.imcore.improto.ImMessageRequestHead buildPartial() {
      com.hwl.imcore.improto.ImMessageRequestHead result = new com.hwl.imcore.improto.ImMessageRequestHead(this);
      result.timestamp_ = timestamp_;
      result.client_ = client_;
      result.session_ = session_;
      result.language_ = language_;
      result.version_ = version_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hwl.imcore.improto.ImMessageRequestHead) {
        return mergeFrom((com.hwl.imcore.improto.ImMessageRequestHead)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hwl.imcore.improto.ImMessageRequestHead other) {
      if (other == com.hwl.imcore.improto.ImMessageRequestHead.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (!other.getClient().isEmpty()) {
        client_ = other.client_;
        onChanged();
      }
      if (!other.getSession().isEmpty()) {
        session_ = other.session_;
        onChanged();
      }
      if (!other.getLanguage().isEmpty()) {
        language_ = other.language_;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.hwl.imcore.improto.ImMessageRequestHead parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hwl.imcore.improto.ImMessageRequestHead) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 1;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 1;</code>
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 1;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object client_ = "";
    /**
     * <code>string client = 2;</code>
     */
    public java.lang.String getClient() {
      java.lang.Object ref = client_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        client_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string client = 2;</code>
     */
    public com.google.protobuf.ByteString
        getClientBytes() {
      java.lang.Object ref = client_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        client_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string client = 2;</code>
     */
    public Builder setClient(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      client_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string client = 2;</code>
     */
    public Builder clearClient() {
      
      client_ = getDefaultInstance().getClient();
      onChanged();
      return this;
    }
    /**
     * <code>string client = 2;</code>
     */
    public Builder setClientBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      client_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object session_ = "";
    /**
     * <code>string session = 3;</code>
     */
    public java.lang.String getSession() {
      java.lang.Object ref = session_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        session_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string session = 3;</code>
     */
    public com.google.protobuf.ByteString
        getSessionBytes() {
      java.lang.Object ref = session_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        session_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string session = 3;</code>
     */
    public Builder setSession(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      session_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string session = 3;</code>
     */
    public Builder clearSession() {
      
      session_ = getDefaultInstance().getSession();
      onChanged();
      return this;
    }
    /**
     * <code>string session = 3;</code>
     */
    public Builder setSessionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      session_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object language_ = "";
    /**
     * <code>string language = 4;</code>
     */
    public java.lang.String getLanguage() {
      java.lang.Object ref = language_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        language_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string language = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLanguageBytes() {
      java.lang.Object ref = language_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        language_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string language = 4;</code>
     */
    public Builder setLanguage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      language_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string language = 4;</code>
     */
    public Builder clearLanguage() {
      
      language_ = getDefaultInstance().getLanguage();
      onChanged();
      return this;
    }
    /**
     * <code>string language = 4;</code>
     */
    public Builder setLanguageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      language_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     * <code>string version = 5;</code>
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string version = 5;</code>
     */
    public com.google.protobuf.ByteString
        getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string version = 5;</code>
     */
    public Builder setVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      version_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string version = 5;</code>
     */
    public Builder clearVersion() {
      
      version_ = getDefaultInstance().getVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string version = 5;</code>
     */
    public Builder setVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      version_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:ImMessageRequestHead)
  }

  // @@protoc_insertion_point(class_scope:ImMessageRequestHead)
  private static final com.hwl.imcore.improto.ImMessageRequestHead DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hwl.imcore.improto.ImMessageRequestHead();
  }

  public static com.hwl.imcore.improto.ImMessageRequestHead getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImMessageRequestHead>
      PARSER = new com.google.protobuf.AbstractParser<ImMessageRequestHead>() {
    public ImMessageRequestHead parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImMessageRequestHead(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImMessageRequestHead> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImMessageRequestHead> getParserForType() {
    return PARSER;
  }

  public com.hwl.imcore.improto.ImMessageRequestHead getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

