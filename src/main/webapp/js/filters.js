$(function () {

    $('#only_employed').change(function () {
        if (this.checked) {
            $('tr td.isEmployed').each(function () {
                if ($(this).text().trim() !== 'Да') {
                    $(this).parent().hide();
                }
            });
        } else {
            $('tr').show();
        }
    });

    $('#only_with_benefits').change(function () {
        if (this.checked) {
            $('tr td.hasBenefits').each(function () {
                if ($(this).text().trim() !== 'Да') {
                    $(this).parent().hide();
                }
            });
        } else {
            $('tr').show();
        }
    });

    $('#period').change(function () {
        var value = +$(this).val();
        if (value == -1) {
            $('tr').show();
        } else {
            $('tr td.period').each(function () {
                if (+$(this).text().trim() != value) {
                    $(this).parent().hide();
                } else {
                    $(this).parent().show();
                }
            });
        }
    });

});