package com.lhale

class Receptionist {

String recepName
String recapEmail
String recepUsername
String recepPassword
String recepPhone

String toString(){
return recepName
}


    static constraints = {

recepName nullable: false, blank: false
recapEmail nullable: false, blank: false, email: true
recepUsername nullable: false, blank: false
recepPassword nullable: false, blank: false, password: true 
recepPhone  nullable: false, blank: false
    }
}
