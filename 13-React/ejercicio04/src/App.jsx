import './App.css'
import Main1 from './Views/Main1';
import Main2 from './Views/Main2';
import Footer from './components/Footer'
import Navbar from './components/Navbar'
import { BrowserRouter, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <>
      <BrowserRouter>
        <Navbar />
        <Routes>
          <Route exact path={"/"} element={<Main1 />} />
          <Route path={"/main2"} element={<Main2 />} />
        </Routes>
        <Footer />
      </BrowserRouter>
    </>
  )
}

export default App
