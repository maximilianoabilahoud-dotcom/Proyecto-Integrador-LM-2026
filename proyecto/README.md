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

---

## Registro de Correcciones del Validador W3C

| Fichero | Error detectado en W3C | Corrección realizada |
| :--- | :--- | :--- |
| `index.html` | Faltaba cerrar un contenedor `<div>` al final del documento. | Se añadió la etiqueta de cierre `</div>` antes del `</body>`. |
| `index.html` | Carácter especial `©` insertado en texto plano. | Se sustituyó por la entidad HTML oficial `&copy;`. |
| `cuidados.html` | Falta de atributo `alt` o espacio en etiquetas preformateadas. | Ajuste de márgenes en la etiqueta `<pre>` y validación limpia de etiquetas. |
| `razas.html` | Falta de elementos estructurales requeridos (`blockquote` y `<pre>`). | Se agregaron los elementos correspondientes cumpliendo el estándar W3C. |

## Formulario de Contacto

Se utiliza el método `post` en lugar de `get` para garantizar la privacidad y seguridad de los datos introducidos por el usuario, evitando que información sensible se envíe expuesta a través de la URL.

---

## Estructura del repositorio
```text
Proyecto-Integrador-LM-2026/
└── proyecto/
    ├── index.html
    ├── razas.html
    ├── cuidados.html
    ├── datosgatos.html
    ├── datos.xml
    ├── img/
    └── README.md