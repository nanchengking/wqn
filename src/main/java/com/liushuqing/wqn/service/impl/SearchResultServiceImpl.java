/**
 * 
 */
package com.liushuqing.wqn.service.impl;

import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liushuqing.wqn.meta.dao.SearchResultDao;
import com.liushuqing.wqn.meta.entity.SearchResult;
import com.liushuqing.wqn.service.SearchResultService;

/**
 * @author nancheng
 *
 */
@Service
public class SearchResultServiceImpl implements SearchResultService {

    @Resource
    private SearchResultDao searchResultDao;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liushuqing.wqn.service.SearchResultService#insertSearchResult(com.
     * liushuqing.wqn.meta.entity.SearchResult)
     */
    @Override
    public int insertSearchResult(SearchResult searchResult) {
        searchResultDao.insertSearchResult(searchResult);
        return searchResult.getId();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liushuqing.wqn.service.SearchResultService#insertSearchResults(java.
     * util.List)
     */
    @Override
    public int insertSearchResults(List<SearchResult> searchResults) {
        Iterator<SearchResult> result = searchResults.iterator();
        while (result.hasNext()) {
            insertSearchResult(result.next());
        }
        return searchResults.size();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liushuqing.wqn.service.SearchResultService#deleteSearchResult(int)
     */
    @Override
    public int deleteSearchResult(int id) {
        searchResultDao.deleteSearchResultById(id);
        return id;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liushuqing.wqn.service.SearchResultService#deleteSearchResults(java.
     * util.List)
     */
    @Override
    public int deleteSearchResults(List<Integer> id) {
        Iterator<Integer> result = id.iterator();
        while (result.hasNext()) {
            deleteSearchResult(result.next());
        }
        return id.size();
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liushuqing.wqn.service.SearchResultService#updateSearchResult(com.
     * liushuqing.wqn.meta.entity.SearchResult)
     */
    @Override
    public SearchResult updateSearchResult(SearchResult searchResult) {
        searchResultDao.updateSearchResult(searchResult);
        return searchResult;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.liushuqing.wqn.service.SearchResultService#updateSearchResults(java.
     * util.List)
     */
    @Override
    public int updateSearchResults(List<SearchResult> searchResults) {
        Iterator<SearchResult> result = searchResults.iterator();
        while (result.hasNext()) {
            updateSearchResult(result.next());
        }
        return searchResults.size();
    }

}
