/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.webcosolution.braceletsblog.cache;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import pl.com.webcosolution.braceletsblog.ejb.Article;

/**
 *
 * @author Pawel.Kowalski
 */
@ApplicationScoped
public class Cache {

    private static Cache instance;
    private List<Article> articleList = new LinkedList<Article>();
    private List<String> imageList = new LinkedList<String>();

    public static Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }

        return instance;
    }

    private Cache() {
        init();
    }

    private void init() {

        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));
        articleList.add(new Article(1L, "Nowa twórczość", "Anna Kowalska", "Bransoletki", 0L, "http://image.ceneo.pl/data/products/20196326/i-bransoletka-shamballa-serce-love-duza-12mm.jpg", "OPIS", Calendar.getInstance().getTime()));     

        imageList.add("Bransoletka-Rower-turkusowy.png");
        imageList.add("fzxxsdldhlkqfxdrth.jpg");
        imageList.add("bransoletka-pandora.jpg");
        imageList.add("i-bransoletka-shamballa-serce-love-duza-12mm.jpg");
    }

    public List<String> getImageList() {
        return imageList;
    }

    public void setImageList(List<String> imageList) {
        this.imageList = imageList;
    }

    public List<Article> getArticleList() {
        return articleList;
    }

    public void setArticleList(List<Article> articleList) {
        this.articleList = articleList;
    }
}
