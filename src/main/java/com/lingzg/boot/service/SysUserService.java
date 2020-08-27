package com.lingzg.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lingzg.boot.dao.SysUserDao;
import com.lingzg.boot.model.PageInfo;
import com.lingzg.boot.model.SysUser;
import com.lingzg.boot.model.vo.SysUserVO;

@Service
@Transactional
public class SysUserService{

    @Autowired
    private SysUserDao userDao;
    
    public List<SysUser> findList(){
        return userDao.findAll();
    }
    
    public PageInfo findPage(SysUserVO vo){
    	PageInfo page = new PageInfo(vo);
        List<?> rows = userDao.findPage(vo);
        int total = userDao.findPageCount(vo);
        page.setRows(rows);
        page.setTotal(total);
        return page;
    }
}
