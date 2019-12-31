package com.roharon.huformationi.wrapper.component.componentType;

import com.roharon.huformationi.wrapper.component.Component;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class SimpleImage implements Component {

    private String imageUrl;
    private String altText;

}
