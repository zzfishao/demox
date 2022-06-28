package com.zzf.demox.service.impl;

import com.zzf.demox.entity.User;
import com.zzf.demox.mapper.UserMapper;
import com.zzf.demox.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zzf
 * @since 2022-06-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    public List<User> getUserById(Integer id) {
        return userMapper.selectUserById(id);
    }

    public Integer getLogin(String username, String pwd) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("pwd", pwd);
        return (userMapper.countUserByUserName(username) == 0 ? 1 : (userMapper.login(map) == null ? 0 : 2));
    }

    public Integer getSignUp(String username, String pwd) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("pwd", pwd);
        return (userMapper.countUserByUserName(username) != 0 ? 1 : (userMapper.signUp(map) == null ? 0 : 2));
    }

    public Integer deleteUserById(Integer id) {
        return userMapper.deleteUserById(id);
    }
}
