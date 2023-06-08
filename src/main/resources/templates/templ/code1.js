var menuButton = document.querySelector('.menu-button');
var menuList = document.querySelector('.menu-list');
var mainImage = document.getElementById("map");
var button1 = document.getElementById("22");
var button2 = document.getElementById("45");
var button3 = document.getElementById("91");
let selectedRoute;

// Обробник події для кнопки меню
menuButton.addEventListener('click', function() {
    // Перевіряємо, чи список з пунктами меню прихований
    if (menuList.style.display === 'none') {
        // Якщо так, то робимо його видимимим
        menuList.style.display = 'block';
    } else {
        // Якщо ні, то приховуємо його
        menuList.style.display = 'none';
    }
});

// Обробник події для кнопок маршрутів
button1.addEventListener("click", function(){
    mainImage.src = "../../images/22.jpg";
    selectedRoute = "22";
});

button2.addEventListener("click", function(){
    mainImage.src = "../../images/45.jpg";
    selectedRoute = "45";
});

button3.addEventListener("click", function(){
    mainImage.src = "../../images/91.jpg";
    selectedRoute = "91";
});

// Обробник події для кнопки "інфо"
document.getElementById("info").addEventListener("click", function() {
    if (selectedRoute === "22") {
        mainImage.src = "../../images/bus22.jpg";
    } else if (selectedRoute === "45") {
        mainImage.src = "../../images/bus45.jpg";
    } else if (selectedRoute === "91") {
        mainImage.src = "../../images/bus91.jpg";
    }
});
