import React, { Component } from 'react'

class Header extends Component {

render(){
        return (
             <header id="header" class="header">
            <div class="header-menu">
                <div class="col-sm-7">
                    <a id="menuToggle" class="menutoggle pull-left"><i class="fa fa fa-tasks"></i></a>
                    <div class="header-left">
                        <div class="form-inline">
                            <h3>Welcome</h3>
                            <form class="search-form">
                            <button class="search-close" type="button"> <i class="fa fa-close"></i> Signup</button>
                                <button class="search-close" type="button"><i class="fa fa-close">Login</i></button>
                            </form>
                        </div>
                    </div>
                 </div>
            </div>
        </header>

        )
        }
 
}
export default Header