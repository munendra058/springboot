package com.myspringboot.repo;

import org.springframework.stereotype.Repository;

import com.myspringboot.model.RC;

@Repository
public class myRepository {

    public void save(RC rc) {
        System.out.println("Saved in DB");
    }

}
