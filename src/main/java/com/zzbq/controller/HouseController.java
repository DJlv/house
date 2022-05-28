package com.zzbq.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zzbq.common.R;
import com.zzbq.entity.House;
import com.zzbq.service.HouseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private HouseService houseService;

    /**
     * 查询所有
     * @return
     */
    @GetMapping
    public R getAll() {
        log.info("查询数据");
        return new R(true, houseService.list());
    }

    @PostMapping
    public R save(@RequestBody House house) {
        return new R(houseService.save(house));
    }

    @PutMapping
    public R update(@RequestBody House house) {
        return new R(houseService.updateById(house));
    }


    @DeleteMapping("{id}")
    public R delete(@PathVariable Integer id) {
        return new R(houseService.removeById(id));
    }

    @GetMapping("{name}")
    public R getmAll(@PathVariable String name) {
        System.out.println(name);
        QueryWrapper<House> wrapper = new QueryWrapper<>();
        wrapper.like("materialname", name);
        List<House> houses = houseService.list(wrapper);
        System.out.println(houses);
        return new R(true, houses);
    }
}
