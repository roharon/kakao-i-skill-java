package com.roharon.huformationi.wrapper.component.componentType;

import com.roharon.huformationi.wrapper.component.CanCarousel;
import com.roharon.huformationi.wrapper.type.CarouselHeader;
import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
public class Carousel {

    private String type;

    @Singular("addItem")
    private List<CanCarousel> items;

    private CarouselHeader header;

    public void addItem(CanCarousel ccItem){
        this.items.add(ccItem);
    }


}
