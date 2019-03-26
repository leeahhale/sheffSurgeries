package com.lhale

class Nurse {

String nurseName
String qualification
String nurseEmail
String nurseOffice
String nursePhone

static hasMany=[doctors:Doctor]
static belongsTo = [Doctor,Patient]

    static constraints = {

nurseName nullable: false, blank: false
qualification nullable: false, blank: false
nurseEmail nullable: false, blank: false, email: true
nurseOffice nullable: false, blank: false
nursePhone nullable: false, blank: false
    } 
}
