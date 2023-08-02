package top.zxqs.gen.dto;

import lombok.Data;

@Data
public class GenDtoFromSqlReq {

    private String sql;

    private GenDtoConfig config = new GenDtoConfig();

}
