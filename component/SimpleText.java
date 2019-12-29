package com.roharon.huformationi.wrapper.component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SimpleText implements Component {
    private String text;
    private String altText;
}
