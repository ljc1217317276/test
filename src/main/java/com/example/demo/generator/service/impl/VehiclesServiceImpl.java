package com.example.demo.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.generator.mapper.VehiclesMapper;
import com.example.demo.generator.pojo.Vehicles;
import com.example.demo.generator.service.VehiclesService;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【vehicles】的数据库操作Service实现
* @createDate 2024-02-21 20:42:25
*/
@Service
public class VehiclesServiceImpl extends ServiceImpl<VehiclesMapper, Vehicles>
    implements VehiclesService{

}




