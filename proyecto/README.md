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
* **Palabra del día:** [meta]

---

## Qué he hecho en esta entrega
En esta primera entrega correspondiente a las Unidades Didácticas 1 y 2, he creado la estructura inicial del proyecto dentro del repositorio. He desarrollado una página web (`index.html`) estructurada semánticamente con etiquetas de texto, imágenes, listas y enlaces. Además, he creado un archivo de datos (`datos.xml`) bien formado para almacenar la información correspondiente a la lista del HTML utilizando un vocabulario XML propio.

## UD3 · Estructura HTML
Analizando el estado actual de mi archivo `index.html` con respecto a los contenidos de la UD3, identifico las siguientes 3 faltas/errores de estructura que deben ser corregidos:

1. **Metadatos incompletos y formato del título en la cabecera (`<head>`)**:
   * Falta incluir los metadatos esenciales en el `<head>`: `<meta name="description">` (resumen de la web), `<meta name="keywords">` (palabras clave del tema) y `<meta name="author">` (autor)[cite: 3].
   * El título `<title>` no sigue el formato requerido (`Inicio | Nombre del proyecto`)[cite: 3].
   * Además, se incluye erróneamente un enlace visible (`<a href="datos.xml">`) dentro del `<head>`[cite: 5], cuando en la cabecera solo se debe incluir información invisible para el usuario[cite: 3].

2. **Incorrecta jerarquía de títulos (`<h1>`...`<h6>`) y anidamiento inválido**:
   * Existen dos etiquetas `<h1>` en la misma página (`<h1>Mi pagina web</h1>` y `<h1>Razas de gatos</h1>`)[cite: 5], vulnerando la regla de usar **un único `<h1>` principal por página**[cite: 3].
   * Se anida un párrafo `<p>` dentro de un encabezado de segundo nivel (`<h2><p>...</p></h2>`)[cite: 5], lo cual es una estructura HTML incorrecta según los estándares de la UD3[cite: 3].

3. **Falta de organización en bloques semánticos (`<div>`) y comentarios explicativos**:
   * Gran parte del contenido del cuerpo (`<body>`) se encuentra suelto sin agrupar en bloques o secciones mediante etiquetas `<div>`[cite: 3, 5].
   * Faltan los comentarios explicativos (ej. `<!-- Cabecera -->`, `<!-- Listado de razas -->`) que ayuden a estructurar y leer el árbol del documento antes de añadirle estilos[cite: 3].

   ## Mapa del sitio

| Fichero | Título | Qué contiene |
| :--- | :--- | :--- |
| `index.html` | Inicio \| Razas de gatos | Portada: presentación general y bienvenida al sitio web felino. |
| `razas.html` | Razas \| Razas de gatos | Catálogo detallado de las razas de gatos más populares y conocidas. |
| `cuidados.html` | Cuidados \| Razas de gatos | Consejos de bienestar, blockquote de opinión y ficha técnica de mantenimiento. |
| `datosgatos.html` | Datos XML \| Razas de gatos | Listado completo con todos los elementos y pesos extraídos del fichero `datos.xml`. |

---

## Estructura del repositorio
```text
Proyecto-Integrador-LM-2026/
└── proyecto/
    ├── index.html         (portada, mejorada en esta unidad)
    ├── pagina-1.html      (NUEVA: una por cada página de tu mapa del sitio)
    ├── pagina-2.html      (NUEVA)
    ├── pagina-3.html      (NUEVA)
    ├── ...                (todas las que tenga tu web)
    ├── datos.xml
    ├── img/
    └── README.md
