package socialecommerce

class UrlMappings {

    static mappings = {


        "/circulos/$id"(controller: "circulos", action: [GET: "show"])
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
