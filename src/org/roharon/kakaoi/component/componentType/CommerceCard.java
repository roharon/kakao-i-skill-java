package org.roharon.kakaoi.component.componentType;

import org.roharon.kakaoi.component.CanCarousel;
import org.roharon.kakaoi.component.Component;
import org.roharon.kakaoi.type.Button;
import org.roharon.kakaoi.type.Profile;
import org.roharon.kakaoi.type.Thumbnail;

import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
public class CommerceCard implements Component, CanCarousel {

    private String description;
    private Integer price;
    private String currency;
    private Integer discount;
    private Integer discountRate;
    private Integer discountedPrice;
    private List<Thumbnail> thumbnails;
    private Profile profile;
    private List<Button> buttons;
}
