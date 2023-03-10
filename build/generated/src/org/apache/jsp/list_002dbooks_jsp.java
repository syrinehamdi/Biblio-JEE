package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class list_002dbooks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header-side.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("\n");
      out.write("  <title>Books list - LibraryAdmin</title>  <meta content=\"\" name=\"description\">\n");
      out.write("  <meta content=\"\" name=\"keywords\">\n");
      out.write("\n");
      out.write("  <!-- Favicons -->\n");
      out.write("  <link href=\"assets/img/favicon.png\" rel=\"icon\">\n");
      out.write("  <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\n");
      out.write("\n");
      out.write("  <!-- Google Fonts -->\n");
      out.write("  <link href=\"https://fonts.gstatic.com\" rel=\"preconnect\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Vendor CSS Files -->\n");
      out.write("  <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/quill/quill.snow.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/quill/quill.bubble.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/remixicon/remixicon.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"assets/vendor/simple-datatables/style.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/5.2.0/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"https://cdn.datatables.net/1.12.1/css/dataTables.bootstrap5.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("  <!-- Template Main CSS File -->\n");
      out.write("  <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- ======= Header ======= -->\n");
      out.write("  <header id=\"header\" class=\"header fixed-top d-flex align-items-center\">\n");
      out.write("\n");
      out.write("    <div class=\"d-flex align-items-center justify-content-between\">\n");
      out.write("      <a href=\"index.html\" class=\"logo d-flex align-items-center\">\n");
      out.write("        Library  Esen\n");
      out.write("      </a>\n");
      out.write("      <i class=\"bi bi-list toggle-sidebar-btn\"></i>\n");
      out.write("    </div><!-- End Logo -->\n");
      out.write("\n");
      out.write("    <div class=\"search-bar\">\n");
      out.write("      <form class=\"search-form d-flex align-items-center\" method=\"POST\" action=\"#\">\n");
      out.write("        <input type=\"text\" name=\"query\" placeholder=\"Search\" title=\"Enter search keyword\">\n");
      out.write("        <button type=\"submit\" title=\"Search\"><i class=\"bi bi-search\"></i></button>\n");
      out.write("      </form>\n");
      out.write("    </div><!-- End Search Bar -->\n");
      out.write("\n");
      out.write("    <nav class=\"header-nav ms-auto\">\n");
      out.write("      <ul class=\"d-flex align-items-center\">\n");
      out.write("\n");
      out.write("        <li class=\"nav-item d-block d-lg-none\">\n");
      out.write("          <a class=\"nav-link nav-icon search-bar-toggle \" href=\"#\">\n");
      out.write("            <i class=\"bi bi-search\"></i>\n");
      out.write("          </a>\n");
      out.write("        </li><!-- End Search Icon-->\n");
      out.write("\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("          <a class=\"nav-link nav-icon\" href=\"#\" data-bs-toggle=\"dropdown\">\n");
      out.write("            <i class=\"bi bi-bell\"></i>\n");
      out.write("            <span class=\"badge bg-danger badge-number\">4</span>\n");
      out.write("          </a><!-- End Notification Icon -->\n");
      out.write("\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow notifications\">\n");
      out.write("            <li class=\"dropdown-header\">\n");
      out.write("              You have 4 new notifications\n");
      out.write("              <a href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View all</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-exclamation-circle text-warning\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Lorem Ipsum</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>30 min. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-x-circle text-danger\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Atque rerum nesciunt</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>1 hr. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-check-circle text-success\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Sit rerum fuga</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>2 hrs. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"notification-item\">\n");
      out.write("              <i class=\"bi bi-info-circle text-primary\"></i>\n");
      out.write("              <div>\n");
      out.write("                <h4>Dicta reprehenderit</h4>\n");
      out.write("                <p>Quae dolorem earum veritatis oditseno</p>\n");
      out.write("                <p>4 hrs. ago</p>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown-footer\">\n");
      out.write("              <a href=\"#\">Show all notifications</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul><!-- End Notification Dropdown Items -->\n");
      out.write("\n");
      out.write("        </li><!-- End Notification Nav -->\n");
      out.write("\n");
      out.write("        <li class=\"nav-item dropdown\">\n");
      out.write("\n");
      out.write("          <a class=\"nav-link nav-icon\" href=\"#\" data-bs-toggle=\"dropdown\">\n");
      out.write("            <i class=\"bi bi-chat-left-text\"></i>\n");
      out.write("            <span class=\"badge bg-warning badge-number\">3</span>\n");
      out.write("          </a><!-- End Messages Icon -->\n");
      out.write("\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow messages\">\n");
      out.write("            <li class=\"dropdown-header\">\n");
      out.write("              You have 3 new messages\n");
      out.write("              <a href=\"#\"><span class=\"badge rounded-pill bg-primary p-2 ms-2\">View all</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"message-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"assets/img/messages-1.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("                <div>\n");
      out.write("                  <h4>Maria Hudson</h4>\n");
      out.write("                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\n");
      out.write("                  <p>4 hrs. ago</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"message-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"assets/img/messages-2.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("                <div>\n");
      out.write("                  <h4>Anna Nelson</h4>\n");
      out.write("                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\n");
      out.write("                  <p>6 hrs. ago</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"message-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <img src=\"assets/img/messages-3.jpg\" alt=\"\" class=\"rounded-circle\">\n");
      out.write("                <div>\n");
      out.write("                  <h4>David Muldon</h4>\n");
      out.write("                  <p>Velit asperiores et ducimus soluta repudiandae labore officia est ut...</p>\n");
      out.write("                  <p>8 hrs. ago</p>\n");
      out.write("                </div>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"dropdown-footer\">\n");
      out.write("              <a href=\"#\">Show all messages</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul><!-- End Messages Dropdown Items -->\n");
      out.write("\n");
      out.write("        </li><!-- End Messages Nav -->\n");
      out.write("\n");
      out.write("        <li class=\"nav-item dropdown pe-3\">\n");
      out.write("\n");
      out.write("          <a class=\"nav-link nav-profile d-flex align-items-center pe-0\" href=\"#\" data-bs-toggle=\"dropdown\">\n");
      out.write("            <img src=\"assets/img/profile-img.jpg\" alt=\"Profile\" class=\"rounded-circle\">\n");
      out.write("            <span class=\"d-none d-md-block dropdown-toggle ps-2\">K. Anderson</span>\n");
      out.write("          </a><!-- End Profile Iamge Icon -->\n");
      out.write("\n");
      out.write("          <ul class=\"dropdown-menu dropdown-menu-end dropdown-menu-arrow profile\">\n");
      out.write("            <li class=\"dropdown-header\">\n");
      out.write("              <h6>Kevin Anderson</h6>\n");
      out.write("              <span>Web Designer</span>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"users-profile.html\">\n");
      out.write("                <i class=\"bi bi-person\"></i>\n");
      out.write("                <span>My Profile</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"users-profile.html\">\n");
      out.write("                <i class=\"bi bi-gear\"></i>\n");
      out.write("                <span>Account Settings</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"pages-faq.html\">\n");
      out.write("                <i class=\"bi bi-question-circle\"></i>\n");
      out.write("                <span>Need Help?</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li>\n");
      out.write("              <hr class=\"dropdown-divider\">\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li>\n");
      out.write("              <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                <i class=\"bi bi-box-arrow-right\"></i>\n");
      out.write("                <span>Sign Out</span>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("          </ul><!-- End Profile Dropdown Items -->\n");
      out.write("        </li><!-- End Profile Nav -->\n");
      out.write("\n");
      out.write("      </ul>\n");
      out.write("    </nav><!-- End Icons Navigation -->\n");
      out.write("\n");
      out.write("  </header>\n");
      out.write("<!-- End Header -->\n");
      out.write("\n");
      out.write("<!-- ======= Sidebar ======= -->\n");
      out.write("  <aside id=\"sidebar\" class=\"sidebar\">\n");
      out.write("\n");
      out.write("    <ul class=\"sidebar-nav\" id=\"sidebar-nav\">\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link \" href=\"index.html\">\n");
      out.write("          <i class=\"bi bi-grid\"></i>\n");
      out.write("          <span>Dashboard</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Dashboard Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#user-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"bi bi-people\"></i><span>Users</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"user-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"list-users.jsp\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Users list</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a class=\"btn btn-link\" onclick=\"showModal()\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Add new user</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End User Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" data-bs-target=\"#books-nav\" data-bs-toggle=\"collapse\" href=\"#\">\n");
      out.write("          <i class=\"bi bi-book\"></i><span>Books</span><i class=\"bi bi-chevron-down ms-auto\"></i>\n");
      out.write("        </a>\n");
      out.write("        <ul id=\"books-nav\" class=\"nav-content collapse \" data-bs-parent=\"#sidebar-nav\">\n");
      out.write("          <li>\n");
      out.write("            <a href=\"list-books.jsp\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Books list</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li>\n");
      out.write("            <a href=\"create-book.jsp\">\n");
      out.write("              <i class=\"bi bi-circle\"></i><span>Add new book</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </li><!-- End Book Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-heading\">Pages</li>\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"users-profile.html\">\n");
      out.write("          <i class=\"bi bi-person\"></i>\n");
      out.write("          <span>Profile</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Profile Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-reservation.html\">\n");
      out.write("          <i class=\"bi bi-question-circle\"></i>\n");
      out.write("          <span>Reservation</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End F.A.Q Page Nav -->\n");
      out.write("      \n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-emprunt.html\">\n");
      out.write("          <i class=\"bi bi-card-list\"></i>\n");
      out.write("          <span>Borrowing</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Register Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-contact.html\">\n");
      out.write("          <i class=\"bi bi-envelope\"></i>\n");
      out.write("          <span>Contact</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Contact Page Nav -->\n");
      out.write("\n");
      out.write("      <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link collapsed\" href=\"pages-login.html\">\n");
      out.write("          <i class=\"bi bi-box-arrow-in-right\"></i>\n");
      out.write("          <span>Sign Out</span>\n");
      out.write("        </a>\n");
      out.write("      </li><!-- End Sign out Page Nav -->\n");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("  </aside>\n");
      out.write("<!-- End Sidebar-->\n");
      out.write("\n");
      out.write("  <main id=\"main\" class=\"main\">\n");
      out.write("    <div class=\"pagetitle\">\n");
      out.write("      <div class=\"d-flex justify-content-between\">\n");
      out.write("        <h1>Books list</h1>\n");
      out.write("        <a class=\"decoration-none\" href=\"create-book.jsp\"><button class=\"btn btn-outline-dark \" data-bs-toggle=\"modal\"  data-bs-target=\"#staticBackdrop\">\n");
      out.write("          <i class=\"bi bi-plus\"></i>\n");
      out.write("        </button></a>\n");
      out.write("      </div>\n");
      out.write("      <nav>\n");
      out.write("        <ol class=\"breadcrumb\">\n");
      out.write("          <li class=\"breadcrumb-item\"><a href=\"index.html\">Home</a></li>\n");
      out.write("          <li class=\"breadcrumb-item\">Books</li>\n");
      out.write("          <li class=\"breadcrumb-item active\">Books list</li>\n");
      out.write("        </ol>\n");
      out.write("      </nav>\n");
      out.write("    </div><!-- End Page Title -->\n");
      out.write("\n");
      out.write("    <table id=\"example\" class=\"table table-striped mt-5 align-middle text-center\" style=\"width:100%\">\n");
      out.write("      <thead>\n");
      out.write("          <tr>\n");
      out.write("              <th>ISBN</th>\n");
      out.write("              <th>Cover image</th>\n");
      out.write("              <th>Title</th>\n");
      out.write("              <th>Authors</th>\n");
      out.write("              <th>Status</th>\n");
      out.write("              <th></th>\n");
      out.write("          </tr>\n");
      out.write("      </thead>\n");
      out.write("      <tbody>\n");
      out.write("          <!--<tr>\n");
      out.write("              <td>1</td>\n");
      out.write("              <td><img src=\"assets/img/9782100841509-001-X.jpeg\" width=\"100px\" height=\"auto\" alt=\"\"></td>\n");
      out.write("              <td>Lean UX</td>\n");
      out.write("              <td>Jeff Gothelf et Josh Seiden</td>\n");
      out.write("              <td>Reserved</td>\n");
      out.write("              <td>\n");
      out.write("                <button class=\"btn btn-outline-warning\" data-bs-toggle=\"tooltip\" data-bs-placement=\"bottom\" data-bs-title=\"Edit\">\n");
      out.write("                  <i class=\"bi bi-pen\"></i>\n");
      out.write("                </button>\n");
      out.write("\n");
      out.write("                <button class=\"btn btn-outline-danger\" data-bs-toggle=\"tooltip\" data-bs-placement=\"bottom\" data-bs-title=\"Reserve\">\n");
      out.write("                  <i class=\"bi bi-book\"></i>\n");
      out.write("                </button>\n");
      out.write("              </td>\n");
      out.write("          </tr>-->\n");
      out.write("          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("      </tbody>\n");
      out.write("    </table>\n");
      out.write("  </main><!-- End #main -->\n");
      out.write("\n");
      out.write("  ");
      out.write("<!-- ======= Footer ======= -->\n");
      out.write("  <footer id=\"footer\" class=\"footer\">\n");
      out.write("    <div class=\"copyright\">\n");
      out.write("      &copy; Copyright <strong><span>LibraryAdmin</span></strong>. All Rights Reserved\n");
      out.write("    </div>\n");
      out.write("    <div class=\"credits\">\n");
      out.write("           Designed by <a href=\"\">Syrine & Eya</a>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("<!-- End Footer -->\n");
      out.write("\n");
      out.write("\n");
      out.write("  <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i class=\"bi bi-arrow-up-short\"></i></a>\n");
      out.write("\n");
      out.write("  <!-- Vendor JS Files -->\n");
      out.write("  <script src=\"assets/vendor/apexcharts/apexcharts.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/chart.js/chart.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/echarts/echarts.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/quill/quill.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/simple-datatables/simple-datatables.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/tinymce/tinymce.min.js\"></script>\n");
      out.write("  <script src=\"assets/vendor/php-email-form/validate.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Template Main JS File -->\n");
      out.write("  <script src=\"assets/js/main.js\"></script>\n");
      out.write("\n");
      out.write("  <script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\n");
      out.write("  <script src=\"https://cdn.datatables.net/1.12.1/js/jquery.dataTables.min.js\"></script>\n");
      out.write("  <script src=\"https://cdn.datatables.net/1.12.1/js/dataTables.bootstrap5.min.js \"></script>\n");
      out.write("  <script>\n");
      out.write("    $(document).ready(function() {\n");
      out.write("      $('#example').DataTable();\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livres}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("livre");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("            <tr> \n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livre.isbn }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td><img src=\"img/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livre.img }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" width=\"100px\" height=\"auto\" alt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livre.titre }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("></td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livre.titre }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livre.auteurs }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                <td></td>                \n");
          out.write("                <td>\n");
          out.write("                    <a href=\"editBook?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livre.isbn }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-warning\" data-bs-toggle=\"tooltip\" data-bs-placement=\"bottom\" data-bs-title=\"Edit\">\n");
          out.write("                      <i class=\"bi bi-pen\"></i>\n");
          out.write("                    </a>\n");
          out.write("\n");
          out.write("                    <a href=\"\" class=\"btn btn-outline-danger\" data-bs-toggle=\"tooltip\" data-bs-placement=\"bottom\" data-bs-title=\"Reserve\">\n");
          out.write("                      <i class=\"bi bi-book\"></i>\n");
          out.write("                    </a>\n");
          out.write("                    \n");
          out.write("                    <a href=\"deleteBook?isbn=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${livre.isbn }", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" class=\"btn btn-outline-dark\" data-bs-toggle=\"tooltip\" data-bs-placement=\"bottom\" data-bs-title=\"Delete\">\n");
          out.write("                        <i class=\"bi bi-trash3\"></i>\n");
          out.write("                    </a>\n");
          out.write("\n");
          out.write("                </td>\n");
          out.write("            </tr>\n");
          out.write("         ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
