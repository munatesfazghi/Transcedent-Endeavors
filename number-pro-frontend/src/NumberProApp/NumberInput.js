import React, { useState } from 'react';
import axios from 'axios';

function NumberInput() {
  const [number, setNumber] = useState('');
  const [result, setResult] = useState('');

  const handleInputChange = (e) => {
    setNumber(e.target.value);
  };

  const handleSubmit = () => {
    axios
      .post('http://localhost:8081/api/v1/numbers', { originalNumber: number })
      .then((response) => {
        setResult(response.data.squaredResult);
      })
      .catch((error) => {
        console.error('Error:', error);
      });
  };

  return (
    <div>
      <input
        type="number"
        placeholder="Enter a number"
        value={number}
        onChange={handleInputChange}
      />
      <button onClick={handleSubmit}>Calculate</button>
      {result && <div>Result: {result}</div>}
    </div>
  );
}

export default NumberInput;
