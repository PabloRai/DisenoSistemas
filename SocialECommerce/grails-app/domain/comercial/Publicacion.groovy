package comercial

class Publicacion {
    static hasOne = [producto: Producto]
    Long id
    Date fechaPublicacion
    Date fechaFinalizacion


    static constraints = {
    }
}
