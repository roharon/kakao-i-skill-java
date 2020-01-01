package com.roharon.huformationi.wrapper.component.componentType;

import com.roharon.huformationi.wrapper.component.CanCarousel;
import com.roharon.huformationi.wrapper.component.Component;
import com.roharon.huformationi.wrapper.type.CarouselHeader;
import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
public class Carousel implements Component{

    private String type;
    private CarouselHeader header;
    @Singular("addItem")
    private List<CanCarousel> items;

}
