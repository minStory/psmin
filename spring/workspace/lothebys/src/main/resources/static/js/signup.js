document.addEventListener("DOMContentLoaded", () => {
    // 아이디 중복 체크
    const duplicate = document.getElementsByClassName("duplicate")[0];
    const idInput = document.getElementsByClassName("signup_form_id")[0];
    const idText = document.getElementsByClassName("signup_form_id_error")[0];

    duplicate.addEventListener("click", () => {
        const id = idInput.value;

        fetch(`/user/id_duplicate_check?id=${id}`) // 입력받은 id를 서버로 전달하여 검증
            .then(response => response.json()) // 응답을 json 객체로 변환
            .then(data => {
                if (!(4 <= id.length && id.length <= 16)) {
                    idText.style.color = "red";
                    idText.innerText = "Please enter your ID with 4 to 16 characters.";
                    idInput.focus();
                    id_validate = true;
                    return;
                }
                if (!(/[a-zA-Z]/.test(id) && /[0-9]/.test(id))) {
                    idText.style.color = "red";
                    idText.innerText = "The ID must consist of a combination of letters and numbers.";
                    idInput.focus();
                    id_validate = true;
                    return;
                }
                if (data.result) {
                    idText.style.color = "red";
                    idText.innerText = "ID is not allowed";
                    idInput.focus();
                    id_validate = true;
                } else {
                    idText.style.color = "green";
                    idText.innerText = "ID is available";
                    id_validate = false;
                }
            })
            .catch(error => console.error("Error:", error));
    });

    // 비밀번호 자릿수 및 두 비밀번호가 같은지 확인
    const pwd = document.getElementsByClassName("signup_form_pwd")[0];
    const pwdCheck = document.getElementsByClassName("signup_form_pwd_double_check")[0];
    const pwdText1 = document.getElementsByClassName("signup_form_pwd_error1")[0];
    const pwdText2 = document.getElementsByClassName("signup_form_pwd_error2")[0];

    pwdText1.style.display = "none";
    pwdText2.style.display = "none";

    pwd.addEventListener("keyup", () => {
        pwdText1.style.display = "inline-block";
        if (pwd.value.length === 0) {
            pwdText1.style.display = "none";
            pwd_validate = true;
        } else if (!(4 <= pwd.value.length && pwd.value.length <= 16)) {
            pwdText1.style.color = "red";
            pwdText1.innerText = "Passwords must be between 4 and 16 characters.";
            pwd_validate = true;
        } else {
            pwdText1.style.color = "green";
            pwdText1.innerText = "Password available";
            pwd_validate = false;
        }

        if (pwdCheck.value.length === 0) {
            pwdText2.style.display = "none";
            pwd_check_validate = true;
        } else if (!(4 <= pwdCheck.value.length && pwdCheck.value.length <= 16)) {
            pwdText2.style.color = "red";
            pwdText2.innerText = "Passwords must be between 4 and 16 characters.";
            pwd_check_validate = true;
        } else if (pwd.value !== pwdCheck.value) {
            pwdText2.style.color = "red";
            pwdText2.innerText = "Passwords do not match.";
            pwd_check_validate = true;
        } else {
            pwdText2.style.color = "green";
            pwdText2.innerText = "Password matches";
            pwd_check_validate = false;
        }
    });

    pwd.addEventListener("focusin", () => {
        if (pwd.value.length === 0) {
            pwdText1.style.display = "none";
            pwd_validate = true;
        } else {
            pwdText1.style.display = "inline-block";
        }
    });

    pwdCheck.addEventListener("keyup", () => {
        pwdText2.style.display = "inline-block";
        if (pwdCheck.value.length === 0) {
            pwdText2.style.display = "none";
            pwd_check_validate = true;
        } else if (!(4 <= pwdCheck.value.length && pwdCheck.value.length <= 16)) {
            pwdText2.style.color = "red";
            pwdText2.innerText = "Passwords must be between 4 and 16 characters.";
            pwd_check_validate = true;
        } else if (pwd.value !== pwdCheck.value) {
            pwdText2.style.color = "red";
            pwdText2.innerText = "Passwords do not match.";
            pwd_check_validate = true;
        } else {
            pwdText2.style.color = "green";
            pwdText2.innerText = "Password matches";
            pwd_check_validate = false;
        }
    });

    pwdCheck.addEventListener("focusin", () => {
        if (pwdCheck.value.length === 0) {
            pwdText2.style.display = "none";
            pwd_check_validate = true;
        } else {
            pwdText2.style.display = "inline-block";
        }
    });

    // 아이디 중복 검사 후 다시 아이디를 수정했을 때
    idInput.addEventListener("keydown", () => {
        id_validate = true;
        idText.innerText = "";
    });
});


// ------ DOMContentLoaded 외부 영역 ------
// 휴대폰번호 입력 시 자동으로 다음 박스로 이동
function movePhoneBox() {
    const phoneFields = Array.from(document.getElementsByClassName("signup_form_num"));

    phoneFields.forEach((field, index) => {
        field.addEventListener("input", () => {
            if (index < phoneFields.length && field.value.length === field.maxLength) {
                phoneFields[index + 1].focus();
            }
        });
    });
}

// 이메일 형식 검증
function validateEmail() {
    const email = document.getElementsByClassName("signup_form_email")[0];
    return !(/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email.value));

}

let id_validate = true;
let pwd_validate = true;
let pwd_check_validate = true;

function validate() {
    if (id_validate) {
        alert("Please check for duplicate ID!");
        return false;
    }
    if (validateEmail()) {
        alert("Not a valid e-mail format");
        return false;
    }
    if (pwd_validate || pwd_check_validate) {
        alert("Please check the password!");
        return false;
    }
    alert("Signup successful!");
    return true;
}