package com.roharon.huformationi.wrapper;

import com.roharon.huformationi.wrapper.type.ContextControl;
import com.roharon.huformationi.wrapper.type.SkillTemplate;
import lombok.*;

@Getter
@Builder
@ToString
public class SkillResponse {

    @Builder.Default
    private String version = "2.0";
    private SkillTemplate template;
    private ContextControl context;
    private Object data;
}

