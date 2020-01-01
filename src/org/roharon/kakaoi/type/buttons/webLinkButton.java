package org.roharon.kakaoi.type.buttons;

import org.roharon.kakaoi.type.Button;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class webLinkButton implements Button {

    @Builder.Default
    private String action = "webLink";
    private String webLinkUrl;
}
