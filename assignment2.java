Index.js
import { BrowserRouter} from 'react-router-dom';
<BrowserRouter>
<App />
</ BrowserRouter>


App.js
import './App.css';
import { Route, Routes } from 'react-router-dom';
import Home from './Home';
import About from './about';
importNavbar from './navbar';

function App(){

return(
<main>
<Routes>
<Route path = "/" Component={Home}/>
<Route path = "/about" Component={About}/>

</Routes>
<Navbar/>

</main>

  )

}

export default App;
Home.js
import React from "react";

function Home(){
return(<h1>This is home page</h1> )

}

export default Home;

ADD ANY ONE COMPONENT ALSO


Navbar.js

functionNavbar(){

return(
<div>
<div>
<Link to="/" >Home</Link>
</div>
<br></br>
<div>
<Link to="/about">About</Link>
</div>

</div>


)

}
export default Navbar


