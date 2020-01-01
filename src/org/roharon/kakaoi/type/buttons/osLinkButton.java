package org.roharon.kakaoi.type.buttons;

import org.roharon.kakaoi.type.Button;
import org.roharon.kakaoi.type.subtype.Link;

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
