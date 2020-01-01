package roharon.kakaoi.component.componentType;

import com.roharon.huformationi.wrapper.component.Component;
import lombok.*;
import roharon.kakaoi.component.Component;

@Getter
@Builder
@ToString
public class SimpleText implements Component {
    private String text;
}
