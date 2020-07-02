import React from "react";
import "./App.css";
import axios from "axios";

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
onSubmit(){
  
  let  merchant_id =2;
   let user_id = 1;
   
  
  let url = `http://localhost:8080/queue/${merchant_id}/${user_id}`; 
  axios.delete(url).then(response => {
    console.log("User Deleted");
  });
}
  render() {
    return (
      <div className='App'>
          
        {/* {this.state.merchant.map(res => (
        <ul>
          <li key={res.merchant_id}>{res.merchant_id}</li>
          <li>{res.merchant_name}</li>
          <li>{res.merchant_email}</li>
          </ul>
        ))} */}
        <button onClick={this.onSubmit}>Delete User</button>
      </div>
    );
  }
}

export default App;
