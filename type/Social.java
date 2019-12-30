package com.roharon.huformationi.wrapper.type;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Social {

    private Long like;
    private Long comment;
    private Long share;
}
