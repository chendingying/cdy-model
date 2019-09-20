package com.cdy.liankao.modular.system.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cdy.liankao.core.common.node.TreeviewNode;
import com.cdy.liankao.core.common.node.ZTreeNode;
import com.cdy.liankao.modular.system.entity.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 部门表 Mapper 接口
 *
 * @Author: cdy
 * @Date: 2019/9/19 16:23
 * @Version 1.0
 */
public interface DeptMapper extends BaseMapper<Dept> {

    /**
     * 获取ztree的节点列表
     */
    List<ZTreeNode> tree();

    /**
     * 获取所有部门列表
     */
    Page<Map<String, Object>> list(@Param("page") Page page, @Param("condition") String condition, @Param("deptId") Long deptId);

    /**
     * 获取所有部门树列表
     */
    List<TreeviewNode> treeviewNodes();

    /**
     * where pids like ''
     */
    List<Dept> likePids(@Param("deptId") Long deptId);
}
