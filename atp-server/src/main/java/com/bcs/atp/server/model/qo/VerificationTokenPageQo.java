package com.bcs.atp.server.model.qo;

import com.soulcraft.network.resp.page.PageQuery;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 验证码表 分页查询对象
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Builder
@NoArgsConstructor
//@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@ApiModel(value = "验证码表分页查询对象", description = "验证码表分页查询对象")
public class VerificationTokenPageQo extends PageQuery implements Serializable {

  private static final long serialVersionUID = 1L;

}
