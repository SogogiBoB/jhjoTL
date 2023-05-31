
$(".fa-circle-question").click(function() {
    $(".smPopupBox").toggleClass("displayBlock");
});

$(document).click(function(e) {
    let $tgPoint = $(e.target);
    let $icon = $tgPoint.hasClass("fa-circle-question");
    let $area = $tgPoint.hasClass("smPopupBox");

    if(!$icon && !$area) {
        $(".smPopupBox").removeClass("displayBlock");
    }
})
