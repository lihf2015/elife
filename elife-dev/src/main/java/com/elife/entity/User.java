package com.elife.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author lihf
 * @since 2019-11-11
 */
@TableName("t_user")
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    @TableField(value="t_username", fill = FieldFill.INSERT)
    private String name;
    private String password;
    private String email;
    private Integer sex;
    @TableField(value="create_time", fill = FieldFill.INSERT)
    private Date  createTime;

    @TableField(value="update_time", fill = FieldFill.INSERT, update="NOW()")
    private Date  updateTime;

    @TableField(value="create_t_user", fill = FieldFill.INSERT)
    private String createUser;

    @TableField(value="update_t_user", fill = FieldFill.INSERT)
    private String updateUser;

//    @Version
//    @TableField(value="version", fill = FieldFill.INSERT, update="%s+1")
//    protected Long version;

}
