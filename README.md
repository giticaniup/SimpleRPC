# NettyRpc
An RPC framework based on Netty, ZooKeeper  
包含RPC框架中需要解决的一些问题：
## 透明化调用
    解决方案：动态代理
## 编解码
    解决方案：ProtoStuff
## 通信：
    解决方案：Netty
## 调用结果返回
    解决方案：在request中添加标识ID
## 服务发布和管理
    解决方案：Zookeeper