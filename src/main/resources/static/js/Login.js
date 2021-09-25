$(document).ready(function(){

    $("#Ingresar").click(function(e) {
		e.preventDefault();
		if (validarFormulario()) {
			var dato = new FormData();
			dato.append('usuario', $('#exampleInputUsuario').prop('value'));
			dato.append('password', $('#exampleInputPassword').prop('value'));
			$.ajax({
				type: "post",
				url: "http://localhost:8080/Login/Use",
				data: dato,
				dataType: "JSON",
				cache: false,
				contentType: false,
				processData: false,
				beforeSend: function() {
					$("#Ingresar").addClass("disabled");
				},
				success: function(json) {
					$("#Ingresar").removeClass("disabled");
				    console.log(json.ok)
					if (json.rol == "S") {
					 location.href="http://localhost:8080/Web/Dashboard"
					} else {
                        location.href="http://localhost:8080/Web/Admin"
					}
				},
				error: function(error) {
                    console.log(error)
				}
			});

			return false;
		}
	});

    $("#enviar").click(function(){  
        const Toast = Swal.mixin({
            toast: true,
            position: 'top-end',
            showConfirmButton: false,
            timer: 1000,
            timerProgressBar: true,
            didOpen: (toast) => {
                toast.addEventListener('mouseenter', Swal.stopTimer)
                toast.addEventListener('mouseleave', Swal.resumeTimer)
                $("#enviar").attr('disabled','disabled');
                $("#retroceder").attr('disabled','disabled');
            }   
        })
        $.ajax({
            url : 'http://localhost:8080/Login/Correo?correo='+$("#exampleInputCorreo").val(),
            type : 'POST',
            success : function(json) {
               console.log(json)
            },
            error : function(xhr, status) {
                console.log(status)
            },
            complete : function(xhr, status) {
                console.log(status)
                Toast.fire({
                    icon: 'success',
                    title: 'Se Envio Correctamente' 
                              
                }).then((result) => {
                    location.href = "http://localhost:8080/Login/"  
                });
                
            }
        });
    });
});