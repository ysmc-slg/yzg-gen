package com.yzg.gen.mybatisplus.generatorui.controller;

import com.yzg.gen.mybatisplus.generatorui.common.Result;
import com.yzg.gen.mybatisplus.generatorui.common.ResultGenerator;
import com.yzg.gen.mybatisplus.generatorui.dto.OutputFileInfo;
import com.yzg.gen.mybatisplus.generatorui.service.OutputFileInfoService;
import com.yzg.gen.mybatisplus.generatorui.service.UserConfigStore;
import com.yzg.gen.mybatisplus.generatorui.strategy.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/output-file-info")
public class OutputFileInfoController {

    @Autowired
    private OutputFileInfoService outputFileInfoService;

    @Autowired
    private UserConfigStore userConfigStore;

    @GetMapping("/user-config")
    public Result getUserConfig() {
        return ResultGenerator.genSuccessResult(userConfigStore.getDefaultUserConfig());
    }

    @PostMapping("/delete")
    public Result deleteOutputInfos(@RequestBody OutputFileInfo outputFileInfo) throws IOException {

        outputFileInfoService.deleteOutputFileInfo(outputFileInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/save")
    public Result saveOutputInfos(@RequestBody OutputFileInfo outputFileInfo) throws IOException {
        outputFileInfoService.saveOutputFileInfo(outputFileInfo);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/save-entity-strategy")
    public Result saveEntityStrategy(@RequestBody EntityStrategy entityStrategy) throws IOException {
        outputFileInfoService.saveEntityStrategy(entityStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/save-mapper-strategy")
    public Result saveMapperStrategy(@RequestBody MapperStrategy mapperStrategy) throws IOException {
        outputFileInfoService.saveMapperStrategy(mapperStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/save-mapper-xml-strategy")
    public Result saveMapperXmlStrategy(@RequestBody MapperXmlStrategy mapperXmlStrategy) throws IOException {
        outputFileInfoService.saveMapperXmlStrategy(mapperXmlStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/save-controller-strategy")
    public Result saveControllerStrategy(@RequestBody ControllerStrategy controllerStrategy) throws IOException {
        outputFileInfoService.saveControllerStrategy(controllerStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/save-service-strategy")
    public Result saveServiceStrategy(@RequestBody ServiceStrategy serviceStrategy) throws IOException {
        outputFileInfoService.saveServiceStrategy(serviceStrategy);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/save-service-impl-strategy")
    public Result saveServiceImplStrategy(@RequestBody MapperXmlStrategy ServiceImplStrategy) throws IOException {
        outputFileInfoService.saveMapperXmlStrategy(ServiceImplStrategy);
        return ResultGenerator.genSuccessResult();
    }


}
