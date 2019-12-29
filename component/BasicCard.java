package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.Profile;
import com.roharon.huformationi.wrapper.type.Social;
import com.roharon.huformationi.wrapper.type.Thumbnail;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Builder
@ToString
public class BasicCard implements Component{

    private String title;
    private String description;
    private Thumbnail thumbnaill;
<<<<<<< HEAD
    private Profile profile;
    private Social social;
    //TODO Thumbnail, Profile, Social 클래스 구현
=======
    //TODO Thumbnail 클래스 추가
    private Profile profile;
    private Social social;
>>>>>>> master
    private List<Button> buttons;
}
