package usuario

class Tarjeta {

    Long id
    Integer nroTarjeta
    String nombreTitular
    Integer codigoSeguridad
    Date fechaVencimiento

    static constraints = {
    }
}
