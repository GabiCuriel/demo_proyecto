<?php
	
	require 'ConectarR.php';
	
	$nombrec = $_POST['nombrec'];
       $id_mesa = $_POST['id_mesa'];
       $fecha = $_POST['fecha'];
	$apellido = $_POST['apellido'];
	$numero_telefono = $_POST['numero_telefono'];
	$hora = $_POST['hora'];
       $informacion = $_POST['informacion'];
    
	
	$sql = "INSERT INTO reservaciones (nombrec, id_mesa, fecha, apellido, numero_telefono, hora, informacion) VALUES ('$nombrec', '$id_mesa', '$fecha', '$apellido', '$numero_telefono', '$hora', '$informacion')";
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
						<h3>Gracias Por Realizar Tu Reservacion!</h3>
						<?php } else { ?>
						<h3>ERROR AL GUARDAR</h3>
					<?php } ?>
					
					<a href="session1.php" class="btn btn-primary">Regresar</a>
					
				</div>
			</div>
		</div>
	</body>
</html>
