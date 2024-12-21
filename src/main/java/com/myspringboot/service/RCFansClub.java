package com.myspringboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myspringboot.repo.myRepository;
import com.myspringboot.model.RC;

@Service
public class RCFansClub {

    @Autowired
    private myRepository repo;

    public void areaOfClub(RC rc) {
        repo.save(rc);
    }

    public boolean checkRs(RC rc) {
        return true;
    }
}
