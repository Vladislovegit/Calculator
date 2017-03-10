<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="header.jsp" %>
<jsp:useBean id="data_list" scope="request" type="java.util.ArrayList"/>
<html>
<head>
    <title>Statistics</title>
    <script src="webjars/tablesorter/2.25.4/js/jquery.tablesorter.js"></script>
    <script src="../js/tablesorter.js"></script>
    <script src="../js/filters.js"></script>
    <link href="../css/statistics.css" rel="stylesheet">
</head>
<body>

<div id="filters">
    <p><label for="period">Период</label>
        <br>
        <select id="period">
            <option value="-1">Все</option>
            <option value="3">Квартал</option>
            <option value="6">Полугодие</option>
            <option value="9">Девять месяцев</option>
            <option value="12">Год</option>
        </select>
    </p>
    <p>
        <label>
            <input type="checkbox" id="only_employed">
            Только с основной работой
        </label>
    </p>
    <p>
        <label>
            <input type="checkbox" id="only_with_benefits">
            Только льготники
        </label>
    </p>
</div>
<div>
    <table id="table" class="tablesorter">
        <thead>
        <tr>
            <th>Период, мес.</th>
            <th>Сумма выручки, руб.</th>
            <th>Сумма внереализационных доходов, руб</th>
            <th>Основная работа</th>
            <th>Права на льготы</th>
            <th>Воспитывает в одиночку</th>
            <th>Количество детей до 18 лет</th>
            <th>Количество детей-инвалидов</th>
            <th>Количество иждивенцев</th>
            <th>Сумма расходов на страхование, руб</th>
            <th>Сумма расходов на обучение, руб</th>
            <th>Сумма расходов на жилье, руб</th>
            <th>Сумма расходов на предпринимательство, руб</th>
            <th class="result">Сумма подоходного налога, руб</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="entry" items="${data_list}">
            <tr>
                <td class="period">
                    <c:choose>
                        <c:when test="${entry.period eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.period}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="revenueFromSale">
                    <c:choose>
                        <c:when test="${entry.revenueFromSale eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.revenueFromSale}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="nonOperatingRevenue">
                    <c:choose>
                        <c:when test="${entry.nonOperatingRevenue eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.nonOperatingRevenue}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="isEmployed">
                    <c:choose>
                        <c:when test="${entry.isEmployed eq true}">
                            Да
                        </c:when>
                        <c:when test="${entry.isEmployed eq false}">
                            Нет
                        </c:when>
                        <c:otherwise>
                            &mdash;
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="hasBenefits">
                    <c:choose>
                        <c:when test="${entry.hasBenefits eq true}">
                            Да
                        </c:when>
                        <c:when test="${entry.hasBenefits eq false}">
                            Нет
                        </c:when>
                        <c:otherwise>
                            &mdash;
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="isRaisingAlone">
                    <c:choose>
                        <c:when test="${entry.isRaisingAlone eq true}">
                            Да
                        </c:when>
                        <c:when test="${entry.isRaisingAlone eq false}">
                            Нет
                        </c:when>
                        <c:otherwise>
                            &mdash;
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="childrenAmount">
                    <c:choose>
                        <c:when test="${entry.childrenAmount eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.childrenAmount}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="invalidChildrenAmount">
                    <c:choose>
                        <c:when test="${entry.invalidChildrenAmount eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.invalidChildrenAmount}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="dependentsAmount">
                    <c:choose>
                        <c:when test="${entry.dependentsAmount eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.dependentsAmount}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="insuranceCosts">
                    <c:choose>
                        <c:when test="${entry.insuranceCosts eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.insuranceCosts}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="educationCosts">
                    <c:choose>
                        <c:when test="${entry.educationCosts eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.educationCosts}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="housingCosts">
                    <c:choose>
                        <c:when test="${entry.housingCosts eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.housingCosts}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="businessCosts">
                    <c:choose>
                        <c:when test="${entry.businessCosts eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.businessCosts}
                        </c:otherwise>
                    </c:choose>
                </td>
                <td class="result">
                    <c:choose>
                        <c:when test="${entry.resultTax eq null}">
                            &mdash;
                        </c:when>
                        <c:otherwise>
                            ${entry.resultTax}
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
        </tbody>
        <script>
        </script>
    </table>
</div>
</body>
</html>
