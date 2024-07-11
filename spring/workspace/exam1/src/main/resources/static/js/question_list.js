document.addEventListener("DOMContentLoaded", () => {
    // 검색을 한 경우 검색창에 포커스
    const search_kw = document.getElementById("search_kw");
    const kw = document.getElementById("kw");
    if(kw.value !== ""){
        search_kw.focus();
        search_kw.setSelectionRange(kw.value.length, kw.value.length);
    }
})

const pages = Array.from(document.getElementsByClassName("page-link"));
pages.forEach(li => {
    li.addEventListener("click", () => {
        document.getElementById('page').value = li.dataset.page;
        document.getElementById('searchForm').submit();
    });
});

const btn_search = document.getElementById("btn_search");
btn_search.addEventListener("click", () => {
    document.getElementById("kw").value = document.getElementById("search_kw").value;
    document.getElementById("page").value = 0; // 검색버튼을 클릭할 경우 0 페이지부터 조회한다.
    document.getElementById("searchForm").submit();
});

// 검색창에서 엔터를 누르면 검색
const search_kw = document.getElementById("search_kw");
search_kw.addEventListener("keydown", (event) => {
    if (event.key === "Enter") {
        btn_search.click();
    }
})