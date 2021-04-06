package com.xjm.service.relation.impl;

import com.xjm.dao.RelationShipDao;
import com.xjm.service.relation.RelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *  Created by JianMin-xie on 2019/4/30.
 */
@Service
public class RelationShipServiceImpl implements RelationShipService {

    @Autowired
    private RelationShipDao relationShipDao;


}
