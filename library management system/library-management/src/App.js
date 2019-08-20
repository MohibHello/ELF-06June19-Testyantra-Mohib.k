import React from 'react';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom'
import './App.css';
import Login from './components/login/Login';

function App() {
  return (
     <Router>
    <Route exact path='/' component={Login} /> 
    </Router>
  );
}

export default App;
