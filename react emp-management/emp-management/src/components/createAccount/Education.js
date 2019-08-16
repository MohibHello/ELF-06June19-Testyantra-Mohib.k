import React, { Component } from 'react'

export class Education extends Component {
    render() {
        return (
      
          <div>
            <div>
              <fieldset>
              <div className="card-header" id="headingEight">
          <legend className="h3" style={{textAlign: 'center'}}>Education
                  Details</legend>
          </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">Education Type</span> <input id="educationType" name="employeeEducationalInfoBean[0].educationalInfoPKBean.educationType" className="form-control" placeholder="Enter Educational Type" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">Degree Type</span> <input id="degreeType" name="employeeEducationalInfoBean[0].degreeType" className="form-control" placeholder="Enter Degree Type" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">Branch</span> <input id="branch" name="employeeEducationalInfoBean[0].branch" className="form-control" placeholder="Enter Branch" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">College Name</span> <input id="college" name="employeeEducationalInfoBean[0].collegeName" className="form-control" placeholder="Enter College Name" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">University</span> <input id="university" name="employeeEducationalInfoBean[0].university" className="form-control" placeholder="Enter University Name" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">Year of Passout</span> <input id="yop" name="employeeEducationalInfoBean[0].yop" className="form-control" placeholder="Enter Year of Passout" type="text" />
                    </div>
                  </div>
                </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">Percentage</span> <input id="percentage" name="employeeEducationalInfoBean[0].percentage" className="form-control" placeholder="Enter Percentage" type="number" />
                    </div>
                  </div>
                </div>
                {/* Prepended text*/}
                <div className="form-group">
                  <label className="control-label col-sm-4" htmlFor="prependedtext" />
                  <div className="col-sm-4">
                    <div className="input-group">
                      <span className="input-group-addon">Location</span> <input id="location" name="employeeEducationalInfoBean[0].location" className="form-control" placeholder="Enter Location" type="text" />
                    </div>
                  </div>
                </div>
              </fieldset>
            </div>
          </div>
        )
    }
}

export default Education
