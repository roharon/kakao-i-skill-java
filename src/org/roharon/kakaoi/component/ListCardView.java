package org.roharon.kakaoi.component;

import org.roharon.kakaoi.component.componentType.ListCard;

import lombok.*;


@Getter
@Builder
@ToString
public class ListCardView implements Component{

    private ListCard listCard;
}
