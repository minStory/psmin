const tabBtns = document.querySelector(".tab-btns");

const prevTab = {
    btn: document.querySelector(".tab-btns li"),
    list: document.querySelector(".tab-list li")
}

let target;


const prevRemoveClass = (prevObject) => {
    for(const key in prevObject){
        prevTab[key].classList.remove("active")
    }
}

const addClass = (arr) => arr.forEach(elem => elem.classList.add("active"))

function tabHandler(event){
    target = event.target;

    if(target.nodeName === "UL") return
    if(prevTab.btn) prevRemoveClass(prevTab)
        
    while(target.nodeName !== "LI") target = target.parentNode

    const tabItem = document.querySelector(`.tab-list .${target.classList[0]}`)

    prevTab.list = tabItem
    prevTab.btn = target;

    addClass([target, tabItem])
}


tabBtns.addEventListener("click", tabHandler)