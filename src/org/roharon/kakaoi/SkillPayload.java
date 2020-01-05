package org.roharon.kakaoi;

import org.roharon.kakaoi.payload.Action;
import org.roharon.kakaoi.payload.Bot;
import org.roharon.kakaoi.payload.Intent;
import org.roharon.kakaoi.payload.UserRequest;

import lombok.*;

@Getter
@ToString
public class SkillPayload{

    public UserRequest userRequest;
    public Intent intent;

    public Bot bot;
    public Action action;
}

