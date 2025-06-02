# Portal para la Gestión de Eventos Sostenibles

Este proyecto ha sido desarrollado por Hugo Gago de 1º de DAW como parte de la práctica del módulo de Formación Profesional. El objetivo es construir un portal web que permita a los usuarios gestionar y participar en eventos relacionados con la sostenibilidad.

## 🧩 Descripción del Proyecto

El portal permite:
- Registrar eventos sostenibles como talleres, conferencias o actividades ecológicas.
- Permitir a los usuarios registrarse y apuntarse a eventos.
- Gestionar perfiles de organizadores y usuarios.
- Clasificar eventos por tipo (conferencia, taller, etc.).
- Mostrar eventos destacados y listados navegables.

## 🛠️ Estructura del Proyecto

```plaintext
📁 /doc
   └─ Documento con la instalación del sistema operativo
📁 /sql
   └─ Scripts SQL con creación de tablas y diseño físico de la BD
📁 /html
   ├─ index.html (página principal con carrusel)
   ├─ eventos.html (listado de eventos)
   └─ detalle_evento.html (detalles del evento)
   📁 /css → Hojas de estilo CSS
   📁 /js → Archivos JavaScript
   📁 /images → Imágenes del portal
   📁 /fonts → Fuentes personalizadas
📁 /src
   📁 /main
       📁 /java/com/indra/eventossostenibles → Código fuente en Java
       📁 /resources → Archivos de configuración
   📁 /test
       📁 /java/com/indra/eventossostenibles → Pruebas en Java
       📁 /resources → Recursos para pruebas
