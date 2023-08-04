/*Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo 
con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El 
radio del círculo lo proporcionará el usuario*/

const area = (radio) => Math.PI * Math.pow(radio,2);
const perimetro = (radio) => 2 * Math.PI * radio;

let radio = parseFloat(prompt("Ingrese el radio de la circunferencia"));

console.log(`El área del circulo es: ${area(radio).toFixed(2)}
El perímetro del circulo es: ${perimetro(radio).toFixed(2)}`)