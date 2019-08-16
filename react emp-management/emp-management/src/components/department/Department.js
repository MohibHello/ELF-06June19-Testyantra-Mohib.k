import React, { Component } from 'react'

export class Department extends Component {
    render() {
        return (
            <div>
            <legend className="h3" style={{textAlign: 'center'}}>Department Information</legend>
            <br />
            <div className="container-fluid">
              <div className="row">
                <div className="col-sm-4 col-md-offset-4">
                  <label htmlFor="dname"> Department Name</label>
                  <input type="text" className="form-control" name="departname" id="dname" placeholder="Enter Department Name" />
                </div>
              </div>
            </div>
          </div>
        )
    }
}

export default Department
