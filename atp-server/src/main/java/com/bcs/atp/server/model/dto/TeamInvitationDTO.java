package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 团队邀请表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("团队邀请表DTO")
public class TeamInvitationDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "团队ID")
  private String teamId;

  @ApiModelProperty(value = "创建人用户ID")
  private String creatorUid;

  @ApiModelProperty(value = "受邀人邮箱")
  private String inviteeEmail;

  @ApiModelProperty(value = "受邀人角色")
  private String inviteeRole;


}
