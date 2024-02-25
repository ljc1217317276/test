package com.example.demo.generator.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.generator.pojo.Vehicles;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【vehicles】的数据库操作Mapper
* @createDate 2024-02-21 20:42:25
* @Entity generator.pojo.Vehicles
*/
@Mapper
public interface VehiclesMapper extends BaseMapper<Vehicles> {
    int addAll(Vehicles vehicles);

    List<Vehicles> selectByVehicleId(@Param("vehicleId") Integer vehicleId);
    List<Vehicles> selectAllByModel(@Param("model") String model);

    int deleteByVehicleId(@Param("vehicleId") Integer vehicleId);

    int updateSelective(Vehicles vehicles);

    int insertSelective(Vehicles vehicles);
}




