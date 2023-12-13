# ProyectoFinal
GRUPO 10\
Paula San Martín\
Ignacio Candia

![DiagramaDeCasosDeUso](https://github.com/IgnCan/ProyectoFinal/assets/147210706/52939436-fb52-412b-a601-f2bb7345ba94)
![TareaFinal vpd](https://github.com/IgnCan/ProyectoFinal/assets/147210706/5c9be4eb-8964-435b-8f24-07e0e4471a20)


#Deciciones Tomadas:

- trabajar de manera sincronica usando code with me, debido a nuestra disponibilidad de tiempo.\
- seguir avanzando a pesar de no tenr decidido el patron de diseño.\
- crear la combinacion de los recorridos, horarios, tipo de asiento y tipo de bus usando numeraciones para acceder rapidamente a los datos y precios adicionales y obtener de forma eficiente datos relevantes como el precio total por billete y un String identificador unico para cada recorrido.\
- el uso de cardlayout para el desplazamiento eficiente entre paneles.
- el uso de sublistas para almacenar los cambios en los botones al reservar un pasaje y asi acceder a ellos cuando se quiera comprar un pasaje en el mismo recorrido  

#Problemas encontrados:

- Dificultades en encontrar los patrones de diseño que se acomodara a nuestras necesidades.\
- El desarroo de el sistema de compra, ya que la implementascion de sublistas con distintos tipos de objetos que almacenara los pasajes y sus respectivos datos fue muy confuso.\
- Distribucion del tiempo, por la carga academica al final de semestre en ramos demandantes de nuestra malla curricular no pudimos dedicar el tiemppo deseado y requerido para terminar satisfactoriamente el proyecto.\
- No utilizamos de manera ideal las ventajas que nos proporciona Github, debido a que preferimos trabajar de manera sincronica a traves del uso de la herrameinta Code with me de intellij para compartir ideas e ir aplicadolas al mismo tiempo, ya que ambos compartiamos disponibilidad de horarios al momentos de trabajr en el proyecto.\
-El programa es funcional hasta enviar el horario, teniamos pensado crear un sistema de sublistas con un String identificador, el cual iba a ser creado con  los datos enviados por los enums asi cada recorrido tendria su lista unica que contendria el string verificador y la cantidas de Jbuttons Asientos correspondientes logramos impementar hasta la creasion de ese string indentificador, la idea es que este string identificador fuese enviado a un funcion que busque el string y la lista correspondiente en una lista principal encargada de almacenar estos recorridos, si esta existe es llamada y sus respectivos botones se muestran, y de no existir esta sera creada y llamada inmediatamente, luego , se deberia pasar al panel de compra y ahi realizar el proceso de reserva terminando la compra, y tras terminada la compra ser llevado de vuelta al panel de seleciion de recorridos iniciado nuevamente el proceso de compra. Esto no pudo ser implementado al quedar estancados al no poder agregar el sistema de reserva a los paneles, para que funcione con el strin verificador trayendo la lista.


