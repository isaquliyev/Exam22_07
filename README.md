Question 4) DataClass - is one of the type of class which we can store data
data class Student(var name : String, var surname : String, var age : Int)

Question 5)
  1. Using fill() function
The standard approach to initialize an array with some value in Kotlin is to use the extension function fill()

fun main() {
    val size = 5
    val value = 1
 
    val arr = arrayOfNulls<Int>(size)
    arr.fill(value)
 
    println(arr.contentToString())        // [1, 1, 1, 1, 1]
}

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



Question 6)
var is mutable val is immutable 
In var we can change value, but in val we cannot change value we only initialize first time.


Question 7)
Concatenation is the process of appending one string to the end of another string. You concatenate strings by using the + operator. For string literals and string constants, concatenation occurs at compile time; no run-time concatenation occurs. For string variables, concatenation occurs only at run time.


Question 8)
? means nullable, variable can be null

var name : String? = null

in this code we can asigne name with null

var name : String = ""

but in this code we cannot asigne name with null


Question 11)
The life cycle of an Android activity refers to the different states an activity goes through during its existence, from its creation to its destruction. Understanding the activity life cycle is crucial for proper management and handling of an Android application. Below is the step-by-step explanation of the Android activity life cycle:

OnCreate(): This is the first method called when the activity is created. It is where you initialize essential components and set up the user interface. You can also restore the activity's previous state if it was paused or stopped.

OnStart(): After OnCreate(), the activity enters the started state. In this state, the activity becomes visible to the user, but it may not have the focus. It is an indication that the activity is about to become visible on the screen.

OnResume(): This method is called when the activity is about to start interacting with the user. It is in the foreground, and the user can now interact with it. At this point, the activity is considered to be running.

OnPause(): When another activity comes into the foreground or the current activity loses focus, OnPause() is called. This could happen, for example, when the user receives a phone call or opens another app. In this method, you should release resources that might be consumed by the activity and save any data that needs to be persisted.

OnStop(): When the activity is no longer visible to the user, OnStop() is called. It may be followed by the activity being destroyed or coming back to the foreground. In this method, you can save any crucial data that needs to persist across sessions.

OnRestart(): If the activity is stopped and then started again, OnRestart() is called before OnStart(). It is an indication that the activity is coming back to the foreground from a stopped state.

OnDestroy(): This is the final method in the activity life cycle. It is called when the activity is being destroyed or removed from memory. It could happen either because the user finished the activity or the system needs to free up resources. In OnDestroy(), you should release all resources associated with the activity.



Question 12)
Every app project must have an AndroidManifest. xml file, with precisely that name, at the root of the project source set. The manifest file describes essential information about your app to the Android build tools, the Android operating system, and Google Play.


Question 13)

In Android, an Intent is a fundamental component of the Android operating system that facilitates communication between different components of an application or between different applications. It acts as a message-passing mechanism that allows you to request an action from another component, or to pass data between components.

An Intent can be thought of as an "intention" to perform an action. It can be used to start an activity, start a service, or deliver a broadcast.


Question 14)
1. ConstraintLayout:
ConstraintLayout is a flexible and powerful layout that allows you to create complex UI designs by defining constraints between different views. Views are positioned relative to each other or relative to the parent container. It's a popular choice for modern Android app layouts due to its flexibility and performance.

2. LinearLayout:
LinearLayout is a simple layout that arranges views in a single line, either horizontally or vertically. You can specify the orientation as horizontal or vertical, and views will be added one after another in that direction.

3. RelativeLayout:
RelativeLayout is a layout that allows you to position views relative to each other or relative to the parent container. You can use attributes like android:layout_above, android:layout_below, android:layout_toLeftOf, etc., to position views in relation to others.

4. FrameLayout:
FrameLayout is a basic layout that can contain a single view or multiple views stacked on top of each other. It's often used for simple overlays or as a container for fragments.

5. TableLayout:
TableLayout arranges its children in rows and columns, similar to an HTML table. You can use TableRow elements to define individual rows and add views to the rows to create a table-like structure.

6. GridLayout:
GridLayout is similar to TableLayout but more flexible. It arranges its children in rows and columns, but the size of each cell can be adjusted based on the content or weight defined for each row and column.

7. CoordinatorLayout:
CoordinatorLayout is a specialized layout designed to work with the Android Design Support Library. It allows you to create complex and coordinated animations and interactions between child views.
