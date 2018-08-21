<?php
            #session_star -Iniciar una nueva sesion o reanudar la existente.
            session_start();
            ##isset -Determina si una variable esta definida y no es NULL.
            #$_SESSION-Variables de sesion.
            if (!isset($_SESSION["usuario"]))
            {
                #header-Enviar encabezado sin formato HTTP
                header("Location:Logiin.html");
            }
            ?>
            <h1>Zona VIP</h1>
            <?php
            #printf-Imprimir una cadena con formato
            printf("usuario: %s", $_SESSION["usuario"]);
            echo "<br><a href='session2.php'>cerrar Sesi&oacute;n</a>";
            ?>

<!DOCTYPE HTML>
    <HTML>
        <HEAD>
            <TITLE> Recetas </TITLE>
            <style>
                img {height: 400px;
                    width: 1350px;
                    top:auto;
                    position: relative;}
                .contenedor{
                    height: 400px;
                    width: 1350px;
                    float: left;
                    }   
                 h1 {font-family: 'Lucida Handwriting';
                     color: white;
                     position: absolute;
                     top: 55px;
                     font-size: 100px;
                     left: 0;
                     width: 100%;}
                h2{font-family: 'Lucida Handwriting';
                     color: darkred;}
                fieldset {width: 550px;
                    background-color: white;
                    margin: 15px;
                    opacity: 0.8.5;
                    border-color: white;
                    color: black;
                    font-family: 'Bradley Hand ITC';
                    height: 610px}
                legend {color: chocolate;
                    font-family:'Lucida Handwriting'}
                textarea {height: 70px;}
                input {height: 25px;
                    width: 220px;
                    background-color: white;
                    font-family:'Lucida Handwriting';
                    color: black;}
                select {height: 30px;
                    width: 60px;}
                #imagen {height: 700px;
                    width: 680px;
                    float: left;;}
                .caja3{float: left;}
                .fin {height: 250px;
                    width: 650px;
                    background-color: white;
                    opacity: 0.9;
                    float: left;}
                .min {background-color: white;
                    margin: 12px;
                    height: 165px;
                    width: 190px;
                    float: left;}
                #mesa {margin: 12px;
                    height: 120px;
                    width: 176px;
                    float: left;}
            </style>
        </HEAD>
        <body>
            <div class="contenedor"><img src="imagen2.jpg"><h1><center>Reservas</center></h1></div>
            <div class="caja3">
                <form class="form-horizontal" method="POST" action="GuardarR.php" autocomplete="off"> 
                    <fieldset>
                        <legend><h2>Tus Datos</h2></legend>
                        <p>  
                            <h3><label for="nombrec" class="col-sm-2 control-label">Nombre:</label>   &nbsp;&nbsp;&nbsp;&nbsp;        
                            <input type="text" class="form-control" id="nombrec" name="nombrec" placeholder="nombre"  required /></h3>
                        <h3><p>  
                            <label for="apellido" class="col-sm-2 control-label">Apellido:</label>      &nbsp;&nbsp;&nbsp;&nbsp;  
                            <input type="text" class="form-control" name='apellido' id="apellido" placeholder="apellido"  required/> 
                        </p></h3>
                        <h3><p>  
                            <label for="id_mesa" class="col-sm-2 control-label">Número de Mesa:</label>      &nbsp;&nbsp;&nbsp;&nbsp;  
                            <input type="text" class="form-control" name='id_mesa' id="id_mesa" placeholder="numero de mesa"  required />    
                        </p></h3>
                        <h3><p>  
                            <label for="numero_telefono" class="col-sm-2 control-label">Número Telefonico:</label>      &nbsp;&nbsp;&nbsp;&nbsp;     
                            <input type="text" class="form-control" name='numero_telefono' id="numero" placeholder="numero_telefono"  required  />    
                        </p></h3>
                        <h3><p>  
                            <label for="fecha" class="col-sm-2 control-label">Fecha de reserva:</label>      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;     
                            <input  type="text" class="form-control" name='fecha' id="fecha" placeholder="AAAA/MM/DD"  required />    
                        </p></h3>
                        <h3><p>      
                            Hora de reserva:
                            &nbsp;&nbsp;&nbsp;&nbsp;
                            <select name="hora" for="hora" class="col-sm-2 control-label">
                                <option id="hora" >9:00</option> 
                                <option>10:00</option>
                                <option>11:00</option>       
                                <option>12:00</option> 
                                <option>13:00</option>
                                <option>14:00</option>
                                <option>15:00</option> 
                                <option>16:00</option>
                                <option>17:00</option>
                                <option>18:00</option>
                            </select>
                            </p></h3>  
                        <h3><p> 
                            <label for="informacion" class="col-sm-2 control-label">Información Adicional:</label><br><br> 
                            <textarea id="informacion" rows="2" class="informacion" name='informacion' cols="60">Información Adicional</textarea> 
                        </p></h3>   
                        <h3><p>
                            <center><input type="submit"            		
                                   id="envía"           			
                                   value="Reservar" class="btn btn-primary"/></center></p></h3>
                    </fieldset> 
                </form>
            </div>
            <div class="fin">
                <div class="min"><img id="mesa" src="mesa1.jpg"><center><h2>Mesa 1</h2></center>                </div>
                <div class="min"><img id="mesa" src="mesa1.jpg"><center><h2>Mesa 2</h2></center>  </div>
                <div class="min"><img id="mesa" src="mesa1.jpg"><center><h2>Mesa 3</h2></center>  </div>
                <div class="min"><img id="mesa" src="mesa1.jpg"><center><h2>Mesa 4</h2></center>  </div>
                <div class="min"><img id="mesa" src="mesa1.jpg"><center><h2>Mesa 5</h2></center>  </div>
                <div class="min"><img id="mesa" src="mesa1.jpg"><center><h2>Mesa 6</h2></center>  </div>
                <div class="min"><img id="mesa" src="mesa1.jpg"><center><h2>Mesa 7</h2></center>  </div>
            </div>
            
        </body>
</HTML>