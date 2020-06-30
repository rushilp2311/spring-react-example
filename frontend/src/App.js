import React from "react";
import "./App.css";

class App extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      merchant: [],
    };
  }
  componentDidMount() {
    fetch("http://localhost:8080/api/merchant")
      .then(res => res.json())
      .then(res => {
        this.setState({ merchant: res });
      });
  }

  render() {
    return (
      <div className='App'>
          
        {this.state.merchant.map(res => (
        <ul>
          <li key={res.merchant_id}>{res.merchant_id}</li>
          <li>{res.merchant_name}</li>
          <li>{res.merchant_email}</li>
          </ul>
        ))}
      </div>
    );
  }
}

export default App;
