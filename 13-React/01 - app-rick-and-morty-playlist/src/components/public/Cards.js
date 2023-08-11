import React, { useState,useEffect } from 'react'
import Card from './Card';
import RickAndMortyService from '../../services/RickAndMorty.service'

// const Cards = ({ personajes }) => {
const Cards = () => {
  const [personajes, setPersonajes] = useState([]);

  useEffect(() => {
    RickAndMortyService.getAllCharacters()
      .then((data) => setPersonajes(data.results))
      .catch((error) => console.log(error));
  }, [setPersonajes]);

  const cardList = personajes.map((m) => <Card personaje={m} key={m.id} />);

  return (
    <div className="album py-5 bg-body-tertiary">
      <div className="container">

        <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
          {cardList}
        </div>
      </div>
    </div>
  )
}

export default Cards