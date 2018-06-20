package comercial

class Carrito {
    static hasMany = [productos: Producto]

    Long id
    static constraints = {
    }
}
