package comercial

class Subasta {
    static hasOne = [producto: Producto]
    Long id
    String descripcion
    BigDecimal precioMinimo
    static constraints = {
    }
}
