<%
    if (request.getSession().getAttribute("admin") == null){
        response.sendRedirect("login.jsp");
    } 
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>List user - LibraryAdmin</title>  <meta content="" name="description">
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
  <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css" rel="stylesheet">
  <link href="https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css" rel="stylesheet">
  <!-- Template Main CSS File -->
  <link href="assets/css/style.css" rel="stylesheet">
  <link rel="stylesheet" href="sweetalert2.min.css">
  <script src="sweetalert2.min.js"></script>
</head>

<body>

<%@include file="header-side.jsp" %>

  <main id="main" class="main">
    <div class="pagetitle">
      <div class="d-flex justify-content-between">
        <h1>Users list</h1>
        <button class="btn btn-outline-dark " data-bs-toggle="modal" data-bs-target="#staticBackdrop">
          <i class="bi bi-plus"></i>
        </button>
      </div>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item">Users</li>
          <li class="breadcrumb-item active">List users</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->
    
    <!-- Filtre -->
    <div class="row justify-content-center my-5 ">
      <div class="col-2" ><a href="userServlet"><button class="btn btn-outline-dark" style="font-size: small;">All</button></a></div>
      <div class="col-2"><a href="etudiantServlet"><button class="btn btn-outline-dark" style="font-size: small;">Students</button></a></div>
      <div class="col-2"><a href="enseignantServlet"><button class="btn btn-outline-dark" style="font-size: small;">Teachers</button></a></div>
      <div class="col-2"><a href="adminServlet"><button class="btn btn-outline-dark" style="font-size: small;">Admins</button></a></div>
    </div>

    <table id="example" class="table table-striped mt-5" style="width:100%">
      <thead>
          <tr>
              <th>#</th>
              <th>First name</th>
              <th>Last name</th>
              <th>Login</th>
              <th>Email</th>taTables.bootstrap5.min.css" rel="stylesheet">

              <th>Address</th>
              <th>Phone</th>
              <th>Action</th>
          </tr>
      </thead>
      <tbody>
        <c:forEach items="${personnes}" var="personne">
          <tr>
              <td>${personne.idpers}</td>
              <td>${personne.prenom}</td>
              <td>${personne.nom}</td>
              <td>${personne.login}</td>
              <td>${personne.email}</td>
              <td>${personne.adresse}</td>
              <td>${personne.telephone}</td>
              <td>
                <a class="btn btn-outline-warning" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="Edit"><i class="bi bi-pen"></i></a>
                <a href="deleteUser?idpers=${personne.idpers }" onclick="return confirm();" class="btn btn-outline-danger" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="Delete"><i class="bi bi-trash3"></i></a>
              </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </main><!-- End #main -->

  <!-- Modal -->
  <div class="modal fade" id="staticBackdrop" data-bs-backdrop="static" data-bs-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">
    <%@include file="modal.jsp" %>
  </div>

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

  <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
  <script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
  <script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js "></script>
  <script>
    $(document).ready(function() {
      $('#example').DataTable();
    });
  </script>
  <script>
      function confirm(){
        return Swal.fire({
            title: "Are you sure ?",
            text: "You won't be able to revert this!",
            icon: 'warning',
            showCancelButton: true,
            confirmButtonColor: '#3085d6',
            cancelButtonColor: '#d33',
            confirmButtonText: 'Yes, delete it!'
          }).then((result) => {
            if (result.isConfirmed) {
              Swal.fire(
                'Deleted!',
                'Your user has been deleted.',
                'success'
              )
            }
          })
      })

  </script>
</body>

</html>
