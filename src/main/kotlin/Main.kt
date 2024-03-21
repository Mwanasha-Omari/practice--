fun main() {
println(isName("Mwanasha",19))
    (isLength("AkiraChix"))
println(identity("Ali"))
    (isFact("I like playing chess"))
    println(isWord(33.0))
   println(isEven(20))
}
fun isName(x:String,y:Int):String{
    var name="Hi my name is $x and I am $y years old. "
    return name
}
fun isLength(word:String){
   println(word.length)

}
fun identity(sentence:String){
  if(false)  {
      println("That's me!")
  }
    else{
      println("I don't know who that is" )

}}
fun isFact(x:String){
   println(x)
}
fun isWord(a:Double):String {
  var word="The temperature is $a degree celcius"
    return word
}
fun isEven(a:Int):Boolean{
if(a==0){return(true)
}
    else {
    return(false)
}}
