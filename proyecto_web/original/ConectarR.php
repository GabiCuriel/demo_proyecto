<?php
	
	$mysqli = new mysqli('localhost', 'root', '', 'restaurante1');
	
	if($mysqli->connect_error){
		
		die('Error en la conexion' . $mysqli->connect_error);
		
	}
?>