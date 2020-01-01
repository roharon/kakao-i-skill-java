package roharon.kakaoi.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import roharon.kakaoi.type.Button;

@Getter
@Builder
@ToString
public class messageButton implements Button {

    @Builder.Default
    private String action = "message";
    private String messageText;
}
