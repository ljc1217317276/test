package com.example.demo.generator.controller;

import com.example.demo.generator.mapper.UsersMapper;
import com.example.demo.generator.pojo.Inventory;
import com.example.demo.generator.pojo.Users;
import jakarta.annotation.Resource;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    public class InventoryController {
        /**
         * 服务对象
         */
        @Resource
        private UsersMapper usersMapper;

        @GetMapping
        public ResponseEntity<List<Users>> queryByPage(@Param("userId") Integer userId) {
            return ResponseEntity.ok(this.usersMapper.selectAllByUserId(userId));
        }

        /**
         * 通过主键查询单条数据
         *
         * @param id 主键
         * @return 单条数据
         */
        @GetMapping("{id}")
        public ResponseEntity<Users> queryById(@PathVariable("id") Integer id) {
            return ResponseEntity.ok(this.usersMapper.selectById(id));
        }

        /**
         * 新增数据
         *
         * @param user 实体
         * @return 新增结果
         */
        @PostMapping
        public ResponseEntity<Integer> add(@RequestBody Users user) {
            return ResponseEntity.ok(this.usersMapper.insertSelective(user));
        }

        /**
         * 编辑数据
         *
         * @param user 实体
         * @return 编辑结果
         */
        @PutMapping
        public ResponseEntity<Integer> edit(@RequestBody Users user) {
            return ResponseEntity.ok(this.usersMapper.updateSelective(user));
        }

        /**
         * 删除数据
         *
         * @param id 主键
         * @return 删除是否成功
         */
        @DeleteMapping("/{id}")
        public ResponseEntity<Integer> deleteById(@PathVariable("id")  Integer id) {
            return ResponseEntity.ok(this.usersMapper.deleteById(id));
        }

    }

}
