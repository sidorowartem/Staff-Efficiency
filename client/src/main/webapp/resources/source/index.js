$(document).ready(function () {
    $.get("getUser", function (response) {
        if (response.success) {
            $("#userNameLabel").show();
            $("#userNameHolder").html(response.payload.userName);
        } else {
            $("#userNameLabel").hide();
            $("#userNameHolder").html("Sorry, no user found.");
        }
    });
});