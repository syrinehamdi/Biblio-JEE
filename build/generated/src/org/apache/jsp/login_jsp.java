package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"icon\" href=\"assets/img/favicon.png\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("    <!-- Font awesome-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"path/to/font-awesome/css/font-awesome.min.css\">\n");
      out.write("    <!-- Bootstrap Icon-->\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css\">\n");
      out.write("    <!-- CSS only -->\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- JavaScript Bundle with Popper -->\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("            <div class=\"container \" id=\"login\">\n");
      out.write("              <img\n");
      out.write("                src=\"img/pexels-taryn-elliott-9565965.jpg\"\n");
      out.write("                class=\"bg position-absolute text-center\"\n");
      out.write("                alt=\"\"\n");
      out.write("                width=\"100%\"\n");
      out.write("                height=\"100%\"\n");
      out.write("              />\n");
      out.write("              <section\n");
      out.write("                class=\"section register min-vh-100 d-flex flex-column align-items-center justify-content-center py-4\"\n");
      out.write("              >\n");
      out.write("                <div class=\"container\" >\n");
      out.write("                  <div class=\"row justify-content-center\">\n");
      out.write("                    <div\n");
      out.write("                      class=\"col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center\"\n");
      out.write("                    >\n");
      out.write("                      <div class=\"d-flex justify-content-center py-4\">\n");
      out.write("                        <a href=\"/\" class=\"d-flex align-items-center w-auto text-decoration-none\">\n");
      out.write("                          <span class=\"d-none d-lg-block logo position-relative \">Library Esen</span>\n");
      out.write("                        </a>\n");
      out.write("                      </div>\n");
      out.write("                      <!-- End Logo -->\n");
      out.write("\n");
      out.write("                      <div class=\"card mb-3\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                          <div class=\"pt-4 pb-2\">\n");
      out.write("                            <h5 class=\"card-title text-center pb-0 fs-4\">\n");
      out.write("                              Login to Your Account\n");
      out.write("                            </h5>\n");
      out.write("                            <p class=\"text-center small\">\n");
      out.write("                              Enter your username & password to login\n");
      out.write("                            </p>\n");
      out.write("                          </div>\n");
      out.write("\n");
      out.write("                            <form method=\"post\" action=\"authServlet\" class=\"row g-3 needs-validation\">\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                              <label for=\"login\" class=\"form-label\"\n");
      out.write("                                >Login</label\n");
      out.write("                              >\n");
      out.write("                              <div class=\"input-group has-validation\">\n");
      out.write("                                <span class=\"input-group-text\" id=\"inputGroupPrepend\">@</span>\n");
      out.write("                                <input\n");
      out.write("                                  type=\"text\"\n");
      out.write("                                  name=\"login\"\n");
      out.write("                                  class=\"form-control\"\n");
      out.write("                                  id=\"login\"\n");
      out.write("                                  required\n");
      out.write("                                />\n");
      out.write("                                <div class=\"invalid-feedback\">\n");
      out.write("                                  Please enter your username.\n");
      out.write("                                </div>\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                              <label for=\"pass\" class=\"form-label\"\n");
      out.write("                                >Password</label\n");
      out.write("                              >\n");
      out.write("                              \n");
      out.write("                              <input\n");
      out.write("                                type=\"password\"\n");
      out.write("                                name=\"pass\"\n");
      out.write("                                class=\"form-control\"\n");
      out.write("                                id=\"pass\"\n");
      out.write("                                required\n");
      out.write("                              />\n");
      out.write("                              <div class=\"invalid-feedback\">\n");
      out.write("                                Please enter your password!\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                              <div class=\"form-check\">\n");
      out.write("                                <input\n");
      out.write("                                  class=\"form-check-input\"\n");
      out.write("                                  type=\"checkbox\"\n");
      out.write("                                  name=\"remember\"\n");
      out.write("                                  value=\"true\"\n");
      out.write("                                  id=\"rememberMe\"\n");
      out.write("                                />\n");
      out.write("                                <label class=\"form-check-label\" for=\"rememberMe\"\n");
      out.write("                                  >Remember me</label\n");
      out.write("                                >\n");
      out.write("                              </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-12\">\n");
      out.write("                              <button class=\"btn w-100 text-white beige\" type=\"submit\">\n");
      out.write("                                Login\n");
      out.write("                              </button>\n");
      out.write("                            </div>\n");
      out.write("                            <!--<div class=\"col-12\">\n");
      out.write("                              <p class=\"small mb-0\">\n");
      out.write("                                Don't have account?\n");
      out.write("                                <a href=\"pages-register.html\" class=\"beige-text\">Create an account</a>\n");
      out.write("                              </p>\n");
      out.write("                            </div>-->\n");
      out.write("                          </form>\n");
      out.write("                        </div>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </section>\n");
      out.write("            </div>\n");
      out.write("          </main>\n");
      out.write("          <!-- End #main -->\n");
      out.write("                  <input type=\"hidden\" id=\"status\" value=\"");
      out.print( request.getAttribute("status") );
      out.write("\">\n");
      out.write("          <a\n");
      out.write("            href=\"#login\"\n");
      out.write("            class=\"back-to-top d-flex align-items-center justify-content-center\"\n");
      out.write("            ><i class=\"bi bi-arrow-up-short\"></i\n");
      out.write("          ></a>\n");
      out.write("        <script src=\"https://kit.fontawesome.com/0d06085827.js\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"alert/dist/sweetalert.css\">\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            var status = document.getElementById(\"status.value\");\n");
      out.write("            if (status != null){\n");
      out.write("                swal(\"Sorry :)\", \"Wrong login or password !!\", \"error\");\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
