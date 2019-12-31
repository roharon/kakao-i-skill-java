package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.component.componentType.SimpleText;
import lombok.*;

@Getter
@Builder
@ToString
public class SimpleTextView implements Component {

    private SimpleText simpleText;
}
