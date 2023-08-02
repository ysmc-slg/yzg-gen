package top.zxqs.gen.dto;

import lombok.Data;

import java.util.List;

@Data
public class MpgGenCodeDto {

    private List<String> tables;

    private GenSetting genSetting;

}
