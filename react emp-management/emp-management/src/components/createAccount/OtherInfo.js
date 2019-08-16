import React, { Component } from 'react'

export class OtherInfo extends Component {
    render() {
        return (
            <div>
        <div>
        <div className="card-header" id="headingEight">
          <legend className="h3" style={{textAlign: 'center'}}>employeeOtherInfo
                  Details</legend>
          </div>
          <div className="row">
            <div className="col-sm-4">
              <div>
                <label htmlFor="ecn">Emergency Contact Number</label>
              </div>
              <div>
                <input type="number" className="form-control" name="employeeOtherInfoBean.emergencyContactNumber" id="ecn" placeholder="Enter Emergency Contact Number" />
              </div>
            </div>
            <div className="col-sm-4">
              <div>
                <label htmlFor="id">Mother Name</label>
              </div>
              <div>
                <input type="text" className="form-control" id="mothername" name="employeeOtherInfoBean.motherName" placeholder="Enter Mother Name" />
              </div>
            </div>
          </div>
        </div>
        <br />
        <div className="row">
          <div className="col-sm-4">
            <label htmlFor="id">Pan Number</label>
            <div>
              <input type="text" className="form-control" id="pan" name="employeeOtherInfoBean.pan" placeholder="Enter Pan Number" />
            </div>
          </div>
          <div className="col-sm-4">
            <div>
              <label htmlFor="ecna">Emergency Contact Name</label>
            </div>
            <div>
              <input type="text" className="form-control" id="ecna" name="emergencyContactPerson" placeholder="Enter Emergency Contact name" />
            </div>
          </div>
          <div className="col-sm-4">
            <div>
              <label htmlFor="spouse">Spouse Name</label>
            </div>
            <div>
              <input type="text" className="form-control" id="spouse" name="spouseName" placeholder="Enter spouse Name" />
            </div>
          </div>
        </div>
        <br />
        <div className="row">
          <div className="col-sm-4">
            <div>
              <label htmlFor="marital">Marital Status</label>
            </div>
            <div>
              <select id="maritalstatus" name="isMarried" className="form-control">
                <option value="true">Married</option>
                <option value="false">Unmarried</option>
              </select>
            </div>
          </div>
          <div className="col-sm-4">
            <div>
              <label htmlFor="id">Nationality</label>
            </div>
            <div>
              <input type="text" name="nationality" className="form-control" id="Nationality" placeholder="Enter Nationality" />
            </div>
          </div>
          <div className="col-sm-4">
            <div>
              <label htmlFor="id">Passport Number</label>
            </div>
            <div>
              <input type="text" name="passport" className="form-control" id="passport" placeholder="Enter Passport" />
            </div>
          </div>
        </div>
        <br />
        <div className="row">
          <div className="col-sm-4">
            <div>
              <label htmlFor="bloodgroup">Blood Group</label>
            </div>
            <div>
              <input type="text" name="bloodGroup" className="form-control" id="bloodgroup" placeholder="Enter Blood Group" />
            </div>
          </div>
          <div className="col-sm-4">
            <div>
              <label htmlFor="Religion">Religion</label>
            </div>
            <div>
              <select id="Religion" name="religion" className="form-control">
                <option value="null">--select one--</option>
                <option value="hindu">Hindu</option>
                <option value="muslim">Muslim</option>
                <option value="christian">Christian</option>
              </select>
            </div>
          </div>
          <div className="col-sm-4">
            <div>
              <label htmlFor="adhar">Aadhar Number</label>
            </div>
            <div>
              <input type="text" name="adhar" className="form-control" id="adhar" placeholder="Enter Aadhar Number" />
            </div>
          </div>
        </div>
        <br />
        <div className="row">
          <div className="col-sm-4">
            <div>
              <label htmlFor="physicallychallenged">Phyically challenged</label>
            </div>
            <div>
              <select id="physicallychallenged" name="ischallenged" className="form-control">
                <option value="null">---select one---</option>
                <option value="true">Yes</option>
                <option value="false">No</option>
              </select>
            </div>
          </div>
          <div className="col-sm-4">
            <div>
              <label htmlFor="fathername">Father Name</label>
            </div>
            <div>
              <input type="text" name="fatherName" className="form-control" id="fathername" placeholder="Enter Father Name" />
            </div>
          </div>
        </div>
      </div>

        )
    }
}

export default OtherInfo
