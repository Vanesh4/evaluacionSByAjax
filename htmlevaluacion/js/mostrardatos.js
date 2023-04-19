$(document).ready(function () {
    $('#botonListar').on('click', function () {
        tabla = document.querySelector('#tabla')
        tabla.innerHTML=""
        $.ajax({
            url: "http://localhost:8080/verTodosEsts",
            type: "GET",
            dataType: "JSON",
            success: function (res) {
                console.log(res)
                for (i = 0; i <= res.length ; i++) {
                    tabla.innerHTML+='<tr><td>'+
                    res[i].documento + '</td><td>'+
                    res[i].nombre + '</td><td>'+
                    res[i].apellido +'</td><td>'+
                    res[i].curso + '</td><td>'+
                    res[i].notaFinal + '</td><td>'+
                    res[i].observacion + '</td></tr>'                    
                }
            }
        })
    })

    $('#botonApro').on('click', function () {
        tabla = document.querySelector('#tablados')
        tabla.innerHTML=""
        $.ajax({
            url: "http://localhost:8080/eliminarReprobados",
            type: "GET",
            dataType: "JSON",
            success: function (res) {
                console.log(res)
                for (i = 0; i <= res.length ; i++) {
                    tabla.innerHTML+='<tr><td>'+
                    res[i].documento + '</td><td>'+
                    res[i].nombre + '</td><td>'+
                    res[i].apellido +'</td><td>'+
                    res[i].curso + '</td><td>'+
                    res[i].notaFinal + '</td><td>'+
                    res[i].observacion + '</td></tr>'                    
                }
            }
        })
    })

    $('#enviar').on('click', function () {
        doc = parseInt($('#doc').val()),
        notAct = parseFloat($('#na').val())
        console.log(notAct)
        text = document.querySelector(".texto")
        $.ajax({
            url: "http://localhost:8080/actualizarNota/"+doc+"/"+notAct,
            type: "PUT",
            dataType: "JSON",
            success: function (respuesta) {
                console.log(res)
                text.innerHTML="respuesta"+res
                alert(respuesta)
            }
        })
    })


})
