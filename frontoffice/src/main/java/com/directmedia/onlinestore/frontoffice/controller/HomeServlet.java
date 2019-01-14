/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.directmedia.onlinestore.frontoffice.controller;

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
@WebServlet(name = "HomeServlet", urlPatterns = {"/home"})

public class HomeServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.print("<html><head><title>Mon Store Multimedia</title></head><body><div>OnlineStore, votre boutique multimedia en ligne</div><a href='http://localhost:8080/frontoffice/catalogue'>Accès au catalogue des oeuvres</a></body></html>");
    }

    
}
