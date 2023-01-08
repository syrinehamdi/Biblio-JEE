<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    if (request.getSession().getAttribute("person") == null){
        response.sendRedirect("login.jsp");
    } 
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LIBRARY</title>
    <link rel="icon" href="assets/img/favicon.png">
    <link rel="stylesheet" href="assets/css/home.css">
    <!-- Font awesome-->
    <link rel="stylesheet" href="path/to/font-awesome/css/font-awesome.min.css">
    <!-- Bootstrap Icon-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
</head>
<body>
    <nav class="navbar navbar-dark " >
        <!-- Navbar content -->
        <div class="container-fluid">
            <a class="navbar-brand page-title" href="#" style="font-size: 50px;">Library  Esen</a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarText">
              <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                  <i class="bi bi-house-door"></i>
                  <a class="nav-link active" aria-current="page" href="homeServlet">Home</a>
                </li>
                <li class="nav-item">
                  <i class="bi bi-search-heart-fill"></i>
                  <a class="nav-link" href="#search">Search</a>
                </li>
                <li class="nav-item">
                  <a class="login-btn" role="button" href="logoutServlet">Sign Out</a>
                </li>
              </ul>
            </div>
          </div>
    </nav>
    <div class="container-fluid">
        <section class="my-5 section-0">
            <h1>Your Online Library </h1>
            <h2>Library ESEN</h2>
            <form action="searchBook" method="GET" class="d-flex justify-content-center">
                <div class="input-group mb-3">
                    <input id="search" name="searchTerm" type="text" class="form-control" placeholder="Search a book" aria-label="Recipient's username" aria-describedby="basic-addon2">
                    <div class="input-group-append">
                        <button class="btn btn-outline-green" type="submit"><i class="fa-solid fa-magnifying-glass"></i></button>
                    </div>
                  </div>
            </form>
            <c:if test="${!empty sessionScope.person.nom && !empty sessionScope.person.prenom}"> 
                <p class="text-center">Welcome ${sessionScope.person.prenom} ${sessionScope.person.nom}</p>
                <input type="hidden" name="email"value="${sessionScope.person.email}">
            </c:if>
            <p>Discover academic journals, articles, & books on one seamless platform</p>
        </section>
        <section>
            <div class="recommanded">
                <h4><i class="bi bi-bell-fill" ></i> RECOMMANDED</h4>
            </div>
        </section>
        <section class="section-1">
            <div class="row p-5">
                <div class="col-lg-2 col-md-4 col-sm-6">
                    <div class="img-area">
                        <img src="img/9782100813728-001-X.jpeg" width="100%" height="auto" alt="">
                        <div class="img-text">
                            <h3>Intelligence artificielle</h3>
                            <h5>Melanie Mitchell</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 col-md-4 col-sm-6">
                    <div class="img-area">
                        <img src="img/9782100817870-001-X.jpeg" width="100%" height="auto" alt="">
                        <div class="img-text">
                            <h3>Connectivité Wireless</h3>
                            <h5>Martine Villegas, Fabien Robert, Lucas Letailleur</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 col-md-4 col-sm-6">
                    <div class="img-area">
                        <img src="img/9782100834303-001-X.jpeg" width="100%" height="auto" alt="">
                        <div class="img-text">
                            <h3>15 énigmes ludiques pour s'initier à la programmation Python -</h3>
                            <h5>Pascal Lafourcade, Malika More</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 col-md-4 col-sm-6">
                    <div class="img-area">
                        <img src="img/9782100836857-001-X.jpeg" width="100%" height="auto" alt="">
                        <div class="img-text">
                            <h3>Le carnet du régleur - 19e édition</h3>
                            <h5>Jean-Marie Valance, Bernard Poussery, Corine Valance</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 col-md-4 col-sm-6">
                    <div class="img-area">
                        <img src="img/9782100841493-001-X.jpeg" width="100%" height="auto" alt="">
                        <div class="img-text">
                            <h3>Cybersécurité - 7e édition</h3>
                            <h5>Solange Ghernaouti</h5>
                        </div>
                    </div>
                </div>
                <div class="col-lg-2 col-md-4 col-sm-6">
                    <div class="img-area">
                        <img src="img/9782100851263-001-X.jpeg" width="100%" height="auto" alt="">
                        <div class="img-text">
                            <h3>Électronique. Fondements et applications - 2e édition</h3>
                            <h5>José-Philippe Pérez, Christophe Lagoute, Jean-Yves Fourniols, Stéphane Bouhours</h5>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <section class="section-2 my-5">
            <div class="domaine">
                <h4><i class="fa-solid fa-book"></i>ALL BOOKS</h4>
            </div>
            <div class="row p-5">
                <c:forEach items="${books}" var="book">
                    <div class="col-lg-2 col-md-4 col-sm-6 mb-4">
                        <div class="img-area">
                            <img src="img/${book.img}" width="100%" height="auto" alt="">
                            <div class="img-text">
                                <h3>${book.titre }</h3>
                                <h5>${book.auteurs }</h5>
                                <c:if test="${book.getReservationList().size()== 0}">
                                    <form action="bookServlet" method="post">
                                        <a href="reserveBook?isbn=${book.isbn }&idpers=${person.idpers}" type="submit">
                                        <img src="img/pngegg.png" class="booking"  alt=""></a>
                                    </form>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
            <div class="row p-5">
                <c:forEach items="${livres}" var="livre">
                    <div class="col-lg-2 col-md-4 col-sm-6 mb-4">
                        <div class="img-area">
                            <img src="img/${livre.img}" width="100%" height="auto" alt="">
                            <div class="img-text">
                                <h3>${livre.titre }</h3>
                                <h5>${livre.auteurs }</h5>
                                <c:if test="${livre.getReservationList().size()== 0}">
                                    <form action="bookServlet" method="post">
                                        <a href="reserveBook?isbn=${livre.isbn }&idpers=${person.idpers}" type="submit">
                                        <img src="img/pngegg.png" class="booking"  alt=""></a>
                                    </form>
                                </c:if>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </section>
    </div>
    <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>
    <script src="assets/js/main.js"></script>
    <script src="https://kit.fontawesome.com/0d06085827.js" crossorigin="anonymous"></script>
</body>
</html>

