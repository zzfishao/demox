package com.zzf.demox.service;

import com.zzf.demox.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author zzf
 * @since 2022-06-26
 */
public interface IUserService extends IService<User> {
    public List<User> getAllUser();

    public List<User> getUserById(Integer id);

    public Integer getLogin(String username, String pwd);

    public Integer getSignUp(String username, String pwd);

    public Integer deleteUserById(Integer id);
}
