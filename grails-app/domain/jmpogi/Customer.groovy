package jmpogi

class Customer {
    String name
    String address
    String email
    static constraints = {
        name nullable:true
        address nullable:true
        email nullable:true
    }
    static mapping = {
        id sqlType:'int', generator:'increment'
    }
   
}
