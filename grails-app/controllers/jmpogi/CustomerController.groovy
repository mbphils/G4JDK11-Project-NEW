package jmpogi

class CustomerController {

    def index() {
        println "sokpa Controller"
        redirect(action: "update",controller: "customer")
    }
    def create(){
        println "create"
    }
    
    def update() {
        println "update"
    }
}
