$(function(){

    $(".cinema_wrap>ul li:first").css({ background:"#fff"});
    $(".cinema_wrap>ul li ").on("mouseover",function(){
        $(".cinema_wrap>ul li:not(:eq("+$(this).index()+"))").css({ background:"#f1f1f1"});
        $(this).css({ background:"#fff" });
    });
    $(".cinema_wrap>ul li").on("click",function(){
        $(".cinema_list ul").hide();
        $(".cinema_list ul:eq("+$(this).index()+")").show();
    });
    
    $(".cinema_list input").on("click",function(){
        $(".c_top").text( $(this).attr("value"));
    });
   

    $(".movie_wrap button").on("click",function(){
        $(".m_top").text( $(this).find("span").text());
        return false;
    });

    $(".list_view div button").on("mouseover",function(){
        $(".list_view div button").css({ opacity:0.3});
        $(this).css({ opacity:1});
    });
    $(".list_view div button:first").on("click",function(){
        $(".movie_wrap span:nth-of-type(1)").css({ display:"none"});
        return false;
    });
    $(".list_view div button:last").on("click",function(){
        $(".movie_wrap span:nth-of-type(1)").css({ display:"block"});
        return false;
    });


    $(".calendar_date input").on("click",function(){
        $(".calendar_date input").css({ background:"#fff", color:"#000"});
        $(this).css({ background:"#000", color:"#fff"});

        if( $(this).attr("value") <10){
            $(".t_top strong").text( "2024-05-0"+$(this).attr("value")+"(오늘)");
        }else{
            $(".t_top strong").text( "2024-05-"+$(this).attr("value")+"(오늘)");
        };        
    });


    var calendar_count = 0;

    $(".calendar_btn button:last").on("click",function(){
        calendar_count += 1;
        if(calendar_count <3){
            $(".calendar_date ul").stop().animate({ marginLeft: -100 * calendar_count + "%"});
        }else{
            calendar_count = 2;
        };        
        return false;
    });
    $(".calendar_btn button:first").on("click",function(){
        calendar_count -= 1;
        if(calendar_count >= 0 ){
            $(".calendar_date ul").stop().animate({ marginLeft: -100 * calendar_count + "%"});
        }else{
            calendar_count = 0;
        };        
        return false;
    });


    $(".cal_movie button").on("mouseover",function(){

        $(".cal_movie button").css({ background:"#fff", color:"#000"});
        $(".cal_movie button b").css({ color:"#000"})

        $(this).css({ background:"red", color:"#fff"});
        $(this).find("b").css({ color:"#fff"});
    });
});