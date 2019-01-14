/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice.controller;

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
@WebServlet(name = "AddworkServlet", urlPatterns = {"/add-work"})
public class AddworkServlet extends HttpServlet {

   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        String monTitre = request.getParameter("title");
        String monGenre = request.getParameter("gender");
        int maDate = Integer.parseInt(request.getParameter("release"));
        String monResume = request.getParameter("summary");
        Artist monArtiste = new Artist(request.getParameter("mainArtist"));
        
        
        
        Work monoeuvre = new Work(monTitre, monGenre, maDate, monResume, monArtiste);

       Catalogue.listOfWork.add(monoeuvre);
        
        
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        out.println("<html><body><a href='/backoffice/home'>HOME</a>");
        out.println("creation reussie");

        out.println("</html></body>");
    }

   
}
