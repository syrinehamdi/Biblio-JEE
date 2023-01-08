<div class="modal-dialog modal-lg">
              <div class="modal-content">
                <div class="modal-header">
                  <h1 class="modal-title fs-5" id="staticBackdropLabel">Create new user</h1>
                  <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                  <ul class="nav nav-tabs" id="myTab" role="tablist">
                    <li class="nav-item" role="presentation">
                      <button class="nav-link active" id="home-tab" data-bs-toggle="tab" data-bs-target="#teacher" type="button" role="tab" aria-controls="teacher" aria-selected="true">Teacher</button>
                    </li>
                    <li class="nav-item" role="presentation">
                      <button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#student" type="button" role="tab" aria-controls="student" aria-selected="false">Student</button>
                    </li>
                    <li class="nav-item" role="presentation">
                      <button class="nav-link" id="profile-tab" data-bs-toggle="tab" data-bs-target="#admin" type="button" role="tab" aria-controls="admin" aria-selected="false">Admin</button>
                    </li>
                  </ul>
                  <div class="tab-content" id="myTabContent">
                    <div class="tab-pane fade show active" id="teacher" role="tabpanel" aria-labelledby="home-tab" tabindex="0">
                        <form class="row g-2 needs-validation m-4" novalidate method="post" action="enseignantServlet">
                          <div class="col-6">
                            <label for="idens" class="form-label">IDENS</label>
                            <input type="number" name="idpers" class="form-control" id="idens" required>
                            <div class="invalid-feedback">Please, enter id teacher!</div>
                          </div>

                          <div class="col-6">
                            <label for="firstName" class="form-label">First Name</label>
                            <input type="text" name="prenom" class="form-control" id="firstName" required>
                            <div class="invalid-feedback">Please, enter your first name!</div>
                          </div>

                          <div class="col-6">
                            <label for="lastName" class="form-label">Last Name</label>
                            <input type="text" name="nom" class="form-control" id="lastName" required>
                            <div class="invalid-feedback">Please, enter your last name!</div>
                          </div>

                          <div class="col-6">
                            <label for="yourEmail" class="form-label">Email</label>
                            <input type="email" name="email" class="form-control" id="yourEmail" required>
                            <div class="invalid-feedback">Please enter a valid Email adddress!</div>
                          </div>

                          <div class="col-6">
                            <label for="yourPhone" class="form-label">Phone number</label>
                            <div class="input-group flex-nowrap">
                              <span class="input-group-text" id="addon-wrapping"><i class="bi bi-telephone"></i></span>
                              <input type="number" class="form-control" id="yourPhone" name="telephone">
                            </div>
                          </div>

                          <div class="col-6">
                            <label for="yourLogin" class="form-label">Login</label>
                            <div class="input-group has-validation">
                              <span class="input-group-text" id="inputGroupPrepend">@</span>
                              <input type="text" name="login" class="form-control" id="yourLogin" required>
                              <div class="invalid-feedback">Please choose a login.</div>
                            </div>
                          </div>

                          <div class="col-6">
                            <label for="grade" class="form-label">Grade</label>
                            <input type="text" name="grade" class="form-control" id="grade" required>
                            <div class="invalid-feedback">Please, enter your grade!</div>
                          </div>

                          <div class="col-6">
                            <label for="depatement" class="form-label">Departement</label>
                            <input type="text" name="departement" class="form-control" id="depatement" required>
                            <div class="invalid-feedback">Please, enter your departement!</div>
                          </div>

                          <div class="col-12">
                            <label for="yourAddress" class="form-label">Address</label>
                            <textarea class="form-control" name="adresse" id="yourAddress" rows="2" required></textarea>
                          </div>

                          <div class="col-12">
                            <label for="yourPassword" class="form-label">Password</label>
                            <input type="password" name="pass" class="form-control" id="yourPassword" required>
                            <div class="invalid-feedback">Please enter your password!</div>
                          </div>

                          <div class="col-12">
                            <div class="form-check">
                              <input class="form-check-input" name="terms" type="checkbox" value="" id="acceptTerms" required>
                              <label class="form-check-label" for="acceptTerms">I agree and accept the <a href="#">terms and conditions</a></label>
                              <div class="invalid-feedback">You must agree before submitting.</div>
                            </div>
                          </div>
                          <div class="col-12 text-center">
                            <button class="btn btn-primary " type="submit">Create new teacher account !</button>
                          </div>
                      </form>
                    </div>
                    <div class="tab-pane fade" id="student" role="tabpanel" aria-labelledby="profile-tab" tabindex="0">
                        <form class="row g-2 needs-validation m-4" novalidate method="post" action="etudiantServlet">
                        <div class="col-6">
                          <label for="idetud" class="form-label">IDETUD</label>
                          <input type="number" name="idpers" class="form-control" id="idetud" required>
                          <div class="invalid-feedback">Please, enter id teacher!</div>
                        </div>

                        <div class="col-6">
                          <label for="firstName" class="form-label">First Name</label>
                          <input type="text" name="prenom" class="form-control" id="firstName" required>
                          <div class="invalid-feedback">Please, enter your first name!</div>
                        </div>

                        <div class="col-6">
                          <label for="lastName" class="form-label">Last Name</label>
                          <input type="text" name="nom" class="form-control" id="lastName" required>
                          <div class="invalid-feedback">Please, enter your last name!</div>
                        </div>

                        <div class="col-6">
                          <label for="yourEmail" class="form-label">Email</label>
                          <input type="email" name="email" class="form-control" id="yourEmail" required>
                          <div class="invalid-feedback">Please enter a valid Email adddress!</div>
                        </div>

                        <div class="col-6">
                          <label for="yourPhone" class="form-label">Phone number</label>
                          <div class="input-group flex-nowrap">
                            <span class="input-group-text" id="addon-wrapping"><i class="bi bi-telephone"></i></span>
                            <input type="number" class="form-control" id="yourPhone" name="telephone">
                          </div>
                        </div>

                        <div class="col-6">
                          <label for="yourLogin" class="form-label">Login</label>
                          <div class="input-group has-validation">
                            <span class="input-group-text" id="inputGroupPrepend">@</span>
                            <input type="text" name="login" class="form-control" id="yourLogin" required>
                            <div class="invalid-feedback">Please choose a login.</div>
                          </div>
                        </div>

                        <div class="col-12">
                          <label for="classe" class="form-label">Class</label>
                          <input class="form-control" list="datalistOptions" id="classe" name="classe" required>
                          <datalist id="datalistOptions">
                            <option value="L1 BC">
                            <option value="L2 BC">
                            <option value="L3 BI">
                            <option value="L3 BIS">
                            <option value="L3 EBUS">
                            <option value="M1-DSSD">
                            <option value="M2-DSSD">
                            <option value="M1-EBusiness">
                            <option value="M2-EBusiness">
                            <option value="M1-WI">
                            <option value="M2-WI">
                            <option value="M1-VIC">
                            <option value="M2-VIC">
                            <option value="M1-CGBI">
                            <option value="M2-CGBI">
                          </datalist>
                          <div class="invalid-feedback">Please, select your class!</div>
                        </div>

                        <div class="col-12">
                          <label for="yourAddress" class="form-label">Address</label>
                          <textarea class="form-control" name="adresse" id="yourAddress" rows="2" required></textarea>
                        </div>

                        <div class="col-12">
                          <label for="yourPassword" class="form-label">Password</label>
                          <input type="password" name="pass" class="form-control" id="yourPassword" required>
                          <div class="invalid-feedback">Please enter your password!</div>
                        </div>

                        <div class="col-12">
                          <div class="form-check">
                            <input class="form-check-input" name="terms" type="checkbox" value="" id="acceptTerms" required>
                            <label class="form-check-label" for="acceptTerms">I agree and accept the <a href="#">terms and conditions</a></label>
                            <div class="invalid-feedback">You must agree before submitting.</div>
                          </div>
                        </div>
                        <div class="col-12 text-center">
                          <button class="btn btn-primary " type="submit">Create new student account !</button>
                        </div>
                    </form>
                    </div>
                    <div class="tab-pane fade" id="admin" role="tabpanel" aria-labelledby="profile-tab" tabindex="0">
                        <form class="row g-2 needs-validation m-4" action="adminServlet" method="post" novalidate>
                        <div class="col-6">
                          <label for="idpers" class="form-label">IDPERS</label>
                          <input type="number" name="idpers" class="form-control" id="idpers" required>
                          <div class="invalid-feedback">Please, enter id teacher!</div>
                        </div>

                        <div class="col-6">
                          <label for="firstName" class="form-label">First Name</label>
                          <input type="text" name="prenom" class="form-control" id="firstName" required>
                          <div class="invalid-feedback">Please, enter your first name!</div>
                        </div>

                        <div class="col-6">
                          <label for="lastName" class="form-label">Last Name</label>
                          <input type="text" name="nom" class="form-control" id="lastName" required>
                          <div class="invalid-feedback">Please, enter your last name!</div>
                        </div>

                        <div class="col-6">
                          <label for="yourEmail" class="form-label">Email</label>
                          <input type="email" name="email" class="form-control" id="yourEmail" required>
                          <div class="invalid-feedback">Please enter a valid Email adddress!</div>
                        </div>

                        <div class="col-6">
                          <label for="yourPhone" class="form-label">Phone number</label>
                          <div class="input-group flex-nowrap">
                            <span class="input-group-text" id="addon-wrapping"><i class="bi bi-telephone"></i></span>
                            <input type="number" class="form-control" id="yourPhone" name="telephone">
                          </div>
                        </div>

                        <div class="col-6">
                          <label for="yourLogin" class="form-label">Login</label>
                          <div class="input-group has-validation">
                            <span class="input-group-text" id="inputGroupPrepend">@</span>
                            <input type="text" name="login" class="form-control" id="yourLogin" required>
                            <div class="invalid-feedback">Please choose a login.</div>
                          </div>
                        </div>

                        <div class="col-12">
                          <label for="yourAddress" class="form-label">Address</label>
                          <textarea class="form-control" name="adresse" id="yourAddress" rows="2" required></textarea>
                        </div>

                        <div class="col-12">
                          <label for="yourPassword" class="form-label">Password</label>
                          <input type="password" name="pass" class="form-control" id="yourPassword" required>
                          <div class="invalid-feedback">Please enter your password!</div>
                        </div>

                        <div class="col-12">
                          <div class="form-check">
                            <input class="form-check-input" name="terms" type="checkbox" value="" id="acceptTerms" required>
                            <label class="form-check-label" for="acceptTerms">I agree and accept the <a href="#">terms and conditions</a></label>
                            <div class="invalid-feedback">You must agree before submitting.</div>
                          </div>
                        </div>
                        <div class="col-12 text-center">
                          <button class="btn btn-primary " type="submit">Create new admin account !</button>
                        </div>
                    </form>
                    </div>
                  </div>
                </div>
                <div class="modal-footer">
                  <button type="button" class="btn btn-outline-dark" data-bs-dismiss="modal">Close</button>
                </div>
              </div>
            </div>