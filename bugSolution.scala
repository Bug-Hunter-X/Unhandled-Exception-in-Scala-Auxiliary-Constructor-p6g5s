```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor

  def myMethod(y: Int): Int = try {
    if (y == 0) {
      throw new IllegalArgumentException("y cannot be 0")
    } else {
      x + y
    }
  } catch {
    case e: IllegalArgumentException => {
        println("Error: " + e.getMessage)
        0 // Or any other appropriate default value
    }
  }
}

object Main extends App {
  val obj1 = new MyClass(5)
  val obj2 = new MyClass()

  println(obj1.myMethod(2)) // Output: 7
  println(obj2.myMethod(2)) // Output: 2
  println(obj1.myMethod(0)) // Output: Error: y cannot be 0, then 0
}
```