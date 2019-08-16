import React, { Component } from 'react'
import Address from './Address';
import Education from './Education'
import Experience from './Experience'
import Info from './Info'
import OtherInfo from './OtherInfo'
import Training from './Training'
import Submit from './Submit';

export class createEmployee extends Component {
    render() {
        return (
            <div>
                    <form action="./createEmployee" method="post">
              <Info />
              <br/>
              <OtherInfo />
              <br/>
              <Address />
              <br/>
              <Address />
              <br/>
              <Education />
              <br/>
              <Education />
              <br/>
              <Experience />
              <br/>
              <Experience />
                <br/>
            <Training />
            <Submit />
              </form>

            </div>
        )
    }
}

export default createEmployee
