// Funcion para seleccion de fecha de nacimiento:
// Llena los campos de edad y tipo de participante
function cambiaFechaNac() {
	var fecha = $('#datepickerFechaNac').val(); 
	$.get( 'stratega/fechaNacimiento/' + fecha, function( data ) {
		var arrRes = data.split('|');
		if ( arrRes[0]) {
			 $('#edad').val(arrRes[0]);
		}
		if ( arrRes[1]) {
			var tipoPart = arrRes[1];
			 $('#tipoParticipante').val(tipoPart);
			 if ( tipoPart == 1) {
				 $('#div-laboral-adulto').show();
			 } else if ( tipoPart == 2) {
				 $('#div-laboral-adulto').hide();
			 } else  if ( tipoPart == 3) {
				 $('#div-laboral-adulto').hide();
			 }
		}
	});	
}

$( '#datepickerFechaNac' ).change(function() {
	cambiaFechaNac();
});

//Funcion para seleccion de sede:
$( '#sede' ).change(function() {
	var sede = $('#sede').val(); 
console.log(sede);
	$.get( 'stratega/sede/' + sede, function( data ) {
console.log(data);
	});
});


/*$.validator.setDefaults({
	submitHandler: function() {
		alert("submitted!");
	}
});*/

//Función para botones de cambio de tabulador
$( '#changeTab2' ).click(function(e) {
	 e.preventDefault();
	 $( '#tabs' ).tabs( {active:1} );
});


//$().ready(function() {
$(function() {
	$("#formRegistro").validate({
		rules: {
			nombres: 'required',
			apellidoPaterno: 'required',
		},
		messages: {
			nombres: 'Ingrese el nombre',
			apellidoPaterno: "Ingrese apellido paterno",
		},
	    submitHandler: function(form) {
	        form.submit();
	     }		
	});
});