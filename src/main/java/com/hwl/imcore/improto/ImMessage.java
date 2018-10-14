// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/java/com/hwl/imcore/protocol/im_message.proto

package com.hwl.imcore.improto;

public final class ImMessage {
  private ImMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImMessageContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImMessageContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImMessageRequestHead_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImMessageRequestHead_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImMessageResponseHead_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImMessageResponseHead_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImUserValidateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImUserValidateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImUserValidateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImUserValidateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImChatUserMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImChatUserMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImChatUserMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImChatUserMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImChatUserMessageContent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImChatUserMessageContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImChatGroupMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImChatGroupMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImChatGroupMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImChatGroupMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImChatGroupMessageContent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImChatGroupMessageContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImHeartBeatMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImHeartBeatMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImAddFriendMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImAddFriendMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImAddFriendMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImAddFriendMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImAddFriendMessageContent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImAddFriendMessageContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImConfirmFriendMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImConfirmFriendMessageRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6src/main/java/com/hwl/imcore/protocol/" +
      "im_message.proto\"\206\001\n\020ImMessageContext\022\034\n" +
      "\004type\030\001 \001(\0162\016.ImMessageType\022$\n\007request\030\002" +
      " \001(\0132\021.ImMessageRequestH\000\022&\n\010response\030\003 " +
      "\001(\0132\022.ImMessageResponseH\000B\006\n\004body\"\305\003\n\020Im" +
      "MessageRequest\022*\n\013requestHead\030\001 \001(\0132\025.Im" +
      "MessageRequestHead\0225\n\023userValidateReques" +
      "t\030\002 \001(\0132\026.ImUserValidateRequestH\000\022;\n\026cha" +
      "tUserMessageRequest\030\003 \001(\0132\031.ImChatUserMe" +
      "ssageRequestH\000\022=\n\027chatGroupMessageReques" +
      "t\030\004 \001(\0132\032.ImChatGroupMessageRequestH\000\022=\n" +
      "\027heartBeatMessageRequest\030\005 \001(\0132\032.ImHeart" +
      "BeatMessageRequestH\000\022=\n\027addFriendMessage" +
      "Request\030\006 \001(\0132\032.ImAddFriendMessageReques" +
      "tH\000\022E\n\033confirmFriendMessageRequest\030\007 \001(\013" +
      "2\036.ImConfirmFriendMessageRequestH\000B\r\n\013re" +
      "questBody\"\313\002\n\021ImMessageResponse\022,\n\014respo" +
      "nseHead\030\001 \001(\0132\026.ImMessageResponseHead\0227\n" +
      "\024userValidateResponse\030\002 \001(\0132\027.ImUserVali" +
      "dateResponseH\000\022=\n\027chatUserMessageRespons" +
      "e\030\003 \001(\0132\032.ImChatUserMessageResponseH\000\022?\n" +
      "\030chatGroupMessageResponse\030\004 \001(\0132\033.ImChat" +
      "GroupMessageResponseH\000\022?\n\030addFriendMessa" +
      "geResponse\030\005 \001(\0132\033.ImAddFriendMessageRes" +
      "ponseH\000B\016\n\014responseBody\"o\n\024ImMessageRequ" +
      "estHead\022\021\n\ttimestamp\030\001 \001(\004\022\016\n\006client\030\002 \001" +
      "(\t\022\021\n\tsessionid\030\003 \001(\t\022\020\n\010language\030\004 \001(\t\022" +
      "\017\n\007version\030\005 \001(\t\"`\n\025ImMessageResponseHea" +
      "d\022\014\n\004code\030\001 \001(\r\022\017\n\007message\030\002 \001(\t\022(\n\006sour" +
      "ce\030\003 \001(\0162\030.ImMessageSourcePosition\"6\n\025Im" +
      "UserValidateRequest\022\016\n\006userId\030\001 \001(\004\022\r\n\005t" +
      "oken\030\002 \001(\t\"a\n\026ImUserValidateResponse\022\021\n\t" +
      "isSuccess\030\001 \001(\010\022\017\n\007message\030\002 \001(\t\022\020\n\010isOn" +
      "line\030\003 \001(\010\022\021\n\tsessionid\030\004 \001(\t\"U\n\030ImChatU" +
      "serMessageRequest\0229\n\026chatUserMessageCont" +
      "ent\030\001 \001(\0132\031.ImChatUserMessageContent\"i\n\031" +
      "ImChatUserMessageResponse\0229\n\026chatUserMes" +
      "sageContent\030\001 \001(\0132\031.ImChatUserMessageCon" +
      "tent\022\021\n\tbuildTime\030\002 \001(\004\"\360\001\n\030ImChatUserMe" +
      "ssageContent\022\022\n\nfromUserId\030\001 \001(\004\022\024\n\014from" +
      "UserName\030\002 \001(\t\022\025\n\rfromUserImage\030\003 \001(\t\022\020\n" +
      "\010toUserId\030\004 \001(\004\022\023\n\013contentType\030\005 \001(\r\022\017\n\007" +
      "content\030\006 \001(\t\022\022\n\npreviewUrl\030\007 \001(\t\022\022\n\nima" +
      "geWidth\030\010 \001(\r\022\023\n\013imageHeight\030\t \001(\r\022\014\n\004si" +
      "ze\030\n \001(\r\022\020\n\010playTime\030\013 \001(\r\"X\n\031ImChatGrou" +
      "pMessageRequest\022;\n\027chatGroupMessageConte" +
      "nt\030\001 \001(\0132\032.ImChatGroupMessageContent\"l\n\032" +
      "ImChatGroupMessageResponse\022;\n\027chatGroupM" +
      "essageContent\030\001 \001(\0132\032.ImChatGroupMessage" +
      "Content\022\021\n\tbuildTime\030\002 \001(\004\"\365\001\n\031ImChatGro" +
      "upMessageContent\022\022\n\nfromUserId\030\001 \001(\004\022\024\n\014" +
      "fromUserName\030\002 \001(\t\022\025\n\rfromUserImage\030\003 \001(" +
      "\t\022\024\n\014toGrouopGuid\030\004 \001(\t\022\023\n\013contentType\030\005" +
      " \001(\r\022\017\n\007content\030\006 \001(\t\022\022\n\npreviewUrl\030\007 \001(" +
      "\t\022\022\n\nimageWidth\030\010 \001(\r\022\023\n\013imageHeight\030\t \001" +
      "(\r\022\014\n\004size\030\n \001(\r\022\020\n\010playTime\030\013 \001(\r\"0\n\031Im" +
      "HeartBeatMessageRequest\022\023\n\013currentTime\030\001" +
      " \001(\004\"X\n\031ImAddFriendMessageRequest\022;\n\027add" +
      "FriendMessageContent\030\001 \001(\0132\032.ImAddFriend" +
      "MessageContent\"l\n\032ImAddFriendMessageResp" +
      "onse\022;\n\027addFriendMessageContent\030\001 \001(\0132\032." +
      "ImAddFriendMessageContent\022\021\n\tbuildTime\030\002" +
      " \001(\004\"\203\001\n\031ImAddFriendMessageContent\022\022\n\nfr" +
      "omUserId\030\001 \001(\004\022\024\n\014fromUserName\030\002 \001(\t\022\031\n\021" +
      "fromUserHeadImage\030\003 \001(\t\022\020\n\010toUserId\030\004 \001(" +
      "\004\022\017\n\007content\030\006 \001(\t\"\306\001\n\035ImConfirmFriendMe" +
      "ssageRequest\022\022\n\nfromUserId\030\001 \001(\004\022\026\n\016from" +
      "UserSymbol\030\002 \001(\t\022\024\n\014fromUserName\030\003 \001(\t\022\031" +
      "\n\021fromUserHeadImage\030\004 \001(\t\022\020\n\010toUserId\030\005 " +
      "\001(\004\022\023\n\013contentType\030\006 \001(\r\022\017\n\007content\030\007 \001(" +
      "\t\022\020\n\010sendTime\030\010 \001(\004*y\n\rImMessageType\022\010\n\004" +
      "Base\020\000\022\020\n\014UserValidate\020\001\022\014\n\010ChatUser\020\002\022\r" +
      "\n\tChatGroup\020\003\022\r\n\tHeartBeat\020\004\022\r\n\tAddFrien" +
      "d\020\005\022\021\n\rConfirmFriend\020\006*S\n\025ImMessageRespo" +
      "nseCode\022\t\n\005Other\020\000\022\013\n\007Success\020d\022\013\n\006Faile" +
      "d\020\310\001\022\025\n\020SessionidInvalid\020\311\001*I\n\027ImMessage" +
      "SourcePosition\022\010\n\004None\020\000\022\014\n\010RealTime\020\001\022\013" +
      "\n\007Offline\020\002\022\t\n\005Retry\020\003B,\n\026com.hwl.imcore" +
      ".improtoP\001\252\002\017IMCore.Protocolb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_ImMessageContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ImMessageContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImMessageContext_descriptor,
        new java.lang.String[] { "Type", "Request", "Response", "Body", });
    internal_static_ImMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ImMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImMessageRequest_descriptor,
        new java.lang.String[] { "RequestHead", "UserValidateRequest", "ChatUserMessageRequest", "ChatGroupMessageRequest", "HeartBeatMessageRequest", "AddFriendMessageRequest", "ConfirmFriendMessageRequest", "RequestBody", });
    internal_static_ImMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ImMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImMessageResponse_descriptor,
        new java.lang.String[] { "ResponseHead", "UserValidateResponse", "ChatUserMessageResponse", "ChatGroupMessageResponse", "AddFriendMessageResponse", "ResponseBody", });
    internal_static_ImMessageRequestHead_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ImMessageRequestHead_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImMessageRequestHead_descriptor,
        new java.lang.String[] { "Timestamp", "Client", "Sessionid", "Language", "Version", });
    internal_static_ImMessageResponseHead_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ImMessageResponseHead_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImMessageResponseHead_descriptor,
        new java.lang.String[] { "Code", "Message", "Source", });
    internal_static_ImUserValidateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_ImUserValidateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImUserValidateRequest_descriptor,
        new java.lang.String[] { "UserId", "Token", });
    internal_static_ImUserValidateResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_ImUserValidateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImUserValidateResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Message", "IsOnline", "Sessionid", });
    internal_static_ImChatUserMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ImChatUserMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImChatUserMessageRequest_descriptor,
        new java.lang.String[] { "ChatUserMessageContent", });
    internal_static_ImChatUserMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_ImChatUserMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImChatUserMessageResponse_descriptor,
        new java.lang.String[] { "ChatUserMessageContent", "BuildTime", });
    internal_static_ImChatUserMessageContent_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ImChatUserMessageContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImChatUserMessageContent_descriptor,
        new java.lang.String[] { "FromUserId", "FromUserName", "FromUserImage", "ToUserId", "ContentType", "Content", "PreviewUrl", "ImageWidth", "ImageHeight", "Size", "PlayTime", });
    internal_static_ImChatGroupMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_ImChatGroupMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImChatGroupMessageRequest_descriptor,
        new java.lang.String[] { "ChatGroupMessageContent", });
    internal_static_ImChatGroupMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_ImChatGroupMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImChatGroupMessageResponse_descriptor,
        new java.lang.String[] { "ChatGroupMessageContent", "BuildTime", });
    internal_static_ImChatGroupMessageContent_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_ImChatGroupMessageContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImChatGroupMessageContent_descriptor,
        new java.lang.String[] { "FromUserId", "FromUserName", "FromUserImage", "ToGrouopGuid", "ContentType", "Content", "PreviewUrl", "ImageWidth", "ImageHeight", "Size", "PlayTime", });
    internal_static_ImHeartBeatMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_ImHeartBeatMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImHeartBeatMessageRequest_descriptor,
        new java.lang.String[] { "CurrentTime", });
    internal_static_ImAddFriendMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_ImAddFriendMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImAddFriendMessageRequest_descriptor,
        new java.lang.String[] { "AddFriendMessageContent", });
    internal_static_ImAddFriendMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_ImAddFriendMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImAddFriendMessageResponse_descriptor,
        new java.lang.String[] { "AddFriendMessageContent", "BuildTime", });
    internal_static_ImAddFriendMessageContent_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_ImAddFriendMessageContent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImAddFriendMessageContent_descriptor,
        new java.lang.String[] { "FromUserId", "FromUserName", "FromUserHeadImage", "ToUserId", "Content", });
    internal_static_ImConfirmFriendMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_ImConfirmFriendMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImConfirmFriendMessageRequest_descriptor,
        new java.lang.String[] { "FromUserId", "FromUserSymbol", "FromUserName", "FromUserHeadImage", "ToUserId", "ContentType", "Content", "SendTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}