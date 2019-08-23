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
      userType:'',
      errorMessage: '',
      msg:localStorage.getItem('msg')
    }

    this.postLoginData = this.postLoginData.bind(this);
  }
  
  postLoginData(event) {
    event.preventDefault();
    //let accountData = this.state;
    const {userId,password,userType} = this.state;
    const loginData = {userId,password,userType};

    if(this.validateLogin(loginData)){
        //Call the API using Axios and Validate the user Login
        Axios.post('http://localhost/auth',null,{
            params:{
              userId:this.state.userId,
                password:this.state.password,
                userType:this.state.userType,
                msg:localStorage.getItem('msg')
            }
        }).then((response)=>{
          
          console.log('Response Object', response.data);
              console.log(response.data.beans[0].userType);

              if (response.data.beans[0].userType == 'admin') {
                  this.props.history.push('/AdminHomePage');
                  localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
              } else if (response.data.beans[0].userType == 'librarian') {
                  this.props.history.push('/LibrarianHomePage');
                  localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
              } else if (response.data.beans[0].userType == 'normalUser') {
                  this.props.history.push('/NormalUserHomePage');
                  localStorage.setItem("bean", JSON.stringify(response.data.beans[0]));
              }else {
                  this.props.history.push('/');
                  localStorage.setItem('msg',response.data.message);
              }
        }).catch((error)=>{
            console.log('Error',error);
        });
    }
}
componentDidMount() {
  localStorage.removeItem('msg');
}

validateLogin(loginData){
    let validationSuccess = false;

    if(loginData.userId==="" || loginData.userId===null){
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

  render() {
    const { navigation } = this.props;
    if (navigation) {
      console.log(navigation)
      const message = navigation.getParam('message');
    } return (
      <div  className="a">
        <div className="login-purple-pink p-3 shadow-lg">
          <div className="pt-3">
            <h3 className=" mx-auto text-white " style={{ width: '150px', color: 'aliceblue' }}>User Login</h3>
          </div>
          <div>{this.state.msg}</div>
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
                          <select className="custom-select" id="userType" name="userType" onChange={(event)=>{this.setState({userType:event.target.value})}} value={this.state.userType}>
                            <option selected>Choose...</option>
                            <option value="Admin">Admin</option>
                            <option value="Librarian">Librarian</option>
                            <option value="normalUser">Normal User</option>
                          </select>
                        </div>

            <div className="mt-5">
            <button type="submit" class="btn  btn-sm btn-outline-success col"  style={{ marginBottom:10 }}>Login</button>
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
















