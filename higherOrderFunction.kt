fun main(args: Array<String>) {
	
   validateValueWithFunc("bebi2527@gmail.com",::parseEmail,"Email")
   validateValueWithFunc("7204773534",::parsePhoneNo,"Phone")

   validateValueWithFunc("bebi2527@gmail.com",returnMyFunction(1),"Email")
   validateValueWithFunc("7204773534",returnMyFunction(2),"Phone")

   if(1==1) println ("Print Successful")
}

fun parseEmail(address:String): Boolean{
	return true
}


fun parsePhoneNo(address:String): Boolean{
	return false
}


fun validateValueWithFunc(value: String, parseFunc: (value:String) -> Boolean, type:String) {
    if (parseFunc(value))
        println("Invalid $type");
    else
        println("Valid $type");
}

fun returnMyFunction(type:Int):(String)->Boolean{
	if(type ==1)
	return ::parseEmail
	else
	return ::parsePhoneNo
}