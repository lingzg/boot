package com.lingzg.boot.model;

import com.alibaba.fastjson.JSON;

public class SysPermission {

	private String permission;

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	public String toString(){
        return JSON.toJSONString(this);
    }
}
