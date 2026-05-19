package com.oemah.io.hexa.adapters.primary.rpc;

import org.springframework.grpc.server.service.GrpcService;

import com.oemah.io.hexa.ports.adapters.primary.rpc.GreetingInterfaces;
import com.oemah.io.hexa.proto.*;
import com.oemah.io.hexa.proto.GreetingServiceGrpc;
import io.grpc.stub.StreamObserver;

@GrpcService
public class GreetingRPC extends GreetingServiceGrpc.GreetingServiceImplBase implements GreetingInterfaces {

    @Override
    public void greeting(com.google.protobuf.Empty request, StreamObserver<GreetingResponse> responseObserver) {
        GreetingResponse response = GreetingResponse.newBuilder()
            .setContent("hello world")
            .build();
            
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
    
}
