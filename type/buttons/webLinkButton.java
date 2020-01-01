package com.roharon.huformationi.wrapper.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
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
