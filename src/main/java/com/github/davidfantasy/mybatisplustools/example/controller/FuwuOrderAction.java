package com.github.davidfantasy.mybatisplustools.example.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.github.davidfantasy.mybatisplustools.example.service.FuwuOrderService;
import com.github.davidfantasy.mybatisplustools.example.entity.FuwuOrder;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 
 * @since 2023-08-03
 */
@Controller
@RequestMapping("/fuwuOrder")
public class FuwuOrderAction {


    @Autowired
    private FuwuOrderService fuwuOrderService;

    @GetMapping(value = "/")
    public ResponseEntity<Page<FuwuOrder>> list(@RequestParam(required = false) Integer current, @RequestParam(required = false) Integer pageSize) {
        if (current == null) {
            current = 1;
        }
        if (pageSize == null) {
            pageSize = 10;
        }
        Page<FuwuOrder> aPage = fuwuOrderService.page(new Page<>(current, pageSize));
        return new ResponseEntity<>(aPage, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<FuwuOrder> getById(@PathVariable("id") String id) {
        return new ResponseEntity<>(fuwuOrderService.getById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Object> create(@RequestBody FuwuOrder params) {
        fuwuOrderService.save(params);
        return new ResponseEntity<>("created successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable("id") String id) {
        fuwuOrderService.removeById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }

    @PostMapping(value = "/update")
    public ResponseEntity<Object> delete(@RequestBody FuwuOrder params) {
        fuwuOrderService.updateById(params);
        return new ResponseEntity<>("updated successfully", HttpStatus.OK);
    }
}
