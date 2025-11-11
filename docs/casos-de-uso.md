# Casos de Uso

## Diagrama de Casos de Uso

```plantuml
@startuml
left to right direction
skin rose

actor Sistema  

actor Estudiante

rectangle "confirmar contraseña y enviar formulario" {

    Estudiante --> (Seleccionar opción "Registrarse")
    Sistema --> (Mostrar formulario de registro)
    Estudiante --> (Ingresar datos personales)
    Sistema --> (Validar campos del formulario)
    Estudiante--> (Presionar "Registrarme")
    Sistema --> (Verificar correo institucional y duplicados)
    Sistema --> (Guardar información del usuario)
    Sistema --> (Enviar correo de verificación)
    Sistema --> (Mostrar mensaje de confirmación)

}
@enduml
```

## Listado de Casos de Uso

| # | Nombre |
|---|--------|
| CU01  | [ Confirmar Contraseña y Enviar Formulario](casos-de-uso/CU01-Confirmar-contraseña.md) |
| CU02  | Buscar Persona |
| CU03  | Enviar Solicitud de Amistad |
| CU04  | Aceptar o Rechazar solicitud de Amistad |
| CU05  | Ver sus amigos |