package com.lhale

class ReceptionistController {

    def scaffold= Receptionist


def login(){

}

def validate(){

def user = Receptionist.findByRecepUsername(params.username)

if(user && user.recepPassword == params.password){

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
