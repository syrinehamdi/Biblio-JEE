<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if (request.getSession().getAttribute("admin") == null){
        response.sendRedirect("login.jsp");
    } 
%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Reservations list - LibraryAdmin</title>
  <meta content="" name="description">
  <meta content="" name="keywords">

  <!-- Favicons -->
  <link href="assets/img/favicon.png" rel="icon">
  <link href="assets/img/apple-touch-icon.png" rel="apple-touch-icon">

  <!-- Google Fonts -->
  <link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="assets/vendor/simple-datatables/style.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">

</head>

<body>
<%@include file="header-side.jsp" %>

  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Reservations list</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item active">Reservations</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section">
      <div class="row">
        <div class="col-lg-12">

          <div class="card">
            <div class="card-body">
              <h5 class="card-title text-center">Reservation Treatement</h5>
              <p class="text-center">You can valid or cancel the reservation in one click !<br> Also they are the list of all reserved book</p><br>
              <table class="table">
                <thead>
                  <tr>
                    <th scope="col">#</th>
                    <th scope="col">Date</th>
                    <th scope="col">Name</th>
                    <th scope="col">Email</th>
                    <th scope="col">Phone</th>
                    <th scope="col">Book title</th>
                    <th scope="col">Category</th>
                    <th scope="col">Etat</th>
                    <th scope="col"></th>
                  </tr>
                </thead>
                <tbody class="table-group-divider">
                  <c:forEach items="${reservations}" var="res">
                  <tr>
                    <th scope="row">${res.idres }</th>
                    <td>${res.dateres }</td>
                    <td>${res.getIdpers().getPrenom() }</td>
                    <td>${res.getIdpers().getEmail() }</td>
                    <td>${res.getIdpers().getTelephone() }</td>
                    <td>${res.getIsbn().getTitre() }</td>
                    <td>
                        <c:if test="${res.getIdpers().getEtudiant().getIdetud() == res.getIdpers().getIdpers()}">
                            Student
                        </c:if>
                        <c:if test="${res.getIdpers().getEnseignant().getIdens() == res.getIdpers().getIdpers()}">
                            Teacher
                        </c:if>
                     </td>
                     <c:choose>
                         <c:when test="${res.getEmpruntList().size()>0}">
                             <td>Borrowing</td>
                             <td>
                              <a class="decoration-none" href="borrowingServlet" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="Cancel the reservation" style="color: #bea294;">
                                <i class="bi bi-x-lg"></i>
                              </a>
                             </td>
                         </c:when>
                         <c:otherwise>
                             <td>Not yet ! :)</td>
                             <td class="justify-content-arround">
                                <a class="decoration-none" href="cancelReserve?idres=${res.idres }" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="Cancel the reservation" style="color: #bea294;">
                                  <i class="bi bi-x-lg"></i>
                                </a>
                                <a class="decoration-none" href="borrowBook?idres=${res.idres }" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="Borrow" style="color: #2e4e43;">
                                  <i class="bi bi-check2"></i>
                                </a>  
                              </td>
                         </c:otherwise>
                     </c:choose>
                  </tr>
                  </c:forEach>
                </tbody>
              </table>
            </div>
          </div>

        </div>
      </div>
    </section>

  </main><!-- End #main -->

  <%@include file="footer.jsp" %>


  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="assets/vendor/chart.js/chart.min.js"></script>
  <script src="assets/vendor/echarts/echarts.min.js"></script>
  <script src="assets/vendor/quill/quill.min.js"></script>
  <script src="assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="assets/js/main.js"></script>

</body>

</html>
