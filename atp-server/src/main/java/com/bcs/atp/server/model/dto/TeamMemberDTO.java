package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 团队成员表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("团队成员表DTO")
public class TeamMemberDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "角色")
  private String role;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "团队ID")
  private String teamId;


}
