import { Component } from "react";


class State extends Component{
    state={title:'Submit'}

    render(){

        return(<div>

            <button type="button">{this.state.title}</button>


        </div>);
    }
}

export default State;