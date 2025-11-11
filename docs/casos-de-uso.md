# Casos de Uso

## Diagrama de Casos de Uso (Registrar nuevo usuario)

```plantuml
@startuml
left to right direction
skin rose

actor Visitante
actor Usuario 

rectangle "Red Social" {

    Visitante --> (Registrar nuevo usuario)

    Usuario --> (Buscar Persona)
    Usuario --> (Enviar Solicitud de Amistad)
    Usuario --> (Aceptar o Rechazar solicitud de Amistad)
    Usuario --> (Ver sus amigos)

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
| CU01  | [Registrar nuevo usuario](casos-de-uso/CU01-Registrar-nuevo-usuario.md) |
| CU02  | [Registrar usuario con correo institucioanl](casos-de-uso/CU01-Registrar-nuevo-usuario.md) |
| CU03  | Enviar Solicitud de Amistad |
| CU04  | Aceptar o Rechazar solicitud de Amistad |
| CU05  | Ver sus amigos |