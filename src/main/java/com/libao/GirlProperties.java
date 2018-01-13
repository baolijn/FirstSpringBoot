package com.libao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "girl")
public class GirlProperties {
    public void setCupSize(String cupSize) {
        this.cupSize = cupSize;
    }

    private String cupSize;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

    public String getCupSize() {
        return cupSize;
    }
}
