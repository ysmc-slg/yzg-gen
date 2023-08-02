package top.zxqs.gen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.zxqs.gen.GeneratorConfig;
import top.zxqs.gen.common.Result;
import top.zxqs.gen.common.ResultGenerator;
import top.zxqs.gen.dto.GenDtoFromSqlReq;
import top.zxqs.gen.service.SqlGeneratorService;

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
