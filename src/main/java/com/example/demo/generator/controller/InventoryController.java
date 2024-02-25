package com.example.demo.generator.controller;
import com.example.demo.generator.mapper.InventoryMapper;
import com.example.demo.generator.pojo.Inventory;
import jakarta.annotation.Resource;
import lombok.extern.log4j.Log4j2;
import org.apache.ibatis.annotations.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



/**
 * (Inventory)表控制层
 *
 * @author makejava
 * @since 2024-02-21 21:24:45
 */
@Log4j2
@RestController
@RequestMapping("inventory")
public class InventoryController {
    /**
     * 服务对象
     */
    @Resource
    private InventoryMapper inventoryMapper;

    @GetMapping
    public ResponseEntity<Inventory> queryByPage(@Param("inventoryId") Integer id) {
        return ResponseEntity.ok(this.inventoryMapper.selectById(id));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Inventory> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.inventoryMapper.selectById(id));
    }

    /**
     * 新增数据
     *
     * @param inventory 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Integer> add( @RequestBody Inventory inventory) {
        return ResponseEntity.ok(this.inventoryMapper.insert(inventory));
    }

    /**
     * 编辑数据
     *
     * @param inventory 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Integer> edit(@RequestBody Inventory inventory) {
        return ResponseEntity.ok(this.inventoryMapper.updateSelective(inventory));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping("{id}")
    public ResponseEntity<Integer> deleteById(@RequestParam("id") Integer id) {
        return ResponseEntity.ok(this.inventoryMapper.deleteById(id));
    }

}

