import React from "react";

class Employee extends React.Component {
  render() {
    return (
    <h1>{this.props.children}</h1>
    );
  }
}
export default Employee;
