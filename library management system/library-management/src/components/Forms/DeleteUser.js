import React, { Component } from 'react'
import './AddUser.css'
import Axios from 'axios'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
export class DeleteUser extends Component {

  constructor(props) {
    super(props)
    this.state = {
      userId: '',

    }
    this.postDeleteData = this.postDeleteData.bind(this);
  }
  openUser(event) {
    this.props.history.push('/AdminHomePage');
    this.props.history.push('/AddUser');
    this.props.history.push('/DeleteUser');
    this.props.history.push('/UpdateUser');
  }
  logoutApp(event) {
    event.preventDefault();
    this.props.history.push('/'); // redirect to home page
  }
  postDeleteData(event) {
    event.preventDefault();
    let account = this.state;
    console.log(account.userId);
    Axios.delete('http://localhost/deleteUser?userId=' + account.userId).then((response) => {

      console.log(response.data);
      console.log(response.data.statusCode)
      this.props.history.push('/AdminHomePage');

    }).catch((error) => {
      console.log('Error', error);
    });
  }



  render() {
    return (
      <div className="mainHeader">

        <div >
          <nav className="navbar navbar-expand-lg navbar-light bg-light">
            <Link className="navbar-brand" to="/AdminHomePage">Admin</Link>
            <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span className="navbar-toggler-icon" />
            </button>
            <div className="collapse navbar-collapse" id="navbarSupportedContent">
              <ul className="navbar-nav mr-auto">
                <li className="nav-item active">
                  <Link className="nav-link" to="#">Home <span className="sr-only">(current)</span></Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/AddUser">Add User</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/UpdateUser">Update User</Link>
                </li>
                <li className="nav-item">
                  <Link className="nav-link" to="/DeleteUser">Delete User</Link>
                </li>
                <div style={{ marginRight: '200px' }} />
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
        <div className="deleteuser">
          <div className="container" style={{ marginLeft: '500px' }}>
            <div className="row">
              <div className="col-md-6">
                <div className="card2">
                  <h5 className="card-header ">
                    <legend className="mx-auto " style={{ width: '200px', color: 'aliceblue' }}>User Removal </legend>
                  </h5>
                  <form onSubmit={this.postDeleteData}>
                    <div className="card-body">
                      <p className="card-text">
                      </p><div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">ID</span>
                        </div>
                        <input type="text" id="userId" name="userId" placeholder="user id" onChange={(event) => { this.setState({ userId: event.target.value }) }} value={this.state.userId} className="form-control" placeholder=" Enter ID" aria-label="ID" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Name</span>
                        </div>
                        <input type="text" className="form-control" id="userName" name="userName" placeholder=" Enter Username" aria-label="Username" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <label className="input-group-text" htmlFor="inputGroupSelect01">User Type</label>
                        </div>
                        <select className="custom-select" id="userType" name="userType">
                          <option selected>Choose...</option>
                          <option defaultValue="admin">Admin</option>
                          <option value="librarian">Librarian</option>
                          <option value="student">Student</option>
                        </select>
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

export default DeleteUser
