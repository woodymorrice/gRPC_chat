import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: ServerInterface.proto")
public final class ServerInterfaceGrpc {

  private ServerInterfaceGrpc() {}

  public static final String SERVICE_NAME = "ServerInterface";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegisterClientMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ServerInterfaceOuterClass.ClientRegistration,
      com.google.protobuf.Empty> METHOD_REGISTER_CLIENT = getRegisterClientMethod();

  private static volatile io.grpc.MethodDescriptor<ServerInterfaceOuterClass.ClientRegistration,
      com.google.protobuf.Empty> getRegisterClientMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ServerInterfaceOuterClass.ClientRegistration,
      com.google.protobuf.Empty> getRegisterClientMethod() {
    io.grpc.MethodDescriptor<ServerInterfaceOuterClass.ClientRegistration, com.google.protobuf.Empty> getRegisterClientMethod;
    if ((getRegisterClientMethod = ServerInterfaceGrpc.getRegisterClientMethod) == null) {
      synchronized (ServerInterfaceGrpc.class) {
        if ((getRegisterClientMethod = ServerInterfaceGrpc.getRegisterClientMethod) == null) {
          ServerInterfaceGrpc.getRegisterClientMethod = getRegisterClientMethod = 
              io.grpc.MethodDescriptor.<ServerInterfaceOuterClass.ClientRegistration, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerInterface", "registerClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerInterfaceOuterClass.ClientRegistration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerInterfaceMethodDescriptorSupplier("registerClient"))
                  .build();
          }
        }
     }
     return getRegisterClientMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueueRequestMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ClientRequestOuterClass.ClientRequest,
      com.google.protobuf.Empty> METHOD_QUEUE_REQUEST = getQueueRequestMethod();

