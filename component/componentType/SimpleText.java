package com.roharon.huformationi.wrapper.component.componentType;

import com.roharon.huformationi.wrapper.component.Component;
import lombok.*;

@Getter
@Builder
@ToString
public class SimpleText implements Component {
    private String text;
}
