package com.example.demo.generator.mapper;
import java.util.Date;
import java.util.List;
import java.math.BigDecimal;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.generator.pojo.Sales;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
* @author Administrator
* @description 针对表【sales】的数据库操作Mapper
* @createDate 2024-02-21 20:42:25
* @Entity generator.pojo.Sales
*/
@Mapper
public interface SalesMapper extends BaseMapper<Sales> {
    int updateSalePrice(@Param("salePrice") BigDecimal salePrice);

    int deleteByCustomerId(@Param("customerId") Integer customerId);

    List<Sales> selectAllByCustomerId(@Param("customerId") Integer customerId);

    int insertAll(Sales sales);

    List<Sales> selectAll();

    int updateUpdatedAt(@Param("updatedAt") Date updatedAt);

    int updateSelective(Sales sales);
}




