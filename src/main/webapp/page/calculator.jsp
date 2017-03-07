<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>
<html>
<head>
    <title>Calculator</title>
    <link href="../css/calculator.css" rel="stylesheet">
    <script src="../js/questions.js"></script>
    <script src="../js/requestForResult.js"></script>
    <script src="../js/checkValues.js"></script>
</head>
<body>
<div id="questions">
    <form action="controller" method="post" id="submitForm">
        <input type="hidden" name="command" value="CALCULATE">
        <div id="block1">
            <div class="question">
                <p><span class="number">1.</span>&emsp;Период, за который производится расчет:</p>
                <p><select name="period" dir="ltr" required title="Период, за который производится расчет">
                    <option value="3">Квартал</option>
                    <option value="6">Полугодие</option>
                    <option value="9">Девять месяцев</option>
                    <option value="12">Год</option>
                </select>
                </p>
            </div>
            <div class="question">
                <p><span class="number">2.</span>&emsp;Сумма выручки от реализации товаров (работ, услуг), имущественных
                    прав за выбранный период (без
                    налога на добавленную стоимость), руб.</p>
                <p><input class="money" type="number" name="revenueFromSale" value="0" min="0" required
                          title="Сумма выручки от реализации товаров">
                    <span class="message"></span>
                </p>
            </div>
            <div class="question">
                <p><span class="number">3.</span>&emsp;Сумма внереализационных доходов за выбранный период (без налога
                    на добавленную стоимость),
                    руб.</p>
                <p><input class="money" type="number" name="nonOperatingRevenue" value="0" min="0" required
                          title="Сумма внереализационных доходов">
                    <span class="message"></span>
                </p>
            </div>
            <div class="question">
                <p><span class="number">4.</span>&emsp;Наличие места основной работы:</p>
                <h4><input type="radio" name="isEmployed" value="true" required title="Наличие места основной работы">&emsp;да
                </h4>
                <h4><input type="radio" name="isEmployed" value="false" title="Наличие места основной работы">&emsp;нет
                </h4>
            </div>
        </div>
        <div id="block2">
            <div class="question">
                <p><span class="number">5.</span>&emsp;Наличие права на льготы (инвалид I или II группы, инвалид с
                    детства, участник боевых действий
                    на
                    территории других государств и др.):</p>
                <h4><input type="radio" name="hasBenefits" value="true" required title="Наличие права на льготы">&emsp;да
                </h4>
                <h4><input type="radio" name="hasBenefits" value="false" title="Наличие права на льготы">&emsp;нет</h4>
                <input type="radio" name="hasBenefits" value="null" hidden>
            </div>
            <div class="question">
                <p><span class="number">6.</span>&emsp;Являетесь ли Вы вдовой (вдовцом), одиноким родителем, приемным
                    родителем, опекуном или
                    попечителем:</p>
                <h4><input type="radio" name="isRaisingAlone" value="true" required>&emsp;да</h4>
                <h4><input type="radio" name="isRaisingAlone" value="false">&emsp;нет</h4>
                <input type="radio" name="isRaisingAlone" value="null" hidden>
            </div>
            <div class="question">
                <p><span class="number">7.</span>&emsp;Количество детей до 18 лет,</p>
                <p><input type="number" name="childrenAmount" value="0" min="0" step="1" required>
                    <span class="message"></span>
                </p>
                <p>из них количество детей-инвалидов:</p>
                <p><input type="number" name="invalidChildrenAmount" value="0" min="0" step="1" required>
                    <span class="message"></span>
                </p>
            </div>
            <div class="question">
                <p><span class="number">8.</span>&emsp;Количество иждивенцев: </p>
                <p><input type="number" name="dependentsAmount" value="0" min="0" step="1" required>
                    <span class="message"></span>
                </p>
            </div>
            <div class="question">
                <p><span class="number">9.</span>&emsp;Сумма расходов за выбранный период по страховым взносам по
                    договорам добровольного страхования
                    жизни и
                    дополнительной пенсии, заключенным на срок не менее трех лет, а также по договорам добровольного
                    страхования
                    медицинских расходов, руб.</p>
                <p><input class="money" name="insuranceCosts" type="number" value="0" min="0" required>
                    <span class="message"></span>
                </p>
            </div>
            <div class="question">
                <p><span class="number">10.</span>&emsp;Сумма расходов за выбранный период на получение первого платного
                    образования своего либо
                    близких
                    родственников, руб.</p>
                <p><input class="money" name="educationCosts" type="number" value="0" min="0" required>
                    <span class="message"></span>
                </p>
            </div>
            <div class="question">
                <p><span class="number">11.</span>&emsp;Сумма расходов за выбранный период на строительство либо
                    приобретение жилья для нуждающихся в
                    улучшении
                    жилищных условий, руб.</p>
                <p><input class="money" name="housingCosts" type="number" value="0" min="0" required>
                    <span class="message"></span>
                </p>
            </div>
        </div>
        <div id="block3">
            <div class="question">
                <p><span class="number">12.</span>&emsp;Сумма расходов за выбранный период, связанных с осуществлением
                    предпринимательской
                    деятельности,
                    руб. </p>
                <p><input class="money" name="businessCosts" type="number" value="0" min="0" required>
                    <span class="message"></span>
                </p>

            </div>
        </div>
        <div style="width: 60%; margin: auto; text-align: center">
            <button type="submit" id="submit">Calculate</button>
        </div>
    </form>
    <div class="result">
        <p>&emsp;Сумма подоходного налога к уплате, руб.
        </p>
        <p id="result">0.0</p>
    </div>
</div>

</body>
</html>