package org.roharon.kakaoi.payload;

import org.roharon.kakaoi.type.DetailParam;
import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Builder
@ToString
public class Action{

    String id;
    String name;
    Map<String, String> params;
    Map<String, List<DetailParam>> detailParams;
    Map<String, List<Object>> clientExtra;
}
