package org.roharon.kakaoi;

import org.roharon.kakaoi.type.ContextControl;
import org.roharon.kakaoi.type.SkillTemplate;
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

