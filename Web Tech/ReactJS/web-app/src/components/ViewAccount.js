import React, { Component } from 'react'
import Axios from 'axios'
import { Modal, Button } from 'react-bootstrap'

export class ViewAccount extends Component {

  constructor(props) {
    super(props)
    this.state = {
      accounts: [],
      show: false,
      name: '',
      email: '',
      phoneno: '',
      password: ''
    }
  }
  componentDidMount() {
    Axios.get('https://emp-web-9a0cd.firebaseio.com/accounts.json').then((response) => {
      console.log('Response Data', response.data);
      let fetchedAccounts = [];
      for (let key in response.data) {
        fetchedAccounts.push({
          ...response.data[key],
          id: key
        })
      }
      this.setState({
        accounts: fetchedAccounts
      })
      console.log('fetched Accounts', fetchedAccounts);
    }).catch(error => {
      console.log('error', error);
    })
  }
  deleteAccount(account) {
    Axios.delete('https://emp-web-9a0cd.firebaseio.com/accounts/' + account.id + '/.json').then((response) => {
      alert('deleted successfully')

      let allAccounts = this.state.accounts;
      let index = allAccounts.indexOf(account);
      let newAccounts = allAccounts.splice(index, 1);
      console.log('new Account', newAccounts);
      console.log('neew account', allAccounts)
      this.setState(
        account = allAccounts
      )

    })
      .catch((error => {
        alert('Deletion failed')
      }))
  }
  editAccount(account) {
    this.setState({
      name: account.name,
      email: account.email,
      phoneno: account.phoneno,
      password: account.password,
      show: !this.state.show,
      id:account.id
    })
  }
  handleClose() {
    this.setState({
      show: !this.state.show
    })
  }
  putData() {

  }
  updateaccountData() {
    const {id,name,email,password,phoneno} =this.state;
    const account ={name,email,password,phoneno};
    console.log('Account data',account);
  Axios.put('https://emp-web-9a0cd.firebaseio.com/accounts/' + id + '/.json',account).then((response)=>{
    console.log('updated Successfully');
    this.handleClose();
  })
  .catch((error)=>{
console.log('error',error)
  })
  }

  render() {
    return (
      <div>
        <table class="table">
          <thead>
            <tr>
              <th scope="col">Name</th>
              <th scope="col">Email</th>
              <th scope="col">PhoneNo</th>
              <th scope="col">Password</th>
            </tr>
          </thead>
          <tbody>
            {
              this.state.accounts.map((account) => {
                return <tr key={account.id}>
                  <td>{account.name}</td>
                  <td>{account.email}</td>
                  <td>{account.phoneno}</td>
                  <td>{account.password}</td>
                  <td>
                    <button className='btn btn-danger' onClick={this.deleteAccount.bind(this, account)}>Delete</button>
                    <button className='btn btn-info' onClick={this.editAccount.bind(this, account)}>Edit</button>
                  </td>
                </tr>
              })
            }
          </tbody>
        </table>
        <div>

          <Modal show={this.state.show} onHide={this.handleClose.bind(this)}>
            <Modal.Header closeButton>
              <Modal.Title>Modal heading</Modal.Title>
            </Modal.Header>
            <Modal.Body><div className="row">
              <div className="col">
                <input type="text" value={this.state.name} onChange={(event) => { this.setState({ name: event.target.value }) }} className="form-control" placeholder="Name" />
              </div>
              <div className="col">
                <input type="text" value={this.state.email} onChange={(event) => { this.setState({ email: event.target.value }) }} className="form-control" placeholder="Email" />
              </div>
            </div>
              <div className="row">
                <div className="col">
                  <input type="text" className="form-control" onChange={(event) => { this.setState({ phoneno: event.target.value }) }} value={this.state.phoneno} placeholder="Phone Number" />
                </div>
                <div className="col">
                  <input type="password" className="form-control" onChange={(event) => { this.setState({ password: event.target.value }) }} value={this.state.password} placeholder="Password" />
                </div>
              </div></Modal.Body>
            <Modal.Footer>
              <Button variant="secondary" onClick={this.handleClose.bind(this)}>
                Close
          </Button>
              <Button variant="primary" onClick={this.updateaccountData.bind(this)}>
                Save Changes
          </Button>
            </Modal.Footer>
          </Modal>
        </div>
      </div>
    )
  }
}

export default ViewAccount
