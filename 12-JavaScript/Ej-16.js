/*Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios 
y los muestre por pantalla. */

let rellene = (x, y) => {
    for (let i = 0; i < 5; i++) {
        x.push(Math.floor(Math.random()*100))
        y.push(Math.floor(Math.random()*100))
    }
    console.log(x,y)
}