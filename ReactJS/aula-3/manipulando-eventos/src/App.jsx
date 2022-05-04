import React from "react";

const listCustomer = [
    {
        id: 1,
        name: 'Luciano Pereira',
        skills: ['Developer', "Architect", "Writer", "Photographer", 'investor']
    },
    {
        id: 2,
        name: 'Elon Musk',
        skills: ['researcher', 'manager', 'investor']
    },
    {
        id: 3,
        name: 'Jeff Bezos',
        skills: ['speaker', 'manager', 'investor']
    },
    {
        id: 4,
        name: 'Warren Buffett',
        skills: ['banker', 'business', 'investor']
    }
]

const App = () => {

    const handleClick = (e, id) => {
        console.log('deletar cliente')
        alert(`ID do cliente: ${id}`)
    }
    
   const renderCustomers = (customer, index) => {
        return (
            <div key={`customer-${customer.id}`}>
                <li>{customer.name} <button onClick={(e) => handleClick(e, customer.id)}>Delear Cliente X</button></li>
                {customer.skills.map(renderSkills)}
            </div>
        )
   }

   const renderSkills = (skill, index) => {
    return (
        <div style={{paddingLeft: '30px'}} key={`skill-${index}`}>
            <li>{skill}</li>
        </div>
    )
   }

    return (
        <div>
            <p>Digital Innovation One</p>
            <p>Welcome to our class !!!</p>
            <br />
            <div>
                <ul>
                    {listCustomer.map(renderCustomers)}
                </ul>
            </div>
        </div>
    );
};
export default App;