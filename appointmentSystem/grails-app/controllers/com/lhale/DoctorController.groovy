package com.lhale

class DoctorController {

     def scaffold= Doctor

def login(){

}

def validate(){

def user = Doctor.findBydoctorEail(params.email)

if(user && user.password == params.password){

		session.user = user
	
		render view:'Home'
}

else{

		flash.message = "invalid username and password"

		render view:'login'

}

}

def logout = {

		session.user = null

		redirect(uri:'/')

}

}


