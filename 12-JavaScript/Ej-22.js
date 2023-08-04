/*Escribir un programa de JavaScript que al clickear un botón muestre un mensaje a 
elección.*/

document.addEventListener("DOMContentLoaded",()=>{
    document.body.innerHTML = `<button>Clickea aquí</button>`;

    document.querySelector("button").addEventListener("click",()=>{
        document.body.innerHTML = `<h1>QUE CAPO QUE SOS!!</h1>`
    });
});