package com.roharon.huformationi.wrapper.type;

import com.roharon.huformationi.wrapper.type.subtype.Properties;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class User {

    public Properties properties;

    private String id;
    private String type;
}
