/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.directmedia.onlinestore.core.entity;

/**
 *
 * @author Ivu
 */
public class Work {
    private String title;
    private String genre;
    private int release;
    private String summary;
    private Artist mainArtist;
    private static int workCounter = 0;
    private long id;

    
    
    
    public Work() {
        this.id = Work.workCounter;
        Work.workCounter++;
    }
    
    public Work(String title, String genre, int release, String summary, Artist mainArtist) {
        this();
        this.title = title;
        this.genre = genre;
        this.release = release;
        this.summary = summary;
        this.mainArtist = mainArtist;
//        this.id = Work.workCounter;
//        Work.workCounter++;
        
    }
    



    public Work(String title) {
        this();
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRelease() {
        return release;
    }

    public void setRelease(int release) {
        this.release = release;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Artist getMainArtist() {
        return mainArtist;
    }

    public void setMainArtist(Artist mainArtist) {
        this.mainArtist = mainArtist;
    }

    public long getId() {
        return id;
    }



}
