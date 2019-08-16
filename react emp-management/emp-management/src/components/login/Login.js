import React, { Component } from 'react'
import Axios from 'axios'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
export class Login extends Component {
    constructor(props){
        super(props);

        this.state = {
            id : '',
            password : '',
            errorMessage: ''
        }

        this.postLoginData = this.postLoginData.bind(this);
    }

    postLoginData(event) {
        event.preventDefault();
        //let accountData = this.state;
        const {id,password} = this.state;
        const loginData = {id,password};

        if(this.validateLogin(loginData)){
            //Call the API using Axios and Validate the Employee Login
            Axios.post('http://localhost:8008/emp-springrest/login/auth',null,{
                params:{
                    id:this.state.id,
                    password:this.state.password
                }
            }).then((response)=>{
                console.log(response.data);
                console.log(response.data.statusCode)
                if(response.statusCode===401){
                    this.setState({errorMessage:response.data.message});
                } else{
                      
                }
            }).catch((error)=>{
                console.log('Error',error);
            });
        }
    }

    validateLogin(loginData){
        let validationSuccess = false;

        if(loginData.id.trim()==="" || loginData.id.trim()===null){
            alert('Please enter Employee Id');
            document.getElementById("id").focus();
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
    render() {
        return (
<div className="login-purple-pink p-3 shadow-lg rounded">
        <div className="pt-3">
          <h2 className="text-white ">Employee Login</h2>
        </div>
        <form className="mt-5" onSubmit={this.postLoginData}>
          <div className="form-group">
            <input id="id" type="number" name="id"  onChange={(event)=>{this.setState({id:event.target.value})}} value={this.state.id}  className="form-control form-control-sm bg-light" placeholder="Enter id" />
          </div>
          <div className="form-group">
            <input id="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password}  type="password" name="password" className="form-control form-control-sm bg-light" placeholder="Enter Password" />
          </div>
          <div className="mt-5">
            <button className="btn btn-sm btn-light col">
              Login
            </button>
          </div>
          <div className="text-center mt-2">
            <a href="#" className="text-warning">Forgot Password?</a>
          </div>
          <div className="mt-5">
            <p className="text-white text-center">
              Don't have an account?
              <Link to="/createEmployee" className="text-warning">Click here to register</Link>
            </p>
          </div>
        </form>
      </div>
          );
    }
}

export default Login
















 