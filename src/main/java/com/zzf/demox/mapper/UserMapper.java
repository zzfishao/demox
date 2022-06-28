package com.zzf.demox.mapper;

import com.zzf.demox.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zzf
 * @since 2022-06-26
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    public List<User> selectAll();

    public List<User> selectUserById(Integer id);

    public Integer countUserByUserName(String username);

    public User login(Map<String, Object> map);

    Integer signUp(Map<String, Object> map);

    Integer deleteUserById(Integer id);
}
