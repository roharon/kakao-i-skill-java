package com.roharon.huformationi.wrapper.type;

import lombok.*;

@Getter
@Builder
@ToString
public class QuickReply {

    private String label;
    private String action;
    private String messageText;
    private String blockId;
    private Object extra;
}
