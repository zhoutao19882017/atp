package com.bcs.atp.server.model.qo;

import com.soulcraft.network.resp.page.PageQuery;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 基础配置表 分页查询对象
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
@ApiModel(value = "基础配置表分页查询对象", description = "基础配置表分页查询对象")
public class InfraConfigPageQo extends PageQuery implements Serializable {

  private static final long serialVersionUID = 1L;

}
