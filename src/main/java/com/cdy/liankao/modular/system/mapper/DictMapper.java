package com.cdy.liankao.modular.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cdy.liankao.core.common.node.ZTreeNode;
import com.cdy.liankao.modular.system.entity.Dict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *  基础字典 Mapper 接口
 * @Author: cdy
 * @Date: 2019/9/19 16:24
 * @Version 1.0
 */
public interface DictMapper extends BaseMapper<Dict> {

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> dictTree(@Param("dictTypeId") Long dictTypeId);

    /**
     * where parentIds like ''
     */
    List<Dict> likeParentIds(@Param("dictId") Long dictId);
}
