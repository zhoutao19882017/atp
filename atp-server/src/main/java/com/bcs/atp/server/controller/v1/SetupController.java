package com.bcs.atp.server.controller.v1;

import cn.hutool.core.bean.BeanUtil;
import com.bcs.atp.server.constant.InfraConfigEnum;
import com.bcs.atp.server.error.ResponseEnum;
import com.bcs.atp.server.gql.types.InfraConfig;
import com.bcs.atp.server.model.InfraConfigModel;
import com.bcs.atp.server.service.InfraConfigService;
import com.soulcraft.network.resp.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author zhoutao
 * @since 2024/06/17
 */
@RestController
@Api(tags = {"设置管理"})
@RequestMapping("/v1/site")
public class SetupController {

    @Autowired
    private InfraConfigService infraConfigService;

    @ApiOperation("查询是否初次设置")
    @GetMapping("/setup")
    public R<InfraConfig> fetchSetupInfo() {
        InfraConfigModel infraConfigModel = infraConfigService.queryByName(InfraConfigEnum.IS_FIRST_TIME_INFRA_SETUP.getValue());
        ResponseEnum.INFRA_CONFIG_NOT_FOUND.assertNotNull(infraConfigModel);
        InfraConfig infraConfig = new InfraConfig();
        BeanUtil.copyProperties(infraConfigModel, infraConfig);
        return R.success(infraConfig);
    }

    @ApiOperation("修改设置为已完成")
    @PutMapping("/setup")
    public boolean setSetupAsComplete() {
        return infraConfigService.setSetupAsComplete();
    }

}
