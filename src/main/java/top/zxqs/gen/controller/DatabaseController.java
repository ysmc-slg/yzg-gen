package top.zxqs.gen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.zxqs.gen.common.Result;
import top.zxqs.gen.common.ResultGenerator;
import top.zxqs.gen.dto.TableInfo;
import top.zxqs.gen.service.DatabaseService;

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
