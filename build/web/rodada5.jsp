<%@page import="model.dao.TimeDao"%>
<%@page import="java.util.LinkedList"%>
<%@page import="model.dao.JogoDao"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.entidades.Jogo"%>
<%@page import="model.entidades.Time"%>
<%@page language="java" import="java.sql.*, java.util.*"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!--EMPORT PARA O MENU-->
<c:import url="menu.jsp"/>  

<div class="row">

    <div class="col-sm-4"  align="center">

        <div class="text-center">
            <div class="display-4"><i class="fa fa-futbol-o text-primary"><strong> Simulador</strong></i></div><hr>
        </div>

        <div class="col-12 text-center">
            <div class="display-5"><i class="fa fa-futbol-o text-primary" aria-hidden="true"> 5ª Rodada</i></div>
        </div>
        
        <!--FORMULÁRIO_RODADA_5-->
            <form action="RodadaControlador" method="POST"> 
                
                <c:forEach var="lista" items="${listaJogos_r5}" varStatus="index">
                    <div class="col-11">
                        <table class="table text-center">
                            <tbody>
                                <tr>                                                    
                                    <td><img src="imagem/${lista.id_timeA}.png" width="50" height="50"></td>

                                    <td>
                                        <div class="row justify-content-sm-center">
                                            <input type="hidden" name="jogo${lista.id_jogo}" value="${lista.id_jogo}">
                                            <input type="hidden" name="rodada" value="${lista.id_rodada}">
                                            <input type="hidden" name="timeA${lista.id_timeA}" value="${lista.id_timeA}">
                                            <input type="hidden" name="timeB${lista.id_timeB}" value="${lista.id_timeB}">
                                            <div class="col-4">
                                                <input type="text" name="${lista.id_timeA}" required class="form-control" maxlength="2" onkeypress="return  event.charCode >= 48 && event.charCode <= 57">
                                            </div>
                                            <h4>X</h4>
                                            <div class="col-4">
                                                <input type="text" name="${lista.id_timeB}" required class="form-control" maxlength="2" onkeypress="return  event.charCode >= 48 && event.charCode <= 57">
                                            </div>
                                        </div>
                                    </td>

                                    <td><img src="imagem/${lista.id_timeB}.png" width="50" height="50"></td>
                                </tr> 
                            </tbody>
                        </table>
                    </div>  
                </c:forEach>   
                
                <button type="submit" class="btn btn-danger">Simular</button>
                
            </form>
        <!--FORMULÁRIO_RODADA_5-->
        
    </div>

        
    <!--CLASSIFICAÇÃO GERAL--> 
    <div class="col-sm-8">
        <div class="text-center">
            <div class="display-4"><i class="fa fa-futbol-o text-primary" aria-hidden="true"> <strong>Classificação Parcial</strong></i></div><hr>
        </div>
        <!--TABELA COM A LISTA--> 
        <div class="col-12">
            <table class="table text-primary text-center table-hover">
                <thead>
                    <tr class="thead-light badge-info">
                        <th scope="col">Ranking</th>
                        <th scope="col">Descricão</th>
                        <th scope="col">Pts</th>
                        <th scope="col">Jogos</th>
                        <th scope="col">Vitórias</th>                 
                        <th scope="col">Empates</th>
                        <th scope="col">Derrotas</th>                            
                        <th scope="col">GP</th>
                        <th scope="col">GC</th>
                        <th scope="col">SG</th>
                    </tr>
                </thead>
                <c:forEach var="lista" items="${listaTimes}" varStatus="index">
                    <tbody>
                    <td scope="row">${index.count}º</td>                 
                    <td scope="row">${lista.descricao}</td>                    
                    <td scope="row">${lista.pontos}</td>
                    <td scope="row">${lista.jogos}</td>
                    <td scope="row">${lista.vitorias}</td>
                    <td scope="row">${lista.empates}</td>
                    <td scope="row">${lista.derrotas}</td>
                    <td scope="row">${lista.golpro}</td>
                    <td scope="row">${lista.golcontra}</td> 
                    <td scope="row">${lista.saldodegols}</td> 
                    </tbody>
                </c:forEach>
            </table>
        </div>
    </div>
    <!--CLASSIFICAÇÃO GERAL--> 

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="bootstrap/node_modules/jquery/dist/jquery.js"></script>
    <script src="bootstrap/node_modules/popper.js/dist/umd/popper.js"></script>
    <script src="bootstrap/node_modules/bootstrap/dist/js/bootstrap.js"></script>

    <!-- Parar Carrossel -->
    <script>
        $('.carousel').carousel({
            pause: true,
            interval: false
        });
    </script>
