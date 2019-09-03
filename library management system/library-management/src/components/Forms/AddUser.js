import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import Axios from 'axios'
import './AddUser.css'

export class AddUser extends Component {

  constructor(props) {
    super(props)
    this.state = {
      userId: '',
      userType: '',
      userName: '',
      password: '',
      phoneNum: '',
      email: '',
      cardValidity: '',
      address: ''

    }
    this.postAddData = this.postAddData.bind(this);
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
  postAddData(event) {
    event.preventDefault();
    let accountData = this.state;
    console.log("Account data", accountData);
    //Call the API using Axios and Validate the Employee Login
    Axios.post('http://localhost:/addUser', accountData).then((response) => {

      console.log(response.data);
      console.log(response.data.statusCode)
      alert("added Successfully");
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

        <div className="adduser">
          <div className="container" style={{ marginLeft: '500px' }}>
            <div className="row">
              <div className="col-md-6">
                <div className="card">
                  <h5 className="card-header ">
                    <legend className="mx-auto " style={{ width: '200px', color: 'aliceblue' }}>User Registration </legend>
                  </h5>
                  <div className="card-body">
                    <p className="card-text">
                    </p>
                    <form onSubmit={this.postAddData}>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">ID</span>
                        </div>
                        <input type="text" id="userId" name="userId" onChange={(event) => { this.setState({ userId: event.target.value }) }} value={this.state.userId} className="form-control" placeholder=" Enter ID" aria-label="ID" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Name</span>
                        </div>
                        <input type="text" id="userName" name="userName" onChange={(event) => { this.setState({ userName: event.target.value }) }} value={this.state.userName} className="form-control" placeholder=" Enter Username" aria-label="Username" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Password</span>
                        </div>
                        <input type="password" id="password" name="password" placeholder="password" onChange={(event) => { this.setState({ password: event.target.value }) }} value={this.state.password} className="form-control" placeholder=" Enter Password" aria-label="Password" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">address</span>
                        </div>
                        <input type="text" id="address" onChange={(event) => { this.setState({ address: event.target.value }) }} value={this.state.address} name="address" className="form-control" placeholder=" Enter address" aria-label="address" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Phone Number</span>
                        </div>
                        <input type="number" id="phoneNum" name="phoneNum" onChange={(event) => { this.setState({ phoneNum: event.target.value }) }} value={this.state.phoneNum} className="form-control" placeholder=" Enter Phone number" aria-label="phone number" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">email</span>
                        </div>
                        <input type="text" id="email" name="email" onChange={(event) => { this.setState({ email: event.target.value }) }} value={this.state.email} className="form-control" placeholder=" Enter Email" aria-label="email" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <span className="input-group-text" id="basic-addon1">Card Validity</span>
                        </div>
                        <input type="date" className="form-control" id="cardValidity" name="cardValidity" onChange={(event) => { this.setState({ cardValidity: event.target.value }) }} value={this.state.cardValidity} placeholder=" Enter Validity" aria-label="Card Validity" aria-describedby="basic-addon1" />
                      </div>
                      <div className="input-group mb-3">
                        <div className="input-group-prepend">
                          <label className="input-group-text" htmlFor="inputGroupSelect01">User Type</label>
                        </div>
                        <select className="custom-select" id="userType" name="userType" onChange={(event) => { this.setState({ userType: event.target.value }) }} value={this.state.userType}>
                          <option selected>Choose...</option>
                          <option value="admin">Admin</option>
                          <option value="librarian">Librarian</option>
                          <option value="student">Student</option>
                        </select>
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

export default AddUser
