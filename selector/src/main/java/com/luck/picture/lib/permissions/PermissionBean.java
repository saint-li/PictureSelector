package com.luck.picture.lib.permissions;

public class PermissionBean {
    private int icon;
    private String name;
    private String desc;

    public PermissionBean(int icon, String name, String desc) {
        this.icon = icon;
        this.name = name;
        this.desc = desc;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
