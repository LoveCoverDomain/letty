package com.bfbm.netty.protocol.json.server;

public class ServerStartup {
    public static void main(String[] args) throws Exception {
        //启动server服务
        new NettyServer().bind(8080);
    }
}
