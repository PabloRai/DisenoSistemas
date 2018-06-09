package comercial

import groovy.transform.CompileStatic


@CompileStatic
enum Estado {
    ACTIVO('activo'),
    PAUSADO('pausado'),
    FINALIZADO('finalizado')
    String id

    Estado(String id) {
        this.id = id
    }
}


