/**
 * 
 */
package com.liushuqing.wqn.controller.api;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuqing.wqn.controller.BaseController;
import com.liushuqing.wqn.service.UserServce;
import com.liushuqing.wqn.web.ApiResult;

/**
 * @author nancheng
 *
 */
@Controller
@RequestMapping("/login")
public class UserApiController extends BaseController {
    
    @Resource
    private UserServce userService;
    private static Logger logger = LoggerFactory.getLogger(UserApiController.class);
    
    @RequestMapping("/sign")
    public @ResponseBody ApiResult sign(HttpServletRequest request, HttpSession session) {
        System.out.println(request);
        logger.debug("\n ===注册===");
        ApiResult mv = new ApiResult();
        return mv;
    }

}
