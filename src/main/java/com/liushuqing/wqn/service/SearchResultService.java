/**
 * 
 */
package com.liushuqing.wqn.service;

import java.util.List;

import com.liushuqing.wqn.meta.entity.SearchResult;

/**
 * @author nancheng
 *
 */
public interface SearchResultService {
    
    /**
     * 插入一个 SearchResult
     * 
     * @param  SearchResult
     * @return 插入的 SearchResult的id
     */
    public int insertSearchResult( SearchResult  searchResult);

    /**
     * 插入一系列 SearchResult
     * 
     * @param  SearchResult
     * @return 一共插入的多少个 SearchResult
     */
    public int insertSearchResults(List< SearchResult>  searchResults);

    /**
     * 删除一个 SearchResult
     * 
     * @param id
     * @return 删除的 SearchResult的id
     */
    public int deleteSearchResult(int id);

    /**
     * 删除一系列 SearchResult
     * 
     * @param id
     * @return 一共成功删除了多少
     */
    public int deleteSearchResults(List<Integer> id);

    /**
     * 更新一个 SearchResult
     * 
     * @param  SearchResult
     * @return
     */
    public  SearchResult updateSearchResult( SearchResult  searchResult);

    /**
     * 更新一系列 SearchResult
     * 
     * @param  SearchResults
     * @return 成功更新了多少个
     */
    public int updateSearchResults(List<SearchResult>  searchResults);

}
