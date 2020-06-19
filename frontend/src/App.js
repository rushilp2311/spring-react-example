import React from "react";
import "./App.css";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      employees: [],
    };
  }

  componentDidMount() {
    fetch("/api/v1/employees")
      .then((response) => response.text())
      .then((employees) => {
        this.setState({ employees: employees });
      });
  }
  render() {
    return <div className="App">{this.state.employees}</div>;
  }
}
export default App;
