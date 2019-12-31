package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.component.componentType.ListCard;

import lombok.*;


@Getter
@Builder
@ToString
public class ListCardView implements Component{

    private ListCard listCard;
}
