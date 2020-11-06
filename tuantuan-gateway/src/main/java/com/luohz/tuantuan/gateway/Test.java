package com.luohz.tuantuan.gateway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: tuantuanmail
 * @description:
 * @author: luohz
 * @create: 2020-11-05 20:25
 **/
@RestController
public class Test {

    @GetMapping("/str")
    public String str(){
        return "hello";
    }
}
