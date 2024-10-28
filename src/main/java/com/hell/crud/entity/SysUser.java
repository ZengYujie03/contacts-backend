package com.hell.crud.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 用户对象 sys_user
 *
 * @author hell
 */
@Data
@TableName(value = "sys_user")
public class SysUser
{
    private static final long serialVersionUID = 1L;
    /** 用户ID */
    @TableId(value = "id",type = IdType.AUTO)
    private String id;
    /** 用户账号 */
    private String userName;
    /** 用户昵称 */
    private String nickName;
    /** 用户邮箱 */
    private String email;

    /** 手机号码 */
    private String phonenumber;
    /** 用户性别 */
    private String sex;
    /** 密码 */
    private String password;

    /** 帐号状态（0正常 1停用） */
    private String status;

    /** 删除标志（0代表存在 2代表删除） */
    private String delFlag;

}
