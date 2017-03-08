$(function() {
    var inputs = $('input[name=businessCosts],input[name=revenueFromSale],input[name=nonOperatingRevenue]');
    inputs.blur(function() {
        var revenueFromSale = +$('input[name=revenueFromSale]').val();
        var nonOperatingRevenue = +$('input[name=nonOperatingRevenue]').val();
        var businessCosts = +$('input[name=businessCosts]').val();
        var sum = revenueFromSale + nonOperatingRevenue;

        if (businessCosts > sum) {
            $(this).closest('div').find('.message').html('&emsp;The value of the 12th clause must be less than or equal to the sum of the 2nd and the 3rd clauses');
            $('#submit').prop('disabled', true);
        } else if(businessCosts <= sum) {
            inputs.closest('div').find('.message').html('');
            $('#submit').prop('disabled', false);
        }
    });

    $('input[name=invalidChildrenAmount],input[name=childrenAmount]').blur(function() {
        var childrenAmount = +$('input[name=childrenAmount]').val();
        var invalidChildrenAmount = +$('input[name=invalidChildrenAmount]').val();

        if (invalidChildrenAmount > childrenAmount) {
            $(this).closest('div').find('.message').html('&emsp;The amount of children with disabilities can not be more than the total number of children');
            $('#submit').prop('disabled', true);
        } else if(invalidChildrenAmount <= childrenAmount) {
            $(this).closest('div').find('.message').html('');
            $('#submit').prop('disabled', false);
        }
    })
});