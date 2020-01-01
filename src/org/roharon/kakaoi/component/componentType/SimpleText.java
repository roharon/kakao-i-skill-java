package org.roharon.kakaoi.component.componentType;

import org.roharon.kakaoi.component.Component;
import lombok.*;

@Getter
@Builder
@ToString
public class SimpleText implements Component {
    private String text;
}
