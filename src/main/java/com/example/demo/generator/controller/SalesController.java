package com.example.demo.generator.controller;

import com.example.demo.generator.mapper.SalesMapper;
import com.example.demo.generator.pojo.Customers;
import com.example.demo.generator.pojo.Sales;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.List;

@RestController
@RequestMapping("sale")
public class SalesController {
    //注入对应的mapper
   private SalesMapper salesMapper;
    //生成符合rest风格crud的函数方法
    @GetMapping
    public ResponseEntity<List<Sales>> selectAll() {
        return ResponseEntity.ok(this.salesMapper.selectAll());
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<List<Sales>> selectOne(@PathVariable Serializable id) {
        return ResponseEntity.ok(this.salesMapper.selectAllByCustomerId((Integer) id));
    }


    @PostMapping
    public ResponseEntity<Integer> insert(@RequestBody Sales sales) {
        return ResponseEntity.ok(this.salesMapper.updateSelective(sales));
    }


    @PutMapping
    public ResponseEntity<Integer> update(@RequestBody Sales sales) {
        return ResponseEntity.ok(this.salesMapper.updateById((sales) ));
    }


    @DeleteMapping
    public ResponseEntity<Integer> delete(@RequestParam("id")  int id) {
        return ResponseEntity.ok(this.salesMapper.deleteByCustomerId((id) ));
    }
    }





