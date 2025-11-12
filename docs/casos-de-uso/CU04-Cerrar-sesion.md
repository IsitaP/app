CU07 – Cerrar Sesión

Actor principal: Usuario (Pasajero o Conductor)

Guion (Curso normal de eventos)

El usuario se encuentra dentro de la aplicación UniTrip con sesión activa.

El usuario selecciona el icono o la opción “Cerrar sesión” desde el menú principal o la barra de perfil.

El sistema muestra un mensaje de confirmación: “¿Deseas cerrar sesión en UniTrip?”.

El usuario confirma la acción seleccionando “Sí, cerrar sesión”.

El sistema elimina los datos temporales de la sesión activa (tokens, caché, datos locales).

El sistema actualiza el estado de sesión del usuario en la base de datos, marcándolo como “desconectado”.

El sistema redirige al usuario a la pantalla de inicio de sesión, mostrando el mensaje: “Has cerrado sesión correctamente.”

Excepciones (Caminos alternos)

E1 – Usuario cancela la acción
3.1. El usuario selecciona “Cancelar” en el cuadro de confirmación.
3.2. El sistema cierra el mensaje y mantiene la sesión activa sin realizar cambios.
3.3. El flujo termina.

E2 – Fallo en la desconexión del servidor o error de red
5.1. El sistema no puede comunicarse con el servidor para actualizar el estado de sesión.
5.2. El sistema muestra el mensaje: “No se pudo cerrar sesión correctamente. Inténtalo de nuevo.”
5.3. El sistema mantiene los datos locales hasta que se confirme la desconexión.
5.4. El flujo continúa cuando la conexión se restablece o el usuario reintenta la acción.

E3 – Cierre automático por inactividad
1.1. Si el sistema detecta un periodo prolongado de inactividad (por ejemplo, 15 minutos),
1.2. el sistema cierra automáticamente la sesión del usuario por motivos de seguridad.
1.3. El sistema muestra el mensaje: “Tu sesión ha expirado por inactividad. Inicia sesión nuevamente para continuar.”
1.4. El flujo termina redirigiendo a la pantalla de inicio de sesión.

Postcondición

El usuario queda desconectado del sistema, sin datos temporales activos.

El sistema garantiza que la información personal y los tokens de sesión sean eliminados del dispositivo local.

El usuario se encuentra en la pantalla de inicio de sesión, listo para autenticarse nuevamente.
