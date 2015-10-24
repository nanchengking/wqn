/**
 * 
 */
package com.liushuqing.wqn.controller.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuqing.wqn.controller.BaseController;
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

    private static Logger logger = LoggerFactory.getLogger(SpiderApiController.class);

    private Spider spider = Spider.create(new GithubRepoPageProcessor()).addUrl("https://github.com/code4craft").addPipeline(new JsonFilePipeline("target\\spider\\log")).thread(5);

    @RequestMapping(value = "/crawl")
    public @ResponseBody ApiResult crawl() {
        logger.warn("\n  发出爬取请求");
        spider.run();
        logger.warn("\n  爬虫运行结束");
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
