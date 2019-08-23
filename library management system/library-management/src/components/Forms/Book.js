import React, { Component } from 'react'
import Axios from 'axios'

export class Book extends Component {

  constructor(props) {
    super(props)
    this.state = {
      bookId: '',
      bookTitle: '',
      bookAuthor: '',
      category: '',
      available: '',
      numberOfCopies: '',

    }
    this.postAddData = this.postAddData.bind(this);
  }
  logoutApp(event) {
    event.preventDefault();
    this.props.history.push('/'); // redirect to home page
  }

  postAddData(event) {
    event.preventDefault();
    let bookData = this.state;
    console.log("Book data", bookData);
    //Call the API using Axios and Validate
    Axios.post('http://localhost:/addBook', bookData).then((response) => {

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
                  <legend className="mx-auto " style={{ width: '200px', color: 'aliceblue' }}>Book Registration </legend>
                </h5>
                <div className="card-body">
                  <p className="card-text">
                  </p>
                  <form onSubmit={this.postAddData}>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Book ID</span>
                      </div>
                      <input type="text" className="form-control" id="bookId" name="bookId" onChange={(event) => { this.setState({ bookId: event.target.value }) }} value={this.state.bookId} placeholder=" Enter Book ID" aria-label="Book ID" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Book title</span>
                      </div>
                      <input id="bookTitle" name="bookTitle" onChange={(event) => { this.setState({ bookTitle: event.target.value }) }} value={this.state.bookTitle} type="text" className="form-control" placeholder=" Enter Book title" aria-label="book title" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Book Author</span>
                      </div>
                      <input id="bookAuthor" name="bookAuthor" onChange={(event) => { this.setState({ bookAuthor: event.target.value }) }} value={this.state.bookAuthor} type="text" className="form-control" placeholder=" Enter Book Author" aria-label="book Author" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">Category</span>
                      </div>
                      <input id="category" name="category" onChange={(event) => { this.setState({ category: event.target.value }) }} value={this.state.category} type="text" className="form-control" placeholder=" Enter Category" aria-label="Category" aria-describedby="basic-addon1" />
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <label className="input-group-text" htmlFor="inputGroupSelect01">Available</label>
                      </div>
                      <select className="custom-select" id="available" name="available" onChange={(event) => { this.setState({ available: event.target.value }) }} value={this.state.available} >
                        <option selected>Choose...</option>
                        <option value="true">Yes</option>
                        <option value="false">No</option>
                      </select>
                    </div>
                    <div className="input-group mb-3">
                      <div className="input-group-prepend">
                        <span className="input-group-text" id="basic-addon1">NumberOfCopies</span>
                      </div>
                      <input id="numberOfCopies" name="numberOfCopies" type="numberOfCopies" onChange={(event) => { this.setState({ numberOfCopies: event.target.value }) }} value={this.state.numberOfCopies} className="form-control" placeholder=" Enter NumberOfCopies" aria-label="NumberOfCopies" aria-describedby="basic-addon1" />
                    </div>
                    <div className=" mx-auto" style={{ width: '150px', marginBottom: '20px' }}>
                      <button type="reset" className="btn btn-outline-primary">Reset</button>
                      <button type="submit" className="btn btn-outline-success">Submit</button>
                    </div>
                    <p />
                  </form></div>

              </div>
            </div>
          </div>
        </div>
      </div>
    )
  }
}

export default Book
