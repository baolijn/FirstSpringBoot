package com.libao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GirlService {
    @Autowired
    GirlRepository girlRepository;

    public void insertTwo(){
        Girl girl1 =new Girl();
        girl1.setAge(19);
        girl1.setCupSize("C");
        girlRepository.save(girl1);

        Girl girl2 =new Girl();
        girl2.setAge(19);
        girl2.setCupSize("CSSS");
        girlRepository.save(girl2);
    }
}
