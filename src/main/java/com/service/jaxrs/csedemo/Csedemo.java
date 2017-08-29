package com.service.jaxrs.csedemo;

import com.service.jaxrs.csedemo.model.Person;

import java.util.List;
import java.io.InputStream;

public interface Csedemo {

    Integer add(Integer a,Integer b);


    String sayHei(String name);


    String sayHello(String name);


    String sayHi(String name);


    String saySomething(String prefix,Person user);

}