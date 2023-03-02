fun main(){
var people=Human("Ann",20,53)
    people.eat(3)
    println(people.weight)
    people.speak("My name is Serah i love kotlin")
    people.birthday()
    println(people.age)

    val myuser=User("Serah","Mburu","mburu@gmail.com","0711111111","serah20")
    println(myuser.firstName)
    println(myuser.email)





}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodweight:Int){
        println("i am eating $foodweight kgs of food ")
        weight+=foodweight

    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age+=1
    }

}
data class User(var firstName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String){

}