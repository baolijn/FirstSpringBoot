package com.libao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
   @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value =  "/say", method = RequestMethod.GET)
    public String say(){
        return girlProperties.getCupSize();
    }
}
