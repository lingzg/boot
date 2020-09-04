package com.lingzg.boot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.lingzg.boot.model.SysUser;

public class BaseController {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	protected SysUser getCurrentUser(){
		return null;
	}
}
