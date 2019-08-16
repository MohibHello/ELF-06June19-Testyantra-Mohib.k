import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './App.css';
import Login from './components/login/Login';
import HomePage from './components/homePage/HomePage';
import createEmployee from './components/createAccount/createEmployee'

function App() {
  return (
    <Router>
    <Route exact path='/' component={Login} /> 
    <Route path='/createEmployee' component={createEmployee} /> 
    <Route path='/homePage' component={HomePage} /> 

    </Router>
  );
}

export default App;
