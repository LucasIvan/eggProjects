/*Escribir un programa para obtener un array de las propiedades de un objeto Persona. 
Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.*/

class Persona {
  constructor() {
    this.nombre = "";
    this.edad = 0;
    this.sexo = "";
    this.peso = 0;
    this.altura = 0;
  }
}

let persona = new Persona();
let propiedades = Object.keys(persona);

console.log(propiedades)