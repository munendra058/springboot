package com.myspringboot.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TFI {

    @Value("24000000")
    private int collections;

    private MS ms;

    public void compile() {
        ms.bossOfTFI();
    }

    public int getCollections() {
        return collections;
    }

    public void setCollections(int collections) {
        this.collections = collections;
    }

    public MS getMs() {
        return ms;
    }

    @Autowired
    @Qualifier("pk")
    public void setMs(MS ms) {
        this.ms = ms;
    }

}
