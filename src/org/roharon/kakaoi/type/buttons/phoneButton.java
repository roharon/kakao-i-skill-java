package roharon.kakaoi.type.buttons;

import com.roharon.huformationi.wrapper.type.Button;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import roharon.kakaoi.type.Button;

@Getter
@Builder
@ToString
public class phoneButton implements Button {

    private String label;
    @Builder.Default
    private String action = "phone";
    private String phoneNumber;
}
