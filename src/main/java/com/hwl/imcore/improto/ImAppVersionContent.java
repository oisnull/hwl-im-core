// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

/**
 * Protobuf type {@code ImAppVersionContent}
 */
public  final class ImAppVersionContent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ImAppVersionContent)
    ImAppVersionContentOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ImAppVersionContent.newBuilder() to construct.
  private ImAppVersionContent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ImAppVersionContent() {
    appName_ = "";
    appVersion_ = "";
    appSize_ = 0L;
    downloadUrl_ = "";
    upgradeLog_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ImAppVersionContent(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            appName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            appVersion_ = s;
            break;
          }
          case 24: {

            appSize_ = input.readUInt64();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            downloadUrl_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            upgradeLog_ = s;
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
    return com.hwl.imcore.improto.ImMessage.internal_static_ImAppVersionContent_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hwl.imcore.improto.ImMessage.internal_static_ImAppVersionContent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hwl.imcore.improto.ImAppVersionContent.class, com.hwl.imcore.improto.ImAppVersionContent.Builder.class);
  }

  public static final int APPNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object appName_;
  /**
   * <code>string appName = 1;</code>
   */
  public java.lang.String getAppName() {
    java.lang.Object ref = appName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appName_ = s;
      return s;
    }
  }
  /**
   * <code>string appName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAppNameBytes() {
    java.lang.Object ref = appName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPVERSION_FIELD_NUMBER = 2;
  private volatile java.lang.Object appVersion_;
  /**
   * <code>string appVersion = 2;</code>
   */
  public java.lang.String getAppVersion() {
    java.lang.Object ref = appVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      appVersion_ = s;
      return s;
    }
  }
  /**
   * <code>string appVersion = 2;</code>
   */
  public com.google.protobuf.ByteString
      getAppVersionBytes() {
    java.lang.Object ref = appVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      appVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int APPSIZE_FIELD_NUMBER = 3;
  private long appSize_;
  /**
   * <code>uint64 appSize = 3;</code>
   */
  public long getAppSize() {
    return appSize_;
  }

  public static final int DOWNLOADURL_FIELD_NUMBER = 4;
  private volatile java.lang.Object downloadUrl_;
  /**
   * <code>string downloadUrl = 4;</code>
   */
  public java.lang.String getDownloadUrl() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      downloadUrl_ = s;
      return s;
    }
  }
  /**
   * <code>string downloadUrl = 4;</code>
   */
  public com.google.protobuf.ByteString
      getDownloadUrlBytes() {
    java.lang.Object ref = downloadUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      downloadUrl_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPGRADELOG_FIELD_NUMBER = 5;
  private volatile java.lang.Object upgradeLog_;
  /**
   * <code>string upgradeLog = 5;</code>
   */
  public java.lang.String getUpgradeLog() {
    java.lang.Object ref = upgradeLog_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      upgradeLog_ = s;
      return s;
    }
  }
  /**
   * <code>string upgradeLog = 5;</code>
   */
  public com.google.protobuf.ByteString
      getUpgradeLogBytes() {
    java.lang.Object ref = upgradeLog_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      upgradeLog_ = b;
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
    if (!getAppNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, appName_);
    }
    if (!getAppVersionBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, appVersion_);
    }
    if (appSize_ != 0L) {
      output.writeUInt64(3, appSize_);
    }
    if (!getDownloadUrlBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, downloadUrl_);
    }
    if (!getUpgradeLogBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, upgradeLog_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAppNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, appName_);
    }
    if (!getAppVersionBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, appVersion_);
    }
    if (appSize_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, appSize_);
    }
    if (!getDownloadUrlBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, downloadUrl_);
    }
    if (!getUpgradeLogBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, upgradeLog_);
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
    if (!(obj instanceof com.hwl.imcore.improto.ImAppVersionContent)) {
      return super.equals(obj);
    }
    com.hwl.imcore.improto.ImAppVersionContent other = (com.hwl.imcore.improto.ImAppVersionContent) obj;

    boolean result = true;
    result = result && getAppName()
        .equals(other.getAppName());
    result = result && getAppVersion()
        .equals(other.getAppVersion());
    result = result && (getAppSize()
        == other.getAppSize());
    result = result && getDownloadUrl()
        .equals(other.getDownloadUrl());
    result = result && getUpgradeLog()
        .equals(other.getUpgradeLog());
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
    hash = (37 * hash) + APPNAME_FIELD_NUMBER;
    hash = (53 * hash) + getAppName().hashCode();
    hash = (37 * hash) + APPVERSION_FIELD_NUMBER;
    hash = (53 * hash) + getAppVersion().hashCode();
    hash = (37 * hash) + APPSIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppSize());
    hash = (37 * hash) + DOWNLOADURL_FIELD_NUMBER;
    hash = (53 * hash) + getDownloadUrl().hashCode();
    hash = (37 * hash) + UPGRADELOG_FIELD_NUMBER;
    hash = (53 * hash) + getUpgradeLog().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.hwl.imcore.improto.ImAppVersionContent parseFrom(
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
  public static Builder newBuilder(com.hwl.imcore.improto.ImAppVersionContent prototype) {
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
   * Protobuf type {@code ImAppVersionContent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ImAppVersionContent)
      com.hwl.imcore.improto.ImAppVersionContentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImAppVersionContent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImAppVersionContent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hwl.imcore.improto.ImAppVersionContent.class, com.hwl.imcore.improto.ImAppVersionContent.Builder.class);
    }

    // Construct using com.hwl.imcore.improto.ImAppVersionContent.newBuilder()
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
      appName_ = "";

      appVersion_ = "";

      appSize_ = 0L;

      downloadUrl_ = "";

      upgradeLog_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hwl.imcore.improto.ImMessage.internal_static_ImAppVersionContent_descriptor;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImAppVersionContent getDefaultInstanceForType() {
      return com.hwl.imcore.improto.ImAppVersionContent.getDefaultInstance();
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImAppVersionContent build() {
      com.hwl.imcore.improto.ImAppVersionContent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hwl.imcore.improto.ImAppVersionContent buildPartial() {
      com.hwl.imcore.improto.ImAppVersionContent result = new com.hwl.imcore.improto.ImAppVersionContent(this);
      result.appName_ = appName_;
      result.appVersion_ = appVersion_;
      result.appSize_ = appSize_;
      result.downloadUrl_ = downloadUrl_;
      result.upgradeLog_ = upgradeLog_;
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
      if (other instanceof com.hwl.imcore.improto.ImAppVersionContent) {
        return mergeFrom((com.hwl.imcore.improto.ImAppVersionContent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hwl.imcore.improto.ImAppVersionContent other) {
      if (other == com.hwl.imcore.improto.ImAppVersionContent.getDefaultInstance()) return this;
      if (!other.getAppName().isEmpty()) {
        appName_ = other.appName_;
        onChanged();
      }
      if (!other.getAppVersion().isEmpty()) {
        appVersion_ = other.appVersion_;
        onChanged();
      }
      if (other.getAppSize() != 0L) {
        setAppSize(other.getAppSize());
      }
      if (!other.getDownloadUrl().isEmpty()) {
        downloadUrl_ = other.downloadUrl_;
        onChanged();
      }
      if (!other.getUpgradeLog().isEmpty()) {
        upgradeLog_ = other.upgradeLog_;
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
      com.hwl.imcore.improto.ImAppVersionContent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.hwl.imcore.improto.ImAppVersionContent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object appName_ = "";
    /**
     * <code>string appName = 1;</code>
     */
    public java.lang.String getAppName() {
      java.lang.Object ref = appName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string appName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAppNameBytes() {
      java.lang.Object ref = appName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string appName = 1;</code>
     */
    public Builder setAppName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string appName = 1;</code>
     */
    public Builder clearAppName() {
      
      appName_ = getDefaultInstance().getAppName();
      onChanged();
      return this;
    }
    /**
     * <code>string appName = 1;</code>
     */
    public Builder setAppNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object appVersion_ = "";
    /**
     * <code>string appVersion = 2;</code>
     */
    public java.lang.String getAppVersion() {
      java.lang.Object ref = appVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string appVersion = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAppVersionBytes() {
      java.lang.Object ref = appVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string appVersion = 2;</code>
     */
    public Builder setAppVersion(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      appVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string appVersion = 2;</code>
     */
    public Builder clearAppVersion() {
      
      appVersion_ = getDefaultInstance().getAppVersion();
      onChanged();
      return this;
    }
    /**
     * <code>string appVersion = 2;</code>
     */
    public Builder setAppVersionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      appVersion_ = value;
      onChanged();
      return this;
    }

    private long appSize_ ;
    /**
     * <code>uint64 appSize = 3;</code>
     */
    public long getAppSize() {
      return appSize_;
    }
    /**
     * <code>uint64 appSize = 3;</code>
     */
    public Builder setAppSize(long value) {
      
      appSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 appSize = 3;</code>
     */
    public Builder clearAppSize() {
      
      appSize_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object downloadUrl_ = "";
    /**
     * <code>string downloadUrl = 4;</code>
     */
    public java.lang.String getDownloadUrl() {
      java.lang.Object ref = downloadUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        downloadUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string downloadUrl = 4;</code>
     */
    public com.google.protobuf.ByteString
        getDownloadUrlBytes() {
      java.lang.Object ref = downloadUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        downloadUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string downloadUrl = 4;</code>
     */
    public Builder setDownloadUrl(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      downloadUrl_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string downloadUrl = 4;</code>
     */
    public Builder clearDownloadUrl() {
      
      downloadUrl_ = getDefaultInstance().getDownloadUrl();
      onChanged();
      return this;
    }
    /**
     * <code>string downloadUrl = 4;</code>
     */
    public Builder setDownloadUrlBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      downloadUrl_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object upgradeLog_ = "";
    /**
     * <code>string upgradeLog = 5;</code>
     */
    public java.lang.String getUpgradeLog() {
      java.lang.Object ref = upgradeLog_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        upgradeLog_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string upgradeLog = 5;</code>
     */
    public com.google.protobuf.ByteString
        getUpgradeLogBytes() {
      java.lang.Object ref = upgradeLog_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        upgradeLog_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string upgradeLog = 5;</code>
     */
    public Builder setUpgradeLog(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      upgradeLog_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string upgradeLog = 5;</code>
     */
    public Builder clearUpgradeLog() {
      
      upgradeLog_ = getDefaultInstance().getUpgradeLog();
      onChanged();
      return this;
    }
    /**
     * <code>string upgradeLog = 5;</code>
     */
    public Builder setUpgradeLogBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      upgradeLog_ = value;
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


    // @@protoc_insertion_point(builder_scope:ImAppVersionContent)
  }

  // @@protoc_insertion_point(class_scope:ImAppVersionContent)
  private static final com.hwl.imcore.improto.ImAppVersionContent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hwl.imcore.improto.ImAppVersionContent();
  }

  public static com.hwl.imcore.improto.ImAppVersionContent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImAppVersionContent>
      PARSER = new com.google.protobuf.AbstractParser<ImAppVersionContent>() {
    @java.lang.Override
    public ImAppVersionContent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ImAppVersionContent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ImAppVersionContent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImAppVersionContent> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hwl.imcore.improto.ImAppVersionContent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
