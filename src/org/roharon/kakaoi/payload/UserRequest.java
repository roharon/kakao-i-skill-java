package roharon.kakaoi.payload;

import com.roharon.huformationi.wrapper.type.Block;
import com.roharon.huformationi.wrapper.type.User;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class UserRequest{

    public Block block;
    public User user;

    private String timezone;
    private String utterance;
    private String lang;

}
