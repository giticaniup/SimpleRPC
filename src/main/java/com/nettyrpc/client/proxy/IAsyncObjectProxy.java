package com.nettyrpc.client.proxy;

import com.nettyrpc.client.RPCFuture;

/**
 * RPC调用代理接口
 */
public interface IAsyncObjectProxy {
    public RPCFuture call(String funcName, Object... args);
}