<%--
  Created by IntelliJ IDEA.
  User: v.gutierrez
  Date: 12-10-22
  Time: 22:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<html>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css"
      integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <sec:authorize access="!isAuthenticated()">
        <a class="navbar-brand" href="${pageContext.request.contextPath}/login">Ingresar</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
                aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
    </sec:authorize>
    <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/inicio">Inicio <span
                        class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <sec:authorize access="hasAnyAuthority('ADMIN','USER')">
                    <a class="nav-link" href="${pageContext.request.contextPath}/capacitacion/lista">Capacitaciones</a>
                </sec:authorize>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/contacto/form">Contacto</a>
            </li>
            <li class="nav-item dropdown">
                <a class="nav-link dropdown-toggle" href="#" role="button" data-toggle="dropdown"
                   aria-expanded="false">
                    Ver más
                </a>
                <div class="dropdown-menu">
                    <sec:authorize access="hasAnyAuthority('ADMIN')">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/usuario/agregar">Registrar
                            Usuario</a>
                    </sec:authorize>
                    <sec:authorize access="hasAnyAuthority('ADMIN', 'USER')">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/usuario/lista">Ver
                            Usuarios</a>
                    </sec:authorize>
                    <sec:authorize access="hasAnyAuthority('ADMIN')">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/capacitacion/agregar">Registrar
                            Capacitaciones</a>
                    </sec:authorize>
                    <sec:authorize access="!isAuthenticated()">
                        <a class="dropdown-item" href="${pageContext.request.contextPath}/logout">Cerrar Sesión</a>
                    </sec:authorize>
                </div>
            </li>
        </ul>
    </div>
</nav>
</html>
