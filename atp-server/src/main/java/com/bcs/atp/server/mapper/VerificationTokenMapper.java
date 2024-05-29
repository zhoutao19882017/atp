package com.bcs.atp.server.mapper;

import com.bcs.atp.server.model.VerificationTokenModel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * <p>
 * 验证码表 Mapper 接口
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Repository
public interface VerificationTokenMapper extends BaseMapper<VerificationTokenModel> {

}
