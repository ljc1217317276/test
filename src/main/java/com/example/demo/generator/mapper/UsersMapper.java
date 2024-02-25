package com.example.demo.generator.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.generator.pojo.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【users】的数据库操作Mapper
* @createDate 2024-02-21 20:42:25
* @Entity generator.pojo.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {
    int addAll(Users users);

    List<Users> selectAll();
    List<Users> selectAllByUserId(@Param("userId") Integer userId);

    int updateSelective(Users users);

    int deleteByUserId(@Param("userId") Integer userId);

    int insertSelective(Users users);

    List<Users> selectAllByEmail(@Param("email") String email);
}




