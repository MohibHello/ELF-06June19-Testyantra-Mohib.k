import React, { Component } from 'react'
import './Book.css'
import Axios from 'axios'

export class DeleteBook extends Component {

  constructor(props) {
    super(props)
    this.state = {
      bookId: '',

    }
    this.postDeleteData = this.postDeleteData.bind(this);
  }
  openUser(event) {

    this.props.history.push('/LibrarianHomePage');
    this.props.history.push('/Book');
    this.props.history.push('/DeleteBook');
  }

  logoutApp(event) {
    event.preventDefault();
    this.props.history.push('/'); // redirect to home page
  }

  postDeleteData(event) {
    event.preventDefault();
    let account = this.state;
    console.log(account.userId);
    Axios.delete('http://localhost/deleteBook?bookId=' + account.bookId).then((response) => {
      console.log(response.data);
      console.log(response.data.statusCode)
      this.props.history.push('/LibrarianHomePage');

    }).catch((error) => {
      console.log('Error', error);
    });
  }




  render() {
    return (
      <div className="top">
        <div className="container" style={{ marginLeft: '500px' }}>
          <div className="row">
            <div className="col-md-6">
              <div className="card">
                <h5 className="card-header ">
                  <legend className="mx-auto " style={{ width: '200px', color: 'aliceblue' }}>User Removal </legend>
                </h5>
                <form onSubmit={this.postDeleteData}>
                  <div className="card-body">
                    <p className="card-text">
                    </p><div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Book ID</span>
                      </div>
                      <input type="text" className="form-control" id="bookId" name="bookId" onChange={(event) => { this.setState({ bookId: event.target.value }) }} value={this.state.bookId} placeholder=" Enter Book ID" aria-label="Book ID" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">User ID</span>
                      </div>
                      <input type="text" id="userId" name="userId" className="form-control" placeholder=" Enter User ID" aria-label="User ID" aria-describedby="basic-addon1" />
                    </div>
                    <p />
                  </div>
                  <div className=" mx-auto" style={{ width: '150px', marginBottom: '20px' }}>
                    <button type="reset" className="btn btn-outline-primary">Reset</button>
                    <button type="submit" className="btn btn-outline-success">Submit</button>
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

export default DeleteBook
