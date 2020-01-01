package org.roharon.kakaoi.payload;

import org.roharon.kakaoi.type.Block;
import org.roharon.kakaoi.type.User;
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
