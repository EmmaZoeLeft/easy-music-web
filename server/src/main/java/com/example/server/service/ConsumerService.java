package com.example.server.service;

import com.example.server.domain.Consumer;

import java.util.List;

public interface ConsumerService {
    /**
     * 新增用户
     * @param consumer
     * @return
     */
    boolean addUser(Consumer consumer);

    /**
     * 更新用户简介
     * @param consumer
     * @return
     */
    boolean updateUserMsg(Consumer consumer);

    /**
     * 更新用户头像
     * @param consumer
     * @return
     */
    boolean updateUserAvator(Consumer consumer);

    /**
     * ??existUser
     * @param username
     * @return
     */
    boolean existUser(String username);

    /**
     * 验证用户名和密码
     * @param username
     * @param password
     * @return
     */
    boolean veritypasswd(String username, String password);

    /**
     * 删除用户
     * @param id
     * @return
     */
    boolean deleteUser(Integer id);

    /**
     * 返回所有用户
     * @return
     */
    List<Consumer> allUser();

    /**
     * 返回指定用户
     * @param id
     * @return
     */
    List<Consumer> userOfId(Integer id);

    /**
     * 检验登录状态
     * @param username
     * @return
     */
    List<Consumer> loginStatus(String username);
}
