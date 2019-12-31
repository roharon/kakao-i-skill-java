package com.roharon.huformationi.wrapper.type;

import com.roharon.huformationi.wrapper.type.subtype.Link;
import lombok.*;

@Getter
@Builder
@ToString
public class Thumbnail {
    private String imageUrl;
    private Link link;
    private Boolean fixedRaio;
    private Integer width;
    private Integer height;

}
