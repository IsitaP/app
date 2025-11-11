# Casos de Uso

## Diagrama de Casos de Uso

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

## Listado de Casos de Uso

| # | Nombre |
|---|--------|
| CU01  | [Registrar nuevo usuario](casos-de-uso/CU01-Registrar-nuevo-usuario.md) |
| CU02  | Buscar Persona |
| CU03  | Enviar Solicitud de Amistad |
| CU04  | Aceptar o Rechazar solicitud de Amistad |
| CU05  | Ver sus amigos |