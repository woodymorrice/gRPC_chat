# !/bin/bash

# clean compile
#rm -rf ./bin/*
#rm -f src/ClientInterfaceGrpc.java src/ClientInterfaceOuterClass.java \
#src/ClientRequestOuterClass.java src/ServerInterfaceGrpc.java \
#src/ServerInterfaceOuterClass.java src/ServerReplyOuterClass.java

# compile java from proto file
#protoc --plugin=protoc-gen-grpc-java=./plugin/protoc-gen-grpc-java-1.68.0-linux-x86_64.exe \
#-I=./proto --java_out=./src --grpc-java_out=./src ./proto/*.proto

# compile other code
# javac -d bin -cp "lib/grpc-netty-shaded-1.68.0.jar:lib/grpc-protobuf-1.68.0.jar:lib/grpc-stud-1.68.0.jar:lib/protobuf-java-4.28.3.jar" ./src/*.java

# docker
# docker-compose down
# docker-compose up -d --build
# docker attach client1