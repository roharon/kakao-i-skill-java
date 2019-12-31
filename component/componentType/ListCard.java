package com.roharon.huformationi.wrapper.component;

import com.roharon.huformationi.wrapper.type.Button;
import com.roharon.huformationi.wrapper.type.ListItem;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ListCard implements Component{

    private ListItem header;
    private ListItem items;
    private List<Button> buttons;
}
