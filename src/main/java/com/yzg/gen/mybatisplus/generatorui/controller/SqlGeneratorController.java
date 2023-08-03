package com.yzg.gen.mybatisplus.generatorui.controller;

import com.yzg.gen.mybatisplus.generatorui.GeneratorConfig;
import com.yzg.gen.mybatisplus.generatorui.common.Result;
import com.yzg.gen.mybatisplus.generatorui.common.ResultGenerator;
import com.yzg.gen.mybatisplus.generatorui.dto.GenDtoFromSqlReq;
import com.yzg.gen.mybatisplus.generatorui.service.SqlGeneratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sql")
public class SqlGeneratorController {

    @Autowired
    private SqlGeneratorService sqlGeneratorService;

    @Autowired
    private GeneratorConfig generatorConfig;

    @GetMapping("/basepackage")
    public Result getBasepackage() {
        return ResultGenerator.genSuccessResult(generatorConfig.getBasePackage());
    }


    @PostMapping("/gen-mapper-method")
    public Result genMapperMethodFromSQL(@RequestBody GenDtoFromSqlReq params) throws Exception {
        sqlGeneratorService.genMapperMethod(params);
        return ResultGenerator.genSuccessResult();
    }


}
