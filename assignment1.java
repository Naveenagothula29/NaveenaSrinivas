import React, { useState } from 'react';

functionInputField() {
const [value, setValue] = useState('');

consthandleChange = event => {
setValue(event.target.value);
  };

return (
<div>
<input type="text" value={value} onChange={handleChange} />
<p>{value}</p>
</div>
  );
}

export default InputField;



