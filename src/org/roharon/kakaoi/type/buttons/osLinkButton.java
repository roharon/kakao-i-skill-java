package roharon.kakaoi.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.subtype.Link;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import roharon.kakaoi.type.Button;
import roharon.kakaoi.type.subtype.Link;

@Getter
@Builder
@ToString
public class osLinkButton implements Button {

    @Builder.Default
    private String action = "osLink";
    private Link osLink;
}
