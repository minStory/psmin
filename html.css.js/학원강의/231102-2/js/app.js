const swiper = new Swiper(".my-swiper", {
    navigation: {
      nextEl: ".swiper-button-next",
      prevEl: ".swiper-button-prev",
    },

    pagination: {
    el: ".swiper-pagination",
    clickable:true
    },

    scrollbar: {
          el: ".swiper-scrollbar",
          hide: true,
    },
});
