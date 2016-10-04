/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.webcosolution.braceletsblog.ejb;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Pawel.Kowalski
 */

public class Article {
    
    private Long id;
    private String name;
    private String autor;
    private String category;
    private Long comentaryCount;
    private String image;
    private String description;
    private Calendar createDate;

    public Article() {
    }

    public Article(Long id, String name, String autor, String category, Long comentaryCount, String image, String description, Date createDate) {
        this.id = id;
        this.name = name;
        this.autor = autor;
        this.category = category;
        this.comentaryCount = comentaryCount;
        this.image = image;
        this.description = description;
        this.createDate = Calendar.getInstance();
        this.createDate.setTime(createDate);
    }

    
    
    public String getDay() {
        return String.format("%02d", getCreateDate().get(Calendar.DAY_OF_MONTH));
    }
    
    public String getMonth() {
        return getCreateDate().getDisplayName(Calendar.MONDAY, Calendar.LONG_FORMAT, new Locale("pl", "PL"));
    }
    
    public String getYear() {
        return String.format("%d", getCreateDate().get(Calendar.YEAR));
    }
    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the comentaryCount
     */
    public Long getComentaryCount() {
        return comentaryCount;
    }

    /**
     * @param comentaryCount the comentaryCount to set
     */
    public void setComentaryCount(Long comentaryCount) {
        this.comentaryCount = comentaryCount;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the createDate
     */
    public Calendar getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate the createDate to set
     */
    public void setCreateDate(Calendar createDate) {
        this.createDate = createDate;
    }
    
}
