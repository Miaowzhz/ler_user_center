package com.wu.usercenter.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wu.usercenter.model.domain.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author DuoLong
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2024-02-20 18:43:20
*/
public interface UserService extends IService<User> {


    /**
     * 用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 校验密码
     * @param planetCode 星球编号
     * @return 新用户id
     */
    long userRegister(String userAccount,String userPassword,String checkPassword,String planetCode);

    /**
     * 用户登录
     *  @param userAccount 用户账号
     *  @param userPassword 用户密码
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    int deleteUserById(Long id);

    /**
     * 修改用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);
}
