function operaciones(num1, num2){
  let resultados = {suma: null,resta: null,multiplicación: null,división: null}
  
  resultados.suma = num1+num2;
  resultados.resta = num1-num2;
  resultados.multiplicación= num1*num2;
  if (num2 !== 0){
      resultados.división = num1/num2;
  }
  return resultados;
}
console.log(operaciones(10,2));