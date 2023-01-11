fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    test()
}

class Person(val name: String, var age: Int) {
    val isAdult
        get() = age >= 18

    var age
        set(value: Int) {
            log(value);
            field = value
        }
}

