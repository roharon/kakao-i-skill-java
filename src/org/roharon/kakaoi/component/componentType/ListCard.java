package org.roharon.kakaoi.component.componentType;

import org.roharon.kakaoi.component.Component;
import org.roharon.kakaoi.type.Button;
import org.roharon.kakaoi.type.ListItem;

import lombok.*;

import java.util.List;

@Getter
@Builder
@ToString
public class ListCard implements Component {

    private ListItem header;
    private ListItem items;
    private List<Button> buttons;
}
