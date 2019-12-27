package com.roharon.huformationi.wrapper.type;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Getter
@Builder
public class Block {
    String id;
    String name;

    @Override
    public String toString() {

        HashMap<String, String> map = new HashMap<>();
        map.put("id", id);
        map.put("name", name);

        return map.toString();
    }
}
