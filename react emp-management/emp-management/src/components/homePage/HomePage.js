import React, { Component } from 'react'

export class HomePage extends Component {
    render() {
        return (
            <div>
        <section style={{marginTop: '10px'}}>
          <div className="accordion" id="accordionExample">
            <div className="card">
              <div className="card-header" id="headingOne">
                <h2 className="mb-0">
                  <button className="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
                    <h4 style={{width: '1300px', margin: '0 auto'}}>Employee Detail</h4>
                  </button>
                </h2>
              </div>
              <div id="collapseOne" className="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
                <div className="card-body">
                  <table className="table table-hover">
                    <thead>
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">Employee</th>
                        <th scope="col">Details</th>
                      </tr>
                    </thead>
                    <tbody style={{font: '56px'}}>
                      <tr>
                        <th scope="row">1</th>
                        <td>ID</td>
                        <td>${'{'}bean.id{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">2</th>
                        <td>NAME</td>
                        <td>${'{'}bean.name{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">3</th>
                        <td>AGE</td>
                        <td>${'{'}bean.age{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">4</th>
                        <td>GENDER</td>
                        <td>${'{'}bean.gender{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">5</th>
                        <td>SALARY</td>
                        <td>${'{'}bean.salary{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">6</th>
                        <td>PHONE</td>
                        <td>${'{'}bean.phone{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">7</th>
                        <td>JOINING_DATE</td>
                        <td>${'{'}bean.joiningDate{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">8</th>
                        <td>ACCCOUNT_NUMBER</td>
                        <td>${'{'}bean.accountNumber{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">9</th>
                        <td>EMAIL</td>
                        <td>${'{'}bean.email{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">10</th>
                        <td>DESIGNATION</td>
                        <td>${'{'}bean.designation{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">11</th>
                        <td>DOB</td>
                        <td>${'{'}bean.dob{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">12</th>
                        <td>DEPT_NO</td>
                        <td>${'{'}bean.departmentId{'}'}</td>
                      </tr>
                      <tr>
                        <th scope="row">13</th>
                        <td>MGR_ID</td>
                        <td>${'{'}bean.managerId{'}'}</td>
                      </tr>
                    </tbody>
                  </table>
                </div>
              </div>
            </div>
          </div>
          <div className="accordion" id="accordionExample">
            <div className="card">
              <div className="card-header" id="headingTwo">
                <h2 className="mb-0">
                  <button className="btn btn-link" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="true" aria-controls="collapseTwo">
                    <h4 style={{width: '1300px', margin: '0 auto'}}>Employee Other
                      Detail</h4>
                  </button>
                </h2>
              </div>
              <div id="collapseTwo" className="collapse show" aria-labelledby="headingTwo" data-parent="#accordionExample">
                <div className="card-body">
                  &lt;%-- 
                  --%&gt;
                  <table className="table table-hover">
                    <thead>
                      <tr>
                        <th scope="col">#</th>
                        <th scope="col">EmployeeOtherInfo</th>
                        <th scope="col">Details</th>
                      </tr>
                    </thead>
                    <tbody style={{font: '56px'}}>
                      <tr scope="row">
                        <th scope="row">1</th>
                        <th>PAN</th>
                        <td>${'{'}otherInfoBean.pan{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">2</th>
                        <th>ADHAR</th>
                        <td>${'{'} otherInfoBean.adhar{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">3</th>
                        <th>Passport Number</th>
                        <td>${'{'} otherInfoBean.passport{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">4</th>
                        <th>Emergency Contact Name</th>
                        <td>${'{'} otherInfoBean.emergencyContactPerson{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">5</th>
                        <th>Emergency Contact Number</th>
                        <td>${'{'} otherInfoBean.emergencyContactNumber{'}'}</td>
                      </tr><tr scope="row">
                        <th>Physically Challenged</th>
                        <td>${'{'} otherInfoBean.ischallenged{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th>Married</th>
                        <td>${'{'} otherInfoBean.isMarried{'}'}</td>
                      </tr><tr scope="row">
                        <th scope="row">6</th>
                        <th>Spouse Name</th>
                        <td>${'{'} otherInfoBean.spouseName{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">7</th>
                        <th>Father Name</th>
                        <td>${'{'} otherInfoBean.fatherName{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">8</th>
                        <th>Mother Name</th>
                        <td>${'{'} otherInfoBean.motherName{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">9</th>
                        <th>Nationality</th>
                        <td>${'{'} otherInfoBean.nationality{'}'}</td>
                      </tr>
                      <tr scope="row">
                        <th scope="row">10</th>
                        <th>Relegion</th>
                        <td>${'{'} otherInfoBean.religion{'}'}</td>
                      </tr>
                    </tbody></table>
                </div>
              </div>
            </div>
          </div>
        </section>
        <footer style={{background: 'gray', textAlign: 'center'}}>
          ©copyright at HomePage </footer>
      </div>
        )
    }
}

export default HomePage
