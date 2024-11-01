// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: ClientRequest.proto
// Protobuf Java Version: 4.28.3

package wmfx;

public final class ClientRequestOuterClass {
  private ClientRequestOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 3,
      /* suffix= */ "",
      ClientRequestOuterClass.class.getName());
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
   * <pre>
   * Tags for client requests.
   * </pre>
   *
   * Protobuf enum {@code RequestType}
   */
  public enum RequestType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NONE = 0;</code>
     */
    NONE(0),
    /**
     * <code>CREATE = 1;</code>
     */
    CREATE(1),
    /**
     * <code>JOIN = 2;</code>
     */
    JOIN(2),
    /**
     * <code>LIST = 3;</code>
     */
    LIST(3),
    /**
     * <code>LEAVE = 4;</code>
     */
    LEAVE(4),
    /**
     * <code>MESSAGE = 5;</code>
     */
    MESSAGE(5),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        RequestType.class.getName());
    }
    /**
     * <code>NONE = 0;</code>
     */
    public static final int NONE_VALUE = 0;
    /**
     * <code>CREATE = 1;</code>
     */
    public static final int CREATE_VALUE = 1;
    /**
     * <code>JOIN = 2;</code>
     */
    public static final int JOIN_VALUE = 2;
    /**
     * <code>LIST = 3;</code>
     */
    public static final int LIST_VALUE = 3;
    /**
     * <code>LEAVE = 4;</code>
     */
    public static final int LEAVE_VALUE = 4;
    /**
     * <code>MESSAGE = 5;</code>
     */
    public static final int MESSAGE_VALUE = 5;


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
    public static RequestType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RequestType forNumber(int value) {
      switch (value) {
        case 0: return NONE;
        case 1: return CREATE;
        case 2: return JOIN;
        case 3: return LIST;
        case 4: return LEAVE;
        case 5: return MESSAGE;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RequestType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        RequestType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RequestType>() {
            public RequestType findValueByNumber(int number) {
              return RequestType.forNumber(number);
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
      return wmfx.ClientRequestOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final RequestType[] VALUES = values();

    public static RequestType valueOf(
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

    private RequestType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:RequestType)
  }

  public interface ClientRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ClientRequest)
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
     * <code>.RequestType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    int getTypeValue();
    /**
     * <code>.RequestType type = 2;</code>
     * @return The type.
     */
    wmfx.ClientRequestOuterClass.RequestType getType();

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
   * <pre>
   * Message object that client sends to server.
   * </pre>
   *
   * Protobuf type {@code ClientRequest}
   */
  public static final class ClientRequest extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:ClientRequest)
      ClientRequestOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 3,
        /* suffix= */ "",
        ClientRequest.class.getName());
    }
    // Use ClientRequest.newBuilder() to construct.
    private ClientRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ClientRequest() {
      clientId_ = "";
      type_ = 0;
      body_ = "";
      room_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return wmfx.ClientRequestOuterClass.internal_static_ClientRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return wmfx.ClientRequestOuterClass.internal_static_ClientRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              wmfx.ClientRequestOuterClass.ClientRequest.class, wmfx.ClientRequestOuterClass.ClientRequest.Builder.class);
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
     * <code>.RequestType type = 2;</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override public int getTypeValue() {
      return type_;
    }
    /**
     * <code>.RequestType type = 2;</code>
     * @return The type.
     */
    @java.lang.Override public wmfx.ClientRequestOuterClass.RequestType getType() {
      wmfx.ClientRequestOuterClass.RequestType result = wmfx.ClientRequestOuterClass.RequestType.forNumber(type_);
      return result == null ? wmfx.ClientRequestOuterClass.RequestType.UNRECOGNIZED : result;
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
      if (type_ != wmfx.ClientRequestOuterClass.RequestType.NONE.getNumber()) {
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
      if (type_ != wmfx.ClientRequestOuterClass.RequestType.NONE.getNumber()) {
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
      if (!(obj instanceof wmfx.ClientRequestOuterClass.ClientRequest)) {
        return super.equals(obj);
      }
      wmfx.ClientRequestOuterClass.ClientRequest other = (wmfx.ClientRequestOuterClass.ClientRequest) obj;

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

    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static wmfx.ClientRequestOuterClass.ClientRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static wmfx.ClientRequestOuterClass.ClientRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static wmfx.ClientRequestOuterClass.ClientRequest parseFrom(
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
    public static Builder newBuilder(wmfx.ClientRequestOuterClass.ClientRequest prototype) {
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
     * <pre>
     * Message object that client sends to server.
     * </pre>
     *
     * Protobuf type {@code ClientRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ClientRequest)
        wmfx.ClientRequestOuterClass.ClientRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return wmfx.ClientRequestOuterClass.internal_static_ClientRequest_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return wmfx.ClientRequestOuterClass.internal_static_ClientRequest_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                wmfx.ClientRequestOuterClass.ClientRequest.class, wmfx.ClientRequestOuterClass.ClientRequest.Builder.class);
      }

      // Construct using wmfx.ClientRequestOuterClass.ClientRequest.newBuilder()
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
        return wmfx.ClientRequestOuterClass.internal_static_ClientRequest_descriptor;
      }

      @java.lang.Override
      public wmfx.ClientRequestOuterClass.ClientRequest getDefaultInstanceForType() {
        return wmfx.ClientRequestOuterClass.ClientRequest.getDefaultInstance();
      }

      @java.lang.Override
      public wmfx.ClientRequestOuterClass.ClientRequest build() {
        wmfx.ClientRequestOuterClass.ClientRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public wmfx.ClientRequestOuterClass.ClientRequest buildPartial() {
        wmfx.ClientRequestOuterClass.ClientRequest result = new wmfx.ClientRequestOuterClass.ClientRequest(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(wmfx.ClientRequestOuterClass.ClientRequest result) {
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
        if (other instanceof wmfx.ClientRequestOuterClass.ClientRequest) {
          return mergeFrom((wmfx.ClientRequestOuterClass.ClientRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(wmfx.ClientRequestOuterClass.ClientRequest other) {
        if (other == wmfx.ClientRequestOuterClass.ClientRequest.getDefaultInstance()) return this;
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
       * <code>.RequestType type = 2;</code>
       * @return The enum numeric value on the wire for type.
       */
      @java.lang.Override public int getTypeValue() {
        return type_;
      }
      /**
       * <code>.RequestType type = 2;</code>
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
       * <code>.RequestType type = 2;</code>
       * @return The type.
       */
      @java.lang.Override
      public wmfx.ClientRequestOuterClass.RequestType getType() {
        wmfx.ClientRequestOuterClass.RequestType result = wmfx.ClientRequestOuterClass.RequestType.forNumber(type_);
        return result == null ? wmfx.ClientRequestOuterClass.RequestType.UNRECOGNIZED : result;
      }
      /**
       * <code>.RequestType type = 2;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(wmfx.ClientRequestOuterClass.RequestType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.RequestType type = 2;</code>
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

      // @@protoc_insertion_point(builder_scope:ClientRequest)
    }

    // @@protoc_insertion_point(class_scope:ClientRequest)
    private static final wmfx.ClientRequestOuterClass.ClientRequest DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new wmfx.ClientRequestOuterClass.ClientRequest();
    }

    public static wmfx.ClientRequestOuterClass.ClientRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ClientRequest>
        PARSER = new com.google.protobuf.AbstractParser<ClientRequest>() {
      @java.lang.Override
      public ClientRequest parsePartialFrom(
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

    public static com.google.protobuf.Parser<ClientRequest> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ClientRequest> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public wmfx.ClientRequestOuterClass.ClientRequest getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientRequest_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_ClientRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ClientRequest.proto\"Y\n\rClientRequest\022\020" +
      "\n\010clientId\030\001 \001(\t\022\032\n\004type\030\002 \001(\0162\014.Request" +
      "Type\022\014\n\004body\030\003 \001(\t\022\014\n\004room\030\004 \001(\t*O\n\013Requ" +
      "estType\022\010\n\004NONE\020\000\022\n\n\006CREATE\020\001\022\010\n\004JOIN\020\002\022" +
      "\010\n\004LIST\020\003\022\t\n\005LEAVE\020\004\022\013\n\007MESSAGE\020\005B\006\n\004wmf" +
      "xb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ClientRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ClientRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_ClientRequest_descriptor,
        new java.lang.String[] { "ClientId", "Type", "Body", "Room", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
