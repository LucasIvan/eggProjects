import { useState, useEffect } from 'react';
import Servicio from './servicio';
import './App.css'

function App() {
  const [data, setData] = useState(null);
  const [error, setError] = useState(null);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await Servicio();
        setData(response);
      } catch (e) {
        setError(e);
      }
    };

    fetchData();
  }, []);

  if (error) {
    return <div>Error: {error.message}</div>;
  }

  if (!data) {
    return <div>Cargando...</div>;
  }

  return (
    <>
      <ul style={{ listStyleType: "none" }}>
        {data.results.map((character) => (
          <li key={character.id}>{character.name}</li>
        ))}
      </ul>
    </>
  )
}

export default App
