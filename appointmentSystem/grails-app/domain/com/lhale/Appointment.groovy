package com.lhale

class Appointment {

Date appDate
String appTime
int appDuration
String roomNumber
Patient thepatient

static hasMany=[surgerys:Surgery]
static belongsTo=[Surgery]

String toString(){
return roomNumber
}


    static constraints = {

appDate nullable: false, blank: false
appTime nullable: false, blank: false
appDuration nullable: false, blank: false
roomNumber nullable: false, blank: false
thepatient nullable: true, blank: true
    }
}
