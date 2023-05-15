// let personas = [
//   { nombre: "Luis", edad: 30, ciudad: "ciudad naranja" },
//   { nombre: "Ana", edad: 45, ciudad: "villa noruega" },
//   { nombre: "Juan", edad: 15, ciudad: "tostadas" }
// ];

// function crearMensajesDePresentacion(arregloPersonas) {
//   let mensajes = [];
//   arregloPersonas.forEach(persona => {
//     let presentacion = "Mi nombre es " + persona.nombre + " tengo " + persona.edad + " años y vivo en " + persona.ciudad + ".";
//     mensajes.push(presentacion);
//   });
//   return mensajes;
// }
// const presentaciones = crearMensajesDePresentacion(personas);
// presentaciones.forEach(mensaje => {
//     console.log(mensaje);
// })

//------------------------------------------------------------------------------------------------------------------------------------

let personas = [ 
  { nombre: "Luis", edad: 30, ciudad: "ciudad naranja" },
  { nombre: "Ana", edad: 45, ciudad: "villa noruega" },
  { nombre: "Juan", edad: 15, ciudad: "tostadas" }
];

function crearMensajesDePresentacion(arregloPersonas) {
  return arregloPersonas.map(persona => `Mi nombre es ${persona.nombre}, tengo ${persona.edad} años y vivo en ${persona.ciudad}.`);
}

crearMensajesDePresentacion(personas).forEach(mensaje => console.log(mensaje));
