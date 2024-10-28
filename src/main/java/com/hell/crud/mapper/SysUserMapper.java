package com.hell.crud.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hell.crud.entity.SysUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Author jeremy 17344995941@163.com
 * @Description :com.hell.crud.dao
 * @Date:Created in   2024/10/26
 */
@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {

}
