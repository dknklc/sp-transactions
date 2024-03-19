package com.dekankilic.transaction.proxy;

import com.dekankilic.transaction.service.CategoryService;

public class Test {
    public static void main(String[] args) {
        ProxyCategoryService categoryService = new ProxyCategoryService();
        categoryService.create();
    }
}
