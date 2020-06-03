import React from "react";
import Employee from "./Employee";
class EmployeeList extends React.Component {
  render() {
    var employees = <div>Loading</div>;
    if (this.props.employees.length > 0) {
      employees = this.props.employees.map((employee) => (
        <Employee  employee={employee} />
      ));
    }
    return (
      <table>
        <tbody>
          <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Description</th>
          </tr>
          {employees}
        </tbody>
      </table>
    );
  }
}
export default EmployeeList;
