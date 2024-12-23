//let sH = setInterval("slideH()", 3000);
//
//function slideH() {
//  $(".mainTopPhoto")
//    .stop()
//    .animate({ marginLeft: "-100%" }, 500, function () {
//      $(".mainTopPhoto li:first").appendTo(".mainTopPhoto");
//      $(".mainTopPhoto").css({ marginLeft: 0 });
//    });
//}
//
//function slideH_re() {
//  $(".mainTopPhoto li:last").prependTo(".mainTopPhoto");
//  $(".mainTopPhoto").css({ marginLeft: "-100%" });
//  $(".mainTopPhoto").stop().animate({ marginLeft: 0 });
//}
//
//$(function () {
//  $(".mpRight").on("click", function () {
//    clearInterval(sH);
//    slideH();
//  });
//
//  $(".mpLeft").on("click", function () {
//    clearInterval(sH);
//    slideH_re();
//  });
//
//  $(".main-page-header-bottom").on("mouseover", function () {
//    $(".mpLeft").css({ display: "block" });
//    $(".mpRight").css({ display: "block" });
//  });
//  $(".main-page-header-bottom").on("mouseleave", function () {
//    $(".mpLeft").css({ display: "none" });
//    $(".mpRight").css({ display: "none" });
//  });
//});

let sH = setInterval(slideH, 3000);

function slideH() {
  var mainTopPhoto = document.querySelector(".mainTopPhoto");
  var firstChild = mainTopPhoto.firstElementChild;

  mainTopPhoto.style.transition = "margin-left 0.5s";
  mainTopPhoto.style.marginLeft = "-100%";

  mainTopPhoto.addEventListener(
    "transitionend",
    function () {
      mainTopPhoto.appendChild(firstChild);
      mainTopPhoto.style.transition = "none";
      mainTopPhoto.style.marginLeft = "0";
    },
    { once: true }
  );
}

function slideH_re() {
  var mainTopPhoto = document.querySelector(".mainTopPhoto");
  var lastChild = mainTopPhoto.lastElementChild;

  mainTopPhoto.insertBefore(lastChild, mainTopPhoto.firstElementChild);
  mainTopPhoto.style.marginLeft = "-100%";
  mainTopPhoto.style.transition = "none";

  requestAnimationFrame(function () {
    requestAnimationFrame(function () {
      mainTopPhoto.style.transition = "margin-left 0.5s";
      mainTopPhoto.style.marginLeft = "0";
    });
  });
}

document.addEventListener("DOMContentLoaded", function () {
  document.querySelector(".mpRight").addEventListener("click", function () {
    clearInterval(sH);
    slideH();
  });

  document.querySelector(".mpLeft").addEventListener("click", function () {
    clearInterval(sH);
    slideH_re();
  });

  var mainPageHeaderBottom = document.querySelector(".main-page-header-bottom");

  mainPageHeaderBottom.addEventListener("mouseover", function () {
    document.querySelector(".mpLeft").style.display = "block";
    document.querySelector(".mpRight").style.display = "block";
  });

  mainPageHeaderBottom.addEventListener("mouseleave", function () {
    document.querySelector(".mpLeft").style.display = "none";
    document.querySelector(".mpRight").style.display = "none";
  });
});