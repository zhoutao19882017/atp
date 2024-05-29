package com.bcs.atp.server.model.qo;

import com.soulcraft.network.resp.page.PageQuery;
import io.swagger.annotations.ApiModel;
import lombok.*;

import java.io.Serializable;

/**
 * <p>
 * 团队集合表 分页查询对象
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
@ApiModel(value = "团队集合表分页查询对象", description = "团队集合表分页查询对象")
public class TeamCollectionPageQo extends PageQuery implements Serializable {

  private static final long serialVersionUID = 1L;

}
