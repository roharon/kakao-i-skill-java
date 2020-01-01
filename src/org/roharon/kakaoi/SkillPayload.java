package org.roharon.kakaoi;

import org.roharon.kakaoi.payload.Action;
import org.roharon.kakaoi.payload.Bot;
import org.roharon.kakaoi.payload.UserRequest;

import com.google.gson.Gson;
import lombok.*;

@Getter
@ToString
public class SkillPayload{

    public UserRequest userRequest;
    public Bot bot;
    public Action action;

    public SkillPayload(String json) {
        Gson gson = new Gson();
        SkillPayload splData = gson.fromJson(json, SkillPayload.class);

        this.userRequest = splData.userRequest;
        this.bot = splData.bot;
        this.action = splData.action;
    }
}

