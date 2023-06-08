<#macro page>
<!DOCTYPE html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Міський транспорт</title>
    <link rel="stylesheet" href="css/my.css">
</head>
<body>
<#nested>
<!-- Topper -->
<nav class="navbar navbar-light bg-light">
    <div class="container-fluid">

        <h1><a class="nav-link active" aria-current="page" href="index.ftl"><p style="color: white;">Міський транспорт</p></a></h1>

        <button class="menu-button">Меню</button>

        <!-- Список з пунктами меню -->
        <div class="menu-list">
            <a href="routes.ftl">Маршрути</a>
            <a href="interval.ftl">Розклад</a>
            <a href="index.ftl">Карта</a>
        </div>

    </div>

    <!-- Footer -->
    <footer class="footer mt-auto py-3 bg-light">
        <div class="container">
            <span class="text-muted">© 2023 Міський транспорт</span>
        </div>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

    <script>
        // Отримуємо кнопку і список з пунктами меню
        var menuButton = document.querySelector('.menu-button');
        var menuList = document.querySelector('.menu-list');

        // Обробник події для кнопки меню
        menuButton.addEventListener('click', function() {
            // Перевіряємо, чи список з пунктами меню прихований
            if (menuList.style.display === 'none') {
                // Якщо так, то робимо його видимим
                menuList.style.display = 'block';
            } else {
                // Якщо ні, то приховуємо його
                menuList.style.display = 'none';
            }
        });
    </script>
</nav>
</body>
</html>
</#macro>