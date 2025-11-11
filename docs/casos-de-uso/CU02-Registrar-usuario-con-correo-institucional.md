# CU02 - Registro de usuario con correo institucional

Actor : Usuario (Conductor o pasajero)

## Guión (Curso normal de eventos)

1. El estudiante selecciona la opción “Registrarse”.
2. El sistema muestra el formulario de registro.
3. El estudiante ingresa nombre completo, correo institucional, contraseña, confirmación, rol y carrera.
4. El sistema valida los campos.
5. El estudiante presiona “Registrarme”.
6. El sistema verifica que el correo sea institucional y no esté registrado.
7. El sistema guarda la información y envía un correo de verificación.
8. El sistema muestra un mensaje confirmando el envío del correo.

## Excepciones (Caminos alternos)

**Excepcion:** Existe algun campo vacio o que no cumpla con el formato

4.1 Sistema muestra un mensaje "Error, Campo vacio o no cumple el fomrato requerido."

4.2 Remarca el campo donde haya presentado el error.

**Excepcion:** El correo no es institucional

5.1. Sistema muestra un mensaje "Correo no registrado en la institución."

5.2. Permite la posibilidad de rellenar de nuevo los campos


> [Regresar al diagrama](../casos-de-uso.md)