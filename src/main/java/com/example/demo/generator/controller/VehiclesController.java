package com.example.demo.generator.controller;

import com.example.demo.generator.mapper.VehiclesMapper;
import com.example.demo.generator.pojo.Users;
import com.example.demo.generator.pojo.Vehicles;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VehiclesController {
    VehiclesMapper vehiclesMapper;
    @GetMapping
    public ResponseEntity<List<Vehicles>> queryByOne(@Param("vehicleId") Integer vehicleId) {
        return ResponseEntity.ok(this.vehiclesMapper.selectByVehicleId(vehicleId));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Vehicles> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.vehiclesMapper.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param vehicles 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Integer> add(@RequestBody Vehicles vehicles) {
        return ResponseEntity.ok(this.vehiclesMapper.insertSelective(vehicles));
    }

    /**
     * 编辑数据
     *
     * @param vehicles 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Integer> edit(@RequestBody Vehicles vehicles) {
        return ResponseEntity.ok(this.vehiclesMapper.updateSelective(vehicles));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Integer> deleteById(@PathVariable("id")  Integer id) {
        return ResponseEntity.ok(this.vehiclesMapper.deleteById(id));
    }

}
