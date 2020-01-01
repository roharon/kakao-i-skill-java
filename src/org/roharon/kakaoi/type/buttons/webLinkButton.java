package roharon.kakaoi.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import roharon.kakaoi.type.Button;

@Getter
@Builder
@ToString
public class webLinkButton implements Button {

    @Builder.Default
    private String action = "webLink";
    private String webLinkUrl;
}
