package com.roharon.huformationi.wrapper.payload;

import com.roharon.huformationi.wrapper.type.DetailParam;
import lombok.*;

import java.util.Map;

@Getter
@Builder
@ToString
public class Action{

    String id;
    String name;
    Map<String, String> params;
    Map<String, DetailParam> detailParams;
    Map<String, Object> clientExtra;
}
