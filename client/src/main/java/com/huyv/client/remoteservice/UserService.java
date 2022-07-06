package com.huyv.client.remoteservice;

import com.huyv.client.rpc.RemoteClass;

@RemoteClass("com.huyv.server.service.UserService")
public interface UserService {
    Integer getUserCount();
}
