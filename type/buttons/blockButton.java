package com.roharon.huformationi.wrapper.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class blockButton implements Button {
    private String label;
    @Builder.Default
    private String action = "block";
    private String messageText;
    private String blockId;
}
