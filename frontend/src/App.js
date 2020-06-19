import React from "react";
import "./App.css";
const client = require("./client");

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = { employees: [] };
  }
  componentDidMount() {
    client({ method: "GET", path: "/api/employees" }).done((response) => {
      this.setState({ employees: response.entity.employees });
    });
  }

  render() {
    return (
      <div className="App">
        <h1>{this.state.employees}</h1>
      </div>
    );
  }
}

export default App;
