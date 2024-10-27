package wmfx;

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
    comments = "Source: ClientInterface.proto")
public final class ClientInterfaceGrpc {

  private ClientInterfaceGrpc() {}

  public static final String SERVICE_NAME = "ClientInterface";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getQueueMethod()} instead. 
  public static final io.grpc.MethodDescriptor<wmfx.ServerReplyOuterClass.ServerReply,
      com.google.protobuf.Empty> METHOD_QUEUE = getQueueMethod();

  private static volatile io.grpc.MethodDescriptor<wmfx.ServerReplyOuterClass.ServerReply,
      com.google.protobuf.Empty> getQueueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<wmfx.ServerReplyOuterClass.ServerReply,
      com.google.protobuf.Empty> getQueueMethod() {
    io.grpc.MethodDescriptor<wmfx.ServerReplyOuterClass.ServerReply, com.google.protobuf.Empty> getQueueMethod;
    if ((getQueueMethod = ClientInterfaceGrpc.getQueueMethod) == null) {
      synchronized (ClientInterfaceGrpc.class) {
        if ((getQueueMethod = ClientInterfaceGrpc.getQueueMethod) == null) {
          ClientInterfaceGrpc.getQueueMethod = getQueueMethod = 
              io.grpc.MethodDescriptor.<wmfx.ServerReplyOuterClass.ServerReply, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientInterface", "queue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wmfx.ServerReplyOuterClass.ServerReply.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientInterfaceMethodDescriptorSupplier("queue"))
                  .build();
          }
        }
     }
     return getQueueMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getDequeueMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      wmfx.ServerReplyOuterClass.ServerReply> METHOD_DEQUEUE = getDequeueMethod();

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      wmfx.ServerReplyOuterClass.ServerReply> getDequeueMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      wmfx.ServerReplyOuterClass.ServerReply> getDequeueMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, wmfx.ServerReplyOuterClass.ServerReply> getDequeueMethod;
    if ((getDequeueMethod = ClientInterfaceGrpc.getDequeueMethod) == null) {
      synchronized (ClientInterfaceGrpc.class) {
        if ((getDequeueMethod = ClientInterfaceGrpc.getDequeueMethod) == null) {
          ClientInterfaceGrpc.getDequeueMethod = getDequeueMethod = 
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, wmfx.ServerReplyOuterClass.ServerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ClientInterface", "dequeue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  wmfx.ServerReplyOuterClass.ServerReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ClientInterfaceMethodDescriptorSupplier("dequeue"))
                  .build();
          }
        }
     }
     return getDequeueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClientInterfaceStub newStub(io.grpc.Channel channel) {
    return new ClientInterfaceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClientInterfaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ClientInterfaceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClientInterfaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ClientInterfaceFutureStub(channel);
  }

  /**
   */
  public static abstract class ClientInterfaceImplBase implements io.grpc.BindableService {

    /**
     */
    public void queue(wmfx.ServerReplyOuterClass.ServerReply request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getQueueMethod(), responseObserver);
    }

    /**
     */
    public void dequeue(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<wmfx.ServerReplyOuterClass.ServerReply> responseObserver) {
      asyncUnimplementedUnaryCall(getDequeueMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getQueueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                wmfx.ServerReplyOuterClass.ServerReply,
                com.google.protobuf.Empty>(
                  this, METHODID_QUEUE)))
          .addMethod(
            getDequeueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                wmfx.ServerReplyOuterClass.ServerReply>(
                  this, METHODID_DEQUEUE)))
          .build();
    }
  }

  /**
   */
  public static final class ClientInterfaceStub extends io.grpc.stub.AbstractStub<ClientInterfaceStub> {
    private ClientInterfaceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientInterfaceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientInterfaceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientInterfaceStub(channel, callOptions);
    }

    /**
     */
    public void queue(wmfx.ServerReplyOuterClass.ServerReply request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dequeue(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<wmfx.ServerReplyOuterClass.ServerReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDequeueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClientInterfaceBlockingStub extends io.grpc.stub.AbstractStub<ClientInterfaceBlockingStub> {
    private ClientInterfaceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientInterfaceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientInterfaceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientInterfaceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty queue(wmfx.ServerReplyOuterClass.ServerReply request) {
      return blockingUnaryCall(
          getChannel(), getQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public wmfx.ServerReplyOuterClass.ServerReply dequeue(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getDequeueMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClientInterfaceFutureStub extends io.grpc.stub.AbstractStub<ClientInterfaceFutureStub> {
    private ClientInterfaceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ClientInterfaceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClientInterfaceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ClientInterfaceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> queue(
        wmfx.ServerReplyOuterClass.ServerReply request) {
      return futureUnaryCall(
          getChannel().newCall(getQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<wmfx.ServerReplyOuterClass.ServerReply> dequeue(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getDequeueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_QUEUE = 0;
  private static final int METHODID_DEQUEUE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClientInterfaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClientInterfaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_QUEUE:
          serviceImpl.queue((wmfx.ServerReplyOuterClass.ServerReply) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DEQUEUE:
          serviceImpl.dequeue((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<wmfx.ServerReplyOuterClass.ServerReply>) responseObserver);
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

  private static abstract class ClientInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClientInterfaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return wmfx.ClientInterfaceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClientInterface");
    }
  }

  private static final class ClientInterfaceFileDescriptorSupplier
      extends ClientInterfaceBaseDescriptorSupplier {
    ClientInterfaceFileDescriptorSupplier() {}
  }

  private static final class ClientInterfaceMethodDescriptorSupplier
      extends ClientInterfaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClientInterfaceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClientInterfaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClientInterfaceFileDescriptorSupplier())
              .addMethod(getQueueMethod())
              .addMethod(getDequeueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
