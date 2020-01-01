package roharon.kakaoi.component;

import com.roharon.huformationi.wrapper.component.componentType.SimpleImage;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class SimpleImageView implements Component {

    private SimpleImage simpleImage;
}
