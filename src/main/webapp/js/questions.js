$(function() {
    $('input[type=radio][name=isEmployed]').change(
        function () {
            var duration = 500;
            var block2 = $('#block2');
            var radios = $('input[name=hasBenefits],input[name=isRaisingAlone]');
            if ($(this).val() == 'true' && block2.is(':visible')) {
                block2.hide(duration);
                radios.filter('[value=null]').prop('checked', true);
            } else if ($(this).val() == 'false' && block2.is(':hidden')) {
                block2.show(duration);
                radios.filter('[value=null]').prop('checked', false);
            }
        }
    );
});