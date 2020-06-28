import React from "react";
import "./App.css";
import axios from "axios";

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            employees: [],
        };
    }

    componentDidMount() {
        axios.get("http://localhost:8080/api/v1/employees").then((res) => {
            this.setState({employees: res.data});
        });
    }

    render() {
        const employees = this.state.employees;
        return (
            < div
        className = "App" >
            < h1 > Hello < /h1>

            < h1 > {employees.map((res) => console.log(res.id))} < /h1>
            < /div>
    )
        ;
    }
}

export default App;
