fun main() {

    person("Miriam",23,"AkiraChix")
    student("mercy",20,"AkiraChix")
    personsDetails("Miriam",23,"Kenyan")
    println(add(30,20,50,35))
    println(mean(10,20,30,40,50))
    var fullName= "kylisha Nguru"
    println(fullName)
    var age = 22
    println(age)
    var phoneNumber= "o744300568"
    println(phoneNumber)
    var email= "kylishanguru@gmail.com"
    println(email)
    var weight=44.5
    println(weight)
    var citizen="Ugandan"
    println("is a Ugandan citizen")
}

//Create and invoke a function that takes in a users name, age, and national
// out “Hello my name is ${name}, I am ${age} and I am from ${nationality}”
fun person(name:String,age:Int,school:String){
    println("Hello my name is $name and I am $age years old and i go to $school ")
}

fun student(name: String,age: Int,school: String){
    var studentDetail= "Hello my name is $name and I am $age years old and i go to $school "
    println(studentDetail)
}
//Create and invoke a function that takes in a users name, age, and nationality and prints
// out “Hello my name is ${name}, I am ${age} and I am from ${nationality}”
fun personsDetails(name:String,age:Int,nationality:String){
    println("Hello my name is ${name}, I am ${age} and I am from ${nationality}")
}
fun add(num1:Int,num2: Int,num3: Int,num4: Int):Int{
    var sum=num1+num2+num3+num4
    return sum

}
//Create and invoke a function that given any 5 numbers, it returns their average
fun mean(numb1:Int,numb2: Int,numb3: Int,numb4: Int,numb5: Int):Int{
    var avarage=(numb1+numb2+numb3+numb4+numb5)/2
    return avarage
}
//You are creating an app to capture a person’s records. Some of the data you will
//capture includes full name, age, phone number, email, weight in kg, and citizen. For the
//citizen field, you will track whether a student is a Ugandan or not.
fun personsRecords(fullName:String,age: Int,phoneNumber: Int,email:String,weight:Double,citizen:String){


}