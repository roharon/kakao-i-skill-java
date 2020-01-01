package org.roharon.kakaoi.type.buttons;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import org.roharon.kakaoi.type.Button;

@Getter
@Builder
@ToString
public class messageButton implements Button {

    @Builder.Default
    private String action = "message";
    private String messageText;
}
