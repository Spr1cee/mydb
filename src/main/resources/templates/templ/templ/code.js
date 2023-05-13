var mainImage = document.getElementById("map");
var button1 = document.getElementById("22");
var button2 = document.getElementById("45");
var button3 = document.getElementById("91");

button1.addEventListener("click", function(){
    mainImage.src = "../../../images/22.jpg";
});

button2.addEventListener("click", function(){
    mainImage.src = "../../../images/45.jpg";
});

button3.addEventListener("click", function(){
    mainImage.src = "../../../images/91.jpg";
});

