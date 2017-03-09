$(function() {
    $('input[type=radio][name=isEmployed]').change(
        function () {
            var duration = 500;
            var block2 = $('#block2');
            var inputs = block2.find('input');
            if ($(this).val() == 'true' && block2.is(':visible')) {
                block2.hide(duration);
                inputs.prop('disabled', true);
            } else if ($(this).val() == 'false' && block2.is(':hidden')) {
                block2.show(duration);
                inputs.prop('disabled', false);
            }
        }
    );
});