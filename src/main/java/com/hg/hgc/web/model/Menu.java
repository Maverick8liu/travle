package com.hg.hgc.web.model;

/**
 * 
 * @author liuguoyu
 *
 * @since 2016年4月26日下午2:35:53
 */
public class Menu {
   
    private Integer menuid;

    private String menucode;

    private String menuname;

    private String parentmenucode;

    private String url;

    private Integer isleaf;

    private Integer menulevel;

    private Integer status;

    public Menu(){}
    
    
    
    public Integer getMenuid() {
        return menuid;
    }

    public void setMenuid(Integer menuid) {
        this.menuid = menuid;
    }

    public String getMenucode() {
        return menucode;
    }

    public void setMenucode(String menucode) {
        this.menucode = menucode;
    }

    public String getMenuname() {
        return menuname;
    }

    public void setMenuname(String menuname) {
        this.menuname = menuname;
    }

    public String getParentmenucode() {
        return parentmenucode;
    }

    public void setParentmenucode(String parentmenucode) {
        this.parentmenucode = parentmenucode;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getIsleaf() {
        return isleaf;
    }

    public void setIsleaf(Integer isleaf) {
        this.isleaf = isleaf;
    }

    public Integer getMenulevel() {
        return menulevel;
    }

    public void setMenulevel(Integer menulevel) {
        this.menulevel = menulevel;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}