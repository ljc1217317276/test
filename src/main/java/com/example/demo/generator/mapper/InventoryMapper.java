package com.example.demo.generator.mapper;
import java.util.List;

import com.example.demo.generator.pojo.Inventory;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author Administrator
* @description 针对表【inventory】的数据库操作Mapper
* @createDate 2024-02-21 20:42:25
* @Entity generator.pojo.Inventory
*/
@Mapper
public interface InventoryMapper extends BaseMapper<Inventory> {
//根据mybatis-plus上的BaseMapper上面的方法自动生成crud


    List<Inventory> selectByVehicle();

    int updateInventoryId(@Param("inventoryId") Integer inventoryId);



    List<Inventory> selectAllByInventoryId(@Param("inventoryId") Integer inventoryId);

    int insertAll(Inventory inventory);

    int deleteByInventoryId(@Param("inventoryId") Integer inventoryId);

    int updateSelective(Inventory inventory);
}




