package com.example.wand.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.wand.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author TangZT
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    User findByUsername(String username);
}
