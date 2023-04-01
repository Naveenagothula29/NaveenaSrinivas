import React, { useState } from 'react';

functionNameList() {
const [names, setNames] = useState([]);
const [nameInput, setNameInput] = useState('');

consthandleNameSubmit = (e) => {
e.preventDefault();
setNames([...names, nameInput]);
setNameInput('');
  };

consthandleNameEdit = (index, newName) => {
constnewNames = [...names];
newNames[index] = newName;
setNames(newNames);
  };

consthandleNameDelete = (index) => {
constnewNames = [...names];
newNames.splice(index, 1);
setNames(newNames);
  };

return (
<div>
<form onSubmit={handleNameSubmit}>
<label htmlFor="name-input">Enter a name:</label>
<input
type="text"
id="name-input"
value={nameInput}
onChange={(e) =>setNameInput(e.target.value)}
        />
<button type="submit">Submit</button>
</form>
<ul>
        {names.map((name, index) => (
<li key={index}>
            {name}
<button onClick={() =>handleNameEdit(index, prompt('Enter a new name:'))}>Edit</button>
<button onClick={() =>handleNameDelete(index)}>Delete</button>
</li>
        ))}
</ul>
</div>
  );
}

export default  NameList



(calling child component in parent component)
import './App.css';
importNameList from './NameList';

function App(){

return(
<NameList/>

)



}


export default App;




