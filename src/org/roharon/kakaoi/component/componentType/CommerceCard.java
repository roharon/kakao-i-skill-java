package roharon.kakaoi.component.componentType;

import com.roharon.huformationi.wrapper.component.CanCarousel;
import com.roharon.huformationi.wrapper.component.Component;
import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.Profile;
import com.roharon.huformationi.wrapper.type.Thumbnail;
import lombok.*;
import roharon.kakaoi.component.CanCarousel;
import roharon.kakaoi.component.Component;

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
