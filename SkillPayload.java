package com.roharon.huformationi.wrapper;

import com.roharon.huformationi.wrapper.payload.Action;
import com.google.gson.Gson;
import com.roharon.huformationi.wrapper.payload.Bot;
import com.roharon.huformationi.wrapper.payload.UserRequest;
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

