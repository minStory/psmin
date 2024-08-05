document.addEventListener("DOMContentLoaded", () => {

    // 아이디 혹은 비밀번호가 틀렸을 경우
    if (window.location.href.includes("error")) {
        alert("ID or password is wrong!");
    }
});
// ------ DOMContentLoaded end ------