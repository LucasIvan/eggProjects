    /* en primer lugar guardaremos todos los botones para cada acción en arreglos ej:
     btnesSubir estaría guardando los 5 botones "btn-subir" que tienen esa clase */
    const btnesSubir = document.querySelectorAll(".btn-subir");
    const btnesBajar = document.querySelectorAll(".btn-bajar");

    /** con un for each recorreremos cada uno de los botones guardados en btnesSubir, 
     a cada botón (button) le añadiremos el método addEventListener para que al pulsarlos ("click") se ejecute una secuencia */
    btnesSubir.forEach((button) => {
        button.addEventListener("click", function () {
        /** con el método .parentNode guardamos en la constante "fila" el elemento padre del botón
         (sería el contenedor <li> de ese botón) */
        const fila = button.parentNode; 

        /** con el método .previousElementSibling guardamos en la constante "filaAnt" el elemento anterior a la fila que obtivimos
         previamente (sería el contenedor <li> de ese botón), lo que hace este método es buscar el elemento hermano anterior */
        const filaAnt = fila.previousElementSibling;

        /** con un condicional verificaremos si se guardó algo en la constante "filaAnt", si no se guardó nada significa
         que la fila no tenía ningún elemento anterior y no podrá seguir subiendo */
        if (filaAnt) {
            /** con el .parentNode "accedemos" al elemento padre de la fila que deseamos mover y el método .insertBefore 
             insertamos la fila que deseamos mover antes de la fila anterior "filaAnt" */
            fila.parentNode.insertBefore(fila, filaAnt);
        }
      });
    });

    //  TE INVITO A ANALIZAR EL FUNCIONAMIENTO DEL MÍSMO CÓDIGO PERO A LA INVERSA PARA HACER BAJAR LA FILA
    btnesBajar.forEach((button) => {
        button.addEventListener('click', function () {
        const fila = button.parentNode; 
        const filaSig = fila.nextElementSibling; 

        if (filaSig) {
            fila.parentNode.insertBefore(filaSig, fila); 
        }
      });
    });

  