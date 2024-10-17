import { Component } from "react";

export class ParentToChild extends Component{
    state={name:'chandana',id:100}

    render(){
        return(
            <div>
                <Child name={this.state.name} id={this.state.id}/>

            </div>
        );
    }


}


class Child extends Component{
    render(){
        return(
            <div>
                <SubChild name={this.props.name} id={this.props.id}/>
            </div>
        );
    }
}


class SubChild extends Component{
    render(){
        return(<div>
                <h1> EmpName:-{this.props.name}</h1> 
                <h1>EmpId:-{this.props.id}</h1> 

        </div>);
    }
}