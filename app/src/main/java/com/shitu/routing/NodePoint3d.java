package com.shitu.routing;

import java.util.ArrayList;

import com.shitu.routing.Point3d;
/**
 * Created by DongliangLyu on 2015/12/3.
 */
public class NodePoint3d {
    Point3d pt;
    int index;
    double time = 1.0E10;
    //当前节点的其他邻域节点索引
    ArrayList dualNodeIndex = new ArrayList<>();
    //所属的边索引
    ArrayList edgeIndex = new ArrayList<>();

    public NodePoint3d() {
        pt = new Point3d();
        index = -1;
    }

    public NodePoint3d(Point3d pt0, int index0) {
        pt = pt0;
        index = index0;
    }

    @Override
    public boolean equals(Object o) {
        NodePoint3d pt = (NodePoint3d)o;
        if (null != pt) {
            return (this.index == pt.index) && (Math.abs(this.time - pt.time) < 0.01);
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.index;
    }
}
