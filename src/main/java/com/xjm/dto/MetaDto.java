package com.xjm.dto;

import com.xjm.model.MetaDomain;

/**
 * 标签、分类列表
 *  Created by JianMin-xie on 2019/4/30.
 */
public class MetaDto extends MetaDomain {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
