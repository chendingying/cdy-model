package com.cdy.liankao.modular.system.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.cdy.liankao.modular.system.entity.Relation;
import com.cdy.liankao.modular.system.mapper.RelationMapper;
import org.springframework.stereotype.Service;

/**
 * 角色和菜单关联表 服务实现类
 *
 * @Author: cdy
 * @Date: 2019/9/19 16:35
 * @Version 1.0
 */
@Service
public class RelationService  extends ServiceImpl<RelationMapper, Relation> {
}
