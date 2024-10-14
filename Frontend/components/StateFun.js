import { useState } from "react";


function StateFun(){

    const title = useState('reset')


    return(<div>

        <button type="button">{title}</button>
    </div>);


        }

export default StateFun;