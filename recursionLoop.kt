/*
	*Loop with Recursion
*/
fun main(args: Array<String>) {
    println(sum(0,10,0))
}
fun sum(start : Int, end:Int, acc: Int):Int = if(start>end) acc else sum(start+1,end,start+acc)
	
