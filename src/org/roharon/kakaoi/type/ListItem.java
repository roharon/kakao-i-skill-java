package org.roharon.kakaoi.type;

import org.roharon.kakaoi.type.subtype.Link;
import lombok.*;

@Getter
@Builder
@ToString
public class ListItem {

    private String title;
    private String description;
    private String imageUrl;
    private Link link;

}
