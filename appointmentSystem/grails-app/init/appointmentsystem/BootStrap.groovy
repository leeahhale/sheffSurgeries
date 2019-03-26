package com.lhale

class BootStrap {

    def init = { servletContext ->



def sarah=new Doctor (

		fullname: 'Dr Sarah MacDonald',
		qualification: 'MBChB(Sheffield)',
		position: 'GP, Surgeon',
		doctorEmail: 's.macdonald@myemail.com',
		password: 'secret222',
		doctorOffice: 'D9888',
		doctorPhone: '01111777',
		bio: ' hellooooo'
		).save()

def janet=new Doctor (

		fullname: 'Dr Janet Bailey',
		qualification: 'MBChB(Chesterfield)',
		position: 'GP, Surgeon',
		doctorEmail: 'j.bailey@myemail.com',
		password: 'secret123',
		doctorOffice: 'A1234',
		doctorPhone: '01234567',
		bio: ' helloooooooo'
		).save()

def sheffield=new Surgery (

		name: 'City Health Centre',
		address: '21 Marble Street, Sheffield',
		postcode: 'S11 5TY',
		telephone: '0114 555 555',
		numberOfPatients: 50,
		description: 'heeeellloooo',
		openingTime: '09:00-17:00hrs'
		).save()

def nottingham=new Surgery (

		name: 'Nottingham Health Centre',
		address: '21 darkzy Street, Nottingham',
		postcode: 'NG0 5HY',
		telephone: '0114 123 321',
		numberOfPatients: 30,
		description: 'heeeellloooo',
		openingTime: '09:00-17:00hrs'
		).save()

def rob=new Receptionist (

		recepName: 'Rob Kingston',
		recapEmail: 'r.kingston@email.com',
		recepUsername: 'rking',
		recepPassword: 'secret2019',
		recepPhone: '0114 222 4445'
		).save()

def ben=new Receptionist (

		recepName: 'Ben Kata',
		recapEmail: 'b.kata@email.com',
		recepUsername: 'bkata',
		recepPassword: 'swag123',
		recepPhone: '0114 101 1010'
		).save()

def susan=new Nurse (

		nurseName: 'Susan Peters',
		qualification: 'Registered General Nurse',
		nurseEmail: 's.peters@myemail.com',
		nurseOffice: 'B-455',
		nursePhone: '0114 222 4433'
		).save()

def chloe=new Nurse ( 

		nurseName: 'Chloe Winters',
		qualification: 'Registered General Nurse',
		nurseEmail: 'c.winters@myemail.com',
		nurseOffice: 'B-123',
		nursePhone: '0114 202 2020'
		).save()

def para=new Prescription (

		pharmacyName: 'City Centre Pharmacy',
		prescripNumber: 56788,
		medicine: 'Paracetomol',
		totalCost: 5.90,
		dateIssued: new Date('25/05/2019'),
		patientPaying: true
		).save()

def code=new Prescription (

		pharmacyName: 'City Centre Pharmacy',
		prescripNumber: 12345,
		medicine: 'Codeine',
		totalCost: 6.80,
		dateIssued: new Date('03/08/2019'),
		patientPaying: false
		).save()

def one=new Appointment (

		appDate: new Date('11/04/2019'),
		appTime: '3:00',
		appDuration: '30,45,60',
		roomNumber: 'A-1111'
		).save()

def two=new Appointment (

		appDate: new Date('13/07/2019'),
		appTime: '1:00',
		appDuration: '30,45,60',
		roomNumber: 'A-1234'
		).save()

def tom=new Patient (
		patientName: 'Tom Rivers',
		patientAddress: '2 One ay Street, Eckington',
		patientResidence: 'Sheffield, Barnsley, Doncaster',
		patientDob: new Date('20/09/1988'),
		patientID: 'E25555',
		dateRegistered: new Date('26/02/2018'),
		patientPhone: '0114 222 4444',
		theappointment: two
		).save()

def nicole=new Patient (
		patientName: 'Nicole Wheatley',
		patientAddress: '123 street, sunnydale',
		patientResidence: 'Workwell, Barndraven, Donfrank',
		patientDob: new Date('31/01/1998'),
		patientID: 'E12345',
		dateRegistered: new Date('04/06/2018'),
		patientPhone: '0114 111 345',
		theappointment: one
		).save()


    }
    def destroy = {
    }
}
