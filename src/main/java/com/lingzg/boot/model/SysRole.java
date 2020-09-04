package com.lingzg.boot.model;

import java.util.List;

import com.alibaba.fastjson.JSON;

public class SysRole {

	private String role;
	private List<SysPermission> permissions;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	public List<SysPermission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<SysPermission> permissions) {
		this.permissions = permissions;
	}

	public String toString(){
        return JSON.toJSONString(this);
    }
}
