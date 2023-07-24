package com.cny.springmvc.service;

import com.cny.springmvc.demos.web.PathVariableController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : chennengyuan
 */
@Slf4j
@Service
public class ServiceA {

    @Autowired
    private PathVariableController pathVariableController;

    public void m1() {
        pathVariableController.run();
        System.out.println("m1 m1 m1 m1");
    }

}
