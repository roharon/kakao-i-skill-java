package org.roharon.kakaoi.component;

import org.roharon.kakaoi.component.componentType.BasicCard;
import lombok.*;

@Getter
@Builder
@ToString
public class BasicCardView implements Component, CanCarousel {

    private BasicCard basicCard;
}
