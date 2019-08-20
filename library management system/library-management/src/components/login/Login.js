import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import React, { Component } from 'react'
import Axios from 'axios'
import './Login.css'

export class Login extends Component {
  constructor(props) {
    super(props);

    this.state = {
      id: '',
      password: '',
      errorMessage: ''
    }

    this.postLoginData = this.postLoginData.bind(this);
  }
  logoutApp() {

  }
  postLoginData(event) {
    event.preventDefault();
    //let accountData = this.state;
    const { id, password } = this.state;
    const loginData = { id, password };

    if (this.validateLogin(loginData)) {
      //Call the API using Axios and Validate the Employee Login
      Axios.post('http://localhost/emp-springrest/login/auth', null, {
        params: {
          id: this.state.id,
          password: this.state.password
        }
      }).then((response) => {
        if (response.data.statusCode == 401) {
          console.log("40111");
          this.setState({ errorMessage: response.data.message });
          var element = document.getElementById("errorMsg");
          element.classList.remove("hide");
          element.classList.add("show");
        } else {
          //Redirect the Application to Employee Home page
          let employeeData = response.data.beans[0];
          localStorage.setItem("bean", JSON.stringify(employeeData));
          this.props.history.push('/HomePage');

        }
      }).catch((error) => {
        console.log('Error', error);
      });
    }
  }

  validateLogin(loginData) {
    let validationSuccess = false;

    if (loginData.id.trim() === "" || loginData.id.trim() === null) {
      alert('Please enter Employee Id');
      document.getElementById("id").focus();
      return validationSuccess;
    } else if (loginData.password.trim() === "" || loginData.password.trim() === null) {
      alert('Please enter Password');
      document.getElementById("password").focus();
      return validationSuccess;
    } else {
      validationSuccess = true;
    }

    return validationSuccess;
  }

  openCreateEmployee(event) {
    event.preventDefault();
    this.props.history.push('/createEmployee');
  }

  render() {
    const { navigation } = this.props;
    if (navigation) {
      console.log(navigation)
      const message = navigation.getParam('message');
    } return (
      <div  className="a">
        <div className="login-purple-pink p-3 shadow-lg rounded">
          <div className="pt-3">
            <h2 className="text-white ">User Login</h2>
          </div>
          <form className="mt-5" onSubmit={this.postLoginData}>
            <div className="form-group">
              <input id="id" type="number" name="id" onChange={(event) => { this.setState({ id: event.target.value }) }} value={this.state.id} className="form-control form-control-sm bg-light" placeholder="Enter id" />
            </div>
            <div className="form-group">
              <input id="password" onChange={(event) => { this.setState({ password: event.target.value }) }} value={this.state.password} type="password" name="password" className="form-control form-control-sm bg-light" placeholder="Enter Password" />
            </div>
            <div className="mt-5">
              <button className="btn btn-sm btn-light col">
                Login
            </button>
            </div>
            <div className="text-center mt-2">
              <a href="#" className="text-warning">Forgot Password?</a>
            </div>
          </form>
        </div>
      </div>
    );
  }
}

export default Login















