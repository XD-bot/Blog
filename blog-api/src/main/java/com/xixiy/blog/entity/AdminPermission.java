package com.xixiy.blog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author xixiy
 * @since 2021-10-09
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("ms_admin_permission")
public class AdminPermission implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long adminId;

    private Long permissionId;


}
