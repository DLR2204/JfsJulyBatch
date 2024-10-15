import { Component } from "react";

class Calculator extends Component{
    state={a:100,b:25}

    render(){
        return(<div>  <br/><br/>  
          
          <input type="text" onChange={e=>{this.setState({a:parseInt(e.target.value)})}}/>
          
          <input type="text" onChange={e=>{this.setState({b:parseInt(e.target.value)})}}/>
          <br/><br/>  <br/><br/>  
<h1>
            Add:-{this.state.a+this.state.b}<br/><br/>
            Sub:-{this.state.a-this.state.b}<br/><br/>
            Mul:-{this.state.a*this.state.b}<br/><br/>
            Div:-{this.state.a/this.state.b}<br/><br/>
            </h1>


        </div>);
    }
}
export default Calculator;