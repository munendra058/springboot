package com.myspringboot.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class RC implements MS {

    public void bossOfTFI() {

        System.out.println("RC Fans Association");
    }
}
