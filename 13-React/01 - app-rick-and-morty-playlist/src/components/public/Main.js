import React, { Component } from 'react'
import Cards from './Cards';
//import RickAndMortyService from '../../services/RickAndMorty.service'

export class Main extends Component {
  constructor(props) {
    super(props);
    this.state = { personajes: [] };
  }

  componentDidMount() {
    // RickAndMortyService.getAllCharacters()
    //   .then((data) => this.setState({personajes: data.results}))
    //   .catch((error) => console.log(error));
  }

  render() {
    return (
      <main>
        <section className="text-center container">
          <div className="row">
            <div className="col-lg-6 col-md-8 mx-auto">
              <h1 className="fw-light">Personajes de Rick And Morty</h1>
            </div>
          </div>
        </section>

        {/* <Cards personajes={this.state.personajes}/> */}
        <Cards />

      </main>
    )
  }
}

export default Main
