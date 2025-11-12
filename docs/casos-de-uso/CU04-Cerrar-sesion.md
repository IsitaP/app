# CU03 – Cerrar sesion

 Usuario (Pasajero o Conductor)

## Guion (Curso normal de eventos)

1. El usuario se encuentra dentro de la aplicación **UniTrip** con sesión activa.  
2. El usuario selecciona la opción **“Cerrar sesión”** desde el menú principal o la barra de perfil.  
3. El sistema muestra un mensaje de confirmación: *“¿Deseas cerrar sesión en UniTrip?”*.  
4. El usuario confirma la acción seleccionando **“Sí, cerrar sesión”**.  
5. El sistema elimina los datos temporales asociados a la sesión (tokens, caché, datos locales).  
6. El sistema actualiza el estado de sesión del usuario en la base de datos, marcándolo como **“desconectado”**.  
7. El sistema redirige al usuario a la pantalla de **inicio de sesión**, mostrando el mensaje: *“Has cerrado sesión correctamente.”*

---

## Excepciones (Caminos alternos)

**E1 – Usuario cancela la acción**  
3.1.1. El usuario selecciona **“Cancelar”** en el cuadro de confirmación.  
3.1.2. El sistema cierra el mensaje y mantiene la sesión activa sin realizar cambios.  
3.1.3. El flujo termina.  

**E2 – Fallo en la desconexión del servidor o error de red**  
5.1.1. El sistema no puede comunicarse con el servidor para actualizar el estado de sesión.  
5.1.2. El sistema muestra el mensaje: *“No se pudo cerrar sesión correctamente. Inténtalo de nuevo.”*  
5.1.3. El sistema mantiene los datos locales hasta que se confirme la desconexión.  
5.1.4. El flujo continúa cuando la conexión se restablece o el usuario reintenta la acción.  

**E3 – Cierre automático por inactividad**  
1.1.1. Si el sistema detecta un periodo prolongado de inactividad (por ejemplo, 15 minutos),  
1.1.2. el sistema cierra automáticamente la sesión del usuario por motivos de seguridad.  
1.1.3. El sistema muestra el mensaje: *“Tu sesión ha expirado por inactividad. Inicia sesión nuevamente para continuar.”*  
1.1.4. El flujo termina redirigiendo a la pantalla de inicio de sesión.  

---

## Postcondición

- El usuario queda **desconectado del sistema**, sin datos de sesión activos.  
- El sistema garantiza que la información personal y los tokens de autenticación sean eliminados del dispositivo local.  
- El usuario es redirigido a la **pantalla de inicio de sesión**, listo para autenticarse nuevamente.

> [Regresar al diagrama](../casos-de-uso.md)
