package com.hg.hgc.web.model;

/**
 * 角色实体model
 * @author lyj
 *
 * @since 2016年4月26日下午2:11:44
 */
public class Role {
  
    private Integer roleid;

    private String rolename;

    private Integer status;
    
    public Role(){}

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}