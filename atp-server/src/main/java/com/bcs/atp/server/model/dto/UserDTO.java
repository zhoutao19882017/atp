package com.bcs.atp.server.model.dto;

import com.soulcraft.mybatis.common.enums.EYesOrNo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 用户表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("用户表DTO")
public class UserDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "邮箱")
  private String email;

  @ApiModelProperty(value = "密码")
  private String password;

  @ApiModelProperty(value = "显示名称")
  private String displayName;

  @ApiModelProperty(value = "头像链接")
  private String photoUrl;

  @ApiModelProperty(value = "是否管理员：0-否；1-是")
  private EYesOrNo isAdmin;

  @ApiModelProperty(value = "刷新令牌")
  private String refreshToken;

  @ApiModelProperty(value = "当前REST会话")
  private String currentRestSession;

  @ApiModelProperty(value = "当前GQL会话")
  private String currentGqlSession;


}
