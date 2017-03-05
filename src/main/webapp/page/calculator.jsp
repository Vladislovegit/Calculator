<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Calculator</title>
    <link href="css/question.css" rel="stylesheet">
</head>
<body>
<div id="questions">
    <div class="question">
        <p>&emsp;Период, за который производится расчет:</p>
        <h4>квартал</h4>
        <h4>полугодие</h4>
        <h4>девять месяцев</h4>
        <h4>год</h4>
    </div>
    <div class="question">
        <p>&emsp;Сумма выручки от реализации товаров (работ, услуг), имущественных прав за выбранный период (без налога на добавленную стоимость), руб.</p>
        <p><input class="money" type="number" value="0" min="0" required></p>
    </div>
    <div class="question">
        <p>&emsp;Сумма внереализационных доходов за выбранный период (без налога на добавленную стоимость), руб.</p>
        <p><input class="money" type="number" value="0" min="0" required></p>
    </div>
    <div class="question">
        <p>&emsp;Наличие места основной работы:</p>
        <h4>да</h4>
        <h4>нет</h4>
    </div>
    <div class="question">
        <p>&emsp;Наличие права на льготы (инвалид I или II группы, инвалид с детства, участник боевых действий на территории других государств и др.):</p>
        <h4>да</h4>
        <h4>нет</h4>
    </div>
    <div class="question">
        <p>&emsp;Являетесь ли Вы вдовой (вдовцом), одиноким родителем, приемным родителем, опекуном или попечителем:</p>
        <h4>да</h4>
        <h4>нет</h4>
    </div>
    <div class="question">
        <p>&emsp;Количество детей до 18 лет,</p>
        <p><input type="number" value="0" min="0" required></p>
        <p>из них количество детей-инвалидов:</p>
        <p><input type="number" value="0" min="0" required></p>
    </div>
    <div class="question">
        <p>&emsp;Количество иждивенцев: </p>
        <p><input type="number" value="0" min="0" required></p>
    </div>
    <div class="question">
        <p>&emsp;Сумма расходов за выбранный период по страховым взносам по договорам добровольного страхования жизни и дополнительной пенсии, заключенным на срок не менее трех лет, а также по договорам добровольного страхования медицинских расходов, руб.</p>
        <p><input class="money" type="number" value="0" min="0" required></p>
    </div>
    <div class="question">
        <p>&emsp;Сумма расходов за выбранный период на получение первого платного образования своего либо близких родственников, руб.</p>
        <p><input class="money" type="number" value="0" min="0" required></p>
    </div>
    <div class="question">
        <p>&emsp;Сумма расходов за выбранный период на строительство либо приобретение жилья для нуждающихся в улучшении жилищных условий, руб.</p>
        <p><input class="money" type="number" value="0" min="0" required></p>
    </div>
    <div class="question">
        <p>&emsp;Сумма расходов за выбранный период, связанных с осуществлением предпринимательской деятельности, руб. </p>
        <p><input class="money" type="number" value="0" min="0" required></p>
    </div>
</div>

</body>
</html>