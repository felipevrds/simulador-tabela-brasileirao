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

<body>
<%--<body background="brasileirao-logo.png" style="background-repeat: no-repeat; background-position: left; background-size:300px; top: 100px;" >--%>
    
    <div id="Layer1" class="col-sm-12"  align="center" style="background:" >
        <img src="imagem\brasileirao-logo.png" alt="some text" width=450 height=500" align="left" style="margin-top: 40px; margin-left:">
        <form action="IndexControlador" method="GET" style="text-align: center;">
            <button type="submit" class="btn btn-danger" style="font-size: 30px; margin-top: 250px;">Iniciar Simulador Campeonato Brasileiro 2019</button>
        </form>
    </div>
    
</body>

