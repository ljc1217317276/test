package com.example.demo.generator.controller;



import com.example.demo.generator.mapper.CustomersMapper;
import com.example.demo.generator.pojo.Customers;
import com.example.demo.generator.service.CustomersService;
import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

/**
 * (Customers)表控制层
 *
 * @author makejava
 * @since 2024-02-21 21:24:16
 */
@Log4j2
@RestController
@RequestMapping("customers")
public class CustomersController  {
    /**
     * 服务对象
     */
    @Resource
    private CustomersMapper customersMapper;


    @GetMapping
    public ResponseEntity<List<Customers>> selectAll() {

        return ResponseEntity.ok(this.customersMapper.selectAll());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<List<Customers>> selectOne(@PathVariable Serializable id) {
        return ResponseEntity.ok(this.customersMapper.selectAllByCustomerId((Integer) id));
    }

    /**
     * 新增数据
     *
     * @param customers 实体对象
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Integer> insert(@RequestBody Customers customers) {
        return ResponseEntity.ok(this.customersMapper.insert((customers) ));
    }

    /**
     * 修改数据
     *
     * @param customers 实体对象
     * @return 修改结果
     */
    @PutMapping
    public ResponseEntity<Integer> update(@RequestBody Customers customers) {
        return ResponseEntity.ok(this.customersMapper.updateById((customers) ));
    }

    /**
     * 删除数据
     *
     *
     * @return 删除结果
     */
    @DeleteMapping
    public ResponseEntity<Integer> delete(@RequestParam("id")  int id) {
        return ResponseEntity.ok(this.customersMapper.deleteByCustomerId((id) ));
    }
}

