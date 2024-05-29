package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.ShortcodeMapper;
import com.bcs.atp.server.model.ShortcodeModel;
import com.bcs.atp.server.model.qo.ShortcodePageQo;
import com.bcs.atp.server.service.ShortcodeService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 简码表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class ShortcodeServiceImpl extends ServiceImpl<ShortcodeMapper, ShortcodeModel> implements ShortcodeService {
  @Override
  public boolean create(ShortcodeModel shortcode) {
    return save(shortcode);
  }

  @Override
  public boolean update(ShortcodeModel shortcode) {
    return updateById(shortcode);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<ShortcodeModel> list(ShortcodePageQo pageQo) {
    IPage<ShortcodeModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<ShortcodeModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<ShortcodeModel> listAll() {
    QueryWrapper<ShortcodeModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<ShortcodeModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
