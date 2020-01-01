package roharon.kakaoi.component.componentType;

import com.roharon.huformationi.wrapper.component.Component;
import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.ListItem;
import lombok.*;
import roharon.kakaoi.component.Component;

import java.util.List;

@Getter
@Builder
@ToString
public class ListCard implements Component {

    private ListItem header;
    private ListItem items;
    private List<Button> buttons;
}
