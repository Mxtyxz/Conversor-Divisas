# Conversor-Divisas
 Conversor basico de divisas(USD, BRL, COP, ARS).
Conversor de Divisas 💱
Descripción 📝
El Conversor de Divisas es una aplicación simple en Java que permite convertir montos de una moneda a otra utilizando tasas de cambio obtenidas en tiempo real desde una API de tipo cambio. Es ideal para personas que necesitan realizar conversiones rápidas entre diferentes divisas.

Características 🚀
Conversión de divisas en tiempo real.
Soporta las siguientes monedas:
Dólar estadounidense (USD)
Peso argentino (ARS)
Real brasileño (BRL)
Peso colombiano (COP)
Interfaz interactiva basada en consola.
Manejo de errores para tasas de cambio no disponibles o problemas de conexión.
Requisitos del Sistema ⚙️
Java 11 o superior instalado.
Conexión a Internet para consumir la API de tipo de cambio.
Configuración de la clave API del servicio ExchangeRate-API como variable de entorno:
EXCHANGE_API_KEY
Instalación y Configuración 🛠️
Clona este repositorio en tu máquina:

bash
Copy code
git clone https://github.com/tuusuario/conversor-divisas.git
cd conversor-divisas
Configura la clave API como una variable de entorno en tu sistema:

Windows:
cmd
Copy code
set EXCHANGE_API_KEY=tu_clave_api
Mac/Linux:
bash
Copy code
export EXCHANGE_API_KEY=tu_clave_api
Compila y ejecuta el programa:

bash
Copy code
javac -d bin src/com/alura/conversor_divisas/*.java
java -cp bin com.alura.conversor_divisas.Principal
Uso 📖
Al ejecutar el programa, selecciona las opciones del menú para la conversión de divisas.
Ingresa el monto que deseas convertir.
Recibe el valor convertido al instante.
Ejemplo de ejecución:

markdown
Copy code
********************************************
Sea bienvenido/a al Conversor de Divisas

1) Dolár =>> Peso argentino
2) Peso argentino =>> Dolár
3) Dolár =>> Real brasileño
4) Real brasileño =>> Dolár
5) Dolár =>> Peso colombiano
6) Peso colombiano =>> Dolár
7) salir

Elija una opción válida:
********************************************

Ingrese el valor que desea convertir:
El valor de 100.00 [USD] corresponde al valor final de =>>> 36000.00 [COP]
Tecnologías Utilizadas 🛠️
Java 11+
API ExchangeRate-API para las tasas de cambio.
Google GSON para el manejo y parseo de JSON.
Java HTTP Client para realizar solicitudes HTTP.
Contribuciones 🤝
¡Las contribuciones son bienvenidas! Si quieres agregar nuevas funcionalidades o mejorar el código, abre un Pull Request con tus cambios. Asegúrate de seguir las mejores prácticas para mantener el código limpio.

Licencia 📄
Este proyecto está licenciado bajo los términos de la licencia MIT. Consulta el archivo LICENSE para más detalles.

¡Gracias por usar el Conversor de Divisas! Si tienes preguntas, abre un Issue o contáctame directamente.