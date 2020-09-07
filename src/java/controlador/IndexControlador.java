package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.dao.JogoDao;
import model.entidades.Time;
import model.dao.TimeDao;
import model.entidades.Jogo;

/**
 *
 * @author Valdeir
 */
@WebServlet(urlPatterns = {"/IndexControlador"})
public class IndexControlador extends HttpServlet {

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
        try {

            JogoDao jogoDao = new JogoDao();
            TimeDao timeDao = new TimeDao();

            //CONSULTA JOGO_RODADA_1//////////////////////////////////////////////////////////////////
            List<Jogo> listaJogos_r1 = jogoDao.listaJogos_r1();
            request.setAttribute("listaJogos_r1", listaJogos_r1);
            ////////////////////////////////////////////////////////////////////////////////

            //CONSULTA TIME//////////////////////////////////////////////////////////////////
            List< Time> listaTimes = timeDao.consultarClassificacao();
            request.setAttribute("listaTimes", listaTimes);
            ////////////////////////////////////////////////////////////////////////////////

            request.getRequestDispatcher("rodada1.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(IndexControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            
            TimeDao timeDao = new TimeDao();
            
            timeDao.limparRodadas();
            
            request.getRequestDispatcher("index.jsp").forward(request, response);
            
        } catch (Exception ex) {
            Logger.getLogger(RodadaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
