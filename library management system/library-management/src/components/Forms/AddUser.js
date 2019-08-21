import React, { Component } from 'react'
import './AddUser.css'

export class AddUser extends Component {

  constructor(props){
    super(props)
    this.state={
        userId : '',
        userType : '',
        userName : '',
        password : '',
        phoneNum : '',
        email : '',
        
    }
    this.postAddData = this.postAddData.bind(this);
}
openUser(event){
    this.props.history.push('/Navbar');
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
        console.log("Account data",accountData);
            //Call the API using Axios and Validate the Employee Login
            Axios.post('http://localhost:/addUser',accountData).then((response)=>{

                console.log(response.data);
                console.log(response.data.statusCode)
                this.props.history.push('/Navbar');
                
            }).catch((error)=>{
                console.log('Error',error);
            });
        }

    render() {
        return (
            <div className="top">
            <div className="container" style={{marginLeft: '500px'}}>
              <div className="row">
                <div className="col-md-6">
                  <div className="card">
                    <h5 className="card-header ">
                      <legend className="mx-auto " style={{width: '200px', color: 'aliceblue'}}>User Registration </legend>
                    </h5>
                    <div className="card-body">
                      <p className="card-text">
                      </p><form>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">ID</span>
                          </div>
                          <input type="text" className="form-control" placeholder=" Enter ID" aria-label="ID" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Name</span>
                          </div>
                          <input type="text" className="form-control" placeholder=" Enter Username" aria-label="Username" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Password</span>
                          </div>
                          <input type="password" className="form-control" placeholder=" Enter Password" aria-label="Password" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">address</span>
                          </div>
                          <input type="text" className="form-control" placeholder=" Enter address" aria-label="address" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Phone Number</span>
                          </div>
                          <input type="number" className="form-control" placeholder=" Enter Phone number" aria-label="phone number" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">email</span>
                          </div>
                          <input type="text" className="form-control" placeholder=" Enter Email" aria-label="email" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
                          <div className="input-group-prepend">
                            <span className="input-group-text" id="basic-addon1">Card Validity</span>
                          </div>
                          <input type="text" className="form-control" placeholder=" Enter Validity" aria-label="Card Validity" aria-describedby="basic-addon1" />
                        </div>
                        <div className="input-group mb-3">
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
                        <p />
                      </form></div>
                    <div className=" mx-auto" style={{width: '150px', marginBottom: '20px'}}>
                      <button type="reset" className="btn btn-outline-primary">Reset</button>
                      <button type="submit" className="btn btn-outline-success">Submit</button>
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
