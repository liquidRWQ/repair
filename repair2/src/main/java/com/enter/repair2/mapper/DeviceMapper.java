package com.enter.repair2.mapper;

import com.enter.repair2.entity.Device;
import org.apache.ibatis.annotations.CacheNamespace;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
/**
*@className DeviceMapper
*
*@auther Liquid
*
*@description 
*
*@date   2018/11/21 
*/
@CacheNamespace
@org.apache.ibatis.annotations.Mapper
@Repository
public interface DeviceMapper extends Mapper<Device> {
}