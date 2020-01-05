package org.roharon.kakaoi.payload;

import org.roharon.kakaoi.type.Block;
import org.roharon.kakaoi.type.User;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@Getter
@Builder
@ToString
public class UserRequest{

    public Block block;
    public User user;
    public Map<String, String> params;

    private String timezone;
    private String utterance;
    private String lang;

}
