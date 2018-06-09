package usuario

import comunicacion.Mensaje

abstract class Usuario {
    static hasMany = [mensajes: Mensaje]
    static hasOne = [direccion: Direccion]

    Long id
    String tipoDocumento //SHOULD BE AN ENUM
    String documento
    String nombre
    String apellido
    String email
    Integer telefono
    Direccion direccion
    Date fechaNacimiento
    Date fechaRegistracion
    BigDecimal dineroEnCuenta
    Set<Mensaje> mensajes


    static constraints = {
    }
}
