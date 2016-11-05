fun main(args: Array<String>) {
	
   validateValueWithFunc("bebi2527@gmail.com",::parseEmail,"Email")
   validateValueWithFunc("7204773534",::parsePhoneNo,"Phone")
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