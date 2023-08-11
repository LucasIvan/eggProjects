import './App.css';
import { Routes, Route } from "react-router-dom";
import Footer from './components/public/Footer';
import Navbar from './components/public/Navbar';
import Main from './components/public/Main';
import Details from './components/public/Details';
import UserForm from './components/public/UserForm';

function App() {
  return (
    <div>
      <Navbar />
      <Routes>
        <Route exact path={"/"} element={<Main />} />
        <Route path={"/details/:id"} element={<Details />} />
        <Route path={"/user-form"} element={<UserForm />} />
      </Routes>
      <Footer />
    </div>
  );
}

export default App;
