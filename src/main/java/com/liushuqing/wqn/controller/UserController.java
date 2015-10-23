/**
 * 
 */
package com.liushuqing.wqn.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.liushuqing.wqn.service.UserServce;

/**
 * @author nancheng
 *
 */
@Controller
@RequestMapping(value = "login")
public class UserController extends BaseController {
    @Resource
    private UserServce userService;
    private static Logger logger = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/index")
    public ModelAndView login(HttpServletRequest request, Model model, HttpSession session) {
        model.addAttribute("test", "this is a test!");
        System.out.println(request);
        logger.debug("===login===");
        ModelAndView mv = new ModelAndView("login");
        return mv;
    }
    
    @RequestMapping("/html")
    public String relogin(HttpServletRequest request, Model model, HttpSession session) {
        model.addAttribute("test", "this is a test!");
        logger.debug("===relogin===");
        return "reLogin";
    }
    

}
