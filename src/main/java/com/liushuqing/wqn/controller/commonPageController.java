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
@RequestMapping(value = "wqn")
public class commonPageController extends BaseController {
    private static Logger logger = LoggerFactory.getLogger(commonPageController.class);

    @RequestMapping("/index")
    public ModelAndView index(HttpServletRequest request, Model model, HttpSession session) {
        logger.warn("\n == wqn =index页面===");
        ModelAndView mv = new ModelAndView("ftl/spider");
        return mv;
    }
    
    @RequestMapping("/search")
    public ModelAndView search(HttpServletRequest request, Model model, HttpSession session) {
        ModelAndView mv = new ModelAndView("ftl/search_view");
        return mv;
    }

}
