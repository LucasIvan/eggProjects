
document.addEventListener("DOMContentLoaded", function(event) {
  var currentImage = 0;
  var images = [ 
    { src: "imagen1.jpg", alt: "Imagen 1" },
    { src: "imagen2.jpg", alt: "Imagen 2" },
    { src: "imagen3.jpg", alt: "Imagen 3" }
  ];
  var sliderImage = document.getElementById("slider-image"); // <img>
  var nextBtn = document.querySelector(".slider-btn-next"); // <div next>
  var prevBtn = document.querySelector(".slider-btn-prev"); // <div prev>
  
  // Agrega eventos a los botones
  nextBtn.addEventListener("click", nextImage);
  prevBtn.addEventListener("click", prevImage);

  // Cambia la imagen actual
  function changeImage() {
    sliderImage.src = images[currentImage].src;
    sliderImage.alt = images[currentImage].alt;
  }

  // Cambia a la siguiente imagen
  function nextImage() {
    currentImage = currentImage + 1;
    if (currentImage >= images.length) {
      currentImage = 0;
    }
    changeImage();
  }

  // Cambia a la imagen anterior
  function prevImage() {
    currentImage = currentImage - 1;
    if (currentImage < 0) {
      currentImage = images.length - 1;
    }
    changeImage();
  }

  

  // Muestra la primera imagen al cargar la página
  changeImage();
});