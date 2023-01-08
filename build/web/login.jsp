<%-- 
    Document   : login
    Created on : 21 déc. 2022, 22:29:06
    Author     : 21655
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="icon" href="assets/img/favicon.png">
        <link rel="stylesheet" href="style.css">
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
        <main>
            <div class="container " id="login">
              <img
                src="img/pexels-taryn-elliott-9565965.jpg"
                class="bg position-absolute text-center"
                alt=""
                width="100%"
                height="100%"
              />
              <section
                class="section register min-vh-100 d-flex flex-column align-items-center justify-content-center py-4"
              >
                <div class="container" >
                  <div class="row justify-content-center">
                    <div
                      class="col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center"
                    >
                      <div class="d-flex justify-content-center py-4">
                        <a href="/" class="d-flex align-items-center w-auto text-decoration-none">
                          <span class="d-none d-lg-block logo position-relative ">Library Esen</span>
                        </a>
                      </div>
                      <!-- End Logo -->

                      <div class="card mb-3">
                        <div class="card-body">
                          <div class="pt-4 pb-2">
                            <h5 class="card-title text-center pb-0 fs-4">
                              Login to Your Account
                            </h5>
                            <p class="text-center small">
                              Enter your username & password to login
                            </p>
                          </div>

                            <form method="post" action="authServlet" class="row g-3 needs-validation">
                            <div class="col-12">
                              <label for="login" class="form-label"
                                >Login</label
                              >
                              <div class="input-group has-validation">
                                <span class="input-group-text" id="inputGroupPrepend">@</span>
                                <input
                                  type="text"
                                  name="login"
                                  class="form-control"
                                  id="login"
                                  required
                                />
                                <div class="invalid-feedback">
                                  Please enter your username.
                                </div>
                              </div>
                            </div>

                            <div class="col-12">
                              <label for="pass" class="form-label"
                                >Password</label
                              >
                              
                              <input
                                type="password"
                                name="pass"
                                class="form-control"
                                id="pass"
                                required
                              />
                              <div class="invalid-feedback">
                                Please enter your password!
                              </div>
                            </div>

                            <div class="col-12">
                              <div class="form-check">
                                <input
                                  class="form-check-input"
                                  type="checkbox"
                                  name="remember"
                                  value="true"
                                  id="rememberMe"
                                />
                                <label class="form-check-label" for="rememberMe"
                                  >Remember me</label
                                >
                              </div>
                            </div>
                            <div class="col-12">
                              <button class="btn w-100 text-white beige" type="submit">
                                Login
                              </button>
                            </div>
                            <!--<div class="col-12">
                              <p class="small mb-0">
                                Don't have account?
                                <a href="pages-register.html" class="beige-text">Create an account</a>
                              </p>
                            </div>-->
                          </form>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </section>
            </div>
          </main>
          <!-- End #main -->
                  <input type="hidden" id="status" value="<%= request.getAttribute("status") %>">
          <a
            href="#login"
            class="back-to-top d-flex align-items-center justify-content-center"
            ><i class="bi bi-arrow-up-short"></i
          ></a>
        <script src="https://kit.fontawesome.com/0d06085827.js" crossorigin="anonymous"></script>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <link rel="stylesheet" href="alert/dist/sweetalert.css">
        
    </body>
</html>
