$(function() {
    $('#submitForm').submit(
        function (e) {
            e.preventDefault();
            $.ajax({
                type: $(this).attr('method'),
                url: $(this).attr('action'),
                data: $(this).serialize(),
                success: function (data) {
                    if (data.success == true) {
                        $('#result').html(data.result);
                    } else if (data.success == false) {
                        alert(data.message);
                    }
                }
            })
        }
    );
});