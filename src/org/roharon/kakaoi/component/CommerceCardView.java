package org.roharon.kakaoi.component;

import org.roharon.kakaoi.component.componentType.CommerceCard;

import lombok.*;

@Getter
@Builder
@ToString
public class CommerceCardView implements Component, CanCarousel {

    private CommerceCard commerceCard;
}
