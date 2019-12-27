package com.roharon.huformationi.wrapper;

import com.roharon.huformationi.wrapper.type.ContextControl;
import com.roharon.huformationi.wrapper.type.SkillTemplate;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class SkillResponse {

    private String version;
    private SkillTemplate template;
    private ContextControl context;
    private Object data;

    public SkillResponse(){

    }
}

