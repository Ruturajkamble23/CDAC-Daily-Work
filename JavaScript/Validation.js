$(document).ready(function(){
    $("button").click(function(){
        var data1 = $("#x1").val();
        var data2 = $("#x2").val();
        var data3 = $("#x3").val();


        var regpincode=/^[1-9][0-9][0-9][0-9][0-9][0-9]$/;
        var regmobile=/^[1-9][0-9]{9}$/;
        var regpancard=/^([a-zA-Z]{5})([0-9]{4})([a-zA-Z])$/;

        var result1 = regpincode.test(data1);
        console.log(result1);
        var result2 = regmobile.test(data2);
        var result3 = regpancard.test(data3);

        if(!result1){
            $("p").html('<b>  Invalid Pincode</b>');
        }
        else if(!result2){
            $("p").html('<b>Invalid Mobile</b>');
        }
        else if (!result3){
            $("p").html('<b>Invalid Pancard</b>');
        }
        else{
            $("p").html('<b> Valid Date</b>');
        }
    });
})