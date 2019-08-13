import React, { Component } from 'react'
import Axios from 'axios';

export class CreateAccount extends Component {

    constructor(props) {
        super(props)
        this.state ={
            name : '',
            email : '',
            phoneno : '',
            password : '',
            

        }
        this.postData = this.postData.bind(this);
    }
postData(event) {
event.preventDefault();
console.log('Post Date',this.state);
let accountData = this.state;
Axios.post('https://emp-web-9a0cd.firebaseio.com/accounts.json',accountData).then((response)=>{
  console.log('Response object',response);
  this.setState({
    name : '',
    email : '',
    phoneno : '',
    password : '',

})
}).catch((error)=>{
  console.log('error',error);
})
}

//form validation
handleChange = () => {
  event.preventDefault();
  const { name, value } = event.target;
  let errors = this.state.errors;

  switch (name) {
    case 'name': 
      errors.name = 
        value.length < 5
          ? ' Name must be 5 characters long!'
          : '';
      break;
    case 'email': 
      errors.email = 
        value.length<10
          ? ''
          : 'Email is not valid!';
      break;
    case 'password': 
      errors.password = 
        value.length < 8
          ? 'Password must be 8 characters long!'
          : '';
      break;
      case 'phoneno': 
      errors.password = 
        value.length < 10
          ? 'Password must be 8 characters long!'
          : '';
      break;
    default:
      break;
  }

  this.setState({errors, [name]: value}, ()=> {
      console.log(errors)
  })
}





    render() {
        return (
            
<form onSubmit={this.handleChange()}>   //change postData
  <div className="row">
    <div className="col">
      <input type="text" name="name"  value={this.state.name}  onChange={(event)=>{this.setState({name:event.target.value})}}  className="form-control" placeholder="Name"/>
    </div>
    <div className="col">
      <input type="text" name="email" value={this.state.email}  onChange={(event)=>{this.setState({email:event.target.value})}}  className="form-control" placeholder="Email"/>
  </div>
  </div>
  <div className="row">
    <div className="col">
      <input type="text" name="phoneno" className="form-control"  onChange={(event)=>{this.setState({phoneno:event.target.value})}}  value={this.state.phoneno} placeholder="Phone Number"/>
    </div>
    <div className="col">
      <input type="password" name="password" className="form-control"  onChange={(event)=>{this.setState({password:event.target.value})}}  value={this.state.password} placeholder="Password"/>
    </div>
  </div>
  <div>
      <button type="submit"> Create Employee</button>
  </div>
</form>
            
        )
    }
}

export default CreateAccount
