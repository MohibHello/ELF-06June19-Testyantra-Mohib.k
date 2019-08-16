import React, { Component } from 'react'

export class Submit extends Component {
    render() {
        return (
            <div><center> 
                 <div className="form-group">
								<label className="control-label col-sm-4"></label>
								<div className="text-center col-sm-4">
									<div id="resetGroup" className="btn-group" role="group"
										aria-label="">
										<button type="reset" class="btn btn-outline-warning">reset</button>
									<button type="submit" class="btn btn-outline-primary">submit</button>
									</div>

								</div>
							</div>
							</center>
            </div>
        )
    }
}

export default Submit
