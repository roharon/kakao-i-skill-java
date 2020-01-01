package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.component.componentType.Carousel;
import lombok.*;


@Getter
@Builder
@ToString
public class CarouselView implements Component{

    private Carousel carousel;
}
