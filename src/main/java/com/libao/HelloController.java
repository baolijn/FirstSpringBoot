package com.libao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
   @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value =  "/say", method = RequestMethod.GET)
    public String say(@RequestParam("id") Integer myid){
        return "id: " + myid;
        //return girlProperties.getCupSize();
    }
}
