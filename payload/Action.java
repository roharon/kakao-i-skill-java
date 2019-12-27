package com.roharon.huformationi.wrapper.payload;

import com.roharon.huformationi.wrapper.type.DetailParam;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Map;

@Getter
@Builder
public class Action{

    String id;
    String name;
    Map<String, String> params;
    Map<String, DetailParam> detailParams;
    Map<String, Object> clientExtra;
}
