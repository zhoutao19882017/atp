package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 团队邀请表
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
@TableName("team_invitation")
@ApiModel(value = "团队邀请表对象", description = "团队邀请表")
public class TeamInvitationModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "团队ID")
  @TableField("team_id")
  private String teamId;

  @ApiModelProperty(value = "创建人用户ID")
  @TableField("creator_uid")
  private String creatorUid;

  @ApiModelProperty(value = "受邀人邮箱")
  @TableField("invitee_email")
  private String inviteeEmail;

  @ApiModelProperty(value = "受邀人角色")
  @TableField("invitee_role")
  private String inviteeRole;


}
