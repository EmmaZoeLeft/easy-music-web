package com.example.server.service;

public interface AdminService {
    /**
     * 验证用户名密码
     * @param name
     * @param password
     * @return
     */
    boolean verifypasswd(String name, String password);
}
