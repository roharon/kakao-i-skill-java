package org.roharon.kakaoi.component;

import org.roharon.kakaoi.component.componentType.SimpleImage;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SimpleImageView implements Component {

    private SimpleImage simpleImage;
}
