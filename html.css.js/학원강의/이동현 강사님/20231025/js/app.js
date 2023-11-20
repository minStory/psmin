const aboutMenu = document.querySelector("nav ul li:first-of-type")
const portfolioMenu = document.querySelector("nav ul li:nth-of-type(2)")
const contactMenu = document.querySelector("nav ul li:last-of-type")

const aboutElem = document.querySelector(".about")
const portfolioElem = document.querySelector(".portfolio")
const contactElem = document.querySelector(".contact")


// ! 이벤트 핸들러 함수에 첫번째 매개변수는 Event 객체다.
// ! 기본 이벤트를 막아주는 메서드가 있다. => 이벤트객체.preventDefault

// ! 메서드는 객체안에 있는 함수를 말해요.
const elems = [
    { menu: aboutMenu, y: aboutElem.offsetTop },
    { menu: portfolioMenu, y: portfolioElem.offsetTop },
    { menu: contactMenu, y: contactElem.offsetTop },
]

elems.forEach(elem => elem.menu.addEventListener("click", (event) => {
    event.preventDefault()
    window.scrollTo({ top: elem.y, behavior: "smooth" })
}))


// aboutMenu.addEventListener("click", (event) => {
//     event.preventDefault()
//     window.scrollTo({ top: aboutElem.offsetTop, behavior: "smooth" })
// })

// portfolioMenu.addEventListener("click", (event) => {
//     event.preventDefault()
//     window.scrollTo({ top: portfolioElem.offsetTop, behavior: "smooth" })
// })

// contactMenu.addEventListener("click", (event) => {
//     event.preventDefault()
//     window.scrollTo({ top: contactElem.offsetTop, behavior: "smooth" })
// })


const progressBar = document.querySelector(".progress-bar");
const body = document.querySelector("body");

// ! 요소.clientHeight를 사용하면 해당하는 요소의 높이를 알 수 있다.
// ! window.innerHeight => 내 화면의 높이를 알 수 있다.
// ! pageYOffset, scrollY는 문서 페이지의 스크롤 양을 나타낸다.
function progress(){
    // console.log(window.scrollY / body.clientHeight * 100);
    // ! 보고있는 화면의 높이를 빼줘야함.
    // console.log(window.scrollY, body.clientHeight )
    // ! 스크롤한 양 / 문서 높이 * 100 => 
    const ratio = window.scrollY / (body.clientHeight - window.innerHeight) * 100;
    progressBar.style.height = `${ratio}vh`;
}

window.addEventListener("scroll", progress)


/**
 * ! 스크롤하면, portfolio 영역에 있는 이미지들이 투명도가 0에서 1로 바뀌게 만들어보세요.
 * ! 조건 => 내가 보이는 화면에서 스크롤할 때 애니메이션(투명도가 0에서 1로 바뀌게)이 진행되어야 해요.
 */

// const image1 = document.querySelector(".portfolio-image-1 img")
// const image2 = document.querySelector(".portfolio-image-2 img")
// const image3 = document.querySelector(".portfolio-image-3 img")

// const images = [image1, image2, image3]
const images = document.querySelectorAll(".portfolio-image img")

function scrollAnimation(){
    // window.scrollY 내가 스크롤한 양
    // image1.offsetTop 이미지의 높이.
    // 내가 스크롤한 양이 이미지의 높이보다 높으면 투명도를 1로 바꿔주면 된다.

    images.forEach(image => {
        if(window.scrollY >= image.offsetTop - 400) image.classList.add("opacity")
    })

    // if(window.scrollY >= image1.offsetTop - 400){
    //     image1.classList.add("opacity")
    // }

    // if(window.scrollY >= image2.offsetTop - 400){
    //     image2.classList.add("opacity")
    // }

    // if(window.scrollY >= image3.offsetTop - 400){
    //     image3.classList.add("opacity")
    // }
}

window.addEventListener("scroll", scrollAnimation)

