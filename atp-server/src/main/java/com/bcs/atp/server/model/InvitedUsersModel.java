package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 受邀用户表
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("invited_users")
@ApiModel(value = "受邀用户表对象", description = "受邀用户表")
public class InvitedUsersModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "管理员用户ID")
  @TableField("admin_uid")
  private String adminUid;

  @ApiModelProperty(value = "管理员邮箱")
  @TableField("admin_email")
  private String adminEmail;

  @ApiModelProperty(value = "受邀人邮箱")
  @TableField("invitee_email")
  private String inviteeEmail;

  @ApiModelProperty(value = "受邀时间")
  @TableField("invited_on")
  private Date invitedOn;


}
