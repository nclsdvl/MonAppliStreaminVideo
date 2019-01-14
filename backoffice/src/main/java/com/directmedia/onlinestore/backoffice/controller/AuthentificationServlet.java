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
@WebServlet(name = "AuthentificationServlet", urlPatterns = {"/login"})
public class AuthentificationServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String login = request.getParameter("login");
        String mdp = request.getParameter("password");
        
        PrintWriter out = response.getWriter();
        out.print("<HTML><BODY>");
        
        if (login.equals("michel") && mdp.equals("123456") || login.equals("caroline") && mdp.equals("abcdef")){
            out.print("<a href='home'>Accès à la page d'accueil</a>");
            HttpSession session = request.getSession();
            session.setAttribute("login", login);
        }
        else{
            out.print("login et ou mdp erronés <a href='login.html'>Réessayer</a>");
        }
        
        out.print("</BODY></HTML>");
    }

}
