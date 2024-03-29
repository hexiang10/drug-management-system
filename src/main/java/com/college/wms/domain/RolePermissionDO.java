package com.college.wms.domain;

import java.io.Serializable;

/**
 * URL 的角色角色权限信息
 */
public class RolePermissionDO  implements Serializable {

    /**
     * URL 的角色角色权限信息名称
     */
    private String name;

    /**
     * URL 的角色角色权限信息对应的 URL
     */
    private String url;

    /**
     * URL 的角色角色权限信息对应的角色
     */
    private String role;


    /**
     * 对应的 getter & setter
     */

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "RolePermissionDO{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
