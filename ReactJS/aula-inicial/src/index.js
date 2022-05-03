import React, { Component } from "react";
import ReactDOM from "react-dom";
import "./index.css"

class App extends Component {
  constructor(props) {
    super(props)

    this.state = {
      soma: 0
    }
  }

  calcular = () => {
    let a = parseInt(document.querySelector(".input1").value)
    let b = parseInt( document.querySelector(".input2").value)

    this.setState(
      {
        soma: a + b
      } 
    )
  }

  render () {
    const {soma} = this.state

    return(
      <div>
      <h1>Soma de dois valores {soma}</h1>
      <input className={"input1"} type="number"></input>
      <input className={"input2"} type="number"></input>
      <button onClick={() => this.calcular()}>Calcular</button>
    </div>
    )
  }
}

const rootElement = document.getElementById("root")
ReactDOM.render(<App />, rootElement)
