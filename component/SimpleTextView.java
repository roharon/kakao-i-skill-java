package com.roharon.huformationi.wrapper.component;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class SimpleText implements Component {
    private String text;
}
