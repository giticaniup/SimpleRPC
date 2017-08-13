package com.nettyrpc.client;

/**
 * 异步回调
 */
public interface AsyncRPCCallback {

    void success(Object result);

    void fail(Exception e);

}
