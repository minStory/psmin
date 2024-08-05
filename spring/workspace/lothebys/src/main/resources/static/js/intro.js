setInterval("slideF()", 3000);

function slideF() {
    $(".introPhotoZone li:first").fadeOut(500, function () {
        $(this).appendTo(".introPhotoZone").fadeIn();
    });
}

$(function () {
    $("header,footer").css({marginLeft: -200});
    $("header").animate({marginLeft: 0}, 500);
    $("footer").animate({marginLeft: 0}, 800);

    $(".introMain a").on("mouseover", function () {
        $(this).stop().animate(
            {
                width: 100,
                height: 100,
                fontSize: "16px",
                lineHeight: "100px",
                margin: "-40px 0 0 -40px",
            },
            "fast"
        );
    });

    $(".introMain a").on("mouseleave", function () {
        $(this).stop().animate(
            {
                width: 50,
                height: 50,
                fontSize: "12px",
                lineHeight: "50px",
                margin: "-15px 0 0 -15px",
            },
            "fast"
        );
    });
});
