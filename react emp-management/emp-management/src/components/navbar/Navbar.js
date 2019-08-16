import React, { Component } from 'react'

export class Navbar extends Component {
    render() {
        return (
            <div>
                 <header>
          <div className="row" style={{background: 'gray'}}>
            <div className="col-sm-1" style={{marginTop: '10px'}}>
              <a href="/loginmvc"> <img className="rounded" alt="Bootstrap Image Preview" style={{height: '60px', width: '80px', marginBottom: '10px'}} src="https://cdn.pixabay.com/photo/2017/02/23/13/05/profile-2092113_960_720.png" /></a>
            </div>
            <div className="col-sm-10" style={{marginTop: '10px'}}>
              <div className="form-group">
                <label className="control-label" htmlFor="searchInput" />
                <div className="col-md-12">
                  <div className="search input-group" data-initialize="search" role="search" id="search">
                    <form action="<%=baseURL%>/validator/validate/employee/search">
                      <input type="text" name="search" className="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" /> <span className="input-group-btn">
                        <button className="btn btn-default" type="submit">
                          <span className="glyphicon glyphicon-search" /> <span className="sr-only">Search</span>
                        </button> {/* <input hidden type="text" name="url" value="search"> */}
                      </span>
                    </form>
                  </div>
                </div>
              </div>
            </div>
            <div className="col-md-1" style={{marginTop: '10px'}}>
              <button type="button" style={{width: '80px', height: '60px'}} className="btn btn-success btn-inline" id="btn">
                <a href="./logout">logout</a>
              </button>
            </div>
          </div>
        </header>
            </div>
        )
    }
}

export default Navbar
