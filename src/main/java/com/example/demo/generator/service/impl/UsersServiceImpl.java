package com.example.demo.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.generator.mapper.UsersMapper;
import com.example.demo.generator.service.UsersService;
import com.example.demo.generator.pojo.Users;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Service实现
* @createDate 2024-02-21 20:42:25
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService {

}




