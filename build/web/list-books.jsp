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

  <title>Books list - LibraryAdmin</title>  <meta content="" name="description">
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

</head>

<body>
<%@include file="header-side.jsp" %>
  <main id="main" class="main">
    <div class="pagetitle">
      <div class="d-flex justify-content-between">
        <h1>Books list</h1>
        <a class="decoration-none" href="create-book.jsp"><button class="btn btn-outline-dark " data-bs-toggle="modal"  data-bs-target="#staticBackdrop">
          <i class="bi bi-plus"></i>
        </button></a>
      </div>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="index.html">Home</a></li>
          <li class="breadcrumb-item">Books</li>
          <li class="breadcrumb-item active">Books list</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <table id="example" class="table table-striped mt-5 align-middle text-center" style="width:100%">
      <thead>
          <tr>
              <th>ISBN</th>
              <th>Cover image</th>
              <th>Title</th>
              <th>Authors</th>
              <th>Status</th>
              <th></th>
          </tr>
      </thead>
      <tbody>
          <c:forEach items="${livres}" var="livre">
            <tr> 
                <td>${livre.isbn }</td>
                <td><img src="img/${livre.img }" width="100px" height="auto" alt=${livre.titre }></td>
                <td>${livre.titre }</td>
                <td>${livre.auteurs }</td>
                <c:choose>
                    <c:when test="${(livre.getReservationList().size()>0)}">
                        <td>Reserved/rd+
                            borrowed</td>
                    </c:when>
                    <c:otherwise><td>----</td></c:otherwise>
                </c:choose>
                <td>
                    <a href="updateBook?isbn=${livre.isbn }" class="btn btn-outline-warning" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="Edit">
                      <i class="bi bi-pen"></i>
                    </a>
                    
                    <a href="deleteBook?isbn=${livre.isbn }" onclick="return confirm('Are you sure want to delete this book ?');" id="delete" class="btn btn-outline-dark" data-bs-toggle="tooltip" data-bs-placement="bottom" data-bs-title="Delete">
                        <i class="bi bi-trash3"></i>
                    </a>

                </td>
            </tr>
         </c:forEach>
      </tbody>
    </table>
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

  <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
  <script src="https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js"></script>
  <script src="https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js "></script>
  <script>
    $(document).ready(function() {
      $('#example').DataTable();
    });
  </script>
  <script src="sweetalert2.min.js"></script>
  <script>
      function confirm(message){
        return swal({
            title: message,
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
                'Your book has been deleted.',
                'success'
              )
            }
          })
      })

  </script>
</body>

</html>
