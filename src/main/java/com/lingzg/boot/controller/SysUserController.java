package com.lingzg.boot.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lingzg.boot.model.PageInfo;
import com.lingzg.boot.model.vo.SysUserVO;
import com.lingzg.boot.service.SysUserService;

/**
 * @since 2020/08/21
 * @author lingzg
 * 用户管理
 */
@Controller
@RequestMapping("/user")
public class SysUserController {

    @Autowired
    private SysUserService userService;
    
    @RequestMapping("/page")
    public String page(HttpServletRequest request, HttpServletResponse response, ModelMap model, SysUserVO vo){
        PageInfo page = userService.findPage(vo);
        model.addAttribute("page", page);
        return "system/user";
    }
    
    @RequestMapping("/list")
    public String list(HttpServletRequest request, HttpServletResponse response, ModelMap model, SysUserVO vo){
        PageInfo page = userService.findPage(vo);
        model.addAttribute("page", page);
        return "system/user::table";
    }
}
