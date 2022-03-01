# Trivial

##Problema 0

Extraemos el código duplicado a un único método "nuevaPosicionJugador", al que llamamos desde ambos sitios.

Creamos test unitario "si_al_principio_saco_un_1_voy_a_casilla_1"

##Problema 1

Comprobamos si una partida podría tener menos de 2 jugadores y nos aseguramos de ello.

##Problema 2

En el método esJugable hamos añadido a "cuantosJugadores() >= 2" un "cuantosJugadores() <= 6" para que haya jugaores entre esas dos cifras, pero despues añadir al sexto jugador nos ha saltado un bug. Para solucionarlo hemos cambiado las cantidades de los arrays de la clase Game, las hemos a puesto a 7. 

##Problema 3

Hemos añadido "enCasillaCastigo[jugadorActual] = false" en el método fueRespuestaCorrecta. Ahora el jugador pude salir de la cárcel cunado la respuesta sea correcta.

##Problema 4

