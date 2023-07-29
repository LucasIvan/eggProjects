document.addEventListener("DOMContentLoaded", function(event) {
  var imgAct = 0;
  var images = [
    {src: "https://scontent.fcnq2-2.fna.fbcdn.net/v/t1.6435-9/199380431_184966530298046_4405844892672391687_n.jpg?_nc_cat=109&ccb=1-7&_nc_sid=09cbfe&_nc_ohc=GrkxNEtG_PcAX8GDZ8Y&_nc_ht=scontent.fcnq2-2.fna&oh=00_AfAQjqWOkhGldtB6kEXOmoIDDUjqlb95jWTt6u8oe5Btiw&oe=64B56380"},
    {src: "https://i.ytimg.com/vi/2KMqEn-Ypoc/hqdefault.jpg"},
    {src: "https://live.staticflickr.com/4062/4288280192_4c40db3709.jpg"},
    {src: "https://www.eggcooperation.com/wp-content/uploads/2022/07/toca_codigo_desde_el_primer_dia.png"}
  ];

  var imageSlide = document.querySelector(".imagen");
  var btnPrev = document.querySelector(".btn1");
  var btnSig = document.querySelector(".btn2");

  btnPrev.addEventListener("click", imgPrev);
  btnSig.addEventListener("click", imgSig);
  
  function imgPrev(){
    imgAct -= 1;
    if(imgAct < 0){
      imgAct = images.length -1;
    }
    imageSlide.src = images[imgAct].src;
  }
  function imgSig(){
    imgAct += 1;
    if(imgAct >= images.length){
      imgAct = 0;
    }
    imageSlide.src = images[imgAct].src;
  }
  
  imageSlide.src = images[imgAct].src;
 
  });