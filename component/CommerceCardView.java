package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.component.componentType.CommerceCard;

import lombok.*;

@Getter
@Builder
@ToString
public class CommerceCardView implements Component, CanCarousel {

    private CommerceCard commerceCard;
}
