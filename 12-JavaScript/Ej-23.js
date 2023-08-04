/*Resalte todas las palabras de más de 8 caracteres en el texto del párrafo (con un fondo 
amarillo, por ejemplo)*/

const TEXTO = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Voluptatem natus tempore doloremque pariatur quis explicabo quidem illum, veritatis nam id voluptas esse officia laboriosam iure ducimus ratione, voluptates harum commodi.";

/* VERSION  1 */
/*
document.addEventListener("DOMContentLoaded",()=>{
    const arreglo = TEXTO.split(" ");
    for (let i = 0; i < arreglo.length; i++) {
        let elemento = arreglo[i];
        if (elemento.length > 8) {
            arreglo[i] = `<span style="background: yellow">${elemento}</span>`;
        }
    }
    const parrafo = document.createElement("p");
    parrafo.innerHTML = palabras.join(" ");
    document.body.appendChild(parrafo);
})
*/

/* VERSION MEJORADA */

document.addEventListener("DOMContentLoaded", () => {
    const palabras = TEXTO.split(" ").map(elemento => {
        return elemento.length > 8 ? `<span style="background: yellow">${elemento}</span>` : elemento;
    });

    const parrafo = document.createElement("p");
    parrafo.innerHTML = palabras.join(" ");
    document.body.appendChild(parrafo);
});
