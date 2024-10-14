import './movie.css'

function Moive(props){

    return(
<div className="movie-card">
        <img src={props.picture}/>
        <center><label><b>{props.title}</b></label></center>


</div>

    );
}

export default Moive;