package com.my.blog.website.service;

import com.my.blog.website.model.Vo.Ips;

public interface IIpsService {

	/**
	 * 保存访问IP
	 * @param ips
	 * @return
	 */
	int saveIps(Ips ips);
}
