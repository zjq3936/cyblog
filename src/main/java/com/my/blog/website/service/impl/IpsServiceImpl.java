package com.my.blog.website.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.my.blog.website.dao.IpsMapper;
import com.my.blog.website.model.Vo.Ips;
import com.my.blog.website.service.IIpsService;

@Service
public class IpsServiceImpl implements IIpsService {

	@Resource
    private IpsMapper ipsMapper;
	
	@Override
	public int saveIps(Ips ips) {
		return ipsMapper.insertSelective(ips);
	}

}
