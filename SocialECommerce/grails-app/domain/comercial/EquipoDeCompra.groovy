package comercial

import usuario.Comprador

class EquipoDeCompra {
    static hasMany = [miembros: Comprador]

    Long id


    static constraints = {
    }
}
