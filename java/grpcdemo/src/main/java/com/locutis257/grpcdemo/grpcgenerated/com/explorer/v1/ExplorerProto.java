// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/explorer/v1/explorer.proto

// Protobuf Java Version: 3.25.2
package com.explorer.v1;

public final class ExplorerProto {
  private ExplorerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_explorer_v1_ExplorerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_explorer_v1_ExplorerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_explorer_v1_ExplorerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_explorer_v1_ExplorerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n proto/explorer/v1/explorer.proto\022\013expl" +
      "orer.v1\"%\n\017ExplorerRequest\022\022\n\004name\030\001 \001(\t" +
      "R\004name\",\n\020ExplorerResponse\022\030\n\007message\030\001 " +
      "\001(\tR\007message2[\n\017ExplorerService\022H\n\007explo" +
      "re\022\034.explorer.v1.ExplorerRequest\032\035.explo" +
      "rer.v1.ExplorerResponse\"\000B\254\001\n\017com.explor" +
      "er.v1B\rExplorerProtoP\001Z=github.com/bufbu" +
      "ild/explorer/gen/proto/explorer/v1;explo" +
      "rerv1\242\002\003EXX\252\002\013Explorer.V1\312\002\013Explorer\\V1\342" +
      "\002\027Explorer\\V1\\GPBMetadata\352\002\014Explorer::V1" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_explorer_v1_ExplorerRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_explorer_v1_ExplorerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_explorer_v1_ExplorerRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_explorer_v1_ExplorerResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_explorer_v1_ExplorerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_explorer_v1_ExplorerResponse_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
