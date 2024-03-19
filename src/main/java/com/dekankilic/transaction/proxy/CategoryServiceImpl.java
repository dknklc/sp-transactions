package com.dekankilic.transaction.proxy;

import org.springframework.transaction.annotation.Transactional;

public class CategoryServiceImpl {

    @Transactional
    public void create(){
        System.out.println("Category Service");
    }
}
