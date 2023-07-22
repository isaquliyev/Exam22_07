3. Primary constructor is used for initialize the class.
   For example
   Class MyClass(myInput : String) {}
   As you see the primary constructor declared at the header of class.
   There is another case, that used init{} method.
   Class MyClass(myInput : String) {
       val a : String
       init{
           a = "Hello " + myInput 
       }
   }

4. DataClass - is one of the type of class which we can store data
data class Student(var name : String, var surname : String, var age : Int)
Data class doesn't have any functionality. This is the main difference from normal class.

5. How to initialize array with values in Kotlin?
  1. Using fill() function
    The standard approach to initialize an array with some value in Kotlin is to use the extension function fill()

    fun main() {
        val size = 5
        val value = 1
 
        val arr = arrayOfNulls<Int>(size)
        arr.fill(value)
 
        println(arr.contentToString())        
    }

  The above code print an array consist of [1,1,1,1,1]

   2. Using Array Constructor
You can specify the array size using its constructor and initialize each element by calling a lambda. To initialize each element with a constant, you can do like:

fun main() {
    val size = 5
    val value = 1
 
    val arr = Array(size) { value }
 
    println(arr.contentToString())        // [1, 1, 1, 1, 1]
}
   
   3. Using Array class
Another solution is to use the setAll() function of the Arrays class, which uses a generator function that accepts an index and generates a value corresponding to that index.


import java.util.*
 
fun main() {
    val size = 5
    val value = 1
 
    val arr = arrayOfNulls<Int>(size)
    Arrays.setAll(arr) { value }
 
    println(arr.contentToString())        // [1, 1, 1, 1, 1]
}



6. What is difference between var and val?
Var is mutable, while val is immutable. Both of them runtime variables. 
In var we can change value, but in val we cannot change value we only initialize first time.


7. How to concatenate String?
   There is several methods. One of the is + operator.
   val a = "Hello"
   val b = "Isa"
   var c = a + " " + b
   The other method is plus method.
   c = ""
   c = c.plus(a).plus(b) 

8. What is variable declaration with ? mark
Question mark means that the variable is nullable. The value can be null.

var name : String? = null
the default value of name is null

var name : String = ""
In above name can not be null


11. What is the life cycle of Android activity? Write onebyone

The life cycle of an Android activity refers to the different states an activity goes through during its existence, from its creation to its destruction. Understanding the activity life cycle is crucial for proper management and handling of an Android application. Below is the step-by-step explanation of the Android activity life cycle:
onCreate -> onStart -> onResume -> onPause -> onStop -> onRestart -> onDestroy


12. What is AndroidManifest?
Every app project must have an AndroidManifest. xml file, with precisely that name, at the root of the project source set.
The manifest file describes essential information about your app to the Android build tools, the Android operating system, and Google Play.


13. What is an intent?
In android Intent is used for change activity or fragment to another. Intent provides some important methods that helps to carry data from one activity to another.


14. Which layouts do you know?
    1. Constraint Layout
    2. Grid Layout
    3. Linear Layout
    4. Frame Layout
    5. Relative Layout
    6. Absolute Layout
    7. Table Layout
       
