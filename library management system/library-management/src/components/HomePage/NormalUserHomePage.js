import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './Style.css'

export class NormalUserHomePage extends Component {
    render() {
        return (
            <div>
                 <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <Link className="navbar-brand" to="#">Student</Link>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item active">
              <Link className="nav-link" to="#">Home <span className="sr-only">(current)</span></Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="#">view Request</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/BookRequest">Request Book</Link>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="#">Renew Book</Link>
            </li>
            <div style={{marginRight: '200px'}} />
            <li className="nav-item">
              <form className=" form-inline">
                <input className="form-control" type="search" placeholder="Search User" aria-label="Search" />
                <button className="btn btn-outline-success" type="submit">Search</button>
              </form>
            </li>
          </ul>
          <ul className="nav navbar-nav" style={{float: 'right'}}>
            <li>
              <button type="button" className="btn btn-danger"><Link style={{color: 'aliceblue'}} to="/">logout</Link></button>
            </li>
          </ul>
        </div>
      </nav>
            </div>
        )
    }
}

export default NormalUserHomePage
