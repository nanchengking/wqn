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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping("/sign")
    public @ResponseBody ApiResult sign(HttpServletRequest request, HttpSession session,
            @RequestParam(value = "name") String name, @RequestParam(value = "passWord") String passWord,
            @RequestParam(value = "leval") String leval) {
        logger.debug("\n name is  :" + name + "passWord is  :" + passWord + "leval is  :" + leval);
        User user = new User();
        user.setCreateTime(new Date()).setChangeTime(new Date()).setName(name).setLeval(Integer.parseInt(leval))
                .setPassWord(passWord);
        int id = userService.insertUser(user);
        logger.debug("\n 插入的一个id 是：" + id);

        ApiResult result = new ApiResult();
        return result;
    }

}
