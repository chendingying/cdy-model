package com.cdy.liankao.modular.system.warpper;

import com.cdy.liankao.core.common.node.TreeviewNode;

import java.util.List;

/**
 * 部门列表树的包装
 *
 * @Author: cdy
 * @Date: 2019/9/19 16:48
 * @Version 1.0
 */
public class DeptTreeWrapper {

    public static void clearNull(List<TreeviewNode> list) {
        if (list == null) {
            return;
        } else {
            if (list.size() == 0) {
                return;
            } else {
                for (TreeviewNode node : list) {
                    if (node.getNodes() != null) {
                        if (node.getNodes().size() == 0) {
                            node.setNodes(null);
                        } else {
                            clearNull(node.getNodes());
                        }
                    }
                }
            }
        }
    }
}
