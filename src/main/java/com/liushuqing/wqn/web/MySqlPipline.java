/**
 * 
 */
package com.liushuqing.wqn.web;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.liushuqing.wqn.meta.entity.SearchResult;
import com.liushuqing.wqn.service.SearchResultService;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

/**
 * @author nancheng
 *
 */
@Component
public class MySqlPipline implements Pipeline {

    @Resource
    private SearchResultService searchResultResult;

    private static Logger logger = LoggerFactory.getLogger(MySqlPipline.class);

    /*
     * (non-Javadoc)
     * 
     * @see
     * us.codecraft.webmagic.pipeline.Pipeline#process(us.codecraft.webmagic.
     * ResultItems, us.codecraft.webmagic.Task)
     */
    @Override
    public void process(ResultItems resultItems, Task task) {
        if (resultItems != null && resultItems.get("name") != null) {
            logger.debug("\n 判断是否为空 searchResultResult" + searchResultResult);
            SearchResult result = new SearchResult();
            result.setUrl(resultItems.getRequest().getUrl());
            result.setName((String) resultItems.get("name"));
            result.setContent((String) resultItems.get("content"));
            searchResultResult.insertSearchResult(result);
            logger.debug("\n 保存一条数据成功");
        }
    }
}