  private static volatile io.grpc.MethodDescriptor<ClientRequestOuterClass.ClientRequest,
      com.google.protobuf.Empty> getQueueRequestMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ClientRequestOuterClass.ClientRequest,
      com.google.protobuf.Empty> getQueueRequestMethod() {
    io.grpc.MethodDescriptor<ClientRequestOuterClass.ClientRequest, com.google.protobuf.Empty> getQueueRequestMethod;
    if ((getQueueRequestMethod = ServerInterfaceGrpc.getQueueRequestMethod) == null) {
      synchronized (ServerInterfaceGrpc.class) {
        if ((getQueueRequestMethod = ServerInterfaceGrpc.getQueueRequestMethod) == null) {
          ServerInterfaceGrpc.getQueueRequestMethod = getQueueRequestMethod = 
              io.grpc.MethodDescriptor.<ClientRequestOuterClass.ClientRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerInterface", "queueRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClientRequestOuterClass.ClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerInterfaceMethodDescriptorSupplier("queueRequest"))
                  .build();
          }
        }
     }
     return getQueueRequestMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDequeueRequestMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ClientRequestOuterClass.ClientRequest> METHOD_DEQUEUE_REQUEST = getDequeueRequestMethod();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ClientRequestOuterClass.ClientRequest> getDequeueRequestMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      ClientRequestOuterClass.ClientRequest> getDequeueRequestMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, ClientRequestOuterClass.ClientRequest> getDequeueRequestMethod;
    if ((getDequeueRequestMethod = ServerInterfaceGrpc.getDequeueRequestMethod) == null) {
      synchronized (ServerInterfaceGrpc.class) {
        if ((getDequeueRequestMethod = ServerInterfaceGrpc.getDequeueRequestMethod) == null) {
          ServerInterfaceGrpc.getDequeueRequestMethod = getDequeueRequestMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, ClientRequestOuterClass.ClientRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerInterface", "dequeueRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ClientRequestOuterClass.ClientRequest.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerInterfaceMethodDescriptorSupplier("dequeueRequest"))
                  .build();
          }
        }
     }
     return getDequeueRequestMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueueReplyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<ServerReplyOuterClass.ServerReply,
      com.google.protobuf.Empty> METHOD_QUEUE_REPLY = getQueueReplyMethod();

  private static volatile io.grpc.MethodDescriptor<ServerReplyOuterClass.ServerReply,
      com.google.protobuf.Empty> getQueueReplyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<ServerReplyOuterClass.ServerReply,
      com.google.protobuf.Empty> getQueueReplyMethod() {
    io.grpc.MethodDescriptor<ServerReplyOuterClass.ServerReply, com.google.protobuf.Empty> getQueueReplyMethod;
    if ((getQueueReplyMethod = ServerInterfaceGrpc.getQueueReplyMethod) == null) {
      synchronized (ServerInterfaceGrpc.class) {
        if ((getQueueReplyMethod = ServerInterfaceGrpc.getQueueReplyMethod) == null) {
          ServerInterfaceGrpc.getQueueReplyMethod = getQueueReplyMethod = 
              io.grpc.MethodDescriptor.<ServerReplyOuterClass.ServerReply, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerInterface", "queueReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ServerReplyOuterClass.ServerReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerInterfaceMethodDescriptorSupplier("queueReply"))
                  .build();
          }
        }
     }
     return getQueueReplyMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDequeueReplyMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> METHOD_DEQUEUE_REPLY = getDequeueReplyMethod();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDequeueReplyMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getDequeueReplyMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getDequeueReplyMethod;
    if ((getDequeueReplyMethod = ServerInterfaceGrpc.getDequeueReplyMethod) == null) {
      synchronized (ServerInterfaceGrpc.class) {
        if ((getDequeueReplyMethod = ServerInterfaceGrpc.getDequeueReplyMethod) == null) {
          ServerInterfaceGrpc.getDequeueReplyMethod = getDequeueReplyMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ServerInterface", "dequeueReply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ServerInterfaceMethodDescriptorSupplier("dequeueReply"))
                  .build();
          }
        }
     }
     return getDequeueReplyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerInterfaceStub newStub(io.grpc.Channel channel) {
    return new ServerInterfaceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServerInterfaceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServerInterfaceFutureStub(channel);
  }

  /**
   */
  public static abstract class ServerInterfaceImplBase implements io.grpc.BindableService {

    /**
     */
    public void registerClient(ServerInterfaceOuterClass.ClientRegistration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterClientMethod(), responseObserver);
    }

    /**
     */
    public void queueRequest(ClientRequestOuterClass.ClientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getQueueRequestMethod(), responseObserver);
    }

    /**
     */
    public void dequeueRequest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ClientRequestOuterClass.ClientRequest> responseObserver) {
      asyncUnimplementedUnaryCall(getDequeueRequestMethod(), responseObserver);
    }

    /**
     */
    public void queueReply(ServerReplyOuterClass.ServerReply request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getQueueReplyMethod(), responseObserver);
    }

    /**
     */
    public void dequeueReply(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDequeueReplyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServerInterfaceOuterClass.ClientRegistration,
                com.google.protobuf.Empty>(
                  this, METHODID_REGISTER_CLIENT)))
          .addMethod(
            getQueueRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ClientRequestOuterClass.ClientRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_QUEUE_REQUEST)))
          .addMethod(
            getDequeueRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                ClientRequestOuterClass.ClientRequest>(
                  this, METHODID_DEQUEUE_REQUEST)))
          .addMethod(
            getQueueReplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                ServerReplyOuterClass.ServerReply,
                com.google.protobuf.Empty>(
                  this, METHODID_QUEUE_REPLY)))
          .addMethod(
            getDequeueReplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.google.protobuf.Empty>(
                  this, METHODID_DEQUEUE_REPLY)))
          .build();
    }
  }

  /**
   */
  public static final class ServerInterfaceStub extends io.grpc.stub.AbstractStub<ServerInterfaceStub> {
    private ServerInterfaceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerInterfaceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerInterfaceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerInterfaceStub(channel, callOptions);
    }

    /**
     */
    public void registerClient(ServerInterfaceOuterClass.ClientRegistration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queueRequest(ClientRequestOuterClass.ClientRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueueRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dequeueRequest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<ClientRequestOuterClass.ClientRequest> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDequeueRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void queueReply(ServerReplyOuterClass.ServerReply request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueueReplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dequeueReply(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDequeueReplyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerInterfaceBlockingStub extends io.grpc.stub.AbstractStub<ServerInterfaceBlockingStub> {
    private ServerInterfaceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerInterfaceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerInterfaceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerInterfaceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty registerClient(ServerInterfaceOuterClass.ClientRegistration request) {
      return blockingUnaryCall(
          getChannel(), getRegisterClientMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty queueRequest(ClientRequestOuterClass.ClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getQueueRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public ClientRequestOuterClass.ClientRequest dequeueRequest(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDequeueRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty queueReply(ServerReplyOuterClass.ServerReply request) {
      return blockingUnaryCall(
          getChannel(), getQueueReplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty dequeueReply(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDequeueReplyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerInterfaceFutureStub extends io.grpc.stub.AbstractStub<ServerInterfaceFutureStub> {
    private ServerInterfaceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServerInterfaceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerInterfaceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServerInterfaceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> registerClient(
        ServerInterfaceOuterClass.ClientRegistration request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> queueRequest(
        ClientRequestOuterClass.ClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getQueueRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ClientRequestOuterClass.ClientRequest> dequeueRequest(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDequeueRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> queueReply(
        ServerReplyOuterClass.ServerReply request) {
      return futureUnaryCall(
          getChannel().newCall(getQueueReplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> dequeueReply(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDequeueReplyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_CLIENT = 0;
  private static final int METHODID_QUEUE_REQUEST = 1;
  private static final int METHODID_DEQUEUE_REQUEST = 2;
  private static final int METHODID_QUEUE_REPLY = 3;
  private static final int METHODID_DEQUEUE_REPLY = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerInterfaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerInterfaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_CLIENT:
          serviceImpl.registerClient((ServerInterfaceOuterClass.ClientRegistration) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_QUEUE_REQUEST:
          serviceImpl.queueRequest((ClientRequestOuterClass.ClientRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DEQUEUE_REQUEST:
          serviceImpl.dequeueRequest((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<ClientRequestOuterClass.ClientRequest>) responseObserver);
          break;
        case METHODID_QUEUE_REPLY:
          serviceImpl.queueReply((ServerReplyOuterClass.ServerReply) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DEQUEUE_REPLY:
          serviceImpl.dequeueReply((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServerInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ServerInterfaceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerInterface");
    }
  }

  private static final class ServerInterfaceFileDescriptorSupplier
      extends ServerInterfaceBaseDescriptorSupplier {
    ServerInterfaceFileDescriptorSupplier() {}
  }

  private static final class ServerInterfaceMethodDescriptorSupplier
      extends ServerInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerInterfaceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ServerInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerInterfaceFileDescriptorSupplier())
              .addMethod(getRegisterClientMethod())
              .addMethod(getQueueRequestMethod())
              .addMethod(getDequeueRequestMethod())
              .addMethod(getQueueReplyMethod())
              .addMethod(getDequeueReplyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
