package com.oemah.io.record.ports.adapters.primary.rpc;

import com.oemah.io.record.proto.*;

import io.grpc.stub.StreamObserver;

public interface GreetingInterfaces {
    public void greeting(com.google.protobuf.Empty request, StreamObserver<GreetingResponse> responseObserver); 
}
