package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.Profile;
import com.roharon.huformationi.wrapper.type.Thumbnail;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class CommerceCard implements Component {

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
