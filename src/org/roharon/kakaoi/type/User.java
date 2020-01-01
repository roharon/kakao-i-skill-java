package org.roharon.kakaoi.type;

import org.roharon.kakaoi.type.subtype.Properties;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@Builder
@ToString
public class User {

    public Properties properties;

    private String id;
    private String type;
}
