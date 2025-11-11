# CU01 – Confirmar Contraseña y Enviar Formulario

 Estudiante (Visitante)

## Guion (Curso normal de eventos)

1. El estudiante selecciona la opción **“Registrarse”** en la aplicación.
2. El sistema muestra el formulario de registro con los campos: nombre completo, correo institucional, contraseña, confirmación de contraseña, rol y carrera.
3. El estudiante completa todos los campos requeridos.
4. El sistema valida en tiempo real:
   - Que todos los campos estén diligenciados.
   - Que el correo tenga formato institucional (`@javeriana.edu.co`).
   - Que las contraseñas coincidan y cumplan con las políticas de seguridad.
5. El estudiante presiona el botón **“Registrarme”**.
6. El sistema verifica que el correo institucional no esté previamente registrado.
7. Si todas las validaciones son correctas, el sistema guarda la información del nuevo usuario en la base de datos.
8. El sistema envía un correo de verificación al correo institucional del estudiante.
9. El sistema muestra un mensaje confirmando el envío del correo y solicitando la verificación para activar la cuenta.

---

## Excepciones (Caminos alternos)

**E1 – Correo no institucional o formato inválido**  
4.1.1. El sistema muestra el mensaje: Debe ingresar un correo institucional válido (@javeriana.edu.co).  
4.1.2. El botón “Registrarme” permanece deshabilitado.  
4.1.3. El flujo continúa cuando el estudiante corrige el correo.

**E2 – Contraseñas no coinciden**  
4.2.1. El sistema muestra el mensaje: “Las contraseñas no coinciden”.  
4.2.2. El botón “Registrarme” permanece deshabilitado hasta que coincidan.  

**E3 – Contraseña débil**  
4.3.1. El sistema muestra: *“La contraseña debe tener al menos 6 caracteres, incluir mayúsculas y minúsculas”*.  
4.3.2. El estudiante debe modificar la contraseña antes de continuar.  

**E4 – Correo ya registrado**  
6.1. El sistema muestra: *“El correo ingresado ya está registrado. Inicia sesión o recupera tu contraseña.”*  
6.2. El proceso termina.  

**E5 – Fallo en el envío del correo de verificación**  
8.1. El sistema muestra: *“Error al enviar el correo de verificación. Inténtelo más tarde.”*  
8.2. El sistema conserva los datos y ofrece reintentar.  

---

## Postcondición

- El estudiante queda registrado en el sistema, con cuenta inactiva hasta la verificación del correo institucional.

> [Regresar al diagrama](../casos-de-uso.md)