<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Empother</title>
</head>
<body style="background: lightgoldenrodyellow">
    <div class="accordion" id="accordionExample">
        <div class="card">
          <div class="card-header" id="headingOne">
            <h2 class="mb-0">
              <button class="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                  Employee Information
              </button>
            </h2>
          </div>
      
          <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
            <div class="card-body">
                <legend class="h3" style="text-align: center;">Employee
                    Information</legend>
                  <br>
                  <form action="./create" method="post">
                
                    <div class="container-fluid">
                
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <label for="id">ID</label> <input type="text" name="id"
                            class="form-control" id="id" placeholder="ID">
                        </div>
                        <div class="col-md-4">
                          <label for="accountnumber">Account Number</label> <input
                            type="number" name="accountnumber" class="form-control" id="accountnumber"
                            placeholder="Account Number">
                        </div>
                      </div>
                      <br>
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <label for="name">Name</label> <input type="text" name="name"
                            class="form-control" id="name" placeholder="Name">
                        </div>
                        <div class="col-md-4">
                          <label for="email">Email ID</label> <input type="text" name="email"
                            class="form-control" id="email" placeholder="Email ID">
                        </div>
                      </div>
                      <br>
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <label for="age">Age</label> <input type="number" name="age"
                            class="form-control" id="age" placeholder="Age">
                        </div>
                        <div class="col-md-4">
                          <label for="designation">Designation</label> <input type="text"
                            name="designation" class="form-control" id="designation"
                            placeholder="Designation">
                        </div>
                      </div>
                      <br>
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <label for="Gender">Gender</label> <select id="Gender"
                            name="gender" class="form-control">
                            <option selected>--select one--</option>
                            <option value="male">male</option>
                            <option value="female">female</option>
                            <option value="other">other</option>
                          </select>
                        </div>
                        <div class="col-md-4">
                          <label for="dob">Date of Birth</label> <input type="date"
                            name="dob" class="form-control" id="dob" placeholder="dd-mm-yyyy">
                        </div>
                      </div>
                      <br>
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <label for="salary">Salary</label> <input type="number"
                            name="salary" class="form-control" id="salary"
                            placeholder="Salary">
                        </div>
                        <div class="col-md-4">
                          <label for="departmentid">Department id</label> <input
                            type="number" name="deptid" class="form-control" id="departmentid"
                            placeholder="department id">
                        </div>
                      </div>
                      <br>
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <div>
                            <label for="phonenumber">Phone Number</label>
                          </div>
                          <div>
                            <input type="number" name="phonenumber" class="form-control"
                              id="phonenumber" placeholder="phone number">
                          </div>
                        </div>
                        <div class="col-md-4">
                          <div>
                            <label for="managerid">manager ID</label>
                          </div>
                          <div>
                            <input type="number" name="managerid" class="form-control"
                              id="managerid" placeholder="manager id">
                          </div>
                        </div>
                      </div>
                      <br>
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <div>
                            <label for="password">Password</label>
                          </div>
                          <div>
                            <input type="text" name="password1" class="form-control"
                              id="password" placeholder="Enter Password">
                          </div>
                        </div>
                        <div class="col-md-4">
                          <div>
                            <label for="password">Confirm Password</label>
                          </div>
                          <div>
                            <input type="text" class="form-control" id="password"
                              placeholder="confirm password">
                          </div>
                        </div>
                      </div>
                      <br>
                
                
                
                      <div class="row">
                        <div class="col-md-4 col-md-offset-2">
                          <div>
                            <label for="joining">Joining date</label>
                          </div>
                          <div>
                            <input type="date" name="joining" class="form-control"
                              id="joining" placeholder="Enter joining date">
                          </div>
                        </div>
                      </div>
                    </div>
          </div>
        </div>
        <div class="card">
          <div class="card-header" id="headingTwo">
            <h2 class="mb-0">
              <button class="btn btn-link collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
               Employee Other Information
              </button>
            </h2>
          </div>
          <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
              <div class="card-body">
             		

			<legend class="h3" style="text-align: center;">Employee Other Information</legend>
      <br>
              
       <div class="container-fluid">
      
          
        <div class="row">
            <div class="col-sm-4">
        
                <div>  <label for="id">ID</label></div>
                <div>
                  <input type="text" class="form-control" id="id" name="id2" placeholder="Enter ID">
                </div>
            </div>
            <div class="col-sm-4">
              
                <div>  <label for="ecn">Emergency Contact Number</label></div>
                <div>
                  <input type="number" class="form-control" name="emergencyContactNumber" id="ecn" placeholder="Enter Emergency Contact Number">
                </div>
            </div>
            <div class="col-sm-4">
              
                <div>  <label for="id">Mother Name</label></div>
                <div>
                  <input type="text" class="form-control" id="mothername" name="motherName" placeholder="Enter Mother Name">
                </div>
            </div>
          </div>
      <br>
        <div class="row">
          <div class="col-sm-4">  <label for="id">Pan Number</label>
            <div>
              <input type="text" class="form-control" id="pan" name="" placeholder="Enter Pan Number">
              </div>
          </div>
          <div class="col-sm-4">
              <div>  <label for="ecna">Emergency Contact Name</label></div>
              <div>
                <input type="text" class="form-control" id="ecna" name="emergencyContactPerson" placeholder="Enter Emergency Contact name">
                </div>
          </div>
          <div class="col-sm-4">
              <div>  <label for="spouse">Spouse Name</label></div>
              <div>
                <input type="text" class="form-control" id="spouse" name="spouseName" placeholder="Enter spouse Name">
                </div>
          </div>
          </div>
        <br>
        <div class="row">
          <div class="col-sm-4">
              <div>  <label for="marital">Marital Status</label></div>
              <div>
                  <select id="maritalstatus" name="isMarried" class="form-control">
                      
                    <option value="1">Married</option>
                    <option value="0">Unmarried</option>
                   
                  </select>
              </div>
          </div>
          <div class="col-sm-4">
              <div>  <label for="id">Nationality</label></div>
              <div>
                <input type="text" name="nationality" class="form-control" id="Nationality" placeholder="Enter Nationality">
              </div>
          </div>
          <div class="col-sm-4">
              <div>  <label for="id">Passport Number</label></div>
              <div>
                <input type="text" name="passport" class="form-control" id="passport" placeholder="Enter Passport">
              </div>
          </div>
        </div>
      <br>
        <div class="row">
          <div class="col-sm-4">
              <div>  <label for="bloodgroup">Blood Group</label></div>
              <div>
                <input type="text" name="bloodGroup" class="form-control" id="bloodgroup" placeholder="Enter Blood Group">
              </div>
          </div>
          <div class="col-sm-4">
              <div>  <label for="Religion">ID</label></div>
              <div>
                  <select  id="Religion" name="religion" class="form-control">
                    <option value="null">--select one--</option>
                      <option value="hindu">Hindu</option>
                      <option value="muslim">Muslim</option>
                      <option value="christian">Christian</option>
                       
                    </select>
              </div>
          </div>
          <div class="col-sm-4">
              <div>  <label for="adhar">Aadhar Number</label></div>
              <div>
                <input type="text" name="adhar" class="form-control" id="adhar" placeholder="Enter Aadhar Number">
              </div>
          </div>
        </div>
        <br>
        <div class="row">
          <div class="col-sm-4">
              <div>  <label for="physicallychallenged">Phyically challenged</label></div>
              <div>
                  <select id="physicallychallenged" name="ischallenged" class="form-control">
                      <option value="null">---select one---</option>
                      <option value="1">Yes</option>
                      <option value="0">No</option>
                       
                    </select>
              </div>
          </div>
          <div class="col-sm-4">
              <div>  <label for="fathername">Father Name</label></div>
              <div>
                <input type="text" name="fatherName" class="form-control" id="fathername" placeholder="Enter Father Name">
              </div>
          </div>
          <div class="col-sm-4">
              <div>  <label></label></div>
              <div id="resetGroup" class="btn-group" role="group" aria-label="">
                  <button type="reset" id="reset" name="reset" class="btn btn-default" aria-label="Reset">Reset</button>
                  <button type="submit" id="submit" name="submit" class="btn btn-info" aria-label="submit">Register</button>
                </div>
          </div>
        </div>
      
      </div>
        </form> </div>
            </div>
          </div>
</body>
</html>