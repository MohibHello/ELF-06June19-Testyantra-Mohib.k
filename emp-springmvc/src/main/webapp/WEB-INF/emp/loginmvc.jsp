<%@page import="com.tyss.emp.dao.*"%>
<%@page import="com.tyss.emp.dto.*"%>

<!DOCTYPE html>
<html lang='en'>
<head>
<link href='//maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css' rel='stylesheet'>
<link href='//www.fuelcdn.com/fuelux/3.13.0/css/fuelux.min.css' rel='stylesheet'>
<meta charset='UTF-8'>
<meta name='viewport' content='width=device-width, initial-scale=1.0'>
<meta http-equiv='X-UA-Compatible' content='ie=edge'>
<link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integrity='sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anonymous'>
<title>Document</title>
         </head>
         <body>
                 <header class='container-fluid'>
                         <div class='row' style='background: gray;margin-bottom:10px; '>
<div class='col-sm-1' style='margin-top:10px; '>
    <img class='rounded-circle' alt='Bootstrap Image Preview' style='height: 50px; width: 50px' src='https://www.layoutit.com/img/sports-q-c-140-140-3.jpg' />
</div>
<div class='col-sm-10' style='margin-top:10px; '>
        <div class='form-group'>
 <label class='control-label' for='searchInput'></label>
 <div class='col-md-12'>
   <div class='search input-group' data-initialize='search' role='search' id='search'>
     <input type='text' class='form-control' aria-label='Sizing example input' aria-describedby='inputGroup-sizing-default'>
     <span class='input-group-btn'>
       <button class='btn btn-default' type='button'>
        <span class='glyphicon glyphicon-search'></span>
         <span class='sr-only'>Search</span>
       </button>
     </span>
 </div>
 </div>
</div>
       </div>
        <div class='col-md-1' style='margin-top:10px; '>
             
            <button type='button' class='btn btn-success btn-inline' id='btn' onclick='logout()'>
               logout
            </button>
        </div>
      </div>
</header>
<section style='margin: 42%'>

<h1><span style=\'color:green\'>EmployeeFound !!!</span></h1>
<h3><br>

<br> ID 		        ---"  ${infobean.id}
<br> NAME			    ---"  ${infobean.name}
<br> AGE 			    ---"  ${infobean.age}
<br> GENDER			---"  ${infobean.gender}
<br> SALARY  		    ---"  ${infobeansalary}
<br> PHONE  		  	---"  ${infobean.phone}
<br> JOINING_DATE	    ---"  ${infobean.joiningdate}
<br> ACCCOUNT_NUMBER   ---"  ${infobean.accountnumber}
<br> EMAIL  			---"  ${infobean.email}
<br> DESIGNATION    ---"   ${infobean.designation}
<br> DOB        		---"  ${infobean.dob}
<br> DEPT_NO (FK)   	---"  ${infobean.DepartmentId}
<br> MGR_ID			---"  ${infobean.managerId}
</h3>
 </section>       
 <footer style='background: gray; width: 100%; height: 30px;'>
    footer details
  </footer>
 </body>
 <script>        
 function logout() {        
  alert('logged out successfully');
   window.location.href='./emplogin.html'; }     
 </script>
 </html>