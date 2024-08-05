document.addEventListener("DOMContentLoaded", () => {
    const uploadBoxes = Array.from(document.getElementsByClassName("upload-box"));

    uploadBoxes.forEach(li => {
        const fileInput = li.getElementsByClassName("file")[0];
        const previewImg = li.getElementsByClassName("img")[0];

        fileInput.addEventListener("change", event => {
            previewImage(event, previewImg);
        });
    });
});
// ------ DOMContentLoaded end ------


// ------ 이미지 첨부 후 미리보기 메서드 ------
function previewImage(event, imgElement) {
    const file = event.target.files[0];

    // 이미지를 첨부했다가 다시 취소할 때
    if (!file) {
        imgElement.removeAttribute("src");
        imgElement.style.display = "none";
        alert("Image attachment has been canceled.");
        return;
    }

    // 이미지 파일이 아닌 파일을 첨부했을 때
    if (!file.type.startsWith("image")) {
        alert("Please attach the image file.");
        return;
    }

    // 이미지 정상 등록
    const reader = new FileReader();
    reader.onload = (e) => {
        imgElement.src = e.target.result;
        imgElement.style.display = "block";
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
        // 이미지가 아닌 파일을 첨부되었을 때
        if (li.src !== "" && !li.src.includes("image")) {
            fileValidateResult1 = true;
        }
        // 첨부되지 않은 파일이 존재할 때
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

    // 두 조건 중 하나라도 true 면 false 리턴
    return !(fileValidateResult1 || fileValidateResult2);
}

// ------ end ------