/**
 * 
 */
package com.liushuqing.wqn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuqing.wqn.web.GithubRepoPageProcessor;

import us.codecraft.webmagic.Spider;

/**
 * @author nancheng
 *
 */
@Controller
@RequestMapping(value = "spider")
public class SpiderController extends BaseController {
    
    private static Logger logger = LoggerFactory.getLogger(SpiderController.class);

    @RequestMapping(value = "/crawl")
    public @ResponseBody String crawl() {
        Spider.create(new GithubRepoPageProcessor()).addUrl("https://github.com/code4craft").thread(5).run();
        logger.debug("发出爬取请求");
        return "";
    }

}
