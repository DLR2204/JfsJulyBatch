import {Component} from 'react'
import Movie from "./Movie";
import './movies.css'
import movieslist from './movieslist';
class Movies extends Component{


    state={...movieslist}

    getMovie=movie=>{
     return   <Movie picture={movie.picture} title={movie.title}/>
    }

    render(){
        return(<div><br/><br/><br/><div className='movies-section'>
        
            <div class='container-fluid' >
            <div class="row" id="hello">

                {this.getMovie(this.state.Martin)}    
        
                {this.getMovie(this.state.Vettaiyan)},

                {this.getMovie(this.state.Viswam)},

                {this.getMovie(this.state.Devara)}
       
         
       </div><br/><br/>
       <div class="row" className='movies-section'>

                {this.getMovie(this.state.Afraid)},

                {this.getMovie(this.state.Bachan)},

                {this.getMovie(this.state.Harold)},

                {this.getMovie(this.state.Hyderabad)}
 
        </div><br/><br/>

        <div class="row" className='movies-section'>

                {this.getMovie(this.state.Geetha)},

                {this.getMovie(this.state.Karthik)},

                {this.getMovie(this.state.Ripple)},

                {this.getMovie(this.state.Workshop)}
 
</div>
       
       
       </div></div></div>
        );

    }
}
export default Movies;