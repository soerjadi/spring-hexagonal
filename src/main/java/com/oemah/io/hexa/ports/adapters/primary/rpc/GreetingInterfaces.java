package com.oemah.io.hexa.ports.adapters.primary.rpc;

import com.oemah.io.hexa.proto.*;

import io.grpc.stub.StreamObserver;

public interface GreetingInterfaces {
    public void greeting(com.google.protobuf.Empty request, StreamObserver<GreetingResponse> responseObserver); 
}
