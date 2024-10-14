import { Component } from "react";

class Calculator extends Component{
    state={a:100,b:25}

    render(){
        return(<div>    
          

            Add:-{this.state.a+this.state.b}<br/><br/>
            Sub:-{this.state.a-this.state.b}<br/><br/>
            Mul:-{this.state.a*this.state.b}<br/><br/>
            Div:-{this.state.a/this.state.b}<br/><br/>


        </div>);
    }
}
export default Calculator;