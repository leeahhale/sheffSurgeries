package com.lhale

class Prescription {

String pharmacyName
int prescripNumber
String medicine
double totalCost
Date dateIssued
Boolean patientPaying

String toString(){
return pharmacyName
}


    static constraints = {

pharmacyName nullable: false, blank: false
prescripNumber nullable: false, blank: false
medicine nullable: false, blank: false
totalCost nullable: false, blank: false
dateIssued nullable: false, blank: false
patientPaying nullable: false, blank: false
    }
}
