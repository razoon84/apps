/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.webcosolution.braceletsblog.pages;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import pl.com.webcosolution.braceletsblog.cache.Cache;
import pl.com.webcosolution.braceletsblog.ejb.Article;

/**
 *
 * @author Pawel.Kowalski
 */
@ManagedBean
@ViewScoped
public class IndexBean {
    
    /**
     * Search tags
     */
    private String tags;
    private boolean userLogIn;

    public IndexBean() {

    }
    
    // actions 
    /**
     * Search action
     * 
     * @return search outcome
     */
    public String actionSearch(){
        return "search";
    }
    
    // getters and setter
    
    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }
    
    public boolean isUserLogIn() {
        return userLogIn;
    }
    
    public List<Article> getArticleList() {
        return Cache.getInstance().getArticleList();
    }

    public List<String> getImageList() {
        return Cache.getInstance().getImageList();
    }

}
