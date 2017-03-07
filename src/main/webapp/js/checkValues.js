$(function() {
    $('input[name=businessCosts],input[name=revenueFromSale],input[name=nonOperatingRevenue]').blur(function() {
        var revenueFromSale = +$('input[name=revenueFromSale]').val();
        var nonOperatingRevenue = +$('input[name=nonOperatingRevenue]').val();
        var businessCosts = +$('input[name=businessCosts]').val();
        var sum = revenueFromSale + nonOperatingRevenue;

        if (businessCosts > sum) {
            $(this).closest('div').find('.message').html('&emsp;Value of 12th clause must be less or equal than sum of 2nd and 3rd clauses');
            $('#submit').prop('disabled', true);
        } else if(businessCosts <= sum) {
            $('.message').html('');
            $('#submit').prop('disabled', false);
        }
    });

    $('input[name=invalidChildrenAmount]').blur(function() {
        // TODO:
    })
});