package com.roharon.huformationi.wrapper.component;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SimpleImage implements Component {

    private String imageUrl;
    private String altText;

}
