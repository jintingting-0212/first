package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject31sx {

        Project31sxDelegate project31sxDelegate = new Project31sxDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project31sxDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}