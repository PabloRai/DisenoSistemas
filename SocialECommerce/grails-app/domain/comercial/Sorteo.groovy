package comercial

class Sorteo {
    static belongsTo = [circulo: CirculoDeCompra]
    Long id
    Long idGanador

    static constraints = {
    }
}
