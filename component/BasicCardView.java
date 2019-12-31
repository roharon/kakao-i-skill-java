package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.component.componentType.BasicCard;
import lombok.*;

@Getter
@Builder
@ToString
public class BasicCardView implements Component, CanCarousel {

    private BasicCard basicCard;
}
