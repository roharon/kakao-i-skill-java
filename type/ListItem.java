package com.roharon.huformationi.wrapper.type;

import com.roharon.huformationi.wrapper.type.subtype.Link;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ListItem {

    private String title;
    private String description;
    private String imageUrl;
    private Link link;

}
