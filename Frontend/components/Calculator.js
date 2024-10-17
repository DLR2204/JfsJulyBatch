import { Component } from "react";

class Calculator extends Component{

    state={a:100,b:25,showResult:false}
    

    setA=e=>{
        this.setState({

            a:parseInt(e.target.value),
           showResult:false
        })
    }

    setB=e=>{
        this.setState({
            
            b:parseInt(e.target.value),
            showResult:false
        })
    
    }

    setShowResult=e=>{
        this.setState(prevState=>{
            return {showResult:!prevState.showResult}
        })
    }

    render(){
        return(
        
        <div>  
            
            <br/><br/>  
          
          <input type="text" onChange={this.setA}/>
          
          <input type="text" onChange={this.setB}/>


          <button type="button" onClick={this.setShowResult}>Result</button>


          <br/><br/>  <br/><br/>  
          {this.state.showResult?(
          
          <div>
<h1>
            Add:-{this.state.a+this.state.b}<br/><br/>
            Sub:-{this.state.a-this.state.b}<br/><br/>
            Mul:-{this.state.a*this.state.b}<br/><br/>
            Div:-{this.state.a/this.state.b}<br/><br/>
            </h1>
            </div>):(
                <div>

                Please check the result.......

                </div>
            )}

        </div>);
    }
}
export default Calculator;