package com.abhi;

public class ProxyPageAccess implements PageLoader{
    private PageLoader pageAccess;

    public ProxyPageAccess()
    {
        pageAccess = new PageAccess();
    }

    @Override
    public void loadPage(String page) throws Exception {
        if(page.equalsIgnoreCase("youtube"))
        {
            throw new Exception(page+" is blocked by ISP");
        }
        else
        {
            pageAccess.loadPage(page);
        }

    }
}
