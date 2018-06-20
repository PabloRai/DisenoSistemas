package comunicacion

class Mensaje {
    Long id
    Long idUsuarioEmisor
    Long idUsuarioReceptor
    String mensaje
    static constraints = {
    }
}
