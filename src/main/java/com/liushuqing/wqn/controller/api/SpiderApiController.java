/**
 * 
 */
package com.liushuqing.wqn.controller.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuqing.wqn.controller.BaseController;
import com.liushuqing.wqn.dto.SearchTask;
import com.liushuqing.wqn.web.ApiResult;
import com.liushuqing.wqn.web.GithubRepoPageProcessor;

import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;

/**
 * @author nancheng
 *
 */
@Controller
@RequestMapping(value = "spider")
public class SpiderApiController extends BaseController {

    private StringBuilder sb = new StringBuilder("http://dianying.fm/search/?text=");

    private static Logger logger = LoggerFactory.getLogger(SpiderApiController.class);

    private Spider spider = Spider.create(new GithubRepoPageProcessor())
            .addPipeline(new JsonFilePipeline("target/spider")).thread(5);

    @RequestMapping(value = "/crawl")
    public @ResponseBody ApiResult crawl(HttpServletRequest request, @RequestParam(value = "keyword") String keyword,
            @RequestParam(value = "type") int type) {
        logger.debug("\n type is : "+type);
        spider.addUrl(sb.append(keyword).toString());
        logger.warn("\n  发出爬取请求");
        spider.start();
        logger.warn("\n  爬虫异步开始");
        ApiResult result = new ApiResult();
        result.setCode(200).setMsg("OK");
        return result;
    }

    @RequestMapping(value = "/stop")
    public @ResponseBody ApiResult stopCrawl() {
        logger.warn("\n  发出停止请求");
        spider.stop();
        logger.warn("\n  爬虫成功停止！");
        ApiResult result = new ApiResult();
        result.setCode(200).setMsg("OK");
        return result;
    }

}
