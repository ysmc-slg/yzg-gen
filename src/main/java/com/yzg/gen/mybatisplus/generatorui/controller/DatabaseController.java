package com.yzg.gen.mybatisplus.generatorui.controller;

import com.yzg.gen.mybatisplus.generatorui.common.Result;
import com.yzg.gen.mybatisplus.generatorui.common.ResultGenerator;
import com.yzg.gen.mybatisplus.generatorui.dto.TableInfo;
import com.yzg.gen.mybatisplus.generatorui.service.DatabaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/db")
public class DatabaseController {

    @Autowired
    private DatabaseService databaseService;

    @GetMapping("/tables")
    public Result getAllTables() {
        List<TableInfo> tables = databaseService.getTablesFromDb();
        return ResultGenerator.genSuccessResult(tables);
    }

}
