// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ClientInterface.proto
// Protobuf Java Version: 4.28.3

public final class ClientInterfaceOuterClass {
  private ClientInterfaceOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ClientInterfaceOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ClientInterface.proto\032\033google/protobuf" +
      "/empty.proto\032\021ServerReply.proto2q\n\017Clien" +
      "tInterface\022-\n\005queue\022\014.ServerReply\032\026.goog" +
      "le.protobuf.Empty\022/\n\007dequeue\022\026.google.pr" +
      "otobuf.Empty\032\014.ServerReplyb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          ServerReplyOuterClass.getDescriptor(),
        });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.EmptyProto.getDescriptor();
    ServerReplyOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
