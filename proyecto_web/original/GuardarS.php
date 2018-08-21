<?php
	
	require 'ConexionS.php';
	
	$USUARIO = $_POST['USUARIO'];
	$PASSWORD = $_POST['PASSWORD'];
	$NOMBRE_USUARIO = $_POST['NOMBRE_USUARIO'];
	$CORREO = $_POST['CORREO'];
	$FECHA = $_POST['FECHA'];
	

	
	$sql = "INSERT INTO clientes (USUARIO, PASSWORD, NOMBRE_USUARIO, CORREO, FECHA) VALUES ('$USUARIO', '$PASSWORD', '$NOMBRE_USUARIO', '$CORREO', '$FECHA')";
	$resultado = $mysqli->query($sql);
	
?>

<html lang="es">
	<head>
		
		<meta name="viewport" content="width=device-width, initial-scale=1">

	</head>
	
	<body>
		<div class="container">
			<div class="row">
				<div class="row" style="text-align:center">
					<?php if($resultado) { ?>
						<h3>REGISTRO GUARDADO</h3>
						<?php } else { ?>
						<h3>ERROR AL GUARDAR</h3>
					<?php } ?>
					
					<a href="Logiin.html" class="btn btn-primary">Regresar</a>
					
				</div>
			</div>
		</div>
	</body>
</html>
