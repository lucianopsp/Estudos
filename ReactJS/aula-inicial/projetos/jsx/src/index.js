import React from "react";
import ReactDOM from "react-dom";
import "./index.css"

function sum(a, b) {
  return a + b;
}

function primeiroJSN() {
  return (
    <div className="test"> Luciano Pereira - Introdução ao ReactJS
      <h1>Soma: {sum(20, 13)}</h1>
    </div>
  )
}

const App = () => {
  return (
    <div className='App'>
      {primeiroJSN()}
    </div>
  )
}

const rootElement = document.getElementById("root")
ReactDOM.render(<App />, rootElement)
