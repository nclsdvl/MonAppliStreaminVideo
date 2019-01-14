/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.frontoffice.controller;

import com.directmedia.onlinestore.core.entity.Artist;
import com.directmedia.onlinestore.core.entity.Catalogue;
import com.directmedia.onlinestore.core.entity.Work;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Utilisateur
 */
@WebServlet(name = "CatalogueServlet", urlPatterns = {"/catalogue"})
public class CatalogueServlet extends HttpServlet {

   

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        

        if (Catalogue.listOfWork.isEmpty()){
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
        
        minorityReport.setSummary("un classique adapté de Arthur C Clark");
        bad.setSummary("un MUST");
        leGendarmeDeSaintTropez.setSummary("c'est l'histoire d'un gendarme à st tropez...");
        
        minorityReport.setGenre("Sci-fi");
        bad.setGenre("clip musical");
        leGendarmeDeSaintTropez.setGenre("Bouze");
        
        
        
        Catalogue.listOfWork.add(minorityReport);
        Catalogue.listOfWork.add(bad);
        Catalogue.listOfWork.add(leGendarmeDeSaintTropez);
        }
        
        PrintWriter out = response.getWriter();
        out.print("<html><body><h1>Oeuvres du catalogue</h1>");
     
        for (Work work : Catalogue.listOfWork) {
            out.println("<a href='http://localhost:8080/frontoffice/workDetails?id="+work.getId()+"'>"+work.getTitle()+" ("+work.getRelease()+")</a><BR/>");
        }
        
        out.print("</body></html>");
    }

}
