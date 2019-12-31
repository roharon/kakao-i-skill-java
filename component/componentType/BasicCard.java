package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.Profile;
import com.roharon.huformationi.wrapper.type.Social;
import com.roharon.huformationi.wrapper.type.Thumbnail;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class BasicCard implements Component, CanCarousel{

    private String title;
    private String description;
    private Thumbnail thumbnaill;
    private Profile profile;
    private Social social;
    private List<Button> buttons;
}
