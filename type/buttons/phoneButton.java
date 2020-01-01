package com.roharon.huformationi.wrapper.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class phoneButton implements Button {

    private String label;
    @Builder.Default
    private String action = "phone";
    private String phoneNumber;
}
