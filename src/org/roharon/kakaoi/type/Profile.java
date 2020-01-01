package org.roharon.kakaoi.type;

import lombok.*;

@Getter
@Builder
@ToString
public class Profile {
    private String nickname;
    private String imageUrl;
}
