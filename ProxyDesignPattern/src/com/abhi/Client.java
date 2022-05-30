package com.abhi;

public class Client {
    public static void main(String[] args)
    {
        ProxyPageAccess proxyPageAccess = new ProxyPageAccess();
        try{
            //proxyPageAccess.loadPage("youtube");
            proxyPageAccess.loadPage("google");
        }catch (Exception e){
            System.out.println("Exception occurred" +e.getMessage());
            e.printStackTrace();
        }
    }
}
