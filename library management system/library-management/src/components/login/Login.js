import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import React, { Component } from 'react'
import Axios from 'axios'
import './Login.css'

export class Login extends Component {
  constructor(props) {
    super(props);

    this.state = {
      userId: '',
      password: '',
      errorMessage: ''
    }

    this.postLoginData = this.postLoginData.bind(this);
  }
  
  postLoginData(event) {
    event.preventDefault();
    //let accountData = this.state;
    const {userId,password} = this.state;
    const loginData = {userId,password};

    if(this.validateLogin(loginData)){
        //Call the API using Axios and Validate the user Login
        Axios.post('http://localhost/auth',null,{
            params:{
              userId:this.state.userId,
                password:this.state.password
            }
        }).then((response)=>{
            console.log(response.data);
            console.log(response.data.statusCode)
            this.props.history.push('/AdminHomePage');
            if(response.statusCode==401){
                this.setState({errorMessage:response.data.message});
                this.props.history.push('/');
            } else{
              
                            }
        }).catch((error)=>{
            console.log('Error',error);
        });
    }
}

validateLogin(loginData){
    let validationSuccess = false;

    if(loginData.userId==="" || loginData.userI===null){
        alert('Please enter User Id');
        document.getElementById("userId").focus();
        return validationSuccess;
    } else if(loginData.password.trim()==="" || loginData.password.trim()===null){
        alert('Please enter Password');
        document.getElementById("password").focus();
        return validationSuccess;
    } else{
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
              <input  type="text" onChange={(event)=>{this.setState({userId:event.target.value})}} value={this.state.userId} class="form-control" placeholder="User ID" />
            </div>
            <div className="form-group">
              <input type="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} class="form-control" placeholder="Enter Password"/>
            </div>
            <div className="input-group mt-3">
                          <div className="input-group-prepend">
                            <label className="input-group-text" htmlFor="inputGroupSelect01">User Type</label>
                          </div>
                          <select className="custom-select" id="userType" name="userType">
                            <option selected>Choose...</option>
                            <option value="admin">Admin</option>
                            <option value="librarian">Librarian</option>
                            <option value="student">Student</option>
                          </select>
                        </div>

            <div className="mt-5">
              <button type="submit" className="btn btn-sm btn-light col">
                Login
            </button>
            </div>
            </form>
            <div className="text-center mt-2">
              <Link to="/AddUser" className="text-warning">Forgot Password?</Link>
            </div>
         
        </div>
      </div>
    );
  }
}

export default Login
















