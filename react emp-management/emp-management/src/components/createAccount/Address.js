import React, { Component } from 'react'

export class Address extends Component {
    render() {
        return (
            <div >
                <div className="card-header" id="headingEight">
          <legend className="h3" style={{textAlign: 'center'}}>AddressInfo
                  Details</legend>
          </div>
              <div>
                <div>
                  <div className="row">
                    <div className="col-md-4">
                      <label htmlFor="city">City</label> <input type="text" className="form-control" name="addressInfoBeanList[0].city" placeholder="enter City" />
                    </div>
                  </div>
                  <br />
                  <div className="row">
                    <div className="col-md-4 col-md-offset-2">
                      <label htmlFor="addressType">adress Type</label> <select name="addressInfoBeanList[0].addressPKBean.addressType" className="form-control">
                        <option selected>--select one--</option>
                        <option value="temporary">temporary</option>
                        <option value="permanent">permanent</option>
                      </select>
                    </div>
                    <div className="col-md-4">
                      <label htmlFor="State">State</label> <input type="text" className="form-control" name="addressInfoBeanList[0].State" placeholder="Enter State" />
                    </div>
                  </div>
                  <br />
                  <div className="row">
                    <div className="col-md-4 col-md-offset-2">
                      <label htmlFor="addr1">Address1</label> <input type="text" className="form-control" name="addressInfoBeanList[0].address1" placeholder="Enter Address 1" />
                    </div>
                    <div className="col-md-4">
                      <label htmlFor="country">Country</label> <input type="text" className="form-control" name="addressInfoBeanList[0].country" placeholder="Enter Country" />
                    </div>
                  </div>
                  <br />
                  <div className="row">
                    <div className="col-md-4 col-md-offset-2">
                      <label htmlFor="address2">Address 2</label> <input type="text" className="form-control" name="addressInfoBeanList[0].address2" placeholder="Enter Address 2" />
                    </div>
                    <div className="col-md-4">
                      <label htmlFor="pincode">Pincode</label> <input type="number" className="form-control" name="addressInfoBeanList[0].pincode" placeholder="Enter Pincode" />
                    </div>
                  </div>
                  <br />
                  <div className="row">
                    <div className="col-md-4 col-md-offset-2">
                      <div>
                        <label htmlFor="landmark">Landmark</label>
                      </div>
                      <div>
                        <input type="text" className="form-control" name="addressInfoBeanList[0].landmark" placeholder="Enter landmark" />
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
        )
    }
}

export default Address
