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
@WebServlet(urlPatterns = {"/RodadaControlador"})
public class RodadaControlador extends HttpServlet {

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
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {

            /////////////////////////////////////////////////////////////////////
            JogoDao jogoDao = new JogoDao();
            TimeDao timeDao = new TimeDao();

            Time time = new Time();

            /////////////////////////////////////////////////////////////////////
            Jogo jogo1 = new Jogo();
            Jogo jogo2 = new Jogo();
            Jogo jogo3 = new Jogo();
            Jogo jogo4 = new Jogo();
            Jogo jogo5 = new Jogo();
            Jogo jogo6 = new Jogo();
            Jogo jogo7 = new Jogo();
            Jogo jogo8 = new Jogo();
            Jogo jogo9 = new Jogo();
            Jogo jogo10 = new Jogo();

            Jogo time1 = new Jogo();
            Jogo time2 = new Jogo();
            Jogo time3 = new Jogo();
            Jogo time4 = new Jogo();
            Jogo time5 = new Jogo();
            Jogo time6 = new Jogo();
            Jogo time7 = new Jogo();
            Jogo time8 = new Jogo();
            Jogo time9 = new Jogo();
            Jogo time10 = new Jogo();
            Jogo time11 = new Jogo();
            Jogo time12 = new Jogo();
            Jogo time13 = new Jogo();
            Jogo time14 = new Jogo();
            Jogo time15 = new Jogo();
            Jogo time16 = new Jogo();
            Jogo time17 = new Jogo();
            Jogo time18 = new Jogo();
            Jogo time19 = new Jogo();
            Jogo time20 = new Jogo();

            Time ttime1 = new Time();
            Time ttime2 = new Time();
            Time ttime3 = new Time();
            Time ttime4 = new Time();
            Time ttime5 = new Time();
            Time ttime6 = new Time();
            Time ttime7 = new Time();
            Time ttime8 = new Time();
            Time ttime9 = new Time();
            Time ttime10 = new Time();
            Time ttime11 = new Time();
            Time ttime12 = new Time();
            Time ttime13 = new Time();
            Time ttime14 = new Time();
            Time ttime15 = new Time();
            Time ttime16 = new Time();
            Time ttime17 = new Time();
            Time ttime18 = new Time();
            Time ttime19 = new Time();
            Time ttime20 = new Time();

            /////////////////////////////////////////////////////////////////////
            Integer rodada = new Integer(request.getParameter("rodada"));

            switch (rodada) {
                case 1:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo1 = new Integer(request.getParameter("jogo1"));
                    Integer idJogo2 = new Integer(request.getParameter("jogo2"));
                    Integer idJogo3 = new Integer(request.getParameter("jogo3"));
                    Integer idJogo4 = new Integer(request.getParameter("jogo4"));
                    Integer idJogo5 = new Integer(request.getParameter("jogo5"));
                    Integer idJogo6 = new Integer(request.getParameter("jogo6"));
                    Integer idJogo7 = new Integer(request.getParameter("jogo7"));
                    Integer idJogo8 = new Integer(request.getParameter("jogo8"));
                    Integer idJogo9 = new Integer(request.getParameter("jogo9"));
                    Integer idJogo10 = new Integer(request.getParameter("jogo10"));

                    Integer idT1_1 = new Integer(request.getParameter("timeA7"));
                    Integer idT1_2 = new Integer(request.getParameter("timeB13"));
                    Integer idT1_3 = new Integer(request.getParameter("timeA9"));
                    Integer idT1_4 = new Integer(request.getParameter("timeB20"));
                    Integer idT1_5 = new Integer(request.getParameter("timeA14"));
                    Integer idT1_6 = new Integer(request.getParameter("timeB6"));
                    Integer idT1_7 = new Integer(request.getParameter("timeA4"));
                    Integer idT1_8 = new Integer(request.getParameter("timeB1"));
                    Integer idT1_9 = new Integer(request.getParameter("timeA2"));
                    Integer idT1_10 = new Integer(request.getParameter("timeB8"));
                    Integer idT1_11 = new Integer(request.getParameter("timeA19"));
                    Integer idT1_12 = new Integer(request.getParameter("timeB16"));
                    Integer idT1_13 = new Integer(request.getParameter("timeA18"));
                    Integer idT1_14 = new Integer(request.getParameter("timeB5"));
                    Integer idT1_15 = new Integer(request.getParameter("timeA15"));
                    Integer idT1_16 = new Integer(request.getParameter("timeB12"));
                    Integer idT1_17 = new Integer(request.getParameter("timeA11"));
                    Integer idT1_18 = new Integer(request.getParameter("timeB3"));
                    Integer idT1_19 = new Integer(request.getParameter("timeA10"));
                    Integer idT1_20 = new Integer(request.getParameter("timeB17"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g1_1 = new Integer(request.getParameter("7"));
                    Integer g1_2 = new Integer(request.getParameter("13"));
                    Integer g1_3 = new Integer(request.getParameter("9"));
                    Integer g1_4 = new Integer(request.getParameter("20"));
                    Integer g1_5 = new Integer(request.getParameter("14"));
                    Integer g1_6 = new Integer(request.getParameter("6"));
                    Integer g1_7 = new Integer(request.getParameter("4"));
                    Integer g1_8 = new Integer(request.getParameter("1"));
                    Integer g1_9 = new Integer(request.getParameter("2"));
                    Integer g1_10 = new Integer(request.getParameter("8"));
                    Integer g1_11 = new Integer(request.getParameter("19"));
                    Integer g1_12 = new Integer(request.getParameter("16"));
                    Integer g1_13 = new Integer(request.getParameter("18"));
                    Integer g1_14 = new Integer(request.getParameter("5"));
                    Integer g1_15 = new Integer(request.getParameter("15"));
                    Integer g1_16 = new Integer(request.getParameter("12"));
                    Integer g1_17 = new Integer(request.getParameter("11"));
                    Integer g1_18 = new Integer(request.getParameter("3"));
                    Integer g1_19 = new Integer(request.getParameter("10"));
                    Integer g1_20 = new Integer(request.getParameter("17"));

                    jogo1.setGoltimeA(g1_1);
                    jogo1.setGoltimeB(g1_2);
                    jogo2.setGoltimeA(g1_3);
                    jogo2.setGoltimeB(g1_4);
                    jogo3.setGoltimeA(g1_5);
                    jogo3.setGoltimeB(g1_6);
                    jogo4.setGoltimeA(g1_7);
                    jogo4.setGoltimeB(g1_8);
                    jogo5.setGoltimeA(g1_9);
                    jogo5.setGoltimeB(g1_10);
                    jogo6.setGoltimeA(g1_11);
                    jogo6.setGoltimeB(g1_12);
                    jogo7.setGoltimeA(g1_13);
                    jogo7.setGoltimeB(g1_14);
                    jogo8.setGoltimeA(g1_15);
                    jogo8.setGoltimeB(g1_16);
                    jogo9.setGoltimeA(g1_17);
                    jogo9.setGoltimeB(g1_18);
                    jogo10.setGoltimeA(g1_19);
                    jogo10.setGoltimeB(g1_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo1);
                    jogo2.setId_jogo(idJogo2);
                    jogo3.setId_jogo(idJogo3);
                    jogo4.setId_jogo(idJogo4);
                    jogo5.setId_jogo(idJogo5);
                    jogo6.setId_jogo(idJogo6);
                    jogo7.setId_jogo(idJogo7);
                    jogo8.setId_jogo(idJogo8);
                    jogo9.setId_jogo(idJogo9);
                    jogo10.setId_jogo(idJogo10);

                    time1.setId_timeA(idT1_1);
                    time2.setId_timeB(idT1_2);
                    time3.setId_timeA(idT1_3);
                    time4.setId_timeB(idT1_4);
                    time5.setId_timeA(idT1_5);
                    time6.setId_timeB(idT1_6);
                    time7.setId_timeA(idT1_7);
                    time8.setId_timeB(idT1_8);
                    time9.setId_timeA(idT1_9);
                    time10.setId_timeB(idT1_10);
                    time11.setId_timeA(idT1_11);
                    time12.setId_timeB(idT1_12);
                    time13.setId_timeA(idT1_13);
                    time14.setId_timeB(idT1_14);
                    time15.setId_timeA(idT1_15);
                    time16.setId_timeB(idT1_16);
                    time17.setId_timeA(idT1_17);
                    time18.setId_timeB(idT1_18);
                    time19.setId_timeA(idT1_19);
                    time20.setId_timeB(idT1_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_2//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r2 = jogoDao.listaJogos_r2();
                    request.setAttribute("listaJogos_r2", listaJogos_r2);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes2 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes2);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada2.jsp").forward(request, response);
                    break;

                case 2:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo11 = new Integer(request.getParameter("jogo11"));
                    Integer idJogo12 = new Integer(request.getParameter("jogo12"));
                    Integer idJogo13 = new Integer(request.getParameter("jogo13"));
                    Integer idJogo14 = new Integer(request.getParameter("jogo14"));
                    Integer idJogo15 = new Integer(request.getParameter("jogo15"));
                    Integer idJogo16 = new Integer(request.getParameter("jogo16"));
                    Integer idJogo17 = new Integer(request.getParameter("jogo17"));
                    Integer idJogo18 = new Integer(request.getParameter("jogo18"));
                    Integer idJogo19 = new Integer(request.getParameter("jogo19"));
                    Integer idJogo20 = new Integer(request.getParameter("jogo20"));

                    Integer idT2_1 = new Integer(request.getParameter("timeA6"));
                    Integer idT2_2 = new Integer(request.getParameter("timeB4"));
                    Integer idT2_3 = new Integer(request.getParameter("timeA5"));
                    Integer idT2_4 = new Integer(request.getParameter("timeB14"));
                    Integer idT2_5 = new Integer(request.getParameter("timeA16"));
                    Integer idT2_6 = new Integer(request.getParameter("timeB3"));
                    Integer idT2_7 = new Integer(request.getParameter("timeA1"));
                    Integer idT2_8 = new Integer(request.getParameter("timeB19"));
                    Integer idT2_9 = new Integer(request.getParameter("timeA20"));
                    Integer idT2_10 = new Integer(request.getParameter("timeB2"));
                    Integer idT2_11 = new Integer(request.getParameter("timeA11"));
                    Integer idT2_12 = new Integer(request.getParameter("timeB15"));
                    Integer idT2_13 = new Integer(request.getParameter("timeA12"));
                    Integer idT2_14 = new Integer(request.getParameter("timeB9"));
                    Integer idT2_15 = new Integer(request.getParameter("timeA17"));
                    Integer idT2_16 = new Integer(request.getParameter("timeB7"));
                    Integer idT2_17 = new Integer(request.getParameter("timeA8"));
                    Integer idT2_18 = new Integer(request.getParameter("timeB10"));
                    Integer idT2_19 = new Integer(request.getParameter("timeA13"));
                    Integer idT2_20 = new Integer(request.getParameter("timeB18"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g2_1 = new Integer(request.getParameter("6"));
                    Integer g2_2 = new Integer(request.getParameter("4"));
                    Integer g2_3 = new Integer(request.getParameter("5"));
                    Integer g2_4 = new Integer(request.getParameter("14"));
                    Integer g2_5 = new Integer(request.getParameter("16"));
                    Integer g2_6 = new Integer(request.getParameter("3"));
                    Integer g2_7 = new Integer(request.getParameter("1"));
                    Integer g2_8 = new Integer(request.getParameter("19"));
                    Integer g2_9 = new Integer(request.getParameter("20"));
                    Integer g2_10 = new Integer(request.getParameter("2"));
                    Integer g2_11 = new Integer(request.getParameter("11"));
                    Integer g2_12 = new Integer(request.getParameter("15"));
                    Integer g2_13 = new Integer(request.getParameter("12"));
                    Integer g2_14 = new Integer(request.getParameter("9"));
                    Integer g2_15 = new Integer(request.getParameter("17"));
                    Integer g2_16 = new Integer(request.getParameter("7"));
                    Integer g2_17 = new Integer(request.getParameter("8"));
                    Integer g2_18 = new Integer(request.getParameter("10"));
                    Integer g2_19 = new Integer(request.getParameter("13"));
                    Integer g2_20 = new Integer(request.getParameter("18"));

                    jogo1.setGoltimeA(g2_1);
                    jogo1.setGoltimeB(g2_2);
                    jogo2.setGoltimeA(g2_3);
                    jogo2.setGoltimeB(g2_4);
                    jogo3.setGoltimeA(g2_5);
                    jogo3.setGoltimeB(g2_6);
                    jogo4.setGoltimeA(g2_7);
                    jogo4.setGoltimeB(g2_8);
                    jogo5.setGoltimeA(g2_9);
                    jogo5.setGoltimeB(g2_10);
                    jogo6.setGoltimeA(g2_11);
                    jogo6.setGoltimeB(g2_12);
                    jogo7.setGoltimeA(g2_13);
                    jogo7.setGoltimeB(g2_14);
                    jogo8.setGoltimeA(g2_15);
                    jogo8.setGoltimeB(g2_16);
                    jogo9.setGoltimeA(g2_17);
                    jogo9.setGoltimeB(g2_18);
                    jogo10.setGoltimeA(g2_19);
                    jogo10.setGoltimeB(g2_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo11);
                    jogo2.setId_jogo(idJogo12);
                    jogo3.setId_jogo(idJogo13);
                    jogo4.setId_jogo(idJogo14);
                    jogo5.setId_jogo(idJogo15);
                    jogo6.setId_jogo(idJogo16);
                    jogo7.setId_jogo(idJogo17);
                    jogo8.setId_jogo(idJogo18);
                    jogo9.setId_jogo(idJogo19);
                    jogo10.setId_jogo(idJogo20);

                    time1.setId_timeA(idT2_1);
                    time2.setId_timeB(idT2_2);
                    time3.setId_timeA(idT2_3);
                    time4.setId_timeB(idT2_4);
                    time5.setId_timeA(idT2_5);
                    time6.setId_timeB(idT2_6);
                    time7.setId_timeA(idT2_7);
                    time8.setId_timeB(idT2_8);
                    time9.setId_timeA(idT2_9);
                    time10.setId_timeB(idT2_10);
                    time11.setId_timeA(idT2_11);
                    time12.setId_timeB(idT2_12);
                    time13.setId_timeA(idT2_13);
                    time14.setId_timeB(idT2_14);
                    time15.setId_timeA(idT2_15);
                    time16.setId_timeB(idT2_16);
                    time17.setId_timeA(idT2_17);
                    time18.setId_timeB(idT2_18);
                    time19.setId_timeA(idT2_19);
                    time20.setId_timeB(idT2_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_3//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r3 = jogoDao.listaJogos_r3();
                    request.setAttribute("listaJogos_r3", listaJogos_r3);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes3 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes3);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada3.jsp").forward(request, response);

                    break;

                case 3:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo21 = new Integer(request.getParameter("jogo21"));
                    Integer idJogo22 = new Integer(request.getParameter("jogo22"));
                    Integer idJogo23 = new Integer(request.getParameter("jogo23"));
                    Integer idJogo24 = new Integer(request.getParameter("jogo24"));
                    Integer idJogo25 = new Integer(request.getParameter("jogo25"));
                    Integer idJogo26 = new Integer(request.getParameter("jogo26"));
                    Integer idJogo27 = new Integer(request.getParameter("jogo27"));
                    Integer idJogo28 = new Integer(request.getParameter("jogo28"));
                    Integer idJogo29 = new Integer(request.getParameter("jogo29"));
                    Integer idJogo30 = new Integer(request.getParameter("jogo30"));

                    Integer idT3_1 = new Integer(request.getParameter("timeA3"));
                    Integer idT3_2 = new Integer(request.getParameter("timeB6"));
                    Integer idT3_3 = new Integer(request.getParameter("timeA12"));
                    Integer idT3_4 = new Integer(request.getParameter("timeB5"));
                    Integer idT3_5 = new Integer(request.getParameter("timeA19"));
                    Integer idT3_6 = new Integer(request.getParameter("timeB9"));
                    Integer idT3_7 = new Integer(request.getParameter("timeA14"));
                    Integer idT3_8 = new Integer(request.getParameter("timeB15"));
                    Integer idT3_9 = new Integer(request.getParameter("timeA1"));
                    Integer idT3_10 = new Integer(request.getParameter("timeB17"));
                    Integer idT3_11 = new Integer(request.getParameter("timeA7"));
                    Integer idT3_12 = new Integer(request.getParameter("timeB4"));
                    Integer idT3_13 = new Integer(request.getParameter("timeA13"));
                    Integer idT3_14 = new Integer(request.getParameter("timeB11"));
                    Integer idT3_15 = new Integer(request.getParameter("timeA16"));
                    Integer idT3_16 = new Integer(request.getParameter("timeB8"));
                    Integer idT3_17 = new Integer(request.getParameter("timeA12"));
                    Integer idT3_18 = new Integer(request.getParameter("timeB10"));
                    Integer idT3_19 = new Integer(request.getParameter("timeA18"));
                    Integer idT3_20 = new Integer(request.getParameter("timeB20"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g3_1 = new Integer(request.getParameter("3"));
                    Integer g3_2 = new Integer(request.getParameter("6"));
                    Integer g3_3 = new Integer(request.getParameter("12"));
                    Integer g3_4 = new Integer(request.getParameter("5"));
                    Integer g3_5 = new Integer(request.getParameter("19"));
                    Integer g3_6 = new Integer(request.getParameter("9"));
                    Integer g3_7 = new Integer(request.getParameter("14"));
                    Integer g3_8 = new Integer(request.getParameter("15"));
                    Integer g3_9 = new Integer(request.getParameter("1"));
                    Integer g3_10 = new Integer(request.getParameter("17"));
                    Integer g3_11 = new Integer(request.getParameter("7"));
                    Integer g3_12 = new Integer(request.getParameter("4"));
                    Integer g3_13 = new Integer(request.getParameter("13"));
                    Integer g3_14 = new Integer(request.getParameter("11"));
                    Integer g3_15 = new Integer(request.getParameter("16"));
                    Integer g3_16 = new Integer(request.getParameter("8"));
                    Integer g3_17 = new Integer(request.getParameter("12"));
                    Integer g3_18 = new Integer(request.getParameter("10"));
                    Integer g3_19 = new Integer(request.getParameter("18"));
                    Integer g3_20 = new Integer(request.getParameter("20"));

                    jogo1.setGoltimeA(g3_1);
                    jogo1.setGoltimeB(g3_2);
                    jogo2.setGoltimeA(g3_3);
                    jogo2.setGoltimeB(g3_4);
                    jogo3.setGoltimeA(g3_5);
                    jogo3.setGoltimeB(g3_6);
                    jogo4.setGoltimeA(g3_7);
                    jogo4.setGoltimeB(g3_8);
                    jogo5.setGoltimeA(g3_9);
                    jogo5.setGoltimeB(g3_10);
                    jogo6.setGoltimeA(g3_11);
                    jogo6.setGoltimeB(g3_12);
                    jogo7.setGoltimeA(g3_13);
                    jogo7.setGoltimeB(g3_14);
                    jogo8.setGoltimeA(g3_15);
                    jogo8.setGoltimeB(g3_16);
                    jogo9.setGoltimeA(g3_17);
                    jogo9.setGoltimeB(g3_18);
                    jogo10.setGoltimeA(g3_19);
                    jogo10.setGoltimeB(g3_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo21);
                    jogo2.setId_jogo(idJogo22);
                    jogo3.setId_jogo(idJogo23);
                    jogo4.setId_jogo(idJogo24);
                    jogo5.setId_jogo(idJogo25);
                    jogo6.setId_jogo(idJogo26);
                    jogo7.setId_jogo(idJogo27);
                    jogo8.setId_jogo(idJogo28);
                    jogo9.setId_jogo(idJogo29);
                    jogo10.setId_jogo(idJogo30);

                    time1.setId_timeA(idT3_1);
                    time2.setId_timeB(idT3_2);
                    time3.setId_timeA(idT3_3);
                    time4.setId_timeB(idT3_4);
                    time5.setId_timeA(idT3_5);
                    time6.setId_timeB(idT3_6);
                    time7.setId_timeA(idT3_7);
                    time8.setId_timeB(idT3_8);
                    time9.setId_timeA(idT3_9);
                    time10.setId_timeB(idT3_10);
                    time11.setId_timeA(idT3_11);
                    time12.setId_timeB(idT3_12);
                    time13.setId_timeA(idT3_13);
                    time14.setId_timeB(idT3_14);
                    time15.setId_timeA(idT3_15);
                    time16.setId_timeB(idT3_16);
                    time17.setId_timeA(idT3_17);
                    time18.setId_timeB(idT3_18);
                    time19.setId_timeA(idT3_19);
                    time20.setId_timeB(idT3_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_4//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r4 = jogoDao.listaJogos_r4();
                    request.setAttribute("listaJogos_r4", listaJogos_r4);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes4 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes4);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada4.jsp").forward(request, response);

                    break;

                case 4:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo31 = new Integer(request.getParameter("jogo31"));
                    Integer idJogo32 = new Integer(request.getParameter("jogo32"));
                    Integer idJogo33 = new Integer(request.getParameter("jogo33"));
                    Integer idJogo34 = new Integer(request.getParameter("jogo34"));
                    Integer idJogo35 = new Integer(request.getParameter("jogo35"));
                    Integer idJogo36 = new Integer(request.getParameter("jogo36"));
                    Integer idJogo37 = new Integer(request.getParameter("jogo37"));
                    Integer idJogo38 = new Integer(request.getParameter("jogo38"));
                    Integer idJogo39 = new Integer(request.getParameter("jogo39"));
                    Integer idJogo40 = new Integer(request.getParameter("jogo40"));

                    Integer idT4_1 = new Integer(request.getParameter("timeA10"));
                    Integer idT4_2 = new Integer(request.getParameter("timeB13"));
                    Integer idT4_3 = new Integer(request.getParameter("timeA5"));
                    Integer idT4_4 = new Integer(request.getParameter("timeB2"));
                    Integer idT4_5 = new Integer(request.getParameter("timeA17"));
                    Integer idT4_6 = new Integer(request.getParameter("timeB19"));
                    Integer idT4_7 = new Integer(request.getParameter("timeA4"));
                    Integer idT4_8 = new Integer(request.getParameter("timeB14"));
                    Integer idT4_9 = new Integer(request.getParameter("timeA6"));
                    Integer idT4_10 = new Integer(request.getParameter("timeB1"));
                    Integer idT4_11 = new Integer(request.getParameter("timeA9"));
                    Integer idT4_12 = new Integer(request.getParameter("timeB3"));
                    Integer idT4_13 = new Integer(request.getParameter("timeA8"));
                    Integer idT4_14 = new Integer(request.getParameter("timeB12"));
                    Integer idT4_15 = new Integer(request.getParameter("timeA11"));
                    Integer idT4_16 = new Integer(request.getParameter("timeB7"));
                    Integer idT4_17 = new Integer(request.getParameter("timeA20"));
                    Integer idT4_18 = new Integer(request.getParameter("timeB16"));
                    Integer idT4_19 = new Integer(request.getParameter("timeA15"));
                    Integer idT4_20 = new Integer(request.getParameter("timeB18"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g4_1 = new Integer(request.getParameter("10"));
                    Integer g4_2 = new Integer(request.getParameter("13"));
                    Integer g4_3 = new Integer(request.getParameter("5"));
                    Integer g4_4 = new Integer(request.getParameter("2"));
                    Integer g4_5 = new Integer(request.getParameter("17"));
                    Integer g4_6 = new Integer(request.getParameter("19"));
                    Integer g4_7 = new Integer(request.getParameter("4"));
                    Integer g4_8 = new Integer(request.getParameter("14"));
                    Integer g4_9 = new Integer(request.getParameter("6"));
                    Integer g4_10 = new Integer(request.getParameter("1"));
                    Integer g4_11 = new Integer(request.getParameter("9"));
                    Integer g4_12 = new Integer(request.getParameter("3"));
                    Integer g4_13 = new Integer(request.getParameter("8"));
                    Integer g4_14 = new Integer(request.getParameter("12"));
                    Integer g4_15 = new Integer(request.getParameter("11"));
                    Integer g4_16 = new Integer(request.getParameter("7"));
                    Integer g4_17 = new Integer(request.getParameter("20"));
                    Integer g4_18 = new Integer(request.getParameter("16"));
                    Integer g4_19 = new Integer(request.getParameter("15"));
                    Integer g4_20 = new Integer(request.getParameter("18"));

                    jogo1.setGoltimeA(g4_1);
                    jogo1.setGoltimeB(g4_2);
                    jogo2.setGoltimeA(g4_3);
                    jogo2.setGoltimeB(g4_4);
                    jogo3.setGoltimeA(g4_5);
                    jogo3.setGoltimeB(g4_6);
                    jogo4.setGoltimeA(g4_7);
                    jogo4.setGoltimeB(g4_8);
                    jogo5.setGoltimeA(g4_9);
                    jogo5.setGoltimeB(g4_10);
                    jogo6.setGoltimeA(g4_11);
                    jogo6.setGoltimeB(g4_12);
                    jogo7.setGoltimeA(g4_13);
                    jogo7.setGoltimeB(g4_14);
                    jogo8.setGoltimeA(g4_15);
                    jogo8.setGoltimeB(g4_16);
                    jogo9.setGoltimeA(g4_17);
                    jogo9.setGoltimeB(g4_18);
                    jogo10.setGoltimeA(g4_19);
                    jogo10.setGoltimeB(g4_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo31);
                    jogo2.setId_jogo(idJogo32);
                    jogo3.setId_jogo(idJogo33);
                    jogo4.setId_jogo(idJogo34);
                    jogo5.setId_jogo(idJogo35);
                    jogo6.setId_jogo(idJogo36);
                    jogo7.setId_jogo(idJogo37);
                    jogo8.setId_jogo(idJogo38);
                    jogo9.setId_jogo(idJogo39);
                    jogo10.setId_jogo(idJogo40);

                    time1.setId_timeA(idT4_1);
                    time2.setId_timeB(idT4_2);
                    time3.setId_timeA(idT4_3);
                    time4.setId_timeB(idT4_4);
                    time5.setId_timeA(idT4_5);
                    time6.setId_timeB(idT4_6);
                    time7.setId_timeA(idT4_7);
                    time8.setId_timeB(idT4_8);
                    time9.setId_timeA(idT4_9);
                    time10.setId_timeB(idT4_10);
                    time11.setId_timeA(idT4_11);
                    time12.setId_timeB(idT4_12);
                    time13.setId_timeA(idT4_13);
                    time14.setId_timeB(idT4_14);
                    time15.setId_timeA(idT4_15);
                    time16.setId_timeB(idT4_16);
                    time17.setId_timeA(idT4_17);
                    time18.setId_timeB(idT4_18);
                    time19.setId_timeA(idT4_19);
                    time20.setId_timeB(idT4_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_5//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r5 = jogoDao.listaJogos_r5();
                    request.setAttribute("listaJogos_r5", listaJogos_r5);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes5 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes5);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada5.jsp").forward(request, response);

                    break;

                case 5:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo41 = new Integer(request.getParameter("jogo41"));
                    Integer idJogo42 = new Integer(request.getParameter("jogo42"));
                    Integer idJogo43 = new Integer(request.getParameter("jogo43"));
                    Integer idJogo44 = new Integer(request.getParameter("jogo44"));
                    Integer idJogo45 = new Integer(request.getParameter("jogo45"));
                    Integer idJogo46 = new Integer(request.getParameter("jogo46"));
                    Integer idJogo47 = new Integer(request.getParameter("jogo47"));
                    Integer idJogo48 = new Integer(request.getParameter("jogo48"));
                    Integer idJogo49 = new Integer(request.getParameter("jogo49"));
                    Integer idJogo50 = new Integer(request.getParameter("jogo50"));

                    Integer idT5_1 = new Integer(request.getParameter("timeA10"));
                    Integer idT5_2 = new Integer(request.getParameter("timeB1"));
                    Integer idT5_3 = new Integer(request.getParameter("timeA9"));
                    Integer idT5_4 = new Integer(request.getParameter("timeB4"));
                    Integer idT5_5 = new Integer(request.getParameter("timeA3"));
                    Integer idT5_6 = new Integer(request.getParameter("timeB8"));
                    Integer idT5_7 = new Integer(request.getParameter("timeA7"));
                    Integer idT5_8 = new Integer(request.getParameter("timeB18"));
                    Integer idT5_9 = new Integer(request.getParameter("timeA6"));
                    Integer idT5_10 = new Integer(request.getParameter("timeB16"));
                    Integer idT5_11 = new Integer(request.getParameter("timeA14"));
                    Integer idT5_12 = new Integer(request.getParameter("timeB11"));
                    Integer idT5_13 = new Integer(request.getParameter("timeA17"));
                    Integer idT5_14 = new Integer(request.getParameter("timeB13"));
                    Integer idT5_15 = new Integer(request.getParameter("timeA15"));
                    Integer idT5_16 = new Integer(request.getParameter("timeB5"));
                    Integer idT5_17 = new Integer(request.getParameter("timeA19"));
                    Integer idT5_18 = new Integer(request.getParameter("timeB2"));
                    Integer idT5_19 = new Integer(request.getParameter("timeA12"));
                    Integer idT5_20 = new Integer(request.getParameter("timeB20"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g5_1 = new Integer(request.getParameter("10"));
                    Integer g5_2 = new Integer(request.getParameter("1"));
                    Integer g5_3 = new Integer(request.getParameter("9"));
                    Integer g5_4 = new Integer(request.getParameter("4"));
                    Integer g5_5 = new Integer(request.getParameter("3"));
                    Integer g5_6 = new Integer(request.getParameter("8"));
                    Integer g5_7 = new Integer(request.getParameter("7"));
                    Integer g5_8 = new Integer(request.getParameter("18"));
                    Integer g5_9 = new Integer(request.getParameter("6"));
                    Integer g5_10 = new Integer(request.getParameter("16"));
                    Integer g5_11 = new Integer(request.getParameter("14"));
                    Integer g5_12 = new Integer(request.getParameter("11"));
                    Integer g5_13 = new Integer(request.getParameter("17"));
                    Integer g5_14 = new Integer(request.getParameter("13"));
                    Integer g5_15 = new Integer(request.getParameter("15"));
                    Integer g5_16 = new Integer(request.getParameter("5"));
                    Integer g5_17 = new Integer(request.getParameter("19"));
                    Integer g5_18 = new Integer(request.getParameter("2"));
                    Integer g5_19 = new Integer(request.getParameter("12"));
                    Integer g5_20 = new Integer(request.getParameter("20"));

                    jogo1.setGoltimeA(g5_1);
                    jogo1.setGoltimeB(g5_2);
                    jogo2.setGoltimeA(g5_3);
                    jogo2.setGoltimeB(g5_4);
                    jogo3.setGoltimeA(g5_5);
                    jogo3.setGoltimeB(g5_6);
                    jogo4.setGoltimeA(g5_7);
                    jogo4.setGoltimeB(g5_8);
                    jogo5.setGoltimeA(g5_9);
                    jogo5.setGoltimeB(g5_10);
                    jogo6.setGoltimeA(g5_11);
                    jogo6.setGoltimeB(g5_12);
                    jogo7.setGoltimeA(g5_13);
                    jogo7.setGoltimeB(g5_14);
                    jogo8.setGoltimeA(g5_15);
                    jogo8.setGoltimeB(g5_16);
                    jogo9.setGoltimeA(g5_17);
                    jogo9.setGoltimeB(g5_18);
                    jogo10.setGoltimeA(g5_19);
                    jogo10.setGoltimeB(g5_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo41);
                    jogo2.setId_jogo(idJogo42);
                    jogo3.setId_jogo(idJogo43);
                    jogo4.setId_jogo(idJogo44);
                    jogo5.setId_jogo(idJogo45);
                    jogo6.setId_jogo(idJogo46);
                    jogo7.setId_jogo(idJogo47);
                    jogo8.setId_jogo(idJogo48);
                    jogo9.setId_jogo(idJogo49);
                    jogo10.setId_jogo(idJogo50);

                    time1.setId_timeA(idT5_1);
                    time2.setId_timeB(idT5_2);
                    time3.setId_timeA(idT5_3);
                    time4.setId_timeB(idT5_4);
                    time5.setId_timeA(idT5_5);
                    time6.setId_timeB(idT5_6);
                    time7.setId_timeA(idT5_7);
                    time8.setId_timeB(idT5_8);
                    time9.setId_timeA(idT5_9);
                    time10.setId_timeB(idT5_10);
                    time11.setId_timeA(idT5_11);
                    time12.setId_timeB(idT5_12);
                    time13.setId_timeA(idT5_13);
                    time14.setId_timeB(idT5_14);
                    time15.setId_timeA(idT5_15);
                    time16.setId_timeB(idT5_16);
                    time17.setId_timeA(idT5_17);
                    time18.setId_timeB(idT5_18);
                    time19.setId_timeA(idT5_19);
                    time20.setId_timeB(idT5_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_6//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r6 = jogoDao.listaJogos_r6();
                    request.setAttribute("listaJogos_r6", listaJogos_r6);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes6 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes6);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada6.jsp").forward(request, response);

                    break;

                case 6:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo51 = new Integer(request.getParameter("jogo51"));
                    Integer idJogo52 = new Integer(request.getParameter("jogo52"));
                    Integer idJogo53 = new Integer(request.getParameter("jogo53"));
                    Integer idJogo54 = new Integer(request.getParameter("jogo54"));
                    Integer idJogo55 = new Integer(request.getParameter("jogo55"));
                    Integer idJogo56 = new Integer(request.getParameter("jogo56"));
                    Integer idJogo57 = new Integer(request.getParameter("jogo57"));
                    Integer idJogo58 = new Integer(request.getParameter("jogo58"));
                    Integer idJogo59 = new Integer(request.getParameter("jogo59"));
                    Integer idJogo60 = new Integer(request.getParameter("jogo60"));

                    Integer idT6_1 = new Integer(request.getParameter("timeA11"));
                    Integer idT6_2 = new Integer(request.getParameter("timeB12"));
                    Integer idT6_3 = new Integer(request.getParameter("timeA13"));
                    Integer idT6_4 = new Integer(request.getParameter("timeB3"));
                    Integer idT6_5 = new Integer(request.getParameter("timeA5"));
                    Integer idT6_6 = new Integer(request.getParameter("timeB7"));
                    Integer idT6_7 = new Integer(request.getParameter("timeA2"));
                    Integer idT6_8 = new Integer(request.getParameter("timeB9"));
                    Integer idT6_9 = new Integer(request.getParameter("timeA8"));
                    Integer idT6_10 = new Integer(request.getParameter("timeB6"));
                    Integer idT6_11 = new Integer(request.getParameter("timeA4"));
                    Integer idT6_12 = new Integer(request.getParameter("timeB15"));
                    Integer idT6_13 = new Integer(request.getParameter("timeA1"));
                    Integer idT6_14 = new Integer(request.getParameter("timeB14"));
                    Integer idT6_15 = new Integer(request.getParameter("timeA18"));
                    Integer idT6_16 = new Integer(request.getParameter("timeB10"));
                    Integer idT6_17 = new Integer(request.getParameter("timeA20"));
                    Integer idT6_18 = new Integer(request.getParameter("timeB19"));
                    Integer idT6_19 = new Integer(request.getParameter("timeA16"));
                    Integer idT6_20 = new Integer(request.getParameter("timeB17"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g6_1 = new Integer(request.getParameter("11"));
                    Integer g6_2 = new Integer(request.getParameter("12"));
                    Integer g6_3 = new Integer(request.getParameter("13"));
                    Integer g6_4 = new Integer(request.getParameter("3"));
                    Integer g6_5 = new Integer(request.getParameter("5"));
                    Integer g6_6 = new Integer(request.getParameter("7"));
                    Integer g6_7 = new Integer(request.getParameter("2"));
                    Integer g6_8 = new Integer(request.getParameter("9"));
                    Integer g6_9 = new Integer(request.getParameter("8"));
                    Integer g6_10 = new Integer(request.getParameter("6"));
                    Integer g6_11 = new Integer(request.getParameter("4"));
                    Integer g6_12 = new Integer(request.getParameter("15"));
                    Integer g6_13 = new Integer(request.getParameter("1"));
                    Integer g6_14 = new Integer(request.getParameter("14"));
                    Integer g6_15 = new Integer(request.getParameter("18"));
                    Integer g6_16 = new Integer(request.getParameter("10"));
                    Integer g6_17 = new Integer(request.getParameter("20"));
                    Integer g6_18 = new Integer(request.getParameter("19"));
                    Integer g6_19 = new Integer(request.getParameter("16"));
                    Integer g6_20 = new Integer(request.getParameter("17"));

                    jogo1.setGoltimeA(g6_1);
                    jogo1.setGoltimeB(g6_2);
                    jogo2.setGoltimeA(g6_3);
                    jogo2.setGoltimeB(g6_4);
                    jogo3.setGoltimeA(g6_5);
                    jogo3.setGoltimeB(g6_6);
                    jogo4.setGoltimeA(g6_7);
                    jogo4.setGoltimeB(g6_8);
                    jogo5.setGoltimeA(g6_9);
                    jogo5.setGoltimeB(g6_10);
                    jogo6.setGoltimeA(g6_11);
                    jogo6.setGoltimeB(g6_12);
                    jogo7.setGoltimeA(g6_13);
                    jogo7.setGoltimeB(g6_14);
                    jogo8.setGoltimeA(g6_15);
                    jogo8.setGoltimeB(g6_16);
                    jogo9.setGoltimeA(g6_17);
                    jogo9.setGoltimeB(g6_18);
                    jogo10.setGoltimeA(g6_19);
                    jogo10.setGoltimeB(g6_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo51);
                    jogo2.setId_jogo(idJogo52);
                    jogo3.setId_jogo(idJogo53);
                    jogo4.setId_jogo(idJogo54);
                    jogo5.setId_jogo(idJogo55);
                    jogo6.setId_jogo(idJogo56);
                    jogo7.setId_jogo(idJogo57);
                    jogo8.setId_jogo(idJogo58);
                    jogo9.setId_jogo(idJogo59);
                    jogo10.setId_jogo(idJogo60);

                    time1.setId_timeA(idT6_1);
                    time2.setId_timeB(idT6_2);
                    time3.setId_timeA(idT6_3);
                    time4.setId_timeB(idT6_4);
                    time5.setId_timeA(idT6_5);
                    time6.setId_timeB(idT6_6);
                    time7.setId_timeA(idT6_7);
                    time8.setId_timeB(idT6_8);
                    time9.setId_timeA(idT6_9);
                    time10.setId_timeB(idT6_10);
                    time11.setId_timeA(idT6_11);
                    time12.setId_timeB(idT6_12);
                    time13.setId_timeA(idT6_13);
                    time14.setId_timeB(idT6_14);
                    time15.setId_timeA(idT6_15);
                    time16.setId_timeB(idT6_16);
                    time17.setId_timeA(idT6_17);
                    time18.setId_timeB(idT6_18);
                    time19.setId_timeA(idT6_19);
                    time20.setId_timeB(idT6_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_7//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r7 = jogoDao.listaJogos_r7();
                    request.setAttribute("listaJogos_r7", listaJogos_r7);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes7 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes7);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada7.jsp").forward(request, response);

                    break;

                case 7:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo61 = new Integer(request.getParameter("jogo61"));
                    Integer idJogo62 = new Integer(request.getParameter("jogo62"));
                    Integer idJogo63 = new Integer(request.getParameter("jogo63"));
                    Integer idJogo64 = new Integer(request.getParameter("jogo64"));
                    Integer idJogo65 = new Integer(request.getParameter("jogo65"));
                    Integer idJogo66 = new Integer(request.getParameter("jogo66"));
                    Integer idJogo67 = new Integer(request.getParameter("jogo67"));
                    Integer idJogo68 = new Integer(request.getParameter("jogo68"));
                    Integer idJogo69 = new Integer(request.getParameter("jogo69"));
                    Integer idJogo70 = new Integer(request.getParameter("jogo70"));

                    Integer idT7_1 = new Integer(request.getParameter("timeA4"));
                    Integer idT7_2 = new Integer(request.getParameter("timeB11"));
                    Integer idT7_3 = new Integer(request.getParameter("timeA18"));
                    Integer idT7_4 = new Integer(request.getParameter("timeB2"));
                    Integer idT7_5 = new Integer(request.getParameter("timeA5"));
                    Integer idT7_6 = new Integer(request.getParameter("timeB17"));
                    Integer idT7_7 = new Integer(request.getParameter("timeA13"));
                    Integer idT7_8 = new Integer(request.getParameter("timeB12"));
                    Integer idT7_9 = new Integer(request.getParameter("timeA19"));
                    Integer idT7_10 = new Integer(request.getParameter("timeB8"));
                    Integer idT7_11 = new Integer(request.getParameter("timeA7"));
                    Integer idT7_12 = new Integer(request.getParameter("timeB1"));
                    Integer idT7_13 = new Integer(request.getParameter("timeA14"));
                    Integer idT7_14 = new Integer(request.getParameter("timeB3"));
                    Integer idT7_15 = new Integer(request.getParameter("timeA15"));
                    Integer idT7_16 = new Integer(request.getParameter("timeB10"));
                    Integer idT7_17 = new Integer(request.getParameter("timeA6"));
                    Integer idT7_18 = new Integer(request.getParameter("timeB20"));
                    Integer idT7_19 = new Integer(request.getParameter("timeA9"));
                    Integer idT7_20 = new Integer(request.getParameter("timeB16"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g7_1 = new Integer(request.getParameter("4"));
                    Integer g7_2 = new Integer(request.getParameter("11"));
                    Integer g7_3 = new Integer(request.getParameter("18"));
                    Integer g7_4 = new Integer(request.getParameter("2"));
                    Integer g7_5 = new Integer(request.getParameter("5"));
                    Integer g7_6 = new Integer(request.getParameter("17"));
                    Integer g7_7 = new Integer(request.getParameter("13"));
                    Integer g7_8 = new Integer(request.getParameter("12"));
                    Integer g7_9 = new Integer(request.getParameter("19"));
                    Integer g7_10 = new Integer(request.getParameter("8"));
                    Integer g7_11 = new Integer(request.getParameter("7"));
                    Integer g7_12 = new Integer(request.getParameter("1"));
                    Integer g7_13 = new Integer(request.getParameter("14"));
                    Integer g7_14 = new Integer(request.getParameter("3"));
                    Integer g7_15 = new Integer(request.getParameter("15"));
                    Integer g7_16 = new Integer(request.getParameter("10"));
                    Integer g7_17 = new Integer(request.getParameter("6"));
                    Integer g7_18 = new Integer(request.getParameter("20"));
                    Integer g7_19 = new Integer(request.getParameter("9"));
                    Integer g7_20 = new Integer(request.getParameter("16"));

                    jogo1.setGoltimeA(g7_1);
                    jogo1.setGoltimeB(g7_2);
                    jogo2.setGoltimeA(g7_3);
                    jogo2.setGoltimeB(g7_4);
                    jogo3.setGoltimeA(g7_5);
                    jogo3.setGoltimeB(g7_6);
                    jogo4.setGoltimeA(g7_7);
                    jogo4.setGoltimeB(g7_8);
                    jogo5.setGoltimeA(g7_9);
                    jogo5.setGoltimeB(g7_10);
                    jogo6.setGoltimeA(g7_11);
                    jogo6.setGoltimeB(g7_12);
                    jogo7.setGoltimeA(g7_13);
                    jogo7.setGoltimeB(g7_14);
                    jogo8.setGoltimeA(g7_15);
                    jogo8.setGoltimeB(g7_16);
                    jogo9.setGoltimeA(g7_17);
                    jogo9.setGoltimeB(g7_18);
                    jogo10.setGoltimeA(g7_19);
                    jogo10.setGoltimeB(g7_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo61);
                    jogo2.setId_jogo(idJogo62);
                    jogo3.setId_jogo(idJogo63);
                    jogo4.setId_jogo(idJogo64);
                    jogo5.setId_jogo(idJogo65);
                    jogo6.setId_jogo(idJogo66);
                    jogo7.setId_jogo(idJogo67);
                    jogo8.setId_jogo(idJogo68);
                    jogo9.setId_jogo(idJogo69);
                    jogo10.setId_jogo(idJogo70);

                    time1.setId_timeA(idT7_1);
                    time2.setId_timeB(idT7_2);
                    time3.setId_timeA(idT7_3);
                    time4.setId_timeB(idT7_4);
                    time5.setId_timeA(idT7_5);
                    time6.setId_timeB(idT7_6);
                    time7.setId_timeA(idT7_7);
                    time8.setId_timeB(idT7_8);
                    time9.setId_timeA(idT7_9);
                    time10.setId_timeB(idT7_10);
                    time11.setId_timeA(idT7_11);
                    time12.setId_timeB(idT7_12);
                    time13.setId_timeA(idT7_13);
                    time14.setId_timeB(idT7_14);
                    time15.setId_timeA(idT7_15);
                    time16.setId_timeB(idT7_16);
                    time17.setId_timeA(idT7_17);
                    time18.setId_timeB(idT7_18);
                    time19.setId_timeA(idT7_19);
                    time20.setId_timeB(idT7_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_9//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r8 = jogoDao.listaJogos_r8();
                    request.setAttribute("listaJogos_r8", listaJogos_r8);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes8 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes8);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada8.jsp").forward(request, response);

                    break;
                case 8:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo71 = new Integer(request.getParameter("jogo71"));
                    Integer idJogo72 = new Integer(request.getParameter("jogo72"));
                    Integer idJogo73 = new Integer(request.getParameter("jogo73"));
                    Integer idJogo74 = new Integer(request.getParameter("jogo74"));
                    Integer idJogo75 = new Integer(request.getParameter("jogo75"));
                    Integer idJogo76 = new Integer(request.getParameter("jogo76"));
                    Integer idJogo77 = new Integer(request.getParameter("jogo77"));
                    Integer idJogo78 = new Integer(request.getParameter("jogo78"));
                    Integer idJogo79 = new Integer(request.getParameter("jogo79"));
                    Integer idJogo80 = new Integer(request.getParameter("jogo80"));

                    Integer idT8_1 = new Integer(request.getParameter("timeA19"));
                    Integer idT8_2 = new Integer(request.getParameter("timeB18"));
                    Integer idT8_3 = new Integer(request.getParameter("timeA2"));
                    Integer idT8_4 = new Integer(request.getParameter("timeB11"));
                    Integer idT8_5 = new Integer(request.getParameter("timeA3"));
                    Integer idT8_6 = new Integer(request.getParameter("timeB15"));
                    Integer idT8_7 = new Integer(request.getParameter("timeA10"));
                    Integer idT8_8 = new Integer(request.getParameter("timeB4"));
                    Integer idT8_9 = new Integer(request.getParameter("timeA20"));
                    Integer idT8_10 = new Integer(request.getParameter("timeB7"));
                    Integer idT8_11 = new Integer(request.getParameter("timeA1"));
                    Integer idT8_12 = new Integer(request.getParameter("timeB5"));
                    Integer idT8_13 = new Integer(request.getParameter("timeA12"));
                    Integer idT8_14 = new Integer(request.getParameter("timeB6"));
                    Integer idT8_15 = new Integer(request.getParameter("timeA8"));
                    Integer idT8_16 = new Integer(request.getParameter("timeB9"));
                    Integer idT8_17 = new Integer(request.getParameter("timeA16"));
                    Integer idT8_18 = new Integer(request.getParameter("timeB13"));
                    Integer idT8_19 = new Integer(request.getParameter("timeA17"));
                    Integer idT8_20 = new Integer(request.getParameter("timeB14"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g8_1 = new Integer(request.getParameter("19"));
                    Integer g8_2 = new Integer(request.getParameter("18"));
                    Integer g8_3 = new Integer(request.getParameter("2"));
                    Integer g8_4 = new Integer(request.getParameter("11"));
                    Integer g8_5 = new Integer(request.getParameter("3"));
                    Integer g8_6 = new Integer(request.getParameter("15"));
                    Integer g8_7 = new Integer(request.getParameter("10"));
                    Integer g8_8 = new Integer(request.getParameter("4"));
                    Integer g8_9 = new Integer(request.getParameter("20"));
                    Integer g8_10 = new Integer(request.getParameter("7"));
                    Integer g8_11 = new Integer(request.getParameter("1"));
                    Integer g8_12 = new Integer(request.getParameter("5"));
                    Integer g8_13 = new Integer(request.getParameter("16"));
                    Integer g8_14 = new Integer(request.getParameter("6"));
                    Integer g8_15 = new Integer(request.getParameter("8"));
                    Integer g8_16 = new Integer(request.getParameter("9"));
                    Integer g8_17 = new Integer(request.getParameter("16"));
                    Integer g8_18 = new Integer(request.getParameter("13"));
                    Integer g8_19 = new Integer(request.getParameter("17"));
                    Integer g8_20 = new Integer(request.getParameter("14"));

                    jogo1.setGoltimeA(g8_1);
                    jogo1.setGoltimeB(g8_2);
                    jogo2.setGoltimeA(g8_3);
                    jogo2.setGoltimeB(g8_4);
                    jogo3.setGoltimeA(g8_5);
                    jogo3.setGoltimeB(g8_6);
                    jogo4.setGoltimeA(g8_7);
                    jogo4.setGoltimeB(g8_8);
                    jogo5.setGoltimeA(g8_9);
                    jogo5.setGoltimeB(g8_10);
                    jogo6.setGoltimeA(g8_11);
                    jogo6.setGoltimeB(g8_12);
                    jogo7.setGoltimeA(g8_13);
                    jogo7.setGoltimeB(g8_14);
                    jogo8.setGoltimeA(g8_15);
                    jogo8.setGoltimeB(g8_16);
                    jogo9.setGoltimeA(g8_17);
                    jogo9.setGoltimeB(g8_18);
                    jogo10.setGoltimeA(g8_19);
                    jogo10.setGoltimeB(g8_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo71);
                    jogo2.setId_jogo(idJogo72);
                    jogo3.setId_jogo(idJogo73);
                    jogo4.setId_jogo(idJogo74);
                    jogo5.setId_jogo(idJogo75);
                    jogo6.setId_jogo(idJogo76);
                    jogo7.setId_jogo(idJogo77);
                    jogo8.setId_jogo(idJogo78);
                    jogo9.setId_jogo(idJogo79);
                    jogo10.setId_jogo(idJogo80);

                    time1.setId_timeA(idT8_1);
                    time2.setId_timeB(idT8_2);
                    time3.setId_timeA(idT8_3);
                    time4.setId_timeB(idT8_4);
                    time5.setId_timeA(idT8_5);
                    time6.setId_timeB(idT8_6);
                    time7.setId_timeA(idT8_7);
                    time8.setId_timeB(idT8_8);
                    time9.setId_timeA(idT8_9);
                    time10.setId_timeB(idT8_10);
                    time11.setId_timeA(idT8_11);
                    time12.setId_timeB(idT8_12);
                    time13.setId_timeA(idT8_13);
                    time14.setId_timeB(idT8_14);
                    time15.setId_timeA(idT8_15);
                    time16.setId_timeB(idT8_16);
                    time17.setId_timeA(idT8_17);
                    time18.setId_timeB(idT8_18);
                    time19.setId_timeA(idT8_19);
                    time20.setId_timeB(idT8_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_9//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r9 = jogoDao.listaJogos_r9();
                    request.setAttribute("listaJogos_r9", listaJogos_r9);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes9 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes9);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada9.jsp").forward(request, response);

                    break;

                case 9:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo81 = new Integer(request.getParameter("jogo81"));
                    Integer idJogo82 = new Integer(request.getParameter("jogo82"));
                    Integer idJogo83 = new Integer(request.getParameter("jogo83"));
                    Integer idJogo84 = new Integer(request.getParameter("jogo84"));
                    Integer idJogo85 = new Integer(request.getParameter("jogo85"));
                    Integer idJogo86 = new Integer(request.getParameter("jogo86"));
                    Integer idJogo87 = new Integer(request.getParameter("jogo87"));
                    Integer idJogo88 = new Integer(request.getParameter("jogo88"));
                    Integer idJogo89 = new Integer(request.getParameter("jogo89"));
                    Integer idJogo90 = new Integer(request.getParameter("jogo90"));

                    Integer idT9_1 = new Integer(request.getParameter("timeA13"));
                    Integer idT9_2 = new Integer(request.getParameter("timeB2"));
                    Integer idT9_3 = new Integer(request.getParameter("timeA11"));
                    Integer idT9_4 = new Integer(request.getParameter("timeB1"));
                    Integer idT9_5 = new Integer(request.getParameter("timeA6"));
                    Integer idT9_6 = new Integer(request.getParameter("timeB18"));
                    Integer idT9_7 = new Integer(request.getParameter("timeA8"));
                    Integer idT9_8 = new Integer(request.getParameter("timeB5"));
                    Integer idT9_9 = new Integer(request.getParameter("timeA16"));
                    Integer idT9_10 = new Integer(request.getParameter("timeB4"));
                    Integer idT9_11 = new Integer(request.getParameter("timeA12"));
                    Integer idT9_12 = new Integer(request.getParameter("timeB19"));
                    Integer idT9_13 = new Integer(request.getParameter("timeA9"));
                    Integer idT9_14 = new Integer(request.getParameter("timeB7"));
                    Integer idT9_15 = new Integer(request.getParameter("timeA3"));
                    Integer idT9_16 = new Integer(request.getParameter("timeB20"));
                    Integer idT9_17 = new Integer(request.getParameter("timeA17"));
                    Integer idT9_18 = new Integer(request.getParameter("timeB15"));
                    Integer idT9_19 = new Integer(request.getParameter("timeA14"));
                    Integer idT9_20 = new Integer(request.getParameter("timeB10"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g9_1 = new Integer(request.getParameter("13"));
                    Integer g9_2 = new Integer(request.getParameter("2"));
                    Integer g9_3 = new Integer(request.getParameter("11"));
                    Integer g9_4 = new Integer(request.getParameter("1"));
                    Integer g9_5 = new Integer(request.getParameter("6"));
                    Integer g9_6 = new Integer(request.getParameter("18"));
                    Integer g9_7 = new Integer(request.getParameter("8"));
                    Integer g9_8 = new Integer(request.getParameter("5"));
                    Integer g9_9 = new Integer(request.getParameter("16"));
                    Integer g9_10 = new Integer(request.getParameter("4"));
                    Integer g9_11 = new Integer(request.getParameter("12"));
                    Integer g9_12 = new Integer(request.getParameter("19"));
                    Integer g9_13 = new Integer(request.getParameter("9"));
                    Integer g9_14 = new Integer(request.getParameter("7"));
                    Integer g9_15 = new Integer(request.getParameter("3"));
                    Integer g9_16 = new Integer(request.getParameter("20"));
                    Integer g9_17 = new Integer(request.getParameter("17"));
                    Integer g9_18 = new Integer(request.getParameter("15"));
                    Integer g9_19 = new Integer(request.getParameter("14"));
                    Integer g9_20 = new Integer(request.getParameter("10"));

                    jogo1.setGoltimeA(g9_1);
                    jogo1.setGoltimeB(g9_2);
                    jogo2.setGoltimeA(g9_3);
                    jogo2.setGoltimeB(g9_4);
                    jogo3.setGoltimeA(g9_5);
                    jogo3.setGoltimeB(g9_6);
                    jogo4.setGoltimeA(g9_7);
                    jogo4.setGoltimeB(g9_8);
                    jogo5.setGoltimeA(g9_9);
                    jogo5.setGoltimeB(g9_10);
                    jogo6.setGoltimeA(g9_11);
                    jogo6.setGoltimeB(g9_12);
                    jogo7.setGoltimeA(g9_13);
                    jogo7.setGoltimeB(g9_14);
                    jogo8.setGoltimeA(g9_15);
                    jogo8.setGoltimeB(g9_16);
                    jogo9.setGoltimeA(g9_17);
                    jogo9.setGoltimeB(g9_18);
                    jogo10.setGoltimeA(g9_19);
                    jogo10.setGoltimeB(g9_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo81);
                    jogo2.setId_jogo(idJogo82);
                    jogo3.setId_jogo(idJogo83);
                    jogo4.setId_jogo(idJogo84);
                    jogo5.setId_jogo(idJogo85);
                    jogo6.setId_jogo(idJogo86);
                    jogo7.setId_jogo(idJogo87);
                    jogo8.setId_jogo(idJogo88);
                    jogo9.setId_jogo(idJogo89);
                    jogo10.setId_jogo(idJogo90);

                    time1.setId_timeA(idT9_1);
                    time2.setId_timeB(idT9_2);
                    time3.setId_timeA(idT9_3);
                    time4.setId_timeB(idT9_4);
                    time5.setId_timeA(idT9_5);
                    time6.setId_timeB(idT9_6);
                    time7.setId_timeA(idT9_7);
                    time8.setId_timeB(idT9_8);
                    time9.setId_timeA(idT9_9);
                    time10.setId_timeB(idT9_10);
                    time11.setId_timeA(idT9_11);
                    time12.setId_timeB(idT9_12);
                    time13.setId_timeA(idT9_13);
                    time14.setId_timeB(idT9_14);
                    time15.setId_timeA(idT9_15);
                    time16.setId_timeB(idT9_16);
                    time17.setId_timeA(idT9_17);
                    time18.setId_timeB(idT9_18);
                    time19.setId_timeA(idT9_19);
                    time20.setId_timeB(idT9_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA JOGO_RODADA_10//////////////////////////////////////////////////////////////////
                    List<Jogo> listaJogos_r10 = jogoDao.listaJogos_r10();
                    request.setAttribute("listaJogos_r10", listaJogos_r10);
                    ////////////////////////////////////////////////////////////////////////////////

                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes10 = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes10);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("rodada10.jsp").forward(request, response);

                    break;

                case 10:

                    /////////////////////////////////////////////////////////////////////
                    Integer idJogo91 = new Integer(request.getParameter("jogo91"));
                    Integer idJogo92 = new Integer(request.getParameter("jogo92"));
                    Integer idJogo93 = new Integer(request.getParameter("jogo93"));
                    Integer idJogo94 = new Integer(request.getParameter("jogo94"));
                    Integer idJogo95 = new Integer(request.getParameter("jogo95"));
                    Integer idJogo96 = new Integer(request.getParameter("jogo96"));
                    Integer idJogo97 = new Integer(request.getParameter("jogo97"));
                    Integer idJogo98 = new Integer(request.getParameter("jogo98"));
                    Integer idJogo99 = new Integer(request.getParameter("jogo99"));
                    Integer idJogo100 = new Integer(request.getParameter("jogo100"));

                    Integer idT10_1 = new Integer(request.getParameter("timeA2"));
                    Integer idT10_2 = new Integer(request.getParameter("timeB12"));
                    Integer idT10_3 = new Integer(request.getParameter("timeA1"));
                    Integer idT10_4 = new Integer(request.getParameter("timeB13"));
                    Integer idT10_5 = new Integer(request.getParameter("timeA11"));
                    Integer idT10_6 = new Integer(request.getParameter("timeB20"));
                    Integer idT10_7 = new Integer(request.getParameter("timeA5"));
                    Integer idT10_8 = new Integer(request.getParameter("timeB16"));
                    Integer idT10_9 = new Integer(request.getParameter("timeA7"));
                    Integer idT10_10 = new Integer(request.getParameter("timeB3"));
                    Integer idT10_11 = new Integer(request.getParameter("timeA4"));
                    Integer idT10_12 = new Integer(request.getParameter("timeB17"));
                    Integer idT10_13 = new Integer(request.getParameter("timeA10"));
                    Integer idT10_14 = new Integer(request.getParameter("timeB19"));
                    Integer idT10_15 = new Integer(request.getParameter("timeA14"));
                    Integer idT10_16 = new Integer(request.getParameter("timeB9"));
                    Integer idT10_17 = new Integer(request.getParameter("timeA18"));
                    Integer idT10_18 = new Integer(request.getParameter("timeB8"));
                    Integer idT10_19 = new Integer(request.getParameter("timeA15"));
                    Integer idT10_20 = new Integer(request.getParameter("timeB6"));

                    /////////////////////////////////////////////////////////////////////
                    Integer g10_1 = new Integer(request.getParameter("2"));
                    Integer g10_2 = new Integer(request.getParameter("12"));
                    Integer g10_3 = new Integer(request.getParameter("1"));
                    Integer g10_4 = new Integer(request.getParameter("13"));
                    Integer g10_5 = new Integer(request.getParameter("11"));
                    Integer g10_6 = new Integer(request.getParameter("20"));
                    Integer g10_7 = new Integer(request.getParameter("5"));
                    Integer g10_8 = new Integer(request.getParameter("16"));
                    Integer g10_9 = new Integer(request.getParameter("7"));
                    Integer g10_10 = new Integer(request.getParameter("3"));
                    Integer g10_11 = new Integer(request.getParameter("4"));
                    Integer g10_12 = new Integer(request.getParameter("17"));
                    Integer g10_13 = new Integer(request.getParameter("10"));
                    Integer g10_14 = new Integer(request.getParameter("19"));
                    Integer g10_15 = new Integer(request.getParameter("14"));
                    Integer g10_16 = new Integer(request.getParameter("9"));
                    Integer g10_17 = new Integer(request.getParameter("18"));
                    Integer g10_18 = new Integer(request.getParameter("8"));
                    Integer g10_19 = new Integer(request.getParameter("6"));
                    Integer g10_20 = new Integer(request.getParameter("15"));

                    jogo1.setGoltimeA(g10_1);
                    jogo1.setGoltimeB(g10_2);
                    jogo2.setGoltimeA(g10_3);
                    jogo2.setGoltimeB(g10_4);
                    jogo3.setGoltimeA(g10_5);
                    jogo3.setGoltimeB(g10_6);
                    jogo4.setGoltimeA(g10_7);
                    jogo4.setGoltimeB(g10_8);
                    jogo5.setGoltimeA(g10_9);
                    jogo5.setGoltimeB(g10_10);
                    jogo6.setGoltimeA(g10_11);
                    jogo6.setGoltimeB(g10_12);
                    jogo7.setGoltimeA(g10_13);
                    jogo7.setGoltimeB(g10_14);
                    jogo8.setGoltimeA(g10_15);
                    jogo8.setGoltimeB(g10_16);
                    jogo9.setGoltimeA(g10_17);
                    jogo9.setGoltimeB(g10_18);
                    jogo10.setGoltimeA(g10_19);
                    jogo10.setGoltimeB(g10_20);

                    /////////////////////////////////////////////////////////////////////
                    jogo1.setId_jogo(idJogo91);
                    jogo2.setId_jogo(idJogo92);
                    jogo3.setId_jogo(idJogo93);
                    jogo4.setId_jogo(idJogo94);
                    jogo5.setId_jogo(idJogo95);
                    jogo6.setId_jogo(idJogo96);
                    jogo7.setId_jogo(idJogo97);
                    jogo8.setId_jogo(idJogo98);
                    jogo9.setId_jogo(idJogo99);
                    jogo10.setId_jogo(idJogo100);

                    time1.setId_timeA(idT10_1);
                    time2.setId_timeB(idT10_2);
                    time3.setId_timeA(idT10_3);
                    time4.setId_timeB(idT10_4);
                    time5.setId_timeA(idT10_5);
                    time6.setId_timeB(idT10_6);
                    time7.setId_timeA(idT10_7);
                    time8.setId_timeB(idT10_8);
                    time9.setId_timeA(idT10_9);
                    time10.setId_timeB(idT10_10);
                    time11.setId_timeA(idT10_11);
                    time12.setId_timeB(idT10_12);
                    time13.setId_timeA(idT10_13);
                    time14.setId_timeB(idT10_14);
                    time15.setId_timeA(idT10_15);
                    time16.setId_timeB(idT10_16);
                    time17.setId_timeA(idT10_17);
                    time18.setId_timeB(idT10_18);
                    time19.setId_timeA(idT10_19);
                    time20.setId_timeB(idT10_20);

                    ///CÁLCULO_PONTOS/////////////////////////////////////////////////////////////////
                    if (jogo1.getGoltimeA() > jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time1, ttime1);
                    } else if (jogo1.getGoltimeA() == jogo1.getGoltimeB()) {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time1, ttime1);
                    } else {
                        ttime1.setGolpro(jogo1.getGoltimeA());
                        ttime1.setGolcontra(jogo1.getGoltimeB());
                        ttime1.setSaldodegols(jogo1.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time1, ttime1);
                    }

                    if (jogo1.getGoltimeB() > jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time2, ttime2);
                    } else if (jogo1.getGoltimeB() == jogo1.getGoltimeA()) {
                        ttime2.setGolpro(jogo1.getGoltimeB());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time2, ttime2);
                    } else {
                        ttime2.setGolpro(jogo1.getGoltimeA());
                        ttime2.setGolcontra(jogo1.getGoltimeA());
                        ttime2.setSaldodegols(jogo1.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time2, ttime2);
                    }

                    if (jogo2.getGoltimeA() > jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time3, ttime3);
                    } else if (jogo2.getGoltimeA() == jogo2.getGoltimeB()) {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time3, ttime3);
                    } else {
                        ttime3.setGolpro(jogo2.getGoltimeA());
                        ttime3.setGolcontra(jogo2.getGoltimeB());
                        ttime3.setSaldodegols(jogo2.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time3, ttime3);
                    }

                    if (jogo2.getGoltimeB() > jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time4, ttime4);
                    } else if (jogo2.getGoltimeB() == jogo2.getGoltimeA()) {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time4, ttime4);
                    } else {
                        ttime4.setGolpro(jogo2.getGoltimeB());
                        ttime4.setGolcontra(jogo2.getGoltimeA());
                        ttime4.setSaldodegols(jogo2.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time4, ttime4);
                    }

                    if (jogo3.getGoltimeA() > jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time5, ttime5);
                    } else if (jogo3.getGoltimeA() == jogo3.getGoltimeB()) {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time5, ttime5);
                    } else {
                        ttime5.setGolpro(jogo3.getGoltimeA());
                        ttime5.setGolcontra(jogo3.getGoltimeB());
                        ttime5.setSaldodegols(jogo3.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time5, ttime5);
                    }

                    if (jogo3.getGoltimeB() > jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time6, ttime6);
                    } else if (jogo3.getGoltimeB() == jogo3.getGoltimeA()) {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time6, ttime6);
                    } else {
                        ttime6.setGolpro(jogo3.getGoltimeB());
                        ttime6.setGolcontra(jogo3.getGoltimeA());
                        ttime6.setSaldodegols(jogo3.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time6, ttime6);
                    }

                    if (jogo4.getGoltimeA() > jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time7, ttime7);
                    } else if (jogo4.getGoltimeA() == jogo4.getGoltimeB()) {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time7, ttime7);
                    } else {
                        ttime7.setGolpro(jogo4.getGoltimeA());
                        ttime7.setGolcontra(jogo4.getGoltimeB());
                        ttime7.setSaldodegols(jogo4.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time7, ttime7);
                    }

                    if (jogo4.getGoltimeB() > jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time8, ttime8);
                    } else if (jogo4.getGoltimeB() == jogo4.getGoltimeA()) {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time8, ttime8);
                    } else {
                        ttime8.setGolpro(jogo4.getGoltimeB());
                        ttime8.setGolcontra(jogo4.getGoltimeA());
                        ttime8.setSaldodegols(jogo4.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time8, ttime8);
                    }

                    if (jogo5.getGoltimeA() > jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time9, ttime9);
                    } else if (jogo5.getGoltimeA() == jogo5.getGoltimeB()) {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time9, ttime9);
                    } else {
                        ttime9.setGolpro(jogo5.getGoltimeA());
                        ttime9.setGolcontra(jogo5.getGoltimeB());
                        ttime9.setSaldodegols(jogo5.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time9, ttime9);
                    }

                    if (jogo5.getGoltimeB() > jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time10, ttime10);
                    } else if (jogo5.getGoltimeB() == jogo5.getGoltimeA()) {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time10, ttime10);
                    } else {
                        ttime10.setGolpro(jogo5.getGoltimeB());
                        ttime10.setGolcontra(jogo5.getGoltimeA());
                        ttime10.setSaldodegols(jogo5.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time10, ttime10);
                    }

                    if (jogo6.getGoltimeA() > jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time11, ttime11);
                    } else if (jogo6.getGoltimeA() == jogo6.getGoltimeB()) {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time11, ttime11);
                    } else {
                        ttime11.setGolpro(jogo6.getGoltimeA());
                        ttime11.setGolcontra(jogo6.getGoltimeB());
                        ttime11.setSaldodegols(jogo6.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time11, ttime11);
                    }

                    if (jogo6.getGoltimeB() > jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time12, ttime12);
                    } else if (jogo6.getGoltimeB() == jogo6.getGoltimeA()) {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time12, ttime12);
                    } else {
                        ttime12.setGolpro(jogo6.getGoltimeB());
                        ttime12.setGolcontra(jogo6.getGoltimeA());
                        ttime12.setSaldodegols(jogo6.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time12, ttime12);
                    }

                    if (jogo7.getGoltimeA() > jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time13, ttime13);
                    } else if (jogo7.getGoltimeA() == jogo7.getGoltimeB()) {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time13, ttime13);
                    } else {
                        ttime13.setGolpro(jogo7.getGoltimeA());
                        ttime13.setGolcontra(jogo7.getGoltimeB());
                        ttime13.setSaldodegols(jogo7.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time13, ttime13);
                    }

                    if (jogo7.getGoltimeB() > jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time14, ttime14);
                    } else if (jogo7.getGoltimeB() == jogo7.getGoltimeA()) {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time14, ttime14);
                    } else {
                        ttime14.setGolpro(jogo7.getGoltimeB());
                        ttime14.setGolcontra(jogo7.getGoltimeA());
                        ttime14.setSaldodegols(jogo7.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time14, ttime14);
                    }

                    if (jogo8.getGoltimeA() > jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time15, ttime15);
                    } else if (jogo8.getGoltimeA() == jogo8.getGoltimeB()) {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time15, ttime15);
                    } else {
                        ttime15.setGolpro(jogo8.getGoltimeA());
                        ttime15.setGolcontra(jogo8.getGoltimeB());
                        ttime15.setSaldodegols(jogo8.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time15, ttime15);
                    }

                    if (jogo8.getGoltimeB() > jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time16, ttime16);
                    } else if (jogo8.getGoltimeB() == jogo8.getGoltimeA()) {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time16, ttime16);
                    } else {
                        ttime16.setGolpro(jogo8.getGoltimeB());
                        ttime16.setGolcontra(jogo8.getGoltimeA());
                        ttime16.setSaldodegols(jogo8.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time16, ttime16);
                    }

                    if (jogo9.getGoltimeA() > jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time17, ttime17);
                    } else if (jogo9.getGoltimeA() == jogo9.getGoltimeB()) {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time17, ttime17);
                    } else {
                        ttime17.setGolpro(jogo9.getGoltimeA());
                        ttime17.setGolcontra(jogo9.getGoltimeB());
                        ttime17.setSaldodegols(jogo9.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time17, ttime17);
                    }

                    if (jogo9.getGoltimeB() > jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time18, ttime18);
                    } else if (jogo9.getGoltimeB() == jogo9.getGoltimeA()) {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time18, ttime18);
                    } else {
                        ttime18.setGolpro(jogo9.getGoltimeB());
                        ttime18.setGolcontra(jogo9.getGoltimeA());
                        ttime18.setSaldodegols(jogo9.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time18, ttime18);
                    }

                    if (jogo10.getGoltimeA() > jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Vitoria(time19, ttime19);
                    } else if (jogo10.getGoltimeA() == jogo10.getGoltimeB()) {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Empate(time19, ttime19);
                    } else {
                        ttime19.setGolpro(jogo10.getGoltimeA());
                        ttime19.setGolcontra(jogo10.getGoltimeB());
                        ttime19.setSaldodegols(jogo10.getGoltimeA());
                        timeDao.gravarClassificacaoA_Derrota(time19, ttime19);
                    }

                    if (jogo10.getGoltimeB() > jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Vitoria(time20, ttime20);
                    } else if (jogo10.getGoltimeB() == jogo10.getGoltimeA()) {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Empate(time20, ttime20);
                    } else {
                        ttime20.setGolpro(jogo10.getGoltimeB());
                        ttime20.setGolcontra(jogo10.getGoltimeA());
                        ttime20.setSaldodegols(jogo10.getGoltimeB());
                        timeDao.gravarClassificacaoB_Derrota(time20, ttime20);
                    }

                    ///////////////////////////////////////////////////////////////////////////////*/
                    
                    //CONSULTA TIME//////////////////////////////////////////////////////////////////
                    List<Time> listaTimes = timeDao.consultarClassificacao();
                    request.setAttribute("listaTimes", listaTimes);
                    ////////////////////////////////////////////////////////////////////////////////

                    request.getRequestDispatcher("classificacaoGeral.jsp").forward(request, response);
                    break;

                default:

                    break;
            }
        } catch (Exception ex) {
            Logger.getLogger(RodadaControlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}