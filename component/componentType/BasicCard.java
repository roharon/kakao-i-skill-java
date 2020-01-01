package com.roharon.huformationi.wrapper.component.componentType;

import com.roharon.huformationi.wrapper.component.CanCarousel;
import com.roharon.huformationi.wrapper.component.Component;
import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.Profile;
import com.roharon.huformationi.wrapper.type.Social;
import com.roharon.huformationi.wrapper.type.Thumbnail;
import lombok.*;

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

