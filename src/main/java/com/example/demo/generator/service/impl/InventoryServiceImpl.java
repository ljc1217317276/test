package com.example.demo.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.generator.service.InventoryService;
import com.example.demo.generator.pojo.Inventory;
import com.example.demo.generator.mapper.InventoryMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【inventory】的数据库操作Service实现
* @createDate 2024-02-21 20:42:25
*/
@Service
public class InventoryServiceImpl extends ServiceImpl<InventoryMapper, Inventory>
    implements InventoryService {

}




