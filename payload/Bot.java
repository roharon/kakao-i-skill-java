package com.roharon.huformationi.wrapper.payload;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
public class Bot{
    String id;
    String name;
}
