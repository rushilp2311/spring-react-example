import React, { Component } from "react";
import axios from "axios";
var count = 0;
class Merchant extends Component {
  
  constructor(props) {
    super(props);
  }
  getMerchatWaitList(merchant_id) {
    
    axios
      .get("http://localhost:8081/merchant/count/" + merchant_id)
      .then(response => {
        count = response.data;
        return count;
      });
  }
  

render() {
  
    return (
      <div>
        <h2>Here is the List of Available Merchant</h2>
        <table className='table'>
          <thead className='thead-dark'>
            <tr>
              <th scope='col'>Id</th>
              <th scope='col'>Merchant</th>
              <th scope='col'>Waiting</th>
              <th scope='col'>Action</th>
            </tr>
          </thead>
          <tbody>
            {this.props.merchantList.map(res => (
              <tr>
                <th scope='row'>{res.merchant_id}</th>
                <td>{res.merchant_name}</td>
                {this.getMerchatWaitList(res.merchant_id)}
                <td>{count}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}
export default Merchant;
