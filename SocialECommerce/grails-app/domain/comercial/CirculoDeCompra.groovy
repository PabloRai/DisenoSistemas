package comercial

import usuario.Comprador

class CirculoDeCompra {
    static hasMany = [compradores: Comprador]
    static hasOne = [sorteo: Sorteo]

    Long id
    Date fechaFinalizacion
    BigDecimal montoTotal

    static constraints = {
    }
}
