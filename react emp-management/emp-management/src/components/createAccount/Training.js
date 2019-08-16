import React, { Component } from 'react'

export class Training extends Component {
    render() {
        return (
            <div>
        <div className="card-header" id="headingEight">
          <legend className="h3" style={{textAlign: 'center'}}>Training
                  Details</legend>
          </div>
        {/* Prepended text http://getbootstrap.com/components/#input-groups */}
        <div className="form-group">
          <label className="control-label col-sm-4" htmlFor="id" />
          <div className="col-sm-4">
            <div className="input-group">
              <span id="idPrepend" className="input-group-addon">Course ID</span>
              <input id="id" name="id" className="form-control" placeholder="Enter Course ID" type="number" />
            </div>
          </div>
        </div>
        {/* Prepended text http://getbootstrap.com/components/#input-groups */}
        <div className="form-group">
          <label className="control-label col-sm-4" htmlFor="Course Name" />
          <div className="col-sm-4">
            <div className="input-group">
              <span id="Course NamePrepend" className="input-group-addon">Course Name</span>
              <input id="Course Name" name="Course Name" className="form-control" placeholder="Enter Course Name" type="text" />
            </div>
          </div>
        </div>
        {/* Prepended text http://getbootstrap.com/components/#input-groups */}
        <div className="form-group">
          <label className="control-label col-sm-4" htmlFor="duration" />
          <div className="col-sm-4">
            <div className="input-group">
              <span id="durationPrepend" className="input-group-addon">Duration</span>
              <input id="duration" name="duration" className="form-control" placeholder="Enter Course Duration" type="text" />
            </div>
          </div>
        </div>
        {/* Prepended text http://getbootstrap.com/components/#input-groups */}
        <div className="form-group">
          <label className="control-label col-sm-4" htmlFor="coursetype" />
          <div className="col-sm-4">
            <div className="input-group">
              <span id="coursetypePrepend" className="input-group-addon">Course Type</span>
              <input id="coursetype" name="coursetype" className="form-control" placeholder="Enter Course Type" type="text" />
            </div>
          </div>
        </div>
      </div>
        )
    }
}

export default Training
