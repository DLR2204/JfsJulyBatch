import { Component } from "react";


export class ChildToParent extends Component{

    state={}

    getData=(name,id,sal,add)=>{
        this.setState({
            name:name,
            id:id,
            sal:sal,
            add:add
        })
    }

    render(){
        return(<div>
            
                <h1>EmpName:-{this.state.name}</h1>

                <h1>EmpId:-{this.state.id}</h1>

                <h1>EmpSal:-{this.state.sal}</h1>

                <h1>EmpAdd:-{this.state.add}</h1>

                <Child1 onChange={this.getData}/>

        </div>);
    }
}

class Child1 extends Component{

    state={name:'react',id:10,sal:234234,add:'hyderabad'}

    sendData=()=>{
        this.props.onChange(this.state.name,this.state.id,this.state.sal,this.state.add)
    }

    render(){
        return(<div >

            <button type="button" onClick={this.sendData}>SendData</button>
            
        </div>);
    }
}