package com.hell.crud.controller;

import com.hell.crud.entity.SysUser;
import com.hell.crud.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author jeremy 17344995941@163.com
 * @Description :com.hell.crud.controller
 * @Date:Created in   2024/10/26
 */

@RestController
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService userService;

    @GetMapping("/list")
    public List<SysUser> query(){
        return userService.list();
    }

    /**
     * 根据ID获取用户详情
     * @param userId 用户ID
     * @return 用户对象
     */
    @GetMapping("/{userId}")
    public SysUser getUserById(@PathVariable Long userId) {
        return userService.getById(userId);
    }

    /**
     * 添加新用户
     * @param sysUser 用户对象
     * @return 添加后的用户对象
     */
    @PostMapping
    public boolean createUser(@RequestBody SysUser sysUser) {
        return userService.save(sysUser);
    }

    /**
     * 更新用户信息
     * @param sysUser 更新后的用户对象
     * @return 更新后的用户对象
     */
    @PutMapping
    public boolean updateUser(@RequestBody SysUser sysUser) {
        return userService.updateById(sysUser);
    }

    /**
     * 根据ID删除用户
     * @param userId 用户ID
     * @return 删除结果
     */
    @DeleteMapping("/{userId}")
    public boolean deleteUser(@PathVariable Long userId) {
        return userService.removeById(userId);
    }
}
