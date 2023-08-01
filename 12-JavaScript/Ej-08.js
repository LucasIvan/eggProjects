/*Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el 
programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de 
todos ellos. */

function numeros() {
    let num;
    let cant = 0;
    let suma = 0;
    let min = Number.MAX_SAFE_INTEGER;
    let max = Number.MIN_SAFE_INTEGER;

    do {
        num = parseInt(prompt("Ingrese un numero (0 para salir)"));
        if (num != 0 && num != isNaN) {
            cant++;
            suma += num;
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
        } else if (num == NaN) {
            alert("Ingrese solo números")
        }
    } while (num != 0);

    if (cant == 0) {
        alert("Las entradas no fueron válidas")
    } else {
        let prom = suma / cant;
        document.querySelector("body").innerHTML = `
        <h3>Resultados</h3>
        <ul>
            <li>Máximo: ${max}</li>
            <li>Mínimo: ${min}</li>
            <li>Promedio: ${prom.toFixed(2)}</li>
        </ul>`
    }
}

document.addEventListener("DOMContentLoaded", numeros());
