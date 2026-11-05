# Proyecto Integrador - Lenguaje de Marcas (UD1 y UD2)

## Información del estudiante
* **Nombre:** [Maximiliano Abilahoud Hidalgo]
* **Usuario de GitHub:** [maximilianoabilahoud-dotcom]

---

## Tema elegido
**Tema:** [Razas de gatos]

### ¿Por qué he elegido este tema?
He elegido este tema porque a demas de de que me gustan los gatos, tambien porque quiero hacer una pagina web que documente todos los tipos de gatos 

---

## Palabra del día
* **Palabra del día:** [meta, Dia]

---

## Qué he hecho en esta entrega
En esta primera entrega correspondiente a las Unidades Didácticas 1 y 2, he creado la estructura inicial del proyecto dentro del repositorio. He desarrollado una página web (`index.html`) estructurada semánticamente con etiquetas de texto, imágenes, listas y enlaces. Además, he creado un archivo de datos (`datos.xml`) bien formado para almacenar la información correspondiente a la lista del HTML utilizando un vocabulario XML propio.

## UD3 · Estructura HTML
Analizando el estado actual de mi archivo `index.html` con respecto a los contenidos de la UD3, identifico las siguientes 3 faltas/errores de estructura que deben ser corregidos:

## Mapa del sitio

| Fichero | Título | Qué contiene |
| :--- | :--- | :--- |
| `index.html` | Inicio \| Razas de gatos | Portada: presentación general y bienvenida al sitio web felino. |
| `razas.html` | Razas \| Razas de gatos | Catálogo detallado de las razas de gatos más populares y conocidas. |
| `cuidados.html` | Cuidados \| Razas de gatos | Consejos de bienestar, blockquote de opinión y ficha técnica de mantenimiento. |
| `datosgatos.html` | Datos XML \| Razas de gatos | Listado completo con todos los elementos y pesos extraídos del fichero `datos.xml`. |
| `contacto.html` | Contacto \| Razas de gatos | Formulario de contacto y consultas sobre el mundo felino. |

---

## Registro de Correcciones del Validador W3C

| Fichero | Error detectado en W3C | Corrección realizada |
| :--- | :--- | :--- |
| `index.html` | Faltaba cerrar un contenedor `<div>` al final del documento. | Se añadió la etiqueta de cierre `</div>` antes del `</body>`. |
| `index.html` | Carácter especial `©` insertado en texto plano. | Se sustituyó por la entidad HTML oficial `&copy;`. |
| `cuidados.html` | Falta de atributo `alt` o espacio en etiquetas preformateadas. | Ajuste de márgenes en la etiqueta `<pre>` y validación limpia de etiquetas. |
| `razas.html` | Falta de elementos estructurales requeridos (`blockquote` y `<pre>`). | Se agregaron los elementos correspondientes cumpliendo el estándar W3C. |
| `index.html` (UD5) | Warning: el atributo `border="1"` en la etiqueta `<table>` está obsoleto. | Se eliminó el atributo `border="1"` dejando la etiqueta `<table>` limpia para HTML5. |
| `contacto.html` (UD5) | 0 errores detectados. | Documento validado correctamente a la primera. |

## UD5 · Tablas y formularios

### Formulario de Contacto (Reto 3)

Se utiliza el método `post` en lugar de `get` para garantizar la privacidad y seguridad de los datos personales del usuario, evitando que información sensible como el correo o el teléfono viaje expuesta en la barra de direcciones del navegador.

URL generada tras la prueba temporal con el método `get`:
`http://127.0.0.1:5500/proyecto/contacto.html?nombre=Juan+P%C3%A9rez&correo=juan%40email.com&telefono=600112233&motivo=cuidados&preferencia=email&intereses=alimentacion&mensaje=Consulta+de+prueba+sobre+gatos`

## UD5 · Tablas y formularios

### 1. Resumen del trabajo realizado
En esta entrega he implementado una tabla de datos completa sobre razas de gatos en `index.html` utilizando la estructura semántica completa (`caption`, `thead`, `tbody`, `tfoot`, `scope` y `colgroup`, combinando `colspan` y `rowspan`). Además, he desarrollado la página `contacto.html` con un formulario temático adaptado a consultas felinas que incluye los 8 tipos de control requeridos, atributos de validación (`required`, `placeholder`, `autofocus`, etc.) y fieldsets estructurados.

### 2. Formulario de Contacto (Reto 3)

Se utiliza el método `post` en lugar de `get` para garantizar la privacidad y seguridad de los datos personales del usuario, evitando que información sensible como el correo o el teléfono viaje expuesta en la barra de direcciones del navegador.

URL generada tras la prueba temporal con el método `get`:
`http://127.0.0.1:5500/proyecto/contacto.html?nombre=Juan+P%C3%A9rez&correo=juan%40email.com&telefono=600112233&motivo=cuidados&preferencia=email&intereses=alimentacion&mensaje=Consulta+de+prueba+sobre+gatos`

---

Proyecto-Integrador-LM-2026/
└── proyecto/
    ├── index.html
    ├── razas.html
    ├── cuidados.html
    ├── datosgatos.html
    ├── contacto.html
    ├── datos.xml
    ├── img/
    └── README.md