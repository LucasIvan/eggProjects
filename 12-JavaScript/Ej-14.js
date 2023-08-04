/*Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, 
Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario 
y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.*/

function Libro(ISBN,titulo,autor,numPaginas) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
}

function newLibro() {
    let isbn = prompt("Ingrese el ISBN");
    let titulo = prompt("Ingrese el título del libro");
    let autor = prompt("Ingrese el autor del libro");
    let numPaginas = prompt("Ingrese la cantidad de páginas del libro");
    return new Libro(isbn,titulo,autor,numPaginas);
}

function mostrarLibro(libro) {
    console.log(`ISBN: ${libro.ISBN}
    Título: ${libro.titulo}
    Autor: ${libro.autor}
    Páginas: ${libro.numPaginas}`)
}