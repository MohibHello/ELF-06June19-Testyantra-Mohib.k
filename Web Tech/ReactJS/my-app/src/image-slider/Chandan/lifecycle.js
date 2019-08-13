class LifeCycle extends React.Component {

    constructor(props) {
        console.log("constructor")
        super(props)
        this.state = {
            name: 'katrina',
            checked:true
        }
        
    }
    static getDerivedStateFromProps() {
        console.log('GetDerivedStateFromProps Lifecycle');
        //return {name:'salman'};
        return null; //state will remain same
    }
    render() {
        console.log('Render Lifecycle');
            if(this.state.checked){
              return (  <div>
                <h1> {this.state.name}</h1>
                <button onClick={this.changeName.bind(this)}>Change name</button>
            </div>)
            }
            return <h1>checked is false</h1>
    }
    componentDidMount() {
        console.log('Component Did Mount LifeCycle');
    }
    shouldComponentUpdate() {
        console.log('Should Component Update LifeCycle');
        return true;
    }
    getSnapshotBeforeUpdate() {
        console.log('snapshot Before update LifeCycle');
        return 'snapshotData';
    }
    componentDidUpdate(props, state, snapshot) {
        console.log('component Updated LifeCycle');
        console.log('snapshot', snapshot);
    }
    changeName() {
        this.setState({
            name: 'dinga'
        })
    }
}
class Child extends React.Component {

    constructor(props) {
        console.log("constructor")
        super(props)
        this.state = {
            name: 'katrina',
            checked:true
        }
        
    }
    static getDerivedStateFromProps() {
        console.log('GetDerivedStateFromProps Child');
        //return {name:'salman'};
        return null; //state will remain same
    }
    render() {
        console.log('Render Child');
            if(this.state.checked){
              return ( <div>
                <h1> {this.state.name}</h1>
                <button onClick={this.changeName.bind(this)}>Change name</button>
               </div> )
            }
            return <h1>checked is false</h1>
    }
    componentDidMount() {
        console.log('Component Did Mount Child');
    }
    shouldComponentUpdate() {
        console.log('Should Component Update Child');
        return true;
    }
    getSnapshotBeforeUpdate() {
        console.log('snapshot Before update Child');
        return 'snapshotData';
    }
    componentDidUpdate(props, state, snapshot) {
        console.log('component Updated Child');
        console.log('snapshot', snapshot);
    }
    changeName() {
        this.setState({
            name: 'dinga'
        })
    }
}
ReactDOM.render(<div><LifeCycle /><Child name="child"/></div>, document.getElementById('app'));



