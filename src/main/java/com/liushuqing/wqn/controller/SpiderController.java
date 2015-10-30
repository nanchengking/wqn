/**
 * 
 */
package com.liushuqing.wqn.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author nancheng
 *
 */
@Controller
@RequestMapping(value = "spider")
public class SpiderController extends BaseController {
    
    private static Logger logger = LoggerFactory.getLogger(SpiderController.class);

    @RequestMapping("/index")
    public ModelAndView login(HttpServletRequest request, Model model, HttpSession session) {
        logger.warn("\n ===spider页面===");
        ModelAndView mv = new ModelAndView("ftl/spider");
        return mv;
    }
}
