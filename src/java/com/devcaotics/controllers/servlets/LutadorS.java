/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.devcaotics.controllers.servlets;

import com.devcaotics.model.negocios.Local;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.devcaotics.model.negocios.Lutador;
import com.devcaotics.model.repositorios.RepositorioLocalMemo;
import com.devcaotics.model.repositorios.Rlutador;
import java.util.List;

/**
 *
 * @author samue
 */
@WebServlet(name = "LutadorS", urlPatterns = {"/LutadorS"})
public class LutadorS extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            String acao = request.getParameter("a");
            
            if(acao.equals("cadastrar")){
                
               String nome = request.getParameter("nome");
              String apelido = request.getParameter("apelido");
              double peso = Double.parseDouble(request.getParameter("peso"));
              double altura = Double.parseDouble(request.getParameter("altura"));
              String dtnascimento = request.getParameter("dtnascimento");
              boolean destro=true;
            if(request.getParameter("destro")!=null){
              if(request.getParameter("destro").equals("on")){
                 destro=true;
              }
            }else{
                 destro=false;
              }
            
              String curso = request.getParameter("curso");
              String artmarcial = request.getParameter("artmarcial");
              String contatoemergencia = request.getParameter("contatoemergencia");
              
             Lutador l = new Lutador(nome,apelido,peso,altura,dtnascimento,destro,curso,artmarcial,contatoemergencia);
             
             
             Rlutador.inserir(l);
              
             /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Lutador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Nome do corno é " +nome+ "</h1>");
            out.println("<h1>O apelido é " +apelido+ "</h1>");
            out.println("<h1>O peso é " +peso+ "</h1>");
            out.println("<h1>O altura é " +altura+ "</h1>");
            out.println("<h1>O dtnascimento é " +dtnascimento+ "</h1>");
            out.println("<h1>O destro é " +destro+ "</h1>");
            out.println("<h1>O curso é " +curso+ "</h1>");
            out.println("<h1>O artmarcial é " +artmarcial+ "</h1>");
            out.println("<h1>O contatoemergencia é " +contatoemergencia+ "</h1>");
            out.println("</body>");
            out.println("</html>");
            }
            if(acao.equals("ver")){
            
                
                                   
 List<Lutador> lutadores = Rlutador.getCurrentInstance().lerTudo();
        
        request.setAttribute("lutadores", lutadores);
     
        
        request.getRequestDispatcher("/lutadoresNovo.jsp")
                .forward(request, response);
                   
                   
                   
                   
                
            }
            
            
            
        
            
            if(acao.equals("alt")){
                
                
                int id = Integer.parseInt(request.getParameter("id"));
                
                Lutador l = Rlutador.getCurrentInstance().ler(id);
                
       
        
                request.setAttribute("local", l);
    
        
                request.getRequestDispatcher("/CadastroLutadorA.jsp").forward(request, response);
                 out.println("SS");
                
            }
            if(acao.equals("del")){
                
                int id = Integer.parseInt(request.getParameter("id"));
                Lutador l = Rlutador.ler(id);
                Rlutador.delete(l);
                out.println("<h1>Deletado!</h1>");
                
            }
            if(acao.equals("altr")){
                
               int id  = Integer.parseInt(request.getParameter("id"));
               
                String nome = request.getParameter("nome");
              String apelido = request.getParameter("apelido");
              double peso = Double.parseDouble(request.getParameter("peso"));
              double altura = Double.parseDouble(request.getParameter("altura"));
              String dtnascimento = request.getParameter("dtnascimento");
              boolean destro=true;
              
            if(request.getParameter("destro")!=null){
              if(request.getParameter("destro").equals("on")){
                 destro=true;
              }
            }else{
                 destro=false;
              }
            
              String curso = request.getParameter("curso");
              String artmarcial = request.getParameter("artmarcial");
              String contatoemergencia = request.getParameter("contatoemergencia");
              
             Lutador l = new Lutador(nome,apelido,peso,altura,dtnascimento,destro,curso,artmarcial,contatoemergencia);
             l.SetId(id);
              Rlutador.alterar(l);
            }
            
            
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
