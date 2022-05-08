import {useState} from 'react';

function SmartCounter(){
    const [quantity, changeQauntity] = useState(1);

    return(
        <>
            <h1>{quantity}</h1>
            <button onClick={()=> changeQauntity(quantity + 1)}>Aumentar</button>
            <br />
            <button onClick={()=> changeQauntity(quantity - 1)}>Diminuir</button>
        </>
    )
}

export default SmartCounter;