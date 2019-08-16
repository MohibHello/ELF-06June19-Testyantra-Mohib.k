import React, { Component } from 'react'

export class info extends Component {
    render() {
        return (
            <div className="container-fluid">
             <div className="card-header" id="headingEight">
          <legend className="h3" style={{textAlign: 'center'}}>EmployeeInfo
                  Details</legend>
          </div>
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <label htmlFor="id">ID</label> <input type="text" name="id" className="form-control" id="id" placeholder="ID" />
              </div>
              <div className="col-md-4">
                <label htmlFor="accountnumber">Account Number</label> <input type="number" name="accountNumber" className="form-control" id="accountNumber" placeholder="Account Number" />
              </div>
            </div>
            <br />
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <label htmlFor="name">Name</label> <input type="text" name="name" className="form-control" id="name" placeholder="Name" />
              </div>
              <div className="col-md-4">
                <label htmlFor="email">Email ID</label> <input type="text" name="email" className="form-control" id="email" placeholder="Email ID" />
              </div>
            </div>
            <br />
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <label htmlFor="age">Age</label> <input type="number" name="age" className="form-control" id="age" placeholder="Age" />
              </div>
              <div className="col-md-4">
                <label htmlFor="designation">Designation</label> <input type="text" name="designation" className="form-control" id="designation" placeholder="Designation" />
              </div>
            </div>
            <br />
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <label htmlFor="Gender">Gender</label> <select id="Gender" name="gender" className="form-control">
                  <option selected>--select one--</option>
                  <option value="male">male</option>
                  <option value="female">female</option>
                  <option value="other">other</option>
                </select>
              </div>
              <div className="col-md-4">
                <label htmlFor="dob">Date of Birth</label> <input type="date" name="dob" className="form-control" id="dob" placeholder="dd-mm-yyyy" />
              </div>
            </div>
            <br />
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <label htmlFor="salary">Salary</label> <input type="number" name="salary" className="form-control" id="salary" placeholder="Salary" />
              </div>
              <div className="col-md-4">
                <label htmlFor="departmentid">Department id</label> <input type="number" name="departmentId" className="form-control" id="departmentid" placeholder="department id" />
              </div>
            </div>
            <br />
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <div>
                  <label htmlFor="phonenumber">Phone Number</label>
                </div>
                <div>
                  <input type="number" name="phone" className="form-control" id="phone" placeholder="phone number" />
                </div>
              </div>
              <div className="col-md-4">
                <div>
                  <label htmlFor="managerid">manager ID</label>
                </div>
                <div>
                  <input type="number" name="managerId" className="form-control" id="managerId" placeholder="manager id" />
                </div>
              </div>
            </div>
            <br />
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <div>
                  <label htmlFor="password">Password</label>
                </div>
                <div>
                  <input type="text" name="password" className="form-control" id="password" placeholder="Enter Password" />
                </div>
              </div>
              <div className="col-md-4">
                <div>
                  <label htmlFor="password">Confirm Password</label>
                </div>
                <div>
                  <input type="text" className="form-control" id="password" placeholder="confirm password" />
                </div>
              </div>
            </div>
            <br />
            <div className="row">
              <div className="col-md-4 col-md-offset-2">
                <div>
                  <label htmlFor="joiningDate">Joining date</label>
                </div>
                <div>
                  <input type="date" name="joiningDate" className="form-control" id="joiningDate" placeholder="Enter joining date" />
                </div>
              </div>
            </div>
          </div>
        )
    }
}

export default info
