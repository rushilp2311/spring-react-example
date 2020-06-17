import React from "react";
import "./App.css";
import EmployeeList from "./EmployeeList";
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
        this.setState({ employees: [employees] })
      });
  }
  render() {
    const employees = this.state;
    return (
      <div className="App">
        <h1>{employees.map(employees => (

        )}</h1>
        <EmployeeList employees={e} />
      </div>
    );
  }
}

export default App;
