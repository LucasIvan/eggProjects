/*Escribir un programa de JavaScript que a través de un formulario calcule el radio de un 
circulo y lo muestre en el HTML
r = √ (A / π)  */

document.addEventListener("DOMContentLoaded", () => {
    let formulario = document.createElement("form");

    let input = document.createElement("input");
    input.setAttribute("placeholder", "Area del circulo");

    let boton = document.createElement("input");
    boton.setAttribute("type", "submit");
    boton.setAttribute("value", "Calcular");

    formulario.appendChild(input);
    formulario.appendChild(boton);

    document.body.appendChild(formulario);

    formulario.addEventListener("submit", (event) => {
        event.preventDefault();
        let area = parseFloat(input.value);
        input.value = "";
        if (!isNaN(area) && area !=0) {
            let radio = Math.sqrt(area / Math.PI).toFixed(2);

            let text = document.createElement("p");
            let valor = `El radio de la circunferencia es ${radio}`;
            text.textContent = valor;
            console.log(text)
            document.body.appendChild(text);
        } else {
            let text = document.createElement("p");
            let valor = `Ingrese un número válido`;
            text.textContent = valor;
            console.log(text)
            document.body.appendChild(text);
        }
    });
});