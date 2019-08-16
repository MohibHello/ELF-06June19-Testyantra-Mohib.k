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
            <div className="container">
              <div className="row">
                <div className="col-md-6 offset-3 card">
                  <div className="card-body">
                    <h4 className="text-center border-bottom">Login</h4>
                    <br />
                    <form className="form-horizontal" onSubmit={this.postLoginData} /*action="./authenticate"*/ method="POST">
                      <div className="col-auto">
                        <label className="sr-only" htmlFor="id">Id</label>
                        <div className="input-group mb-2">
                          <div className="input-group-prepend" >
                            <div className="input-group-text">ID</div>
                          </div>
                          <input id="id" onChange={(event)=>{this.setState({id:event.target.value})}} value={this.state.id} type="number" className="form-control" name="id" placeholder="Enter Employee ID" />
                        </div>
                      </div>
                      <span id="email-error" style={{display: 'none'}} className="text-danger small" />
                      <div className="col-auto">
                        <label className="sr-only" htmlFor="password">Password</label>
                        <div className="input-group mb-2">
                          <div className="input-group-prepend">
                            <div className="input-group-text">Password</div>
                          </div>
                          <input id ="password" onChange={(event)=>{this.setState({password:event.target.value})}} value={this.state.password} type="password" className="form-control" name="password" placeholder="Enter Password" />
                        </div>
                      </div>
                      <br />
                      <div className=" row">
                        <button type="reset" className="offset-1 col-md-5 btn btn-outline-dark" style={{borderRadius: '3px 0 0 3px', borderRight: 0}}>Reset</button>
                        <button type="submit" className="col-md-5 btn btn-outline-info" style={{borderRadius: '0 3px 3px 0'}}>Login</button>
                      </div>
                      <br />
                      <div className=" row">
                        <Link to="/createEmployee" className="offset-1 col-md-5 btn btn-outline-danger" style={{borderRadius: '3px 0 0 3px', borderRight: 0}}>Create
                          Account</Link> <a href="forgotpassword.html" className="col-md-5 btn btn-outline-danger" style={{borderRadius: '0 3px 3px 0'}}>Forgot Password</a>
                      </div>
                    </form>
                  </div>
                </div>
              </div>
            </div>
          );
    }
}

export default Login
