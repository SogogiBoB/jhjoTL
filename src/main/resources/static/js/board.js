const body = document.body;
body.addEventListener('click', detectClickArea);

const quesPopupBtn = document.querySelector(".quesPopupBtn");
const smPopupBox = document.querySelector(".smPopupBox");

quesPopupBtn.addEventListener('click', arrowPopupToggle);

function arrowPopupToggle() {
    console.log(smPopupBox.classList);
    smPopupBox.classList.toggle("displayBlock");
}

function detectClickArea(e) {
    let $icon = e.target.classList.contains("fa-circle-question");
    let $area = e.target.classList.contains("smPopupBox");

    if(!$icon && !$area) {
        smPopupBox.classList.remove("displayBlock");
    }
}