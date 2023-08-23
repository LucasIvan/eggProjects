import { useState } from 'react'
import './App.css'

function App() {
  const [contador, setContador] = useState(0);

  const clickHandle = () => {
    setContador(contador +1);
  };

  return (
    <>
      <div style={{display: "flex", flexDirection: "column", fontSize: 30}}>
        <button type='button' style={{background: "coral"}} onClick={clickHandle}>CLICK</button>
        <span style={{fontSize: 45, fontWeight: "bold"}}>{contador}</span>
      </div>
    </>
  )
}

export default App
