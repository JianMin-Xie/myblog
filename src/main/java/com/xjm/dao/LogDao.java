package com.xjm.dao;

import com.xjm.model.LogDomain;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


    List<LogDomain> getLogs();
}
