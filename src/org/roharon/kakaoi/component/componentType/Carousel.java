package org.roharon.kakaoi.component.componentType;

import org.roharon.kakaoi.component.CanCarousel;
import org.roharon.kakaoi.component.Component;
import org.roharon.kakaoi.type.CarouselHeader;

import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
public class Carousel implements Component {

    private String type;
    private CarouselHeader header;
    @Singular("addItem")
    private List<CanCarousel> items;

}
