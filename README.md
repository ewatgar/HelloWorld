# HelloWorld ![badgeDEINT](https://img.shields.io/badge/DEINT-orange) ![badgeAS](https://img.shields.io/badge/Android_Studio-green) ![badgeAEA1](https://img.shields.io/badge/AEA1-HelloWorld-blue)

Se ha creado un proyecto de cero en Android Studio en el cual se han practicado ciertas funcionalidades básicas. La plantilla que hemos escogido es Empty View Activity.
 
<!--![Screenshot_20230930_120908](https://github.com/ewatgar/HelloWorld/assets/103525727/292996dd-29a3-41c4-8a6c-1f67961f683b)-->
<p align="center">
  <img src="https://github.com/ewatgar/HelloWorld/assets/103525727/292996dd-29a3-41c4-8a6c-1f67961f683b" width=25%>
</p>

## Pasos:

### Cambio de Layout

Al crear el proyecto ya se inicia con un TextView en el centro. Lo primero que hicimos fue cambiar el layout de Constraint a LinearLayout, para poder ver todas las vistas de forma secuencial. Más adelante se hizo un cambio de la orientación a vertical en el propio código. Todo esto se realizaría en activity_main.xml.

### Creación y ajuste de TextViews

Aparte de utilizar el TextView creado por defecto, creamos también otro TextView utilizando la paleta de vistas que se encuentra en la visualización de Design en activity_main.xml. A los dos se les asigna una id que sea identificativo, es decir, que fácilmente puedas intuir su función o rol en la aplicación.

Se hicieron ciertos cambios en el formato y composición de las view, por ejemplo, los atributos como el del ancho (width) se cambiaron a "match_parent" a los dos TextViews, el cual iguala el valor del ancho al del padre, que en este caso sería de la propia pantalla. El atributo del alto (height) se cambiaron a "0dp", ya que es necesario para que haga efecto de manera correcta el atributo "weight", el cual representa cuanto espacio debería ocupar en pantalla. Se ha utilizado el valor 0.5 para que quede mitad.

Se ha centralizado también el propio texto con el atributo textAlignment y gravity. Gravity, además de centrar de forma horizontal, también te deja hacer de forma vertical.

En la pestaña de atributos de cada view se ha modificado también el tamaño y el estilo del texto. También se han utilizado recursos de colores y strings para modificar el color del fondo y el texto.

### Creación de colors y strings

Para no utilizar texto "hardcoded" (es decir, texto que está explicitamente en el código y que es díficil de modificar) se necesita crear un recurso de string en strings.xml, en el cual se guardan todos los strings de la aplicación de manera concisa y que sea fácil de modificar. Para colores también se crean en colors.xml, donde se guarda cada valor hexadecimal. 

A cada recurso se se asigna un nombre identificativo, que es el que se utilizará para asignar ese texto o color a cada TextView. Se puede también modificar el valor del texto dandole click a la vista en la visualización de Design en activity_main.xml.

### Añadir lógica al programa

Si nos vamos a MainActivity.java, aquí es donde está donde se escribe las funcionalidades lógicas e interactivas de la app. Primero se han obtenido las TextView a partir de su id, y se han guardado en objetos. Estos objetos se utilizarán para modificar el color de texto o el mensaje al inicializar la app. Estos colores y este mensaje no son los predeterminados, sino que al ejecutar la app se hace el cambio.

### Modificar icono de la app

Antes de nada hay que eliminar todos archivos y directorios dentro de la carpeta mipmap. Ahora para cambiar el icono debemos ir a File > New > Image Asset, y en Launcher Icons elegimos una imagen que habremos descargado antes. Se puede modificar el tamaño para que ocupa bien, y se da a continuar. Se mostrará todos los archivos que se modificarán, que son los iconos en diferentes estilos y resoluciones.

### Crear documentación javadoc

Antes de generar el javadoc de nuestro proyecto hemos introducido un comentario de documentación en MainActivity.java, en el cual se ha especificado el autor, la versión de la app y una breve introducción. 

Para poder generar la documentación hay que primero añadir el android.jar del sdk que estamos utilizando en el proyecto. Para ello vamos a File > Project Structure > Dependencies y le damos al '+' debajo de All Dependencies, y elegimos JAR/ARR Dependency. Elegimos el android.jar del sdk, que está en AppData\Local\Android\Sdk\platforms

Para generar el javador ahora le damos a Tools > Generate JavaDoc, y se tiene que incluir el autor y la versión. También hay que elegir dónde guardar la documentación. Cuando esté generado habrá que ir a build.gradle (del módulo app) y comentar la linea donde aparece la librería que hemos añadido, para que así podamos ejecutar el programa de nuevo, ya que si no nos saldría una excepción de que AndroidManifest.xml está duplicado

#### Configuración git y Github

Para sincronizar Github con Android Studio hay que ir a Files > Version Control > GitHub, y añadimos nuestra cuenta introduciendo un token creado. Después se ha introducido la ruta donde se encuentra nuestro repositorio creado para sincronizarlo con nuestro proyecto.

Se han hecho diversos commits, antes y después de modificar el archivo .gitignore para que sólo se sincronice los archivos de Gradle y del proyecto en sí.
