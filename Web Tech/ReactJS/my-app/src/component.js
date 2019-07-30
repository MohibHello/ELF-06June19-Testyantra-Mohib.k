import React, { Component } from 'react'
import Button from '../node_modules/react-bootstrap/Button'


class TodoList extends Component {
    componentDidUpdate() {
        this.props.inputElement.current.focus()
    }

    render() {
        return (
            <div className="todoListMain">
                <div className="header">
                    <form onSubmit={this.props.addItem}>
                        <input placeholder="Task"
                            style={{backgroundColor:this.props.color}}
                            ref={this.props.inputElement}
                            value={this.props.currentItem.text}
                            onChange={this.props.handleInput}

                        />
                        
                        <Button type="submit" variant="outline-light">Light</Button>
                       
                          
                    </form>
                </div>
            </div>
        )
    }
}
export default TodoList