/**
 * 
 */
package com.liushuqing.wqn.controller.api;

import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuqing.wqn.controller.BaseController;
import com.liushuqing.wqn.meta.entity.User;
import com.liushuqing.wqn.service.UserServce;
import com.liushuqing.wqn.web.ApiResult;

/**
 * @author nancheng
 *
 */
@Controller
@RequestMapping("login")
public class UserApiController extends BaseController {

    @Resource
    private UserServce userService;
    private static Logger logger = LoggerFactory.getLogger(UserApiController.class);

    @RequestMapping(value = "/sign", method = RequestMethod.POST)
    public @ResponseBody ApiResult sign(HttpServletRequest request, HttpSession session, @RequestBody User user) {
        logger.debug("\n name is  :" + user.getName() + "passWord is  :" + user.getPassWord() + "leval is  :"
                + user.getLeval());
        user.setCreateTime(new Date()).setChangeTime(new Date());
        int id = userService.insertUser(user);
        logger.debug("\n 插入的一个id 是：" + id);
        ApiResult result = new ApiResult();
        return result;
    }

}
