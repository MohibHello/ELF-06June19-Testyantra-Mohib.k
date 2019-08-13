<!DOCTYPE html>
<%@page import="com.tyss.emp.dto.EmployeeExperienceInfoBean"%>
<%@page import="com.tyss.emp.dto.EmployeeEducationalInfoBean"%>
<%@page import="com.tyss.emp.dto.EmployeeAddressInfoBean"%>
<%@page import="com.tyss.emp.dto.EmployeeInfoBean"%>
<html lang="en">



<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Form</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>

<%
	EmployeeInfoBean infoBean=(EmployeeInfoBean) session.getAttribute("infobean");
%>


<body>
	<div class="accordion" id="accordionExample">
		<form action="./indata" method="post">
			<div class="card">
				<div class="card-header" id="headingOne">
					<h2 class="mb-0">
						<button style="text-align: center" class="btn btn-link"
							type="button" data-toggle="collapse" data-target="#collapseOne"
							aria-expanded="true" aria-controls="collapseOne">
							employee_Info</button>
					</h2>
				</div>
				<div id="collapseOne" class="collapse show"
					aria-labelledby="headingOne" data-parent="#accordionExample">
					<div class="card-body">
						<div class="container-fluid">

							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="id">ID</label> <input type="text" name="id"
										value="<%=infoBean.getId()%>" class="form-control" id="id"
										placeholder="ID">
								</div>
								<div class="col-md-4">
									<label for="accountnumber">Account Number</label> <input
										type="number" name="accountNumber" class="form-control"
										id="accountNumber" value="<%=infoBean.getAccountNumber()%>"
										placeholder="Account Number">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="name">Name</label> <input type="text"
										value="<%=infoBean.getName()%>" name="name"
										class="form-control" id="name" placeholder="Name">
								</div>
								<div class="col-md-4">
									<label for="email">Email ID</label> <input type="text"
										value="<%=infoBean.getEmail()%>" name="email"
										class="form-control" id="email" placeholder="Email ID">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="age">Age</label> <input type="number" name="age"
										value="<%=infoBean.getAge()%>" class="form-control" id="age"
										placeholder="Age">
								</div>
								<div class="col-md-4">
									<label for="designation">Designation</label> <input type="text"
										name="designation" class="form-control"
										value="<%=infoBean.getDesignation()%>" id="designation"
										placeholder="Designation">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="Gender">Gender</label> <select id="Gender"
										name="gender" class="form-control">
										<% if(infoBean.getGender().equals("male")) {%>
										<option selected>--select one--</option>
										<option value="male" selected="selected">male</option>
										<option value="female">female</option>
										<%}else{%>
										<option selected>--select one--</option>
										<option value="male">male</option>
										<option value="female" selected="selected">female</option>
										<%}%>
									</select>
								</div>
								<div class="col-md-4">
									<label for="dob">Date of Birth</label> <input type="date"
										name="dob" value="<%=infoBean.getDob()%>" class="form-control"
										id="dob" placeholder="dd-mm-yyyy">
								</div>
							</div>
							<br>
							<div class="row">
								<div class="col-md-4 col-md-offset-2">
									<label for="salary">Salary</label> <input type="number"
										name="salary" class="form-control"
										value="<%=infoBean.getSalary()%>" id="salary"
										placeholder="Salary">
								</div>
								<div class="col-md-4">
									<label for="departmentid">Department id</label> <input
										type="number" name="departmentId" class="form-control"
										value="<%=infoBean.getDepartmentId()%>" id="departmentid"
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
										<input type="number" name="phone"
											value="<%=infoBean.getPhone()%>" class="form-control"
											id="phone" placeholder="phone number">
									</div>
								</div>
								<div class="col-md-4">
									<div>
										<label for="managerid">manager ID</label>
									</div>
									<div>
										<input type="number" name="managerId" class="form-control"
											value="<%=infoBean.getManagerId()%>" id="managerId"
											placeholder="manager id">
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
										<input type="text" name="password"
											value="<%=infoBean.getPassword()%>" class="form-control"
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
										<label for="joiningDate">Joining date</label>
									</div>
									<div>
										<input type="date" name="joiningDate" class="form-control"
											value="<%=infoBean.getJoiningDate()%>" id="joiningDate"
											placeholder="Enter joining date">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="card">
				<div class="card-header" id="headingTwo">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseTwo"
							aria-expanded="false" aria-controls="collapseTwo">
							employee_OtherInfo</button>
					</h2>
				</div>
				<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
					data-parent="#accordionExample">
					<div class="card-body">
						<div class="row">
							<div class="col-sm-4">

								<div>
									<label for="ecn">Emergency Contact Number</label>
								</div>
								<div>
									<input type="number" class="form-control"
										name="employeeOtherInfoBean.emergencyContactNumber" id="ecn"
										value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyContactNumber() %>"
										placeholder="Enter Emergency Contact Number">
								</div>
							</div>
							<div class="col-sm-4">

								<div>
									<label for="id">Mother Name</label>
								</div>
								<div>
									<input type="text" class="form-control" id="mothername"
										value="<%=infoBean.getEmployeeOtherInfoBean().getMotherName() %>"
										name="employeeOtherInfoBean.motherName"
										placeholder="Enter Mother Name">
								</div>
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-sm-4">
							<label for="id">Pan Number</label>
							<div>
								<input type="text" class="form-control" id="pan"
									value="<%=infoBean.getEmployeeOtherInfoBean().getPan() %>"
									name="employeeOtherInfoBean.pan" placeholder="Enter Pan Number">
							</div>
						</div>
						<div class="col-sm-4">
							<div>
								<label for="ecna">Emergency Contact Name</label>
							</div>
							<div>
								<input type="text" class="form-control" id="ecna"
									name="emergencyContactPerson"
									value="<%=infoBean.getEmployeeOtherInfoBean().getEmergencyContactPerson() %>"
									placeholder="Enter Emergency Contact name">
							</div>
						</div>
						<div class="col-sm-4">
							<div>
								<label for="spouse">Spouse Name</label>
							</div>
							<div>
								<input type="text" class="form-control" id="spouse"
									value="<%=infoBean.getEmployeeOtherInfoBean().getSpouseName() %>"
									name="spouseName" placeholder="Enter spouse Name">
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-sm-4">
							<div>
								<label for="marital">Marital Status</label>
							</div>
							<div>
								<select id="maritalstatus" name="isMarried" class="form-control">
									<% if(infoBean.getEmployeeOtherInfoBean().isMarried().equals("married")) {%>
									<option value="true" selected="selected">Married</option>
									<option value="false">Unmarried</option>
									<%}else { %>
									<option value="true">Married</option>
									<option value="false" selected="selected">Unmarried</option>
								</select>
							</div>
						</div>
						<div class="col-sm-4">
							<div>
								<label for="id">Nationality</label>
							</div>
							<div>
								<input type="text" name="nationality" class="form-control"
									value="<%=infoBean.getEmployeeOtherInfoBean().getNationality()%>"
									id="Nationality" placeholder="Enter Nationality">
							</div>
						</div>
						<div class="col-sm-4">
							<div>
								<label for="id">Passport Number</label>
							</div>
							<div>
								<input type="text" name="passport" class="form-control"
									value="<%=infoBean.getEmployeeOtherInfoBean().getPassport()%>"
									id="passport" placeholder="Enter Passport">
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-sm-4">
							<div>
								<label for="bloodgroup">Blood Group</label>
							</div>
							<div>
								<input type="text" name="bloodGroup" class="form-control"
									id="bloodgroup"
									value="<%=infoBean.getEmployeeOtherInfoBean().getBloodGroup() %>"
									placeholder="Enter Blood Group">
							</div>
						</div>
						<div class="col-sm-4">
							<div>
								<label for="Religion">Religion</label>
							</div>
							<div>
								<select id="Religion" name="religion" class="form-control">
									<% if(infoBean.getEmployeeOtherInfoBean().getReligion().equals("hindu")) {%>
									<option value="hindu" selected="selected">Hindu</option>
									<option value="muslim">Muslim</option>
									<option value="christian">Christian</option>
									<%}else if(infoBean.getGender().equals("muslim")){ %>
									<option value="hindu">Hindu</option>
									<option value="muslim" selected="selected">Muslim</option>
									<option value="christian">Christian</option>
									<%}else{ %>
									<option value="hindu">Hindu</option>
									<option value="muslim">Muslim</option>
									<option value="christian" selected="selected">Christian</option>
									<%} %>
								</select>
							</div>
						</div>
						<div class="col-sm-4">
							<div>
								<label for="adhar">Aadhar Number</label>
							</div>
							<div>
								<input type="text" name="adhar" class="form-control" id="adhar"
									value="<%=infoBean.getEmployeeOtherInfoBean().getAdhar()%>"
									placeholder="Enter Aadhar Number">
							</div>
						</div>
					</div>
					<br>
					<div class="row">
						<div class="col-sm-4">
							<div>
								<label for="physicallychallenged">Phyically challenged</label>
							</div>
							<div>
								<select id="physicallychallenged" name="ischallenged"
									class="form-control">
									<% if(infoBean.getEmployeeOtherInfoBean().isIschallenged().equals("yes")) {%>
									<option value="true" selected="selected">Yes</option>
									<option value="false">No</option>
									<%} else { %>
									<option value="true">Yes</option>
									<option value="false" selected="selected">No</option>
									<%}%>
								</select>
							</div>
						</div>
						<div class="col-sm-4">
							<div>
								<label for="fathername">Father Name</label>
							</div>
							<div>
								<input type="text" name="fatherName"
									value="<%=infoBean.getEmployeeOtherInfoBean().getFatherName()%>"
									class="form-control" id="fathername"
									placeholder="Enter Father Name">
							</div>
						</div>
					</div>
				</div>
			</div>
			<%
			List<EmployeeAddressInfoBean> addressInfoBeans = infoBean.getAddressInfoBeanList();
										
										for(EmployeeAddressInfoBean addressInfoBean :addressInfoBeans) {
											int i=0;
			%>

			<div class="card">
				<div class="card-header" id="headingThree">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseThree"
							aria-expanded="false" aria-controls="collapseThree">
							employee_AdressInfo1</button>
					</h2>
				</div>
				<div id="collapseThree" class="collapse"
					aria-labelledby="headingThree" data-parent="#accordionExample">
					<div class="card-body">
						<div class="row">
							<div class="col-md-4">
								<label for="city">City</label> <input type="text"
									value="<%=addressInfoBean.getCity()%>" class="form-control"
									name="addressInfoBeanList[<%=i%>].city"
									placeholder="enter City">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<label for="addressType">adress Type</label> <select
									value="<%=addressInfoBean.getAddressPKBean().getAddressType()%>"
									name="addressInfoBeanList[<%=i%>].addressPKBean.addressType"
									class="form-control">
									<option selected>--select one--</option>
									<option value="temporary">temporary</option>
									<option value="permanent">permanent</option>
								</select>
							</div>
							<div class="col-md-4">
								<label for="State">State</label> <input type="text"
									value="<%=addressInfoBean.getState()%>" class="form-control"
									name="addressInfoBeanList[<%=i%>].State"
									placeholder="Enter State">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<label for="addr1">Address1</label> <input type="text"
									value="<%=addressInfoBean.getAddress1()%>" class="form-control"
									name="addressInfoBeanList[<%=i%>].address1"
									placeholder="Enter Address 1">
							</div>
							<div class="col-md-4">
								<label for="country">Country</label> <input type="text"
									value="<%=addressInfoBean.getCountry()%>" class="form-control"
									name="addressInfoBeanList[<%=i%>].country"
									placeholder="Enter Country">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<label for="address2">Address 2</label> <input type="text"
									value="<%=addressInfoBean.getAddress2() %>"
									class="form-control"
									name="addressInfoBeanList[<%=i%>].address2"
									placeholder="Enter Address 2">
							</div>

							<div class="col-md-4">
								<label for="pincode">Pincode</label> <input type="number"
									value="<%=addressInfoBean.getPincode()%>" class="form-control"
									name="addressInfoBeanList[<%=i%>].pincode"
									placeholder="Enter Pincode">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<div>
									<label for="landmark">Landmark</label>
								</div>
								<div>
									<input type="text" class="form-control"
										value="<%=addressInfoBean.getLandmark()%>"
										name="addressInfoBeanList[<%=i%>].landmark"
										placeholder="Enter landmark">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<% i++;
			
										} %>
			<!-- 		<div class="card">
				<div class="card-header" id="headingFour">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseFour"
							aria-expanded="false" aria-controls="collapseThree">
							employee_AdressInfo2</button>
					</h2>
				</div>
				<div id="collapseFour" class="collapse"
					aria-labelledby="headingFour" data-parent="#accordionExample">
					<div class="card-body">
						<div class="row">
							<div class="col-md-4">
								<label for="city">City</label> <input type="text"
									class="form-control" name="addressInfoBeanList[1].city"
									placeholder="enter City">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<label for="addressType">Address Type</label> <select
									name="addressInfoBeanList[1].addressPKBean.addressType"
									class="form-control">
									<option selected>--select one--</option>
									<option value="temporary">temporary</option>
									<option value="permanent">permanent</option>

								</select>
							</div>
							<div class="col-md-4">
								<label for="State">State</label> <input type="text"
									class="form-control" name="addressInfoBeanList[1].State"
									placeholder="Enter State">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<label for="addr1">Address1</label> <input type="text"
									class="form-control" name="addressInfoBeanList[1].address1"
									placeholder="Enter Address 1">
							</div>
							<div class="col-md-4">
								<label for="country">Country</label> <input type="text"
									class="form-control" name="addressInfoBeanList[1].country"
									placeholder="Enter Country">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<label for="address2">Address 2</label> <input type="text"
									class="form-control" name="addressInfoBeanList[1].address2"
									placeholder="Enter Address 2">
							</div>

							<div class="col-md-4">
								<label for="pincode">Pincode</label> <input type="number"
									class="form-control" name="addressInfoBeanList[1].pincode"
									placeholder="Enter Pincode">
							</div>
						</div>
						<br>
						<div class="row">
							<div class="col-md-4 col-md-offset-2">
								<div>
									<label for="landmark">Landmark</label>
								</div>
								<div>
									<input type="text" class="form-control"
										name="addressInfoBeanList[1].landmark"
										placeholder="Enter landmark">
								</div>
							</div>
						</div>
					</div>
				</div>
			</div> -->

			<%
			List<EmployeeEducationalInfoBean> EduInfoBeans = infoBean.getAddressInfoBeanList(); 
											int j=0;
										for(EmployeeEducationalInfoBean  empEduInfo:EduInfoBeans) {
									
										%>

			<div class="card">
				<div class="card-header" id="headingFive">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseFive"
							aria-expanded="false" aria-controls="collapseThree">
							employee_EducationInfo1</button>
					</h2>
				</div>
				<div id="collapseFive" class="collapse"
					aria-labelledby="headingFive" data-parent="#accordionExample">
					<div class="card-body">
						<fieldset>

							<legend class="h3" style="text-align: center;">Education
								Details</legend>


							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Education Type</span> <input
											id="educationType"
											value="<%=empEduInfo.getEducationalInfoPKBean().getEducationType()%>"
											name="employeeEducationalInfoBean[<%=j%>].educationalInfoPKBean.educationType"
											class="form-control" placeholder="Enter Educational Type"
											type="text">
									</div>

								</div>
							</div>

							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Degree Type</span> <input
											id="degreeType" value="<%=empEduInfo.getDegreeType()%>"
											name="employeeEducationalInfoBean[<%=j%>].degreeType"
											class="form-control" placeholder="Enter Degree Type"
											type="text">
									</div>

								</div>
							</div>

							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Branch</span> <input
											id="branch" name="employeeEducationalInfoBean[<%=j%>].branch"
											value="<%=empEduInfo.getEducationalInfoPKBean().getEducationType()%>"
											class="form-control" placeholder="Enter Branch" type="text">
									</div>

								</div>
							</div>

							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">College Name</span> <input
											id="college" value="<%=empEduInfo.getCollegeName()%>"
											name="employeeEducationalInfoBean[<%=j%>].collegeName"
											class="form-control" placeholder="Enter College Name"
											type="text">
									</div>

								</div>
							</div>

							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">University</span> <input
											id="university" value="<%=empEduInfo.getUniversity()%>"
											name="employeeEducationalInfoBean[<%=j%>].university"
											class="form-control" placeholder="Enter University Name"
											type="text">
									</div>

								</div>
							</div>

							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Year of Passout</span> <input
											id="yop" name="employeeEducationalInfoBean[<%=j%>].yop"
											value="<%=empEduInfo.getYop()%>" class="form-control"
											placeholder="Enter Year of Passout" type="text">
									</div>

								</div>
							</div>

							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Percentage</span> <input
											id="percentage" value="<%=empEduInfo.getPercentage()%>"
											name="employeeEducationalInfoBean[<%=j%>].percentage"
											class="form-control" placeholder="Enter Percentage"
											type="number">
									</div>

								</div>
							</div>

							<!-- Prepended text-->
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Location</span> <input
											value="<%=empEduInfo.getLocation()%>" id="location"
											name="employeeEducationalInfoBean[<%=j%>].location"
											class="form-control" placeholder="Enter Location" type="text">
									</div>

								</div>
							</div>

						</fieldset>
					</div>
				</div>
			</div>
			<% 
				j++;
										} %>
			<!-- <div class="card">
				<div class="card-header" id="headingSix">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseSix"
							aria-expanded="false" aria-controls="collapseThree">
							employee_EducationInfo2</button>
					</h2>
				</div>
				<div id="collapseSix" class="collapse" aria-labelledby="headingSix"
					data-parent="#accordionExample">
					<div class="card-body">
						<fieldset>

							<legend class="h3" style="text-align: center;">Education
								Details</legend>
							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Education Type</span> <input
											id="educationType"
											name="employeeEducationalInfoBean[1].educationalInfoPKBean.educationType"
											class="form-control" placeholder="Enter Educational Type"
											type="text">
									</div>

								</div>
							</div>

							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Degree Type</span> <input
											id="degreeType"
											name="employeeEducationalInfoBean[1].degreeType"
											class="form-control" placeholder="Enter Degree Type"
											type="text">
									</div>

								</div>
							</div>

							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Branch</span> <input
											id="branch" name="employeeEducationalInfoBean[1].branch"
											class="form-control" placeholder="Enter Branch" type="text">
									</div>

								</div>
							</div>

							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">College Name</span> <input
											id="college"
											name="employeeEducationalInfoBean[1].collegeName"
											class="form-control" placeholder="Enter College Name"
											type="text">
									</div>

								</div>
							</div>

							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">University</span> <input
											id="university"
											name="employeeEducationalInfoBean[1].university"
											class="form-control" placeholder="Enter University Name"
											type="text">
									</div>

								</div>
							</div>

							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Year of Passout</span> <input
											id="yop" name="employeeEducationalInfoBean[1].yop"
											class="form-control" placeholder="Enter Year of Passout"
											type="text">
									</div>

								</div>
							</div>

							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Percentage</span> <input
											id="percentage"
											name="employeeEducationalInfoBean[1].percentage"
											class="form-control" placeholder="Enter Percentage"
											type="number">
									</div>

								</div>
							</div>

							Prepended text
							<div class="form-group">
								<label class="control-label col-sm-4" for="prependedtext"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span class="input-group-addon">Location</span> <input
											id="location" name="employeeEducationalInfoBean[1].location"
											class="form-control" placeholder="Enter Location" type="text">
									</div>

								</div>
							</div>

						</fieldset>
					</div>
				</div>
			</div> -->

			<%
			List<EmployeeExperienceInfoBean> ExpInfoBeans = infoBean.getEmployeeExperienceInfoBean();  
											int k=0;
										for(EmployeeExperienceInfoBean  empExpInfo:ExpInfoBeans) {
									
										%>

			<div class="card">
				<div class="card-header" id="headingSeven">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseSeven"
							aria-expanded="false" aria-controls="collapseThree">
							employee_ExperienceInfo1</button>
					</h2>
				</div>
				<div id="collapseSeven" class="collapse"
					aria-labelledby="headingSeven" data-parent="#accordionExample">
					<div class="card-body">
						<fieldset>

							<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
							<div class="form-group">
								<label class="control-label col-sm-4" for="companyName"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="companyPrepend" class="input-group-addon">Company
											Name</span> <input id="companyName"
											value="<%=empExpInfo.getEmployeeExperienceInfoPKBean().getCompanyName() %>"
											name="employeeExperienceInfoBean[<%=k%>].employeeExperienceInfoPKBean.companyName"
											class="form-control" placeholder="Enter Company Name"
											type="text">

									</div>

								</div>
							</div>

							<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
							<div class="form-group">
								<label class="control-label col-sm-4" for="companyName"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="companyPrepend" class="input-group-addon">Desingnation</span>
										<input id="desingnation"
											value="<%=empExpInfo.getDesignation()%>"
											name="employeeExperienceInfoBean[<%=k%>].desingnation"
											class="form-control" placeholder="Enter Desingnation"
											type="text">

									</div>

								</div>
							</div>



							<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
							<div class="form-group">
								<label class="control-label col-sm-4" for="joiningDate"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="joiningPrepend" class="input-group-addon">Joining
											Date</span> <input id="joiningDate"
											value="<%=empExpInfo.getJoiningDate()%>"
											name="employeeExperienceInfoBean[<%=k%>].joiningDate"
											class="form-control" placeholder="dd-mm-yyyy" type="date">

									</div>

								</div>
							</div>

							<!-- Prepended text http://getbootstrap.com/components/#input-groups -->
							<div class="form-group">
								<label class="control-label col-sm-4" for="leavingDate"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="leavingPrepend" class="input-group-addon">Leaving
											Date</span> <input id="leavingDate"
											value="<%=empExpInfo.getLeavingDate()%>"
											name="employeeExperienceInfoBean[<%=k%>].leavingDate"
											class="form-control" placeholder="dd-mm-yyyy" type="date">

									</div>

								</div>
							</div>
						</fieldset>
					</div>
				</div>
			</div>


			<%
				k++;
										} %>
			<!-- <div class="card">
				<div class="card-header" id="headingEight">
					<h2 class="mb-0">
						<button class="btn btn-link collapsed" type="button"
							data-toggle="collapse" data-target="#collapseEight"
							aria-expanded="false" aria-controls="collapseThree">
							employee_ExperienceInfo2</button>
					</h2>
				</div>
				<div id="collapseEight" class="collapse"
					aria-labelledby="headingEight" data-parent="#accordionExample">
					<div class="card-body">
						<fieldset>

							Prepended text http://getbootstrap.com/components/#input-groups
							<div class="form-group">
								<label class="control-label col-sm-4" for="companyName"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="companyPrepend" class="input-group-addon">Company
											Name</span> <input id="companyName"
											name="employeeExperienceInfoBean[1].employeeExperienceInfoPKBean.companyName"
											class="form-control" placeholder="Enter Company Name"
											type="text">

									</div>

								</div>
							</div>

							Prepended text http://getbootstrap.com/components/#input-groups
							<div class="form-group">
								<label class="control-label col-sm-4" for="companyName"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="companyPrepend" class="input-group-addon">Desingnation</span>
										<input id="desingnation"
											name="employeeExperienceInfoBean[1].desingnation"
											class="form-control" placeholder="Enter Desingnation"
											type="text">

									</div>

								</div>
							</div>



							Prepended text http://getbootstrap.com/components/#input-groups
							<div class="form-group">
								<label class="control-label col-sm-4" for="joiningDate"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="joiningPrepend" class="input-group-addon">Joining
											Date</span> <input id="joiningDate"
											name="employeeExperienceInfoBean[1].joiningDate"
											class="form-control" placeholder="dd-mm-yyyy" type="date">

									</div>

								</div>
							</div>

							Prepended text http://getbootstrap.com/components/#input-groups
							<div class="form-group">
								<label class="control-label col-sm-4" for="leavingDate"></label>
								<div class="col-sm-4">
									<div class="input-group">
										<span id="leavingPrepend" class="input-group-addon">Leaving
											Date</span> <input id="leavingDate"
											name="employeeExperienceInfoBean[1].leavingDate"
											class="form-control" placeholder="dd-mm-yyyy" type="date">

									</div>

								</div>
							</div>

							Button Group http://getbootstrap.com/components/#btn-groups
							<div class="form-group">
								<label class="control-label col-sm-4"></label>
								<div class="text-center col-sm-4">
									<div id="resetGroup" class="btn-group" role="group"
										aria-label="">
										<button type="reset" id="reset" name="reset"
											class="btn btn-default" aria-label="Reset">Reset</button>
										<input type="submit" id="submit" name="submit"
											class="btn btn-info" aria-label="submit" />
									</div>

								</div>
							</div>


						</fieldset>
					</div>
				</div>
			</div> -->
		</form>
	</div>
</body>
<!-- Latest compiled and minified JavaScript -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>

</html>