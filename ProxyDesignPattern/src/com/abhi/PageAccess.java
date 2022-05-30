package com.abhi;

public class PageAccess implements PageLoader{
    @Override
    public void loadPage(String page) throws Exception{
        System.out.println("Page " + page + " Access and loaded Successfully");
    }
}
