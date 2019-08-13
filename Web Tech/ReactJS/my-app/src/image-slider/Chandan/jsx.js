//const element=<h1>This is JSX</h1>
/* const name ='ak';
const element = <h1>{name}</h1> */

function Welcome(props) {
    // return (<h1>{props.name}</h1>)
    return (
        <div>
            <h1 style={{ color: 'red' }}>{props.name}</h1>
            <button onClick={alert.bind(this, 'Button')}>Click</button>

        </div>
    )
}

//ReactDOM.render(element,document.getElementById('app'));

class Message extends React.Component {
    constructor(props) {
        super(props)
        //  this.state = {name='akshay'}
        this.state = { name: 'Akshay Kumar' }  //bind or error
        //   this.changeMessage = this.changeMessage.bind(this);
        //   this.clicklink = this.clicklink.bind(this);
    }

    /*   changeMessage() {
          console.log("change message Method")
          this.state.name="alia bhatt";
          this.setState({
              name:'Alia Bhatt' })//use setState to change state
         
      } */

    changeMessage = (e) => {
        console.log("change message Method")
        this.state.name = "alia bhatt";
        this.setState({
            name: 'Alia Bhatt'
        })//use setState to change state
    }



    render() {
        console.log("rendering")
        return (
            <div>
                <h1>{this.state.name}</h1>
                <button onClick={this.changeMessage}>Change Mesage</button>
                <a href="https://www.google.com" onClick={this.clicklink}>link</a>
            </div>
        )
    }
    /* clicklink(event){
        event.preventDefault();
    } */
node 
    //Arrow function for clicklink (no need to bind in constructor)
    clicklink = (e) => {
        event.preventDefault();
    }


}

ReactDOM.render(<Message />, document.getElementById('app'));
//ReactDOM.render(<Welcome name="hello"/>,document.getElementById('app'));
//ReactDOM.render(<Welcome name="Akshay"/>,document.getElementById('app'));