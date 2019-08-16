import React, { Component } from 'react'

export class Experience extends Component {
    render() {
        return (
          <div className="card">
          <div className="card-header" id="headingEight">
          <legend className="h3" style={{textAlign: 'center'}}>Experience
                  Details</legend>
          </div>
            <div>
              <fieldset>
                {/* Prepended text http://getbootstrap.com/components/#input-groups */}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="companyName" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span id="companyPrepend" className="input-group-addon">Company
                        Name</span> <input id="companyName" name="employeeExperienceInfoBean[1].employeeExperienceInfoPKBean.companyName" className="form-control" placeholder="Enter Company Name" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text http://getbootstrap.com/components/#input-groups */}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="companyName" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span id="companyPrepend" className="input-group-addon">Desingnation</span>
                      <input id="desingnation" name="employeeExperienceInfoBean[1].desingnation" className="form-control" placeholder="Enter Desingnation" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text http://getbootstrap.com/components/#input-groups */}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="joiningDate" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span id="joiningPrepend" className="input-group-addon">Joining
                        Date</span> <input id="joiningDate" name="employeeExperienceInfoBean[1].joiningDate" className="form-control" placeholder="dd-mm-yyyy" type="date" />
                    </div>
                  </div>
                </div>
                {/* Prepended text http://getbootstrap.com/components/#input-groups */}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="leavingDate" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span id="leavingPrepend" className="input-group-addon">Leaving
                        Date</span> <input id="leavingDate" name="employeeExperienceInfoBean[1].leavingDate" className="form-control" placeholder="dd-mm-yyyy" type="date" />
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
        )
    }
}

export default Experience
