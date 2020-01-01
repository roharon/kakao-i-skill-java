package org.roharon.kakaoi.component.componentType;

import lombok.Builder;
import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import org.roharon.kakaoi.component.CanCarousel;
import org.roharon.kakaoi.component.Component;
import org.roharon.kakaoi.type.Button;
import org.roharon.kakaoi.type.Profile;
import org.roharon.kakaoi.type.Social;
import org.roharon.kakaoi.type.Thumbnail;

import java.util.List;

@Getter
@Builder
@ToString
public class BasicCard implements Component, CanCarousel {

    private String title;
    private String description;
    private Thumbnail thumbnaill;
    private Profile profile;
    private Social social;

    @Singular("addButton")
    private List<Button> buttons;
}

