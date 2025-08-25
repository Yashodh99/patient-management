package com.pm.billing_service.grpc;

import billing.BillingResponse;
import billing.BillingRequest;
import billing.BillingServiceGrpc.BillingServiceImplBase;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
public class BillingGrpcService extends BillingServiceImplBase {

    @Override
    public void createBillingAccount(BillingRequest billingRequest, StreamObserver<BillingResponse>responseObserver) {

    }



    }
