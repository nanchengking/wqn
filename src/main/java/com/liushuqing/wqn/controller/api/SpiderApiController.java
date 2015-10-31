/**
 * 
 */
package com.liushuqing.wqn.controller.api;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liushuqing.wqn.controller.BaseController;
import com.liushuqing.wqn.web.ApiResult;
import com.liushuqing.wqn.web.DianyingFMRepoPageProcessor;
import com.liushuqing.wqn.web.MySqlPipline;

import us.codecraft.webmagic.Spider;

/**
 * @author nancheng
 *
 */
@Controller
@RequestMapping(value = "spider")
public class SpiderApiController extends BaseController {

    @Resource
    private MySqlPipline mysqlPipline;

    @Resource
    private DianyingFMRepoPageProcessor pageProcessor;

    private StringBuilder sb = new StringBuilder("http://dianying.fm/search/?text=");

    private static Logger logger = LoggerFactory.getLogger(SpiderApiController.class);

    private Spider spider;

    @RequestMapping(value = "/crawl")
    public @ResponseBody ApiResult crawl(HttpServletRequest request, @RequestParam(value = "keyword") String keyword,
            @RequestParam(value = "type") int type) {
        if (spider == null) {
            spider = Spider.create(pageProcessor).addPipeline(mysqlPipline).thread(2);
            logger.debug("\n 是否为空 : " + pageProcessor + mysqlPipline + spider);
        }
        logger.debug("\n type is : " + type);
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
        if(spider!=null){
            spider.stop();
            logger.warn("\n  爬虫成功停止！");
        }else{
            logger.warn("\n  爬虫尚未初始化，不需要停止！");
        }
       
        ApiResult result = new ApiResult();
        result.setCode(200).setMsg("OK");
        return result;
    }

}
