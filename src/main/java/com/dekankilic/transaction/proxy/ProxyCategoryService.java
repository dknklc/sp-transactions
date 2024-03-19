package com.dekankilic.transaction.proxy;

public class ProxyCategoryService {
    private CategoryServiceImpl categoryService;

    public ProxyCategoryService(){
        System.out.println("Proxy Category Service");
    }

    public void create(){
        if(categoryService == null){
            categoryService = new CategoryServiceImpl();
        }

        try{
            System.out.println("Get Transaction");
            categoryService.create();
        } catch (Exception e){
            System.out.println("Rollback Transaction");
        }
        System.out.println("Commit Transaction");
    }
}
