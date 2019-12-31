package com.roharon.huformationi.wrapper.type;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CarouselHeader {

    private String title;
    private String description;
    private Thumbnail thumbnail;

}
