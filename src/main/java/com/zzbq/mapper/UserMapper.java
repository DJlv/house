package com.zzbq.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zzbq.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
