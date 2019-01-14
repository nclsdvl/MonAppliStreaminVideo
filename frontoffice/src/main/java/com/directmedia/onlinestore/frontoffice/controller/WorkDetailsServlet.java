/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

TODO Recup de l'id de l'oeuvre cliqué
 */
package com.directmedia.onlinestore.frontoffice.controller;
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
@WebServlet(name = "WorkDetailsServlet", urlPatterns = {"/workDetails"})
public class WorkDetailsServlet extends HttpServlet {




    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        String id = request.getParameter("id");

        //Work work = Catalogue.listOfWork.stream().filter(w -> w.getId()==Long.parseLong(id).findFirst().get());
        
        Work work=null;
        
        for (Work nextWork : Catalogue.listOfWork){
            if (nextWork.getId()==Long.parseLong(id)){
                work=nextWork;
                break;
            }
        }
        
        out.print("<HTML><BODY><H1>Descriptif de l'oeuvre</H1>");
        out.print("Titre : "+work.getTitle()+"<BR/>");
        out.print("Année de parution : "+work.getRelease()+"<BR/>");
        out.print("Genre : "+work.getGenre()+"<BR/>");
        out.print("Artiste : "+work.getMainArtist().getName()+"<BR/>");
        out.print("Resumé : "+work.getSummary()+"<BR/>");
        out.print("</BODY></HTML>");
        
    }

  

}
