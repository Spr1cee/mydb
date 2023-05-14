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


let selectedRoute;

document.getElementById("22").addEventListener("click", function() {
    selectedRoute = "route22";
});

document.getElementById("45").addEventListener("click", function() {
    selectedRoute = "route45";
});

document.getElementById("91").addEventListener("click", function() {
    selectedRoute = "route91";
});

document.getElementById("info").addEventListener("click", function() {
    if (selectedRoute === "route22") {
        document.getElementById("bus-image").src = "bus22.jpg";
    } else if (selectedRoute === "route45") {
        document.getElementById("bus-image").src = "bus45.jpg";
    } else if (selectedRoute === "route91") {
        document.getElementById("bus-image").src = "bus91.jpg";
    }
});
