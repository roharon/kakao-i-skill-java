package org.roharon.kakaoi.component.componentType;

import org.roharon.kakaoi.component.Component;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class SimpleImage implements Component {

    private String imageUrl;
    private String altText;
}
