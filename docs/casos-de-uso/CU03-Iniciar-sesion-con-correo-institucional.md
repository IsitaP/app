# CU03 - Inicio de sesión con correo institucional

 Usuario (Conductor o Pasajero)

## Guión (Curso normal de eventos)

1. El usuario selecciona la opción “Iniciar sesión”.
2. El sistema muestra el formulario de inicio de sesión.
3. El usuario ingresa el correo institucional y la contraseña.
4. El sistema valida que los campos no estén vacíos y cumplan con el formato.
5. El usuario presiona el botón “Ingresar”.
6. El sistema verifica que el correo sea institucional y que las credenciales coincidan con un registro existente.
7. El sistema inicia la sesión del usuario y redirige a la página principal correspondiente a su rol.

8. El sistema muestra un mensaje confirmando el inicio de sesión exitoso.

## Excepciones (Caminos alternos)

**E1: Existe algún campo vacío o con formato incorrecto

4.1 El sistema muestra un mensaje "Error, campo vacío o formato incorrecto."
4.2 Remarca el campo donde se presentó el error.

**E2: El correo no es institucional

5.1 El sistema muestra un mensaje "Debe ingresar un correo institucional válido."
5.2 Permite la posibilidad de rellenar de nuevo los campos.

**E3: Credenciales incorrectas

6.1 El sistema muestra un mensaje "Correo o contraseña incorrectos."
6.2 Permite al usuario volver a intentar o seleccionar la opción "¿Olvidó su contraseña?".

## Postcondición

- El usuario accede correctamente al sistema y puede utilizar las funcionalidades correspondientes a su rol (conductor o pasajero).