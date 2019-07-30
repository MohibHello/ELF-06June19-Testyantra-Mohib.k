
import React, { Component } from 'react'
import './App.css';
import TodoList from './component';
import TodoItems from './additems';
//import './todo.css';
import Header from './image-slider/header';
import Carouselimg from './image-slider/carousel';
import Footer from './image-slider/footer';

import './image-slider/img.css';

class App extends Component {

  inputElement = React.createRef()
  constructor() {
    super()
    this.state = {
      items: [],
      currentItem: { text: '', key: '' },
      color: 'yellow'
    }
  }
  handleInput = e => {
    const itemText = e.target.value
    const currentItem = { text: itemText, key: Date.now() }
    if(itemText.length>=0){
    this.setState({ currentItem,
    color : 'green' })
    console.log('hello input')
  }
  else{
    this.setState({ currentItem,
      color : 'yellow' })
  }
}

  addItem = e => {
    e.preventDefault();
    const newItem = this.state.currentItem
    if (newItem.text !== '') {
      console.log(newItem)
      const items = [...this.state.items, newItem]
      this.setState({
        items: items,
        currentItem: { text: '', key: '' },
      })
    }

    console.log("hello add item")
  }
  deleteItem = key => {
    const filteredItems = this.state.items.filter(item => {
      return item.key !== key
    })
    this.setState({
      items: filteredItems,
    })
    console.log("delete item");
  }



 /*  render() {
    return (<div className="App"><h1>TodoList</h1>

      <TodoList
        addItem={this.addItem}
        inputElement={this.inputElement}
        handleInput={this.handleInput}
        currentItem={this.state.currentItem}
        color={this.state.color} />

      <TodoItems entries={this.state.items} deleteItem={this.deleteItem} />   
    </div>
    )
  } */
   render() {
     return(<div>
    <Header />
    <Carouselimg />
    <Footer />
    </div>)

   }


}

export default App;
