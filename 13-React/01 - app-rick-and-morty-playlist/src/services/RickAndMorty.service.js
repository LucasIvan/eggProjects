import { API_RM } from "../constants/Api.constants";

class RickAndMortyService {
  async getAllCharacters(){
    const response = await fetch(API_RM.CHARACTERS());
    //Interceptor
    return response.json();
  }

  async getCharacter(id){
    const response = await fetch(API_RM.CHARACTER_BY_ID(id));
    //Interceptor
    return response.json();
  }
}

export default new RickAndMortyService();