$(function () {
    // 상단 hide Filter를 눌렀을 시 좌측 메뉴가 사라지고 사진들이 커지게 하는 스크립트
    $(".stuffList_middle_top button:eq(1)").on("click", function () {
        if ($(".stuffList_middle_lists_left").is(":visible")) {
            // 좌측 메뉴가 보일 때: 숨기기
            $(".stuffList_middle_lists_left").hide(200, function () {
                $(".stuffList_middle_lists_right").css({
                    width: "120%",
                    margin: "0 auto",
                });
                $(".stuffList_middle_right_info_lists li").css({
                    margin: "50px",
                });
            });
        } else {
            // 좌측 메뉴가 숨겨져 있을 때: 다시 보이기
            $(".stuffList_middle_lists_left").show(200, function () {
                $(".stuffList_middle_lists_right").css({
                    width: "",
                    margin: "",
                });
                $(".stuffList_middle_right_info_lists li").css({
                    margin: "",
                });
            });
        }
    });
    // 가로정렬과 세로정렬을 시키는 기능
    $(".stuffList_middle_lists_right ul:eq(1)").hide();
    $(".colbutton").on("click", function () {
        $(".stuffList_middle_lists_right ul:eq(0)").hide();
        $(".stuffList_middle_lists_right ul:eq(1)").stop().animate().show();
        $(".stuffList_middle_top .colbutton").css({
            border: "1px solid #000",
        });
        $(".stuffList_middle_top .rowbutton").css({
            border: "1px solid #ECECEC",
        });
    });
    $(".rowbutton").on("click", function () {
        $(".stuffList_middle_lists_right ul:eq(1)").hide();
        $(".stuffList_middle_lists_right ul:eq(0)").stop().animate().show();
        $(".stuffList_middle_top .rowbutton").css({
            border: "1px solid #000",
        });
        $(".stuffList_middle_top .colbutton").css({
            border: "1px solid #ECECEC",
        });
    });
    // end

    // 왼쪽 창 첫번째 접기 버튼 활성화
    $(".list_menus_top:eq(0) button").on("click", function () {
        var $listItems = $(".list_menus_checkbox:eq(0) li");

        if ($listItems.is(":visible")) {
            $listItems.stop().slideUp();
            $(".list_menus_top:eq(0) button").css({transform: "scaleY(-1)"});
        } else {
            $listItems.stop().slideDown();
            $(".list_menus_top:eq(0) button").css({transform: "scaleY(1)"});
        }
    });
    // end
    // 왼쪽 창 두번째 접기 버튼 활성화
    $(".list_menus_top:eq(1) button").on("click", function () {
        var $listItems = $(".list_menus_checkbox:eq(1) li, .lists_jewelry>button ");

        if ($listItems.is(":visible")) {
            $listItems.stop().slideUp();
            $(".list_menus_top:eq(1) button").css({transform: "scaleY(-1)"});
        } else {
            $listItems.stop().slideDown();
            $(".list_menus_top:eq(1) button").css({transform: "scaleY(1)"});
        }
    });
    // end
    // 왼쪽 창 세번째 접기 버튼 활성화
    $(".list_menus_top:eq(2) button").on("click", function () {
        var $listItems = $(".list_menus_checkbox:eq(2) li, .lists_material>button");

        if ($listItems.is(":visible")) {
            $listItems.stop().slideUp();
            $(".list_menus_top:eq(2) button").css({transform: "scaleY(-1)"});
        } else {
            $listItems.stop().slideDown();
            $(".list_menus_top:eq(2) button").css({transform: "scaleY(1)"});
        }
    });
    $(".list_menus_top:eq(3) button").on("click", function () {
        var $listItems = $(".list_menus_checkbox:eq(3) li");

        if ($listItems.is(":visible")) {
            $listItems.stop().slideUp();
            $(".list_menus_top:eq(3) button").css({transform: "scaleY(-1)"});
        } else {
            $listItems.stop().slideDown();
            $(".list_menus_top:eq(3) button").css({transform: "scaleY(1)"});
        }
    });
    $(".list_menus_top:eq(4) button").on("click", function () {
        var $listItems = $(".lists_price_bottom");

        if ($listItems.is(":visible")) {
            $listItems.stop().slideUp();
            $(".list_menus_top:eq(4) button").css({transform: "scaleY(-1)"});
        } else {
            $listItems.stop().slideDown();
            $(".list_menus_top:eq(4) button").css({transform: "scaleY(1)"});
        }
    });
    $(".list_menus_top:eq(5) button").on("click", function () {
        var $listItems = $(".lists_price_bottom");

        if ($listItems.is(":visible")) {
            $listItems.stop().slideUp();
            $(".list_menus_top:eq(5) button").css({transform: "scaleY(-1)"});
        } else {
            $listItems.stop().slideDown();
            $(".list_menus_top:eq(5) button").css({transform: "scaleY(1)"});
        }
    });

    // 초기에는 3번째 li 요소부터 숨김 jewelry type
    $(".lists_jewelry_checkbox li:gt(2)").hide();

    // "See More" 버튼 클릭 시 이벤트 핸들러 jewelry type 부분
    $(".list_menus:eq(1)>button").on("click", function () {
        // 숨겨진 체크박스들을 보이게 하기
        if ($(this).text() === "See More") {
            $(".lists_jewelry_checkbox li:gt(2)").slideDown();
            // 버튼 텍스트 변경 (예시로 "See More"를 "Hide"로 변경)
            $(this).text("Hide");
        } else {
            // 리스트 항목들을 다시 숨기기
            $(".lists_jewelry_checkbox li:gt(2)").slideUp();
            // 버튼 텍스트를 다시 "See More"로 변경
            $(this).text("See More");
        }
    });

    // 초기에는 3번째 li 요소부터 숨김 Material type
    $(".lists_material_checkbox li:gt(2)").hide();

    // "See More" 버튼 클릭 시 이벤트 핸들러 jewelry type 부분
    $(".list_menus:eq(2)>button").on("click", function () {
        // 숨겨진 체크박스들을 보이게 하기
        if ($(this).text() === "See More") {
            $(".lists_material_checkbox li:gt(2)").slideDown();
            // 버튼 텍스트 변경 (예시로 "See More"를 "Hide"로 변경)
            $(this).text("Hide");
        } else {
            // 리스트 항목들을 다시 숨기기
            $(".lists_material_checkbox li:gt(2)").slideUp();
            // 버튼 텍스트를 다시 "See More"로 변경
            $(this).text("See More");
        }
    });

    // 필터링 기능

    // 가격필터링
    function applyFilters() {
        var minPrice = parseFloat($("#minimum_price").val().replace(/,/g, ""));
        var maxPrice = parseFloat($("#maximum_price").val().replace(/,/g, ""));
        // 재질 필터링
        var selectedMaterials = $(
            '.lists_material_checkbox input[type="checkbox"]:checked'
        )
            .map(function () {
                return $(this).attr("name");
            })
            .get();
        // 타입 필터링
        var selectedJewelry = $(
            '.lists_jewelry_checkbox input[type="checkbox"]:checked'
        )
            .map(function () {
                return $(this).attr("name");
            })
            .get();
        // 리스트 1번 가로정렬
        $(".stuffList_middle_right_info_lists li").each(function () {
            var priceText = $(this).find(".stuffList_specific p:eq(1)").text();
            var price = parseFloat(priceText.replace(/[^\d.-]/g, ""));
            // 재질 필터링
            var material = $(this)
                .find(".stuffList_specific p:first")
                .text()
                .toLowerCase()
                .trim();
            // 타입 필터링
            var jewelry = $(this)
                .find(".stuffList_specific span:first")
                .text()
                .toLowerCase()
                .trim();

            if (
                (isNaN(minPrice) || price >= minPrice) &&
                (isNaN(maxPrice) || price <= maxPrice) &&
                (selectedMaterials.length === 0 ||
                    selectedMaterials.includes(material)) &&
                (selectedJewelry.length === 0 || selectedJewelry.includes(jewelry))
            ) {
                $(this).show();
            } else {
                $(this).hide();
            }
        });
        // 리스트 2번 새로 정렬
        $(".stuffList_middle_right_info_lists2 li").each(function () {
            var priceText = $(this).find(".stuffList_price_button p:first").text();
            var price = parseFloat(priceText.replace(/[^\d.-]/g, ""));
            // 재질 필터링
            var material = $(this)
                .find(".stuffList_specific p:eq(1) span")
                .text()
                .toLowerCase()
                .trim();
            // 타입 필터링
            var jewelry = $(this)
                .find(".stuffList_specific p:eq(2) span")
                .text()
                .toLowerCase()
                .trim();

            if (
                (isNaN(minPrice) || price >= minPrice) &&
                (isNaN(maxPrice) || price <= maxPrice) &&
                (selectedMaterials.length === 0 ||
                    selectedMaterials.includes(material)) &&
                (selectedJewelry.length === 0 || selectedJewelry.includes(jewelry))
            ) {
                $(this).show();
            } else {
                $(this).hide();
            }
        });
    }

    // 가격 필터링 적용
    $("#submit_price_filter").on("click", function (e) {
        e.preventDefault();
        applyFilters();
    });

    // 재질 및 악세사리 타입 체크박스 필터 적용
    $(
        '.lists_material_checkbox input[type="checkbox"], .lists_jewelry_checkbox input[type="checkbox"]'
    ).on("change", function () {
        applyFilters();
    });

    // 체크박스 해제 시 해당 필터 제외하고 다시 필터링 적용
    $(
        '.lists_material_checkbox input[type="checkbox"], .lists_jewelry_checkbox input[type="checkbox"]'
    ).on("change", function () {
        if (!$(this).prop("checked")) {
            applyFilters();
        }
    });

    // 가격 필터 초기화
    $("#reset_price_filter").on("click", function () {
        $("#minimum_price").val("");
        $("#maximum_price").val("");
        applyFilters();
    });

    // 가격 비교 함수
    // 가격을 추출하는 함수
    function getPrice(item, listSelector) {
        var price;
        if (
            $(item)
                .closest(listSelector)
                .hasClass("stuffList_middle_right_info_lists")
        ) {
            price = parseFloat(
                $(item)
                    .find(".stuffList_specific p:eq(1)")
                    .text()
                    .replace(/[^\d.-]/g, "")
            );
        } else if (
            $(item)
                .closest(listSelector)
                .hasClass("stuffList_middle_right_info_lists2")
        ) {
            price = parseFloat(
                $(item)
                    .find(".stuffList_price_button p:first")
                    .text()
                    .replace(/[^\d.-]/g, "")
            );
        }
        return price;
    }

    $("#sort-select").on("change", function () {
        var selectedValue = $(this).val();

        if (selectedValue === "low-to-high") {
            sortByPrice(".stuffList_middle_right_info_lists", "asc");
            sortByPrice(".stuffList_middle_right_info_lists2", "asc");
        } else if (selectedValue === "high-to-low") {
            sortByPrice(".stuffList_middle_right_info_lists", "desc");
            sortByPrice(".stuffList_middle_right_info_lists2", "desc");
        } else if (selectedValue === "newest") {
            sortByNewest(".stuffList_middle_right_info_lists");
            sortByNewest(".stuffList_middle_right_info_lists2");
        }
    });

    // 가격에 따라 오름차순 혹은 내림차순으로 정렬하는 함수
    function sortByPrice(listSelector, order) {
        var $items = $(listSelector + " li");

        $items.sort(function (a, b) {
            var priceA = getPrice(a, listSelector);
            var priceB = getPrice(b, listSelector);

            if (order === "asc") {
                return priceA - priceB;
            } else {
                return priceB - priceA;
            }
        });

        // 정렬된 아이템을 다시 순서대로 나열
        $(listSelector).empty().append($items);
    }

    // 날짜순으로 정렬하는 함수
    function sortByNewest(listSelector) {
        var $items = $(listSelector + " li");

        $items.sort(function (a, b) {
            var dateA = new Date(getDateValue(a, listSelector));
            var dateB = new Date(getDateValue(b, listSelector));
            return dateB - dateA; // 최신순 정렬
        });

        // 정렬된 아이템을 다시 순서대로 나열
        $(listSelector).empty().append($items);
    }

    function getDateValue(item, listSelector) {
        var dateText;
        if (listSelector === ".stuffList_middle_right_info_lists") {
            dateText = $(item)
                .find(".stuffList_specific p:nth-of-type(3)")
                .text()
                .trim();
        } else if (listSelector === ".stuffList_middle_right_info_lists2") {
            dateText = $(item)
                .find(".stuffList_specific p:nth-of-type(4)")
                .text()
                .trim();
        }
        return dateText;
    }
});
