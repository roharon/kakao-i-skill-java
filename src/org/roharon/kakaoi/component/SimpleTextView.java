package org.roharon.kakaoi.component;

import org.roharon.kakaoi.component.componentType.SimpleText;
import lombok.*;

@Getter
@Builder
@ToString
public class SimpleTextView implements Component {

    private SimpleText simpleText;
}
