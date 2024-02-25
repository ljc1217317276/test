package com.example.demo.generator.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.Collection;

import com.example.demo.generator.pojo.Customers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【customers】的数据库操作Mapper
* @createDate 2024-02-21 20:42:25
* @Entity generator.pojo.Customers
*/
@Mapper
public interface CustomersMapper extends BaseMapper<Customers> {
    int insertBatch(@Param("customersCollection") Collection<Customers> customersCollection);
    int insertBatchSelective(@Param("customersCollection") Collection<Customers> customersCollection);

    int deleteByCustomerId(@Param("customerId") Integer customerId);

        int updateByCustomerName(Customers customers);

    List<Customers> selectAllByCustomerId(@Param("customerId") Integer customerId);

    List<Customers> selectAll();
}




