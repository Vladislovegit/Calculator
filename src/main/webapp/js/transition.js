jQuery(document).ready(function () {
        $('#calculator').click(function () {
                $.ajax({
                    type: "GET",
                    data: {command: "GET_QUESTIONS"},
                    url: "controller",
                    success: function (data) {
                        $('#content').html(data);
                    }
                })
            }
        );
    }
);