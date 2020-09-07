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

<div class="row justify-content-center">

    <div align="center">

        <div class="text-center text-white">
            <div class="display-4" >-</div><hr class="border-white">
        </div>

        <div class="col-2 float-right">
            <table class="table text-primary text-center table-hover">

                <thead>
                    <tr class="thead-light">
                        <th scope="col">|</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-primary">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-primary">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-primary">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-primary">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-info ">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-info ">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-success">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-success">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-success">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-success">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-success">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-success">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-secondary ">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-secondary  ">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-secondary  ">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-secondary  ">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-danger">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-danger">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead> 
                    <tr class="badge-danger">
                        <th scope="col">º</th>
                    </tr>
                </thead>

                <thead>
                    <tr class="badge-danger">
                        <th scope="col">º</th>
                    </tr>
                </thead>

            </table>
        </div>

    </div>

    <!--CLASSIFICAÇÃO GERAL--> 
    <div class="col-sm-10">
        <div class="text-center">
            <div class="display-4"><i class="fa fa-futbol-o text-primary" aria-hidden="true"> <strong>Classificação Geral</strong></i>
            </div>
            <hr>
        </div>
        <!--TABELA COM A LISTA--> 
        <div class="">
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
        <table class="table text-primary text-center table-hover">
            <tr class="thead-light badge-info">
                <td colspan="8" class="badge-light"><strong>LEGENDA</strong></td>
            </tr>
            <tr class="thead-light badge-info">
                <td scope="row" class="badge-primary">º</td>
                <td scope="row" class="badge-primary">Libertadores da América</td>

                <td scope="row" class="badge-info">º</td>
                <td scope="row" class="badge-info">Pré-Libertadores</td>

                <td scope="row" class="badge-success">º</td>
                <td scope="row" class="badge-success">Sul-Americana</td>

                <td scope="row" class="badge-danger">º</td>
                <td scope="row" class="badge-danger">2ª Divisão</td>
            </tr>
            <tr class="thead-light badge-info" >
                <td colspan="4" class="badge-light">
                    <form action="IndexControlador" method="GET">
                        <button type="submit" class="btn btn-danger">Apenas Iniciar Nova Simulação</button>
                    </form>
                </td>
                <td  colspan="4" class="badge-light">
                    <form class="float-left" action="IndexControlador" method="POST">
                        <button type="submit" class="btn btn-danger">Limpar e Iniciar Nova Simulação</button>
                    </form>
                </td>
            </tr>
        </table>    

    </div>


    <!--CLASSIFICAÇÃO GERAL--> 

</div>    

<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="bootstrap/node_modules/jquery/dist/jquery.js"></script>
<script src="bootstrap/node_modules/popper.js/dist/umd/popper.js"></script>
<script src="bootstrap/node_modules/bootstrap/dist/js/bootstrap.js"></script>

