// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

public interface ImGroupOperateMessageContentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ImGroupOperateMessageContent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ImGroupOperateType operateType = 1;</code>
   */
  int getOperateTypeValue();
  /**
   * <code>.ImGroupOperateType operateType = 1;</code>
   */
  com.hwl.imcore.improto.ImGroupOperateType getOperateType();

  /**
   * <code>.ImUserContent operateUser = 2;</code>
   */
  boolean hasOperateUser();
  /**
   * <code>.ImUserContent operateUser = 2;</code>
   */
  com.hwl.imcore.improto.ImUserContent getOperateUser();
  /**
   * <code>.ImUserContent operateUser = 2;</code>
   */
  com.hwl.imcore.improto.ImUserContentOrBuilder getOperateUserOrBuilder();

  /**
   * <code>string groupGuid = 3;</code>
   */
  java.lang.String getGroupGuid();
  /**
   * <code>string groupGuid = 3;</code>
   */
  com.google.protobuf.ByteString
      getGroupGuidBytes();

  /**
   * <code>string groupName = 4;</code>
   */
  java.lang.String getGroupName();
  /**
   * <code>string groupName = 4;</code>
   */
  com.google.protobuf.ByteString
      getGroupNameBytes();

  /**
   * <code>repeated .ImUserContent groupUsers = 5;</code>
   */
  java.util.List<com.hwl.imcore.improto.ImUserContent> 
      getGroupUsersList();
  /**
   * <code>repeated .ImUserContent groupUsers = 5;</code>
   */
  com.hwl.imcore.improto.ImUserContent getGroupUsers(int index);
  /**
   * <code>repeated .ImUserContent groupUsers = 5;</code>
   */
  int getGroupUsersCount();
  /**
   * <code>repeated .ImUserContent groupUsers = 5;</code>
   */
  java.util.List<? extends com.hwl.imcore.improto.ImUserContentOrBuilder> 
      getGroupUsersOrBuilderList();
  /**
   * <code>repeated .ImUserContent groupUsers = 5;</code>
   */
  com.hwl.imcore.improto.ImUserContentOrBuilder getGroupUsersOrBuilder(
      int index);
}
