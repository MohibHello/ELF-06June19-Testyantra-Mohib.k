import React, { Component } from 'react'
import './BookLoan.css'
import Axios from 'axios'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'

export class BookLoan extends Component {

  constructor(props) {
    super(props)
    this.state = {
      bookAllotmentId: '',
      userId: '',
      bookId: '',
      issueDate: '',
      returnDate: '',
      status: '',

    }
    this.postAddData = this.postAddData.bind(this);
  }
  logoutApp(event) {
    event.preventDefault();
    this.props.history.push('/'); // redirect to home page
  }

  postAddData(event) {
    event.preventDefault();
    let bookData = this.state;
    console.log("Book data", bookData);
    //Call the API using Axios and Validate
    Axios.post('http://localhost:/createAllocate', bookData).then((response) => {

      console.log(response.data);
      console.log(response.data.statusCode)
      this.props.history.push('/LibrarianHomePage');

    }).catch((error) => {
      console.log('Error', error);
    });
  }


  render() {
    return (
      <div className="mainHead">

        <div >
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




        <div className="booktop">
          <div className="container" style={{ marginLeft: '500px' }}>
            <div className="row">
              <div className="col-md-6">
                <div id="bcard2" className="card">
                  <h5 className="card-header ">
                    <legend className="mx-auto " style={{ width: '200px', color: 'aliceblue' }}>Book Allocate </legend>
                  </h5>
                  <div className="card-body">
                    <p className="card-text">
                    </p>
                    <form onSubmit={this.postAddData}>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Book Allocate ID</span>
                        </div>
                        <input type="number" className="form-control" id="bookAllotmentId" name="bookAllotmentId" onChange={(event) => { this.setState({ bookAllotmentId: event.target.value }) }} value={this.state.bookAllotmentId} placeholder=" Enter Book ID" aria-label="Book ID" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">User ID</span>
                        </div>
                        <input id="userId" name="userId" onChange={(event) => { this.setState({ userId: event.target.value }) }} value={this.state.userId} type="number" className="form-control" placeholder=" Enter Date Issued" aria-label="Date Issued" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Book ID</span>
                        </div>
                        <input id="bookId" name="bookId" onChange={(event) => { this.setState({ bookId: event.target.value }) }} value={this.state.bookId} type="number" className="form-control" placeholder=" Enter Date due for return" aria-label="Date due for return" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Issue Date</span>
                        </div>
                        <input id="issueDate" name="issueDate" onChange={(event) => { this.setState({ issueDate: event.target.value }) }} value={this.state.issueDate} type="date" className="form-control" placeholder=" Enter Fine" aria-label="fine" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Return Date</span>
                        </div>
                        <input id="returnDate" name="returnDate" onChange={(event) => { this.setState({ returnDate: event.target.value }) }} value={this.state.returnDate} type="text" className="form-control" placeholder=" Enter User ID" aria-label="User ID" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Status</span>
                        </div>
                        <input id="status" name="status" onChange={(event) => { this.setState({ status: event.target.value }) }} value={this.state.status} type="text" className="form-control" placeholder=" Enter Renewing Date" aria-label="User ID" aria-describedby="basic-addon1" />
                      </div>
                      <div className=" mx-auto" style={{ width: '150px', marginBottom: '20px' }}>
                        <button type="reset" className="btn btn-outline-primary">Reset</button>
                        <button type="submit" className="btn btn-outline-success">Submit</button>
                      </div>
                      <p />
                    </form>
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

export default BookLoan
