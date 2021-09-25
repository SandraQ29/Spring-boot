$(document).ready(function(){
$(".iocn-link").click(function(){ 
  $("li").removeClass("showMenu")
  $(this).parent("li").addClass("showMenu")
});
$(".bx-menu").click(function(){ 
  $("li").removeClass("showMenu")
  $(".sidebar").toggleClass("close");
});

$(".Dashboard").click(function(){ 
location.href="http://localhost:8080/web/Dashboard"
});
$(".Producto").click(function(){ 
  location.href="http://localhost:8080/web/Producto"
});

});

