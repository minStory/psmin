document.addEventListener("DOMContentLoaded", () => {
    const uploadBoxes = Array.from(document.getElementsByClassName("upload-box"));

    uploadBoxes.forEach(li => {
        const fileInput = li.getElementsByClassName("file")[0];
        const image = li.getElementsByClassName("img")[0];
        const plus = li.getElementsByClassName("plus")[0];

        fileInput.addEventListener("change", event => {
            previewImage(event, image, plus);
        });
    });
});
// ------ DOMContentLoaded end ------


// ------ 이미지 첨부 후 미리보기 메서드 ------
function previewImage(event, image, plus) {
    // file 객체에 현재 이벤트 요소 삽입
    const file = event.target.files[0];

    // 첨부 전 이미지 요소의 정보 초기화
    image.removeAttribute("src");
    image.style.display = "none";
    plus.classList.remove("hide");

    // 이미지를 첨부했다가 다시 취소할 경우
    if (!file) {
        alert("Image attachment has been canceled.");
        return;
    }

    // 이미지 파일이 아닌 파일을 첨부할 경우
    if (!file.type.startsWith("image")) {
        alert("Please attach the image file.");
        return;
    }

    // 정상일 경우 이미지 요소에 정보 대입 후 이미지 출력
    const reader = new FileReader();
    reader.onload = (e) => {
        image.src = e.target.result;
        image.style.display = "block";
        plus.classList.add("hide");
    };
    reader.readAsDataURL(file);
}

// ------ end ------


// ------ 파일 첨부 submit 유효성 검사 ------
function fileAttachedValidate() {
    const imgs = Array.from(document.getElementsByClassName("img"));
    let fileValidateResult1;
    let fileValidateResult2;

    imgs.forEach(li => {
        // 요소는 있지만 이미지가 아닌 파일을 첨부되었을 경우
        if (li.src !== "" && !li.src.includes("image")) {
            fileValidateResult1 = true;
        }
        // 이미지 요소의 내용물이 없을 경우
        if (li.src === "") {
            fileValidateResult2 = true;
        }
    })

    if (fileValidateResult1) {
        alert("Please attach the image file.");
    }
    if (fileValidateResult2) {
        alert("Please attach all the images.");
    }
    // 등록 성공 문구
    if (!(fileValidateResult1 || fileValidateResult2)) {
        alert("Upload successful!")
    }

    // 두 조건 중 하나라도 true 면 false 리턴
    //return !(fileValidateResult1 || fileValidateResult2);
    return true;
}

// ------ end ------