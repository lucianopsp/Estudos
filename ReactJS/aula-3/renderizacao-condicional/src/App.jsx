import React from "react";
import Button from "./Button"

const buttonA = <button>Histórico de clientes</button>
const buttonB = <button>Cadastrar cliente</button>

const hasCustomer = true

const App = () => {
    
    const renderShowHistory = (
        <div>
            Clique no botão abaixo para visualizar o histórico dos clientes
            <br />
            {buttonA}
        </div>    
    )
    
    const renderAddCustomer = (
        <div>
            Clique no botão abaixo para cadastrar o cliente
            <br />
            {buttonB}
        </div>
    )

    const showCustomer = () => {

        if (!hasCustomer) return null

        return (
            <div>
                <h1>Nome do Cliente: Luciano Pereira </h1>
            </div>
        )
    }

    return (
        <div>
            <p>Digital Innovation One</p>
            <p>Welcome to our class !!!</p>
            <br />
            {hasCustomer ? renderShowHistory() : renderAddCustomer()}
            <br />
            <div>
                {showCustomer()}
            </div>
        </div>

    // Exemplo condicional &&
    // <div>
    //     <p>Digital Innovation One</p>
    //     <p>Welcome to our class !!!</p>
    //     <br />
    //     {hasCustomer && (
    //         <div>
    //             Clique no botão abaixo para visualizar o histórico dos clientes
    //             <br />
    //             {buttonA}
    //         </div>
    //     )}
    // </div>
    );
};
export default App;