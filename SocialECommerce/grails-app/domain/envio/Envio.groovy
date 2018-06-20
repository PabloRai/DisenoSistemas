package envio

import usuario.Direccion

class Envio {

    static hasOne = [direccion: Direccion]
    Long id
    String estadoEnvio

    static constraints = {
    }
}
