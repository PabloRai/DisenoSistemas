package usuario


class Direccion {
    Long id
    Integer numero
    Integer codigoPostal
    String localidad
    String provincia
    Integer piso
    Boolean departamento

    static constraints = {
    }
}
