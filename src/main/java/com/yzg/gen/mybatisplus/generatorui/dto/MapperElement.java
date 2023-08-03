package com.yzg.gen.mybatisplus.generatorui.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MapperElement {

    private String id;

    private String content;

    private String comment;

    private ElementPosition location;

    private boolean existed;

}
