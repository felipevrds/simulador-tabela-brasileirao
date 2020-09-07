package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import model.entidades.Time;
import Conexao.ConnectionFactory;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.entidades.Jogo;

public class TimeDao {

    ///SELECT_CLASSIFICAÇÃO//////////////////////////////////////////////////////////////////////////////////////
    public List<Time> consultarClassificacao() throws Exception {

        Connection conexao = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Time> listaTimes = new ArrayList<>();

        try {
            conexao = new ConnectionFactory().getConnection();
            String sql = "SELECT * FROM  tb_time ORDER BY pontos desc, descricao";
            stmt = conexao.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {

                Time t = new Time();

                t.setId_time(rs.getInt("id_time"));
                t.setDescricao(rs.getString("descricao"));
                t.setPontos(rs.getInt("pontos"));
                t.setJogos(rs.getInt("jogos"));
                t.setVitorias(rs.getInt("vitorias"));
                t.setEmpates(rs.getInt("empates"));
                t.setDerrotas(rs.getInt("derrotas"));
                t.setGolpro(rs.getInt("golpro"));
                t.setGolcontra(rs.getInt("golcontra"));
                t.setSaldodegols(rs.getInt("saldodegols"));

                listaTimes.add(t);
            }
        } catch (Exception e) {
            throw new Exception("Deu Ruim.", e);
        } finally {
            stmt.close();
            conexao.close();
        }
        return listaTimes;
    }
    ///SELECT_CLASSIFICAÇÃO//////////////////////////////////////////////////////////////////////////////////////

    ///UPDATE_CLASSIFICAÇÃO_TIMEA_VITORIA///////////////////////////////////////////////////////////////////////////////////////////
    public void gravarClassificacaoA_Vitoria(Jogo jogo, Time time) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "UPDATE tb_time SET pontos = pontos + 3, jogos = jogos + 1, vitorias = vitorias + 1, "
                    + "golpro = ?, golcontra = ?, saldodegols = ?  WHERE id_time = ? ";

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, time.getGolpro());
            stmt.setInt(2, time.getGolcontra());
            stmt.setInt(3, time.getSaldodegols());
            stmt.setInt(4, jogo.getId_timeA());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Deu pau", e);
        } finally {
            stmt.close();
            conn.close();
        }
    }
    ///UPDATE_CLASSIFICAÇÃO_TIMEA_VITORIA///////////////////////////////////////////////////////////////////////////////////////////

    ///UPDATE_CLASSIFICAÇÃO_TIMEA_EMPATE///////////////////////////////////////////////////////////////////////////////////////////
    public void gravarClassificacaoA_Empate(Jogo jogo, Time time) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "UPDATE tb_time SET pontos = pontos + 1, jogos = jogos + 1, empates = empates + 1, "
                    + "golpro = ?, golcontra = ?, saldodegols = ?  WHERE id_time = ? ";

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, time.getGolpro());
            stmt.setInt(2, time.getGolcontra());
            stmt.setInt(3, time.getSaldodegols());
            stmt.setInt(4, jogo.getId_timeA());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Deu pau", e);
        } finally {
            stmt.close();
            conn.close();
        }
    }
    ///UPDATE_CLASSIFICAÇÃO_TIMEA_EMPATE///////////////////////////////////////////////////////////////////////////////////////////

    ///UPDATE_CLASSIFICAÇÃO_TIMEA_DERROTA///////////////////////////////////////////////////////////////////////////////////////////
    public void gravarClassificacaoA_Derrota(Jogo jogo, Time time) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "UPDATE tb_time SET jogos = jogos + 1, derrotas = derrotas + 1, "
                    + "golpro = ?, golcontra = ?, saldodegols = ?  WHERE id_time = ? ";

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, time.getGolpro());
            stmt.setInt(2, time.getGolcontra());
            stmt.setInt(3, time.getSaldodegols());
            stmt.setInt(4, jogo.getId_timeA());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Deu pau", e);
        } finally {
            stmt.close();
            conn.close();
        }
    }
    ///UPDATE_CLASSIFICAÇÃO_TIMEA_DERROTA///////////////////////////////////////////////////////////////////////////////////////////

    ///UPDATE_CLASSIFICAÇÃO_TIMEB_VITORIA///////////////////////////////////////////////////////////////////////////////////////////
    public void gravarClassificacaoB_Vitoria(Jogo jogo, Time time) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "UPDATE tb_time SET pontos = pontos + 3, jogos = jogos + 1, vitorias = vitorias + 1, "
                    + "golpro = ?, golcontra = ?, saldodegols = ?  WHERE id_time = ? ";

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, time.getGolpro());
            stmt.setInt(2, time.getGolcontra());
            stmt.setInt(3, time.getSaldodegols());
            stmt.setInt(4, jogo.getId_timeB());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Deu pau", e);
        } finally {
            stmt.close();
            conn.close();
        }
    }
    ///UPDATE_CLASSIFICAÇÃO_TIMEB_VITORIA///////////////////////////////////////////////////////////////////////////////////////////

    ///UPDATE_CLASSIFICAÇÃO_TIMEB_EMPATE///////////////////////////////////////////////////////////////////////////////////////////
    public void gravarClassificacaoB_Empate(Jogo jogo, Time time) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "UPDATE tb_time SET pontos = pontos + 1, jogos = jogos + 1, empates = empates + 1, "
                    + "golpro = ?, golcontra = ?, saldodegols = ?  WHERE id_time = ? ";

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, time.getGolpro());
            stmt.setInt(2, time.getGolcontra());
            stmt.setInt(3, time.getSaldodegols());
            stmt.setInt(4, jogo.getId_timeB());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Deu pau", e);
        } finally {
            stmt.close();
            conn.close();
        }
    }
    ///UPDATE_CLASSIFICAÇÃO_TIMEB_EMPATE///////////////////////////////////////////////////////////////////////////////////////////

    ///UPDATE_CLASSIFICAÇÃO_TIMEB_DERROTA///////////////////////////////////////////////////////////////////////////////////////////
    public void gravarClassificacaoB_Derrota(Jogo jogo, Time time) throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "UPDATE tb_time SET jogos = jogos + 1, derrotas = derrotas + 1, "
                    + "golpro = ?, golcontra = ?, saldodegols = ?  WHERE id_time = ? ";

            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, time.getGolpro());
            stmt.setInt(2, time.getGolcontra());
            stmt.setInt(3, time.getSaldodegols());
            stmt.setInt(4, jogo.getId_timeB());

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Deu pau", e);
        } finally {
            stmt.close();
            conn.close();
        }
    }
    ///UPDATE_CLASSIFICAÇÃO_TIMEB_DERROTA///////////////////////////////////////////////////////////////////////////////////////////

    ///UPDATE_CLASSIFICAÇÃO_TIMEB_DERROTA///////////////////////////////////////////////////////////////////////////////////////////
    public void limparRodadas() throws Exception {

        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = new ConnectionFactory().getConnection();

            String sql = "UPDATE tb_time SET pontos = 0, jogos = 0, vitorias = 0, empates = 0, derrotas = 0, golpro = 0, golcontra = 0, saldodegols = 0 ";

            stmt = conn.prepareStatement(sql);

            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new Exception("Deu pau", e);
        } finally {
            stmt.close();
            conn.close();
        }
    }
    ///UPDATE_CLASSIFICAÇÃO_TIMEB_DERROTA///////////////////////////////////////////////////////////////////////////////////////////

}
