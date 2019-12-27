package com.roharon.huformationi.wrapper.type;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class QuickReply {

    private String label;
    private String action;
    private String messageText;
    private String blockId;
    private Object extra;

}
