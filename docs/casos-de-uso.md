# Casos de Uso

## Diagrama de Casos de Uso (Registrar nuevo usuario)

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
## Caso de Uso: Registrarse con correo institucional

```plantuml
@startuml
left to right direction
skin rose

actor Estudiante

rectangle "Sistema UniTrip" {
    (Registrarse con correo institucional) as UC1
    (Confirmar contraseña y enviar formulario) as UC2
    (Verificar correo institucional) as UC3
    (Iniciar sesión) as UC4
}

Estudiante --> UC1
Estudiante --> UC2
Estudiante --> UC3
Estudiante --> UC4
@enduml
```




## Listado de Casos de Uso

| # | Nombre |
|---|--------|
| CU01  | [Confirmar contraseña](casos-de-uso/CU01-Registrar-nuevo-usuario.md) |
| CU02  | [Registrar usuario con correo institucioanl](casos-de-uso/CU01-Registrar-nuevo-usuario.md) |
| CU03  | Diseñar |
| CU04  | Buscar Persona |
