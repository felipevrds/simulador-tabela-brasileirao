/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import Conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.entidades.Jogo;

/**
 *
 * @author Valdeir
 */
public class JogoDao {

    ///SELECT_RODADA_1///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r1() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r1 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 1";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();
                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r1.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r1;
    }
    ///SELECT_RODADA_1///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_2///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r2() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r2 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 2";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r2.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r2;
    }
    ///SELECT_RODADA_2///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_3///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r3() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r3 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 3";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r3.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r3;
    }
    ///SELECT_RODADA_3///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_4///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r4() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r4 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 4";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r4.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r4;
    }
    ///SELECT_RODADA_4///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_5///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r5() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r5 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 5";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r5.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r5;
    }
    ///SELECT_RODADA_5///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_6///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r6() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r6 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 6";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r6.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r6;
    }
    ///SELECT_RODADA_6///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_7///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r7() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r7 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 7";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r7.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r7;
    }
    ///SELECT_RODADA_7///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_8///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r8() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r8 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 8";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r8.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r8;
    }
    ///SELECT_RODADA_8///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_9///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r9() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r9 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 9";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r9.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r9;
    }
    ///SELECT_RODADA_9///////////////////////////////////////////////////////////////////////////////////////////

    ///SELECT_RODADA_10///////////////////////////////////////////////////////////////////////////////////////////
    public List<Jogo> listaJogos_r10() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Jogo> listaJogos_r10 = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "select * from tb_jogo where id_rodada = 10";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Jogo jogo = new Jogo();

                jogo.setId_jogo(rs.getInt("id_jogo"));
                jogo.setId_rodada(rs.getInt("id_rodada"));
                jogo.setId_timeA(rs.getInt("id_timeA"));
                jogo.setId_timeB(rs.getInt("id_timeB"));
                listaJogos_r10.add(jogo);
            }

        } catch (Exception e) {
            throw new Exception("Erro ao consultar.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaJogos_r10;
    }
    ///SELECT_RODADA_10///////////////////////////////////////////////////////////////////////////////////////////

}
