import React from 'react'
import { Link, useParams, useLocation } from 'react-router-dom'
import { useEffect, useState } from 'react';
import RickAndMortyService from '../../services/RickAndMorty.service';

const Details = () => {
  const [personaje, setPresonaje] = useState({});
  const { id } = useParams();
  const { pathname } = useLocation();

  useEffect(() => {
    RickAndMortyService.getCharacter(id)
      .then((data) => setPresonaje(data))
  }, [])

  return (
    <div className="container card mb-3" style={{ 'background': 'gainsboro' }}>
      <div className="row g-0 mt-4 mb-4">
        <div className="col-md-3">
          <img src={personaje.image} className="img-fluid rounded-start imgDetalle" alt="img del personaje" />
        </div>
        <div className="col-md-8 detallePersonaje">
          <div className="card-body">
            <h5 className="card-title">{personaje.name}</h5>
            <p className="card-text"><small className=""> Specie: {personaje.species}</small></p>
            <p className="card-text"><small className=""> Status: {personaje.status}</small></p>
            <p className="card-text"><small className=""> Gender: {personaje.gender}</small></p>
            <p className="card-text"><small className=""> Created: {personaje.created}</small></p>
          </div>
          <div className="btn-group" style={{ 'marginLeft': '15px' }}>
            <button type="button" className="btn btn-sm btn-outline-secondary" >
              <Link to={'/'} className="nav-link px-2 text-success">Inicio</Link>
            </button>
          </div>
        </div>
      </div>
    </div>
  )
}

export default Details
