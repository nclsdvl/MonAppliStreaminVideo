/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.core;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;

/**
 *
 * @author Ivu
 */
public class Startup {
    public static void main(String... args) {
        Artist tomCruise = new Artist ("Tom Cruise");
        Artist michaelJackson = new Artist ("Michael Jackson");
        Artist louisDeFunes = new Artist ("Louis De Funes");
        
        Work minorityReport = new Work("Minority Report");
        Work bad = new Work("Bad");
        Work leGendarmeDeSaintTropez = new Work("Le gendarme de Saint Tropez");
        
        minorityReport.setMainArtist(tomCruise);
        bad.setMainArtist(michaelJackson);
        leGendarmeDeSaintTropez.setMainArtist(louisDeFunes);
        
        minorityReport.setRelease(2002);
        bad.setRelease(1987);
        leGendarmeDeSaintTropez.setRelease(1964);
        
        minorityReport.setSummary("SF");
        bad.setSummary("Clip genial!!");
        leGendarmeDeSaintTropez.setSummary("bouze");
        
        minorityReport.setGenre("Sci-fi");
        bad.setGenre("clip musical");
        leGendarmeDeSaintTropez.setGenre("bouze francaise");
        
        Catalogue.listOfWork.add(minorityReport);
        Catalogue.listOfWork.add(bad);
        Catalogue.listOfWork.add(leGendarmeDeSaintTropez);
        
//        System.out.println("hello");
        for (Work work : Catalogue.listOfWork) {
            System.out.println(work.getTitle()+" ("+work.getRelease()+")");
        }
    }
}
