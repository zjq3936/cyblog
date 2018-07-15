package com.my.blog.website.controller.admin;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.my.blog.website.controller.BaseController;
import com.my.blog.website.dto.Types;
import com.my.blog.website.model.Vo.MetaVo;
import com.my.blog.website.service.IIpsService;
import com.my.blog.website.service.IMetaService;

/**
 * 访问统计
 * 
 * 
 * @author CyNick
 *
 */
@Controller
@RequestMapping("/admin/visiteSta")
public class VisiteStaController extends BaseController {
    private static final Logger LOGGER = LoggerFactory.getLogger(VisiteStaController.class);

    @Resource
    private IMetaService metasService;
    
    @Resource
    private IIpsService IipsService;


    /**
     * 访问统计
     */
    @GetMapping(value = "")
    public String visiteSta(HttpServletRequest request) {
    	List<MetaVo> metas = metasService.getMetas(Types.LINK.getType());
        request.setAttribute("links", metas);
        return "admin/visiteSta";
    }

    

}
