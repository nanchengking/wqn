/**
 * 
 */
package com.liushuqing.wqn.meta.dao;

import java.util.List;

import com.liushuqing.wqn.meta.entity.SearchResult;

/**
 * @author nancheng
 *
 */
public interface SearchResultDao {
    

    /**
     * 插入一个 SearchResult
     * 
     * @param  SearchResult
     * @return 插入的 SearchResult的id
     */
    public int insertSearchResult( SearchResult  searchResult);

    /**
     * 删除一个 SearchResult
     * 
     * @param id
     * @return 删除的 SearchResult的id
     */
    public int deleteSearchResultById(int id);
    
    /**
     * 删除系列 SearchResult
     * 
     * @param ids
     * @return 删除的 SearchResult的数目
     */
    public int deleteSearchResultByIds(List<Integer> ids);

    /**
     * 更新一个 SearchResult
     * 
     * @param  SearchResult
     * @return
     */
    public  SearchResult updateSearchResult( SearchResult  searchResult);


}
