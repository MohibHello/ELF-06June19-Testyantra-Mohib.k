import React, { Component } from 'react'
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './Style.css'
import Axios from 'axios'

export class AdminHomePage extends Component {

  constructor(props){
    super(props);
    this.state = {
     UserData:[],
     id:'',
     email:'',
     name:'',
     password:'',
     phone:'',
     useType:'',
     searchName:''
  }
}
SerachPageAdmin=(e)=>{
  debugger;
  e.preventDefault();
   console.log("searchName",this.state.searchName);
 /*  this.props.history.push({
     pathname: '/SearchAdmin',
     state: { detail: this.state.searchName }
   })  */ 

   this.getUserName();


}
getAllUser=()=>{
                    
  Axios.get('http://localhost:8080/getAllUser')
  .then((response) => {
    
    let fetchedUser = []; //array 

    for (let key in response.data.userList) {

      //console.log(response.data[key])

      fetchedUser.push({
        ...response.data.userList[key],
      
      })
      //concate two Object using 

    }
    this.setState({
      UserData: fetchedUser

    }) 

    console.log('response', this.state.UserData);

  }).catch((error)=>{
     
  })
}


  openUser(event) {
    event.preventDefault();
    this.props.history.push('/UpdateUser');
    this.props.history.push('/AddUser');
    this.props.history.push('/DeleteUser');
  }


  getUserName=(e)=>{
                    
    Axios.get('http://localhost:8080/getUserByName'+'?'+'name='+this.state.searchName)
    .then((response) => {
      
      let fetchedUser = []; //array 

      for (let key in response.data.userList) {

        //console.log(response.data[key])

        fetchedUser.push({
          ...response.data.userList[key],
        
        })
        //concate two Object using 

      }
      this.setState({
        UserData: fetchedUser

      }) 

      console.log('response', this.state.UserData);

    }).catch((error)=>{
       
    })
  }



    render() {
        return (
          <div className="head">
                <nav className="navbar navbar-expand-lg navbar-light bg-light">
        <Link className="navbar-brand" to="/AdminHomePage">Admin</Link>
        <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarSupportedContent">
          <ul className="navbar-nav mr-auto">
            <li className="nav-item active">
              <Link className="nav-link" to="/AdminHomePage">Home </Link>
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
            <div style={{marginRight: '200px'}} />
            <li className="nav-item">
              <form className=" form-inline" onSubmit={this.getUserName}>
                <input  value={this.state.searchName} onChange={(event)=>{this.setState({searchName:event.target.value})}} 
              value={this.state.searchName} className="form-control" type="search" placeholder="Search User" aria-label="Search" />
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

export default AdminHomePage
