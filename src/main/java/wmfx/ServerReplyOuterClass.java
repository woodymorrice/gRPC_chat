// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ServerReply.proto
// Protobuf Java Version: 4.28.3

public final class ServerReplyOuterClass {
  private ServerReplyOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ServerReplyOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code ReplyType}
   */
  public enum ReplyType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>CREATE_SUCCESS = 0;</code>
     */
    CREATE_SUCCESS(0),
    /**
     * <code>CREATE_FAILURE = 1;</code>
     */
    CREATE_FAILURE(1),
    /**
     * <code>JOIN_SUCCESS = 2;</code>
     */
    JOIN_SUCCESS(2),
    /**
     * <code>JOIN_FAILURE = 3;</code>
     */
    JOIN_FAILURE(3),
    /**
     * <code>LIST_SUCCESS = 4;</code>
     */
    LIST_SUCCESS(4),
    /**
     * <code>LIST_FAILURE = 5;</code>
     */
    LIST_FAILURE(5),
    /**
     * <code>LEAVE_SUCCESS = 6;</code>
     */
    LEAVE_SUCCESS(6),
    /**
     * <code>LEAVE_FAILURE = 7;</code>
     */
    LEAVE_FAILURE(7),
    /**
     * <code>MSG_SUCCESS = 8;</code>
     */
    MSG_SUCCESS(8),
    /**
     * <code>MSG_FAILURE = 9;</code>
     */
    MSG_FAILURE(9),
    /**
     * <code>NEW_MSG = 10;</code>
     */
    NEW_MSG(10),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        ReplyType.class.getName());
    }
    /**
     * <code>CREATE_SUCCESS = 0;</code>
     */
    public static final int CREATE_SUCCESS_VALUE = 0;
    /**
     * <code>CREATE_FAILURE = 1;</code>
     */
    public static final int CREATE_FAILURE_VALUE = 1;
    /**
     * <code>JOIN_SUCCESS = 2;</code>
     */
    public static final int JOIN_SUCCESS_VALUE = 2;
    /**
     * <code>JOIN_FAILURE = 3;</code>
     */
    public static final int JOIN_FAILURE_VALUE = 3;
    /**
     * <code>LIST_SUCCESS = 4;</code>
     */
    public static final int LIST_SUCCESS_VALUE = 4;
    /**
     * <code>LIST_FAILURE = 5;</code>
     */
    public static final int LIST_FAILURE_VALUE = 5;
    /**
     * <code>LEAVE_SUCCESS = 6;</code>
     */
    public static final int LEAVE_SUCCESS_VALUE = 6;
    /**
     * <code>LEAVE_FAILURE = 7;</code>
     */
    public static final int LEAVE_FAILURE_VALUE = 7;
    /**
     * <code>MSG_SUCCESS = 8;</code>
     */
    public static final int MSG_SUCCESS_VALUE = 8;
    /**
     * <code>MSG_FAILURE = 9;</code>
     */
    public static final int MSG_FAILURE_VALUE = 9;
    /**
     * <code>NEW_MSG = 10;</code>
     */
    public static final int NEW_MSG_VALUE = 10;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReplyType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ReplyType forNumber(int value) {
      switch (value) {
        case 0: return CREATE_SUCCESS;
        case 1: return CREATE_FAILURE;
        case 2: return JOIN_SUCCESS;
        case 3: return JOIN_FAILURE;
        case 4: return LIST_SUCCESS;
        case 5: return LIST_FAILURE;
        case 6: return LEAVE_SUCCESS;
        case 7: return LEAVE_FAILURE;
        case 8: return MSG_SUCCESS;
        case 9: return MSG_FAILURE;
        case 10: return NEW_MSG;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ReplyType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ReplyType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ReplyType>() {
            public ReplyType findValueByNumber(int number) {
              return ReplyType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return ServerReplyOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ReplyType[] VALUES = values();

    public static ReplyType valueOf(
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

    private ReplyType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ReplyType)
  }

  public interface ServerReplyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ServerReply)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string clientId = 1;</code>
     * @return The clientId.
     */
    java.lang.String getClientId();
    /**
     * <code>string clientId = 1;</code>
     * @return The bytes for clientId.
     */
    com.google.protobuf.ByteString
        getClientIdBytes();

    /**
     * <code>.ReplyType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.ReplyType type = 2;</code>
     * @return The type.
     */
    ServerReplyOuterClass.ReplyType getType();

    /**
     * <code>string body = 3;</code>
     * @return The body.
     */
    java.lang.String getBody();
    /**
     * <code>string body = 3;</code>
     * @return The bytes for body.
     */
    com.google.protobuf.ByteString
        getBodyBytes();

    /**
     * <code>string room = 4;</code>
     * @return The room.
     */
    java.lang.String getRoom();
    /**
     * <code>string room = 4;</code>
     * @return The bytes for room.
     */
    com.google.protobuf.ByteString
        getRoomBytes();
  }
  /**
   * Protobuf type {@code ServerReply}
   */
  public static final class ServerReply extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ServerReply)
      ServerReplyOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        ServerReply.class.getName());
    }
    // Use ServerReply.newBuilder() to construct.
    private ServerReply(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ServerReply() {
      clientId_ = "";
      type_ = 0;
      body_ = "";
      room_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServerReplyOuterClass.internal_static_ServerReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServerReplyOuterClass.internal_static_ServerReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServerReplyOuterClass.ServerReply.class, ServerReplyOuterClass.ServerReply.Builder.class);
    }

    public static final int CLIENTID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object clientId_ = "";
    /**
     * <code>string clientId = 1;</code>
     * @return The clientId.
     */
    @java.lang.Override
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      }
    }
    /**
     * <code>string clientId = 1;</code>
     * @return The bytes for clientId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_ = 0;
    /**
     * <code>.ReplyType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.ReplyType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override public ServerReplyOuterClass.ReplyType getType() {
      ServerReplyOuterClass.ReplyType result = ServerReplyOuterClass.ReplyType.forNumber(type_);
      return result == null ? ServerReplyOuterClass.ReplyType.UNRECOGNIZED : result;
    }

    public static final int BODY_FIELD_NUMBER = 3;
    @SuppressWarnings("serial")
    private volatile java.lang.Object body_ = "";
    /**
     * <code>string body = 3;</code>
     * @return The body.
     */
    @java.lang.Override
    public java.lang.String getBody() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        body_ = s;
        return s;
      }
    }
    /**
     * <code>string body = 3;</code>
     * @return The bytes for body.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBodyBytes() {
      java.lang.Object ref = body_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        body_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ROOM_FIELD_NUMBER = 4;
    @SuppressWarnings("serial")
    private volatile java.lang.Object room_ = "";
    /**
     * <code>string room = 4;</code>
     * @return The room.
     */
    @java.lang.Override
    public java.lang.String getRoom() {
      java.lang.Object ref = room_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        room_ = s;
        return s;
      }
    }
    /**
     * <code>string room = 4;</code>
     * @return The bytes for room.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRoomBytes() {
      java.lang.Object ref = room_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        room_ = b;
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
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(clientId_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, clientId_);
      }
      if (type_ != ServerReplyOuterClass.ReplyType.CREATE_SUCCESS.getNumber()) {
        output.writeEnum(2, type_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(body_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 3, body_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(room_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 4, room_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(clientId_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, clientId_);
      }
      if (type_ != ServerReplyOuterClass.ReplyType.CREATE_SUCCESS.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(body_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(3, body_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(room_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(4, room_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServerReplyOuterClass.ServerReply)) {
        return super.equals(obj);
      }
      ServerReplyOuterClass.ServerReply other = (ServerReplyOuterClass.ServerReply) obj;

      if (!getClientId()
          .equals(other.getClientId())) return false;
      if (type_ != other.type_) return false;
      if (!getBody()
          .equals(other.getBody())) return false;
      if (!getRoom()
          .equals(other.getRoom())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
      hash = (53 * hash) + getClientId().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + type_;
      hash = (37 * hash) + BODY_FIELD_NUMBER;
      hash = (53 * hash) + getBody().hashCode();
      hash = (37 * hash) + ROOM_FIELD_NUMBER;
      hash = (53 * hash) + getRoom().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServerReplyOuterClass.ServerReply parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ServerReplyOuterClass.ServerReply parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static ServerReplyOuterClass.ServerReply parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static ServerReplyOuterClass.ServerReply parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServerReplyOuterClass.ServerReply prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code ServerReply}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ServerReply)
        ServerReplyOuterClass.ServerReplyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServerReplyOuterClass.internal_static_ServerReply_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServerReplyOuterClass.internal_static_ServerReply_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServerReplyOuterClass.ServerReply.class, ServerReplyOuterClass.ServerReply.Builder.class);
      }

      // Construct using ServerReplyOuterClass.ServerReply.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        clientId_ = "";
        type_ = 0;
        body_ = "";
        room_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServerReplyOuterClass.internal_static_ServerReply_descriptor;
      }

      @java.lang.Override
      public ServerReplyOuterClass.ServerReply getDefaultInstanceForType() {
        return ServerReplyOuterClass.ServerReply.getDefaultInstance();
      }

      @java.lang.Override
      public ServerReplyOuterClass.ServerReply build() {
        ServerReplyOuterClass.ServerReply result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServerReplyOuterClass.ServerReply buildPartial() {
        ServerReplyOuterClass.ServerReply result = new ServerReplyOuterClass.ServerReply(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(ServerReplyOuterClass.ServerReply result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.clientId_ = clientId_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.type_ = type_;
        }
        if (((from_bitField0_ & 0x00000004) != 0)) {
          result.body_ = body_;
        }
        if (((from_bitField0_ & 0x00000008) != 0)) {
          result.room_ = room_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServerReplyOuterClass.ServerReply) {
          return mergeFrom((ServerReplyOuterClass.ServerReply)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServerReplyOuterClass.ServerReply other) {
        if (other == ServerReplyOuterClass.ServerReply.getDefaultInstance()) return this;
        if (!other.getClientId().isEmpty()) {
          clientId_ = other.clientId_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.type_ != 0) {
          setTypeValue(other.getTypeValue());
        }
        if (!other.getBody().isEmpty()) {
          body_ = other.body_;
          bitField0_ |= 0x00000004;
          onChanged();
        }
        if (!other.getRoom().isEmpty()) {
          room_ = other.room_;
          bitField0_ |= 0x00000008;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
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
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                clientId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                type_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              case 26: {
                body_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
              case 34: {
                room_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object clientId_ = "";
      /**
       * <code>string clientId = 1;</code>
       * @return The clientId.
       */
      public java.lang.String getClientId() {
        java.lang.Object ref = clientId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          clientId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string clientId = 1;</code>
       * @return The bytes for clientId.
       */
      public com.google.protobuf.ByteString
          getClientIdBytes() {
        java.lang.Object ref = clientId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          clientId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string clientId = 1;</code>
       * @param value The clientId to set.
       * @return This builder for chaining.
       */
      public Builder setClientId(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        clientId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>string clientId = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearClientId() {
        clientId_ = getDefaultInstance().getClientId();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <code>string clientId = 1;</code>
       * @param value The bytes for clientId to set.
       * @return This builder for chaining.
       */
      public Builder setClientIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        clientId_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <code>.ReplyType type = 2;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.ReplyType type = 2;</code>
       * @param value The enum numeric value on the wire for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeValue(int value) {
        type_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>.ReplyType type = 2;</code>
       * @return The type.
       */
      @java.lang.Override
      public ServerReplyOuterClass.ReplyType getType() {
        ServerReplyOuterClass.ReplyType result = ServerReplyOuterClass.ReplyType.forNumber(type_);
        return result == null ? ServerReplyOuterClass.ReplyType.UNRECOGNIZED : result;
      }
      /**
       * <code>.ReplyType type = 2;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(ServerReplyOuterClass.ReplyType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.ReplyType type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object body_ = "";
      /**
       * <code>string body = 3;</code>
       * @return The body.
       */
      public java.lang.String getBody() {
        java.lang.Object ref = body_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          body_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string body = 3;</code>
       * @return The bytes for body.
       */
      public com.google.protobuf.ByteString
          getBodyBytes() {
        java.lang.Object ref = body_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          body_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string body = 3;</code>
       * @param value The body to set.
       * @return This builder for chaining.
       */
      public Builder setBody(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        body_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }
      /**
       * <code>string body = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearBody() {
        body_ = getDefaultInstance().getBody();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
        return this;
      }
      /**
       * <code>string body = 3;</code>
       * @param value The bytes for body to set.
       * @return This builder for chaining.
       */
      public Builder setBodyBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        body_ = value;
        bitField0_ |= 0x00000004;
        onChanged();
        return this;
      }

      private java.lang.Object room_ = "";
      /**
       * <code>string room = 4;</code>
       * @return The room.
       */
      public java.lang.String getRoom() {
        java.lang.Object ref = room_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          room_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string room = 4;</code>
       * @return The bytes for room.
       */
      public com.google.protobuf.ByteString
          getRoomBytes() {
        java.lang.Object ref = room_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          room_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string room = 4;</code>
       * @param value The room to set.
       * @return This builder for chaining.
       */
      public Builder setRoom(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        room_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }
      /**
       * <code>string room = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearRoom() {
        room_ = getDefaultInstance().getRoom();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
        return this;
      }
      /**
       * <code>string room = 4;</code>
       * @param value The bytes for room to set.
       * @return This builder for chaining.
       */
      public Builder setRoomBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        room_ = value;
        bitField0_ |= 0x00000008;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:ServerReply)
    }

    // @@protoc_insertion_point(class_scope:ServerReply)
    private static final ServerReplyOuterClass.ServerReply DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServerReplyOuterClass.ServerReply();
    }

    public static ServerReplyOuterClass.ServerReply getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ServerReply>
        PARSER = new com.google.protobuf.AbstractParser<ServerReply>() {
      @java.lang.Override
      public ServerReply parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ServerReply> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ServerReply> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServerReplyOuterClass.ServerReply getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerReply_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ServerReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ServerReply.proto\"U\n\013ServerReply\022\020\n\010cl" +
      "ientId\030\001 \001(\t\022\030\n\004type\030\002 \001(\0162\n.ReplyType\022\014" +
      "\n\004body\030\003 \001(\t\022\014\n\004room\030\004 \001(\t*\320\001\n\tReplyType" +
      "\022\022\n\016CREATE_SUCCESS\020\000\022\022\n\016CREATE_FAILURE\020\001" +
      "\022\020\n\014JOIN_SUCCESS\020\002\022\020\n\014JOIN_FAILURE\020\003\022\020\n\014" +
      "LIST_SUCCESS\020\004\022\020\n\014LIST_FAILURE\020\005\022\021\n\rLEAV" +
      "E_SUCCESS\020\006\022\021\n\rLEAVE_FAILURE\020\007\022\017\n\013MSG_SU" +
      "CCESS\020\010\022\017\n\013MSG_FAILURE\020\t\022\013\n\007NEW_MSG\020\nb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ServerReply_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ServerReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ServerReply_descriptor,
        new java.lang.String[] { "ClientId", "Type", "Body", "Room", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}