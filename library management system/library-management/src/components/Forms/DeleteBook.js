import React, { Component } from 'react'
import './Book.css'
import Axios from 'axios'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'

export class DeleteBook extends Component {

  constructor(props) {
    super(props)
    this.state = {
      bookId: '',

    }
    this.postDeleteData = this.postDeleteData.bind(this);
  }
  openUser(event) {

    this.props.history.push('/LibrarianHomePage');
    this.props.history.push('/Book');
    this.props.history.push('/DeleteBook');
  }

  logoutApp(event) {
    event.preventDefault();
    this.props.history.push('/'); // redirect to home page
  }

  postDeleteData(event) {
    event.preventDefault();
    let account = this.state;
    console.log(account.userId);
    Axios.delete('http://localhost/deleteBook?bookId=' + account.bookId).then((response) => {
      console.log(response.data);
      console.log(response.data.statusCode)
      this.props.history.push('/LibrarianHomePage');

    }).catch((error) => {
      console.log('Error', error);
    });
  }




  render() {
    return (
      <div className="mainhead">
        <div>
          <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <Link className="navbar-brand" to="/LibrarianHomePage">Librarian</Link>
            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span className="navbar-toggler-icon" />
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
              <ul className="navbar-nav mr-auto">
                <li className="nav-item active">
                  <Link className="nav-link" to="/LibrarianHomePage">Home <span className="sr-only">(current)</span></Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/Book">Add Book</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/DeleteBook">Remove Book</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/BookLoan">Allocate Book</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="#">De-Allocate Book</Link>
                </li>
                <div style={{ marginRight: '100px' }} />
                <li className="nav-item">
                  <form className=" form-inline">
                    <input className="form-control" type="search" placeholder="Search User" aria-label="Search" />
                    <button className="btn btn-outline-success" type="submit">Search</button>
                  </form>
                </li>
              </ul>
              <ul className="nav navbar-nav" style={{ float: 'right' }}>
                <li>
                  <button type="button" className="btn btn-danger"><Link style={{ color: 'aliceblue' }} to="/">logout</Link></button>
                </li>
              </ul>
            </div>
          </nav>
        </div>


        <div className="top">
          <div className="container" style={{ marginLeft: '500px' }}>
            <div className="row">
              <div className="col-md-6">
                <div id="del" className="card">
                  <h5 className="card-header ">
                    <legend className="mx-auto " style={{ width: '200px', color: 'aliceblue' }}>Remove Book </legend>
                  </h5>
                  <form onSubmit={this.postDeleteData}>
                    <div className="card-body">
                      <p className="card-text">
                      </p><div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Book ID</span>
                        </div>
                        <input type="text" className="form-control" id="bookId" name="bookId" onChange={(event) => { this.setState({ bookId: event.target.value }) }} value={this.state.bookId} placeholder=" Enter Book ID" aria-label="Book ID" aria-describedby="basic-addon1" />
                      </div>
                      <p />
                    </div>
                    <div className=" mx-auto" style={{ width: '150px', marginBottom: '20px' }}>
                      <button type="reset" className="btn btn-outline-primary">Reset</button>
                      <button type="submit" className="btn btn-outline-success">Submit</button>
                    </div>
                  </form>
                </div>
              </div>
            </div>
          </div>
        </div>

      </div>
    )
  }
}

export default DeleteBook
