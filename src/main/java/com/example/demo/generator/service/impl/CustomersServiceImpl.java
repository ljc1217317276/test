package com.example.demo.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.generator.service.CustomersService;
import com.example.demo.generator.pojo.Customers;
import com.example.demo.generator.mapper.CustomersMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【customers】的数据库操作Service实现
* @createDate 2024-02-21 20:42:25
*/
@Service
public class CustomersServiceImpl extends ServiceImpl<CustomersMapper, Customers>
    implements CustomersService {

}




