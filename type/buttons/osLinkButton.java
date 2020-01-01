package com.roharon.huformationi.wrapper.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.subtype.Link;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class osLinkButton implements Button {

    @Builder.Default
    private String action = "osLink";
    private Link osLink;
}
