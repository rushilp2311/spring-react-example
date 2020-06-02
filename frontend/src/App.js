import React from "react";
import "./App.css";

class App extends React.Component {
  state = {
    employees: [],
  };
  componentDidMount() {
    fetch("/api/v1/employees")
      .then((response) => response.text())
      .then((employees) => {
        this.setState({ employees: employees });
      });
  }
  render() {
    return (
      <div className="App">
        <h1>Hello</h1>
    <h2>{this.state.employees}</h2>
      </div>
    );
  }
}

export default App;
