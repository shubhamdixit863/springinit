package com.myfirstdemo.springbeginner.services;


import com.myfirstdemo.springbeginner.beans.IocExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Services {

    @Autowired
    private IocExample iocExample;

    public void getData(){
        System.out.println(iocExample.getAge());

    }


}
