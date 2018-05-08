package com.q18idc.sbms.demo.mapper;

import com.q18idc.sbms.demo.entity.User;
import com.q18idc.sbms.demo.utils.MyMapper;
import org.apache.ibatis.annotations.CacheNamespaceRef;
import org.springframework.stereotype.Repository;

@Repository
@CacheNamespaceRef(UserMapper.class)
public interface UserMapper extends MyMapper<User> {
}