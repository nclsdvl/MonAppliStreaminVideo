/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.backoffice.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Utilisateur
 */
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})
public class HomeServlet extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session = request.getSession();
        String monID = (String) session.getAttribute("login");
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Mon Store Multimedia</title></head><body><div>OnlineStore, Gestion de la boutique</div><BR/><h3>Bonjour "+monID+"</h3><BR/><a href='http://localhost:8080/backoffice/catalogue'>Accès au catalogue des oeuvres</a><BR/><BR/>");
        out.print("<a href ='/backoffice/add-work-form.html'>Ajouter une oeuvre au catalogue");
        out.print("</body></html>");

    }
    
    

    
}
