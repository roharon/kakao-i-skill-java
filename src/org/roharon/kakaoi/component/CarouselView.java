package org.roharon.kakaoi.component;

import org.roharon.kakaoi.component.componentType.Carousel;
import lombok.*;


@Getter
@Builder
@ToString
public class CarouselView implements Component{

    private Carousel carousel;
}
