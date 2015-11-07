# Kotlin Koans  / WIP

The "src" folder contains the resolved exercises of "https://github.com/jetbrains/workshop-jb" 
These are the simple solutions of the kotlin koans ON LINE. If you want to add your answer, you can make a PR.

##Indexes
###Introduction [13/42] Koans
* [Hello World!](https://github.com/vicboma1/Kotlin-Koans#hello-world)
* [Java to Kotlin conversion](https://github.com/vicboma1/Kotlin-Koans#java-to-kotlin-conversion)
* [Named arguments](https://github.com/vicboma1/Kotlin-Koans#named-arguments)
* [Default arguments](https://github.com/vicboma1/Kotlin-Koans#default-arguments)
* [Lambdas](https://github.com/vicboma1/Kotlin-Koans#lambdas)
* [Strings](https://github.com/vicboma1/Kotlin-Koans#strings)
* [Data classes](https://github.com/vicboma1/Kotlin-Koans#data-classes)
* [Nullable types](https://github.com/vicboma1/Kotlin-Koans#nullable-types)  
* [Smart casts](https://github.com/vicboma1/Kotlin-Koans#smart-casts)    <--- Nivel 1
* [Extension functions](https://github.com/vicboma1/Kotlin-Koans#extension-functions)
* [Object expressions](https://github.com/vicboma1/Kotlin-Koans#object-expressions)
* [SAM conversions](https://github.com/vicboma1/Kotlin-Koans#sam-conversions)
* [Extensions on collections](https://github.com/vicboma1/Kotlin-Koans#extensions-on-collections)

###Collections
* [Introduction](https://github.com/vicboma1/Kotlin-Koans#introduction)
* [Filter map](https://github.com/vicboma1/Kotlin-Koans#filter-map)
* [All, Any, Count, FirstOrNull](https://github.com/vicboma1/Kotlin-Koans#all,any,count,firstornull)  <--- Nivel 2
* [FlatMap](https://github.com/vicboma1/Kotlin-Koans#flatmap)
* [Max min](https://github.com/vicboma1/Kotlin-Koans#maxmin)
* [Sort](https://github.com/vicboma1/Kotlin-Koans#sort)
* [Sum](https://github.com/vicboma1/Kotlin-Koans#sum)
* [Partition](https://github.com/vicboma1/Kotlin-Koans#partition)
* [Fold](https://github.com/vicboma1/Kotlin-Koans#fold)
* [Compound tasks](https://github.com/vicboma1/Kotlin-Koans#compoundtasks)
* [Get used to new style](https://github.com/vicboma1/Kotlin-Koans#getusedtonewstyle)


## Hello World!
```
Simple Functions

Take a look at function syntax and make the function start return the string "OK".

In the tasks the function TODO() is used that throws an exception. 
Your job during the koans will be to replace this function invocation with 
a meaningful code according to the problem.
```

Solution
```kotlin
fun start() = "OK"
```

## Java to Kotlin conversion
```
We have a handy tool for Java developers: Java to Kotlin converter. 
It works better in Intellij, but you can try it online as well. 
To become familiar with it, please convert the code below.
Copy Java code, choose 'Convert from Java' above and copy the result function back.

public class JavaCode {
    public String toJSON(Collection<Integer> collection) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            sb.append(element);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

```

Solution
```Kotlin
fun toJSON(collection: Collection<Int>): String  {
        val sb = StringBuilder();
        sb.append("[");
        val iterator = collection.iterator();
        while (iterator.hasNext()) {
            var element = iterator.next();
            sb.append(element);
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

```
## Named arguments
```
Default and named arguments help to minimize the number of overloads
and improve the readability of the function invocation. 
The library function joinToString is declared with default values for parameters:

fun joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = "",
    /* ... */
): String

It can be called on a collection of Strings. Using named arguments 
make the function joinOptions() return the list in a JSON format (e.g., "[a, b, c]")
```

Solution
```Kotlin
fun joinOptions(options: Collection<String>) = options.joinToString(", ","[","]")
```
## Default arguments
```
There are several overloads of 'foo()' in Java:

public String foo(String name, int number, boolean toUpperCase) {
    return (toUpperCase ? name.toUpperCase() : name) + number;
}
public String foo(String name, int number) {
    return foo(name, number, false);
}
public String foo(String name, boolean toUpperCase) {
    return foo(name, 42, toUpperCase);
}
public String foo(String name) {
    return foo(name, 42);
}

All these Java overloads can be replaced with one function in Kotlin. 
Change the declaration of the function foo in a way that makes the code 
using foo compile. Use default and named arguments.
```

Solution
```Kotlin
fun foo(name: String = "", number: Int = 42, toUpperCase: Boolean = false) =
        (if (toUpperCase) name.toUpperCase() else name) + number

fun useFoo() = listOf(
        foo("a"),
        foo("b", number = 1),
        foo("c", toUpperCase = true),
        foo(name = "d", number = 2, toUpperCase = true)
)
```
## Lambdas
```
Kotlin supports a functional style of programming. Read about higher-order
functions and function literals (lambdas) in Kotlin.

Pass a lambda to any function to check if the collection contains an even number.
The function any gets a predicate as an argument and returns true 
if there is at least one element satisfying the predicate.
```

Solution
```Kotlin
fun containsEven(collection: Collection<Int>): Boolean = collection.any { it % 2 == 0  }
```
## Strings
```
Read about different string literals and string templates in Kotlin.

Raw strings are useful for writing regex patterns, you don't need to escape
a backslash by a backslash. Below there is a pattern that matches a date
in format dd.mm.yyyy; in a usual string you'd have to write "(\\d{2})\\.(\\d{2})\\.(\\d{4})".

fun getPattern() = """(\d{2})\.(\d{2})\.(\d{4})"""

Using month variable rewrite this pattern in such a way that it matches 
the date in format 13 JUN 1992.
```

Solution
```Kotlin
val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"

fun getPattern() = """(\d{2}) ${month} """
```
## Data classes
```
Convert the following Java code to Kotlin:

public static class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

Then add an annotation data to the resulting class. This annotation means 
the compiler will generate a bunch of useful methods in this class:
equals/hashCode, toString and some others. The getPeople function should start to compile.

Then read about classes, properties and data classes in more detail.
```

Solution
```Kotlin
data class Person(
			  val name: String,
			  val age : Int) 

fun getPeople(): List<Person> {
    return listOf(Person("Alice", 29), Person("Bob", 31))
}
```
## Nullable types
```
Read about null safety and safe calls in Kotlin and rewrite the following 
Java code using only one if expression:

public void sendMessageToClient(
    @Nullable Client client,
    @Nullable String message,
    @NotNull Mailer mailer
) {
    if (client == null || message == null) return;

    PersonalInfo personalInfo = client.getPersonalInfo();
    if (personalInfo == null) return;

    String email = personalInfo.getEmail();
    if (email == null) return;

    mailer.sendMessage(email, message);
}

```

Solution
```Kotlin
fun sendMessageToClient(
        client: Client?, message: String?, mailer: Mailer
){
    val personalInfo = client?.personalInfo
    val email = personalInfo?.email
    if (email != null && message != null) 
        mailer.sendMessage(email,message)
}

class Client (val personalInfo: PersonalInfo?)
class PersonalInfo (val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}
```
## Smart casts
```
Smart casts

Rewrite the following Java code using smart casts and when expression:

public int eval(Expr expr) {
    if (expr instanceof Num) {
        return ((Num) expr).getValue();
    }
    if (expr instanceof Sum) {
        Sum sum = (Sum) expr;
        return eval(sum.getLeft()) + eval(sum.getRight());
    }
    throw new IllegalArgumentException("Unknown expression");
}
```

Solution
```Kotlin
fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> expr.value
            is Sum -> (eval(expr.left) + eval(expr.right))
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr
```
## Extension functions
```
Read about extension functions. Then implement extension functions Int.r() 
and Pair.r() and make them convert Int and Pair to RationalNumber.
```

Solution
```Kotlin
fun Int.r(): RationalNumber = RationalNumber(this,1)

fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.first, this.second)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(this.component1(), this.component2())

data class RationalNumber(val numerator: Int, val denominator: Int)
    
```
## Object expressions
```
Read about object expressions that play the same role in Kotlin as anonymous
classes do in Java.

Add an object expression that provides a comparator to sort a list in a descending
order using java.util.Collections class. In Kotlin you use Kotlin library extensions
instead of java.util.Collections, but this example is still a good demonstration of
mixing Kotlin and Java code.
```

Solution
```Kotlin
import java.util.*

fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
        Collections.sort(arrayList, object : Comparator<Int> {
    override fun compare(x: Int, y: Int) = y - x
})
    Collections.sort(arrayList, { x, y -> y - x })
    return arrayList
}
```
## SAM conversions
```
SAM conversions

When an object implements a SAM interface (one with a Single Abstract Method), 
you can pass a lambda instead. Read more about SAM conversions in the blog posts
about Kotlin. At first, SAM-constructors were introduced, then SAM-conversions 
were finally supported.

In the previous example change an object expression to a lambda.
```

Solution
```Kotlin
fun getList(): List<Int> {
    val arrayList = arrayListOf(1, 5, 2)
    Collections.sort(arrayList, { x, y -> y - x })
    return arrayList
}
```
## Extensions on collections
```
Extension functions on collections

Kotlin code can be easily mixed with Java code. Thus in Kotlin we don't 
introduce our own collections, but use standard Java ones (slightly improved). 
Read about read-only and mutable views on Java collections.

In Kotlin standard library there are lots of extension functions that make 
the work with collections more convenient. Rewrite the previous example once 
more using an extension function sortedDescending.
```

Solution
```Kotlin
fun getList(): List<Int> {
    return arrayListOf(1, 5, 2).sorted().reversed()
}
```

#Collections 

## Introduction
```
This part was inspired by GS Collections Kata.

Default collections in Kotlin are Java collections, but there are lots of useful extension functions for them. For example, operations that transform a collection to another one, starting with 'to': toSet or toList.

Implement an extension function Shop.getSetOfCustomers(). The class Shop and all related classes can be found at Shop.kt.
```

Solution
```kotlin
fun Shop.getSetOfCustomers(): Set<Customer> {
    return this.customers.toSet()
}
```

## Filter Map
```
Implement extension functions Shop.getCitiesCustomersAreFrom() and Shop.getCustomersFrom() using functions map and filter.

val numbers = listOf(1, -1, 2)
numbers.filter { it > 0 } == listOf(1, 2)
numbers.map { it * it } == listOf(1, 1, 4)
```

Solution
```kotlin
fun Shop.getCitiesCustomersAreFrom(): Set<City> =  customers.map({it.city}).toSet()
fun Shop.getCustomersFrom(city: City): List<Customer> = customers.filter({it.city === city}).toList()
```

## All, Any, Count, FirstOrNull
```
Implement all the functions below using all, any, count, firstOrNull.

val numbers = listOf(-1, 0, 2)
val isZero: (Int) -> Boolean = { it == 0 }
numbers.any(isZero) == true
numbers.all(isZero) == false
numbers.count(isZero) == 1
numbers.firstOrNull { it > 0 } == 2
```

Solution
```kotlin
fun Shop.checkAllCustomersAreFrom(city: City): Boolean = customers.all(givenCity(city))
fun Shop.hasCustomerFrom(city: City): Boolean = customers.any(givenCity(city))
fun Shop.countCustomersFrom(city: City): Int = customers.count(givenCity(city))
fun Shop.findAnyCustomerFrom(city: City): Customer? = customers.firstOrNull(givenCity(city))

private fun givenCity(city: City): (Customer) -> Boolean = { it.city === city }
```

## 
```

```

Solution
```kotlin

```

## 
```

```

Solution
```kotlin

```

## 
```

```

Solution
```kotlin

```


## 
```

```

Solution
```kotlin

```


## 
```

```

Solution
```kotlin

```


## 
```

```

Solution
```kotlin

```

## 
```

```

Solution
```kotlin

```
