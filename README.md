# Kotlin Koans

## Build
[![Build Status](https://img.shields.io/badge/build-success-green.svg?plastic)](https://travis-ci.org/vicboma1/Kotlin-Koans) 
[![Kotlin](https://img.shields.io/badge/Kotlin-1.0.0--beta--1038-blue.svg?plastic)](http://kotlinlang.org) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.eluder.coveralls/coveralls-maven-plugin/) [![Junit](https://img.shields.io/badge/Junit-4.10-orange.svg?plastic)](http://junit.org) [![Guava](https://img.shields.io/badge/Guava-16.0.1-orange.svg?plastic)](https://code.google.com/p/guava-libraries/)

--->>>  [Repo: Getting Started Kotlin](https://github.com/vicboma1/GettingStartedKotlin)   <<<---

--->>>   [Repo: Problems Kotlin](https://github.com/vicboma1/Kotlin-Examples-Problems/blob/master/README.md)   <<<---

--->>>   [Repo: GameBoy Emulator Enviroment](https://github.com/vicboma1/GameBoyEmulatorEnvironment)   <<<---

--->>>   [Repo: Kotlin Mobile](https://github.com/vicboma1/KotlinMobilePoC_MasterUV2018)   <<<---

--->>> [Repo: Kotlin JavaScript](https://github.com/vicboma1/kotlinJavaScript)  <<<---

--->>> [Repo: Kotlin Native-iOS](https://github.com/vicboma1/Kotlin-Native-iOS-ConsoleAsync)  <<<---

--->>> [Repo: Ktor Examples](https://github.com/vicboma1/ktor-API-examples)  <<<---



The "src" folder contains the resolved exercises of "https://github.com/jetbrains/workshop-jb"

These are the simple solutions of the kotlin koans ON LINE. If you want to add your answer, you can make a PR

## Indexes for exercises online

### Introduction [13/42] Koans
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

### Collections [25/42] Koans
* [Introduction](https://github.com/vicboma1/Kotlin-Koans#introduction)
* [Filter map](https://github.com/vicboma1/Kotlin-Koans#filter-map)
* [All, Any, Count, FirstOrNull](https://github.com/vicboma1/Kotlin-Koans#all,any,count,firstornull)  <--- Nivel 2
* [FlatMap](https://github.com/vicboma1/Kotlin-Koans#flatmap)
* [Max min](https://github.com/vicboma1/Kotlin-Koans#maxmin)
* [Sort](https://github.com/vicboma1/Kotlin-Koans#sort)
* [Sum](https://github.com/vicboma1/Kotlin-Koans#sum)
* [Group by](https://github.com/vicboma1/Kotlin-Koans#group-by)
* [Partition](https://github.com/vicboma1/Kotlin-Koans#partition)
* [Fold](https://github.com/vicboma1/Kotlin-Koans#fold)
* [Compound tasks](https://github.com/vicboma1/Kotlin-Koans#compoundtasks) <--- Nivel 3
* [Get used to new style](https://github.com/vicboma1/Kotlin-Koans#getusedtonewstyle)

### Conventions [32/42] Koans
* [Comparison](https://github.com/vicboma1/Kotlin-Koans#comparison)
* [In range](https://github.com/vicboma1/Kotlin-Koans#in-range)
* [Range to](https://github.com/vicboma1/Kotlin-Koans#range-to)
* [For loop](https://github.com/vicboma1/Kotlin-Koans#for-loop)
* [Operators overloading](https://github.com/vicboma1/Kotlin-Koans#operators-overloading)
* [Multi assignment](https://github.com/vicboma1/Kotlin-Koans#multi-assignment)
* [Invoke](https://github.com/vicboma1/Kotlin-Koans#invoke) <--- Nivel 4

### Properties [36/42] Koans
* [Properties](https://github.com/vicboma1/Kotlin-Koans#properties)
* [Lazy property](https://github.com/vicboma1/Kotlin-Koans#lazy-property)
* [Delegates examples](https://github.com/vicboma1/Kotlin-Koans#delgates-examples)
* [Delegates how it works](https://github.com/vicboma1/Kotlin-Koans#delegates-how-it-works)

### Builders [41/42] Koans
* [Extension function literals](https://github.com/vicboma1/Kotlin-Koans#extension-function-literals)
* [String and map builders](https://github.com/vicboma1/Kotlin-Koans#string-and-map-builders)
* [The function with](https://github.com/vicboma1/Kotlin-Koans#the-function-with)
* [Html builders](https://github.com/vicboma1/Kotlin-Koans#html-builders)
* [Builders how it works](https://github.com/vicboma1/Kotlin-Koans#builders-how-it-works)

### Generic [42/42] Koans
* [Generic functions](https://github.com/vicboma1/Kotlin-Koans#generic-functions)  <--- Nivel 5


![Congratulations!](http://i.imgur.com/Xk06fJj.png)

# Introduction

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
[   
	    Collections.sort(arrayList, object : Comparator<Int> {
	    	override fun compare(x: Int, y: Int) = y - x 
	    })

	OR
	    Collections.sort(arrayList, { x, y -> y - x })
	    
	OR 
	    Collections.sort(arrayList, {x:Int, y:Int -> y - x})
]
    return arrayList
}

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

# Collections 

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

## FlatMap
```
Implement Customer.getOrderedProducts() and Shop.getAllOrderedProducts() using flatMap.

val result = listOf("abc", "12").flatMap { it.toCharList() }
result == listOf('a', 'b', 'c', '1', '2')
```

Solution
```kotlin
fun Customer.getOrderedProducts(): Set<Product> = orders.flatMap({it.products}).toSet()
fun Shop.getAllOrderedProducts(): Set<Product> = customers.flatMap({it.getOrderedProducts()}).toSet()
```

## Max min
```
Implement Shop.getCustomerWithMaximumNumberOfOrders() and Customer.getMostExpensiveOrderedProduct() using max, min, maxBy, or minBy.

listOf(1, 42, 4).max() == 42
listOf("a", "ab").minBy { it.length() } == "a"
```

Solution
```kotlin
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? = customers.maxBy({it.orders.count()})
fun Customer.getMostExpensiveOrderedProduct(): Product? = orders.flatMap({it.products}).maxBy({it.price})
```

## Sort
```
Implement Shop.getCustomersSortedByNumberOfOrders() using sort or sortBy.

listOf("bbb", "a", "cc").sorted() == listOf("a", "bbb", "cc")
listOf("bbb", "a", "cc").sortedBy { it.length() } == listOf("a", "cc", "bbb")
```

Solution
```kotlin
fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> = customers.sortedBy({it.orders.size()})
```


## Sum
```
Implement Customer.getTotalOrderPrice() using sum or sumBy.

listOf(1, 5, 3).sum() == 9
listOf("a", "b", "cc").sumBy { it.length() } == 4
```

Solution
```kotlin
fun Customer.getTotalOrderPrice(): Double = orders.flatMap({it.products}).sumByDouble({it.price})
```

## Group by
```
Implement Shop.groupCustomersByCity() using groupBy.

val result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length() }
result == mapOf(1 to listOf("a", "b"), 2 to listOf("ba", "ad"), 3 to listOf("ccc"))
```

Solution
```kotlin
fun Shop.groupCustomersByCity(): Map<City, List<Customer>> {
    val grupo = customers.groupBy({it.city})
    return grupo;
} 
```


## Partition
```
Implement Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered() using partition.

val numbers = listOf(1, 3, -4, 2, -11)
val (positive, negative) = numbers.partition { it > 0 }
positive == listOf(1, 3, 2)
negative == listOf(-4, -11)
```

Solution
```kotlin
fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> =  customers.filter {
    val (del, und) = it.orders.partition { it.isDelivered }
    und.size > del.size
}.toSet()
```


## Fold
```
Implement Shop.getProductsOrderedByAllCustomers() using fold.

listOf(1, 2, 3, 4).fold(1, {
    partProduct, element ->
    element * partProduct
}) == 24
```

Solution
```kotlin
fun Shop.getProductsOrderedByAllCustomers(): Set<Product> {
    return customers.fold(allOrderedProducts, {
        orderedByAll, customer ->
        val orderedProducts = customer.orders.flatMap { it.products }.toSet()
        orderedByAll.intersect(orderedProducts) // [X] intersect [X;C;V] = [X] == retainAll
    })
}

val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap({it.products}).toSet()
}

val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap({it.orderedProducts}).toSet()
}
```

## Compound tasks
```
Implement Customer.getMostExpensiveDeliveredProduct() and Shop.getNumberOfTimesProductWasOrdered() using functions from the Kotlin standard library.
```

Solution
```kotlin
fun Customer.getMostExpensiveDeliveredProduct(): Product? = orders.filter({it.isDelivered}).flatMap({it.products}).maxBy({it.price})

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int = customers.flatMap({it.orders.flatMap { it.products }}).count({it == product})
```

## Get used to new style
```
Rewrite the following Java function to Kotlin.

public Collection<String> doSomethingStrangeWithCollection(
        Collection<String> collection
) {
    Map<Integer, List<String>> groupsByLength = Maps.newHashMap();
    for (String s : collection) {
        List<String> strings = groupsByLength.get(s.length());
        if (strings == null) {
            strings = Lists.newArrayList();
            groupsByLength.put(s.length(), strings);
        }
        strings.add(s);
    }

    int maximumSizeOfGroup = 0;
    for (List<String> group : groupsByLength.values()) {
        if (group.size() > maximumSizeOfGroup) {
            maximumSizeOfGroup = group.size();
        }
    }

    for (List<String> group : groupsByLength.values()) {
        if (group.size() == maximumSizeOfGroup) {
            return group;
        }
    }
    return null;
}
```

Solution
```kotlin
fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection.groupBy{ s -> s?.filter({ it != null}).length }
    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.size() }.max()
    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}
```

# Conventions 

## Comparison
```
Read about operator overloading to learn how different conventions for 
operations like ==, <, + work in Kotlin. Add the function compareTo to the 
class MyDate to make it comparable. After that the code below date1 < date2 will 
start to compile.

In Kotlin when you override a member, the modifier override is mandatory.
```

Solution
```kotlin
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate ): Int{
        if (this.year != other.year) return (this.year - other.year)
        if (this.month != other.month) return (this.month - other.month)
        return (this.dayOfMonth - other.dayOfMonth)
    }
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
```

## In range
```
In Kotlin in checks are translated to the corresponding contains calls:

val list = listOf("a", "b")
"a" in list  // list.contains("a")
"a" !in list // !list.contains("a")
Read about ranges. Make the class DateRange implement the standard Range interface 
to allow in checks with a range of dates.
```

Solution
```kotlin
Range(override val start: MyDate, override val end: MyDate) : Range<MyDate> {
    override fun contains(item: MyDate): Boolean = ( (start <= item) && (item <= end) )
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
```

## Range to
```
Implement the function MyDate.rangeTo(). 
This allows you to create a range of dates using the following syntax:
MyDate(2015, 5, 11)..MyDate(2015, 5, 12)
```

Solution
```kotlin
operator fun MyDate.rangeTo(other: MyDate) = DateRange(this,other)

class DateRange(override val start: MyDate, override val end: MyDate): Range<MyDate> {
    override fun contains(item: MyDate): Boolean = start < item && item < end
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in first..last
}
```

## For loop
```
Kotlin for loop iterates through anything that provides an iterator. 
Make the class DateRange implement Iterable<MyDate>, so that it could be iterated over. 
You can use the function MyDate.nextDay() defined in DateUtil.kt

```

Solution
```kotlin
import java.util.NoSuchElementException;

class DateRange(val start: MyDate, val end: MyDate) : Iterable<MyDate>{
    override fun iterator(): Iterator<MyDate>  = object : Iterator<MyDate> {
        var current: MyDate = start

        override fun next(): MyDate {
            if (!hasNext()) {
                throw NoSuchElementException()
            }

            val result = current
            current = current.nextDay()
            return result
        }

        override fun hasNext(): Boolean {
            return current <= end
        }

    }
}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in DateRange(firstDate,secondDate)) {
        handler(date)
    }
}

```

## Operators overloading
```
Implement a kind of date arithmetic. Support adding years, weeks and days to a date. You could be able to write the code like this: date + YEAR * 2 + WEEK * 3 + DAY * 15.

At first, add an extension function 'plus()' to MyDate, taking a TimeInterval as an argument. Use an utility function MyDate.addTimeIntervals() declared in DateUtil.kt

Then, try to support adding several time intervals to a date. You may need an extra class.
```

Solution
```kotlin

import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) 

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate = addTimeIntervals(timeInterval, 1)

fun task1(today: MyDate): MyDate = addTimeIntervals(today,1,1)

fun task2(today: MyDate): MyDate  = addTimeIntervals(today,2,3,5)

fun addTimeIntervals(myDate: MyDate, year:Int = 0, week: Int = 0, day:Int = 0) : MyDate {
    return myDate
            .addTimeIntervals(TimeInterval.YEAR,year)
            .addTimeIntervals(TimeInterval.WEEK,week)
            .addTimeIntervals(TimeInterval.DAY,day)
}

```

## Multi assignment
```
Read about multi-declarations and make the following code compile by adding one word.
```

Solution
```kotlin
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

fun isLeapDay(date: MyDate): Boolean {
    val (year, month, dayOfMonth) = date
    return year % 4 == 0 && month == 2 && dayOfMonth == 29
}

```

## Invoke
```
Objects with invoke() method can be invoked as a function.

You can add invoke extension for any class, but it's better not to overuse it:

fun Int.invoke() { println(this) }

1() //huh?..
Implement the function Invokable.invoke() so it would count a number of invocations.
```

Solution
```kotlin
class Invokable {
    public var numberOfInvocations: Int = 0
        private set
    operator public fun invoke(): Invokable {
        numberOfInvocations++
            return this
    }
}

fun invokeTwice(invokable: Invokable) = invokable()()
```

#Properties

## Properties
```
Read about properties in Kotlin.

Add a custom setter to PropertyExample.propertyWithCounter so that the
counter property is incremented every time propertyWithCounter is assigned to.
```

Solution
```kotlin

/** 
 * var <propertyName>: <PropertyType> [= <property_initializer>]
 * <getter>
 * <setter>
 */

class PropertyExample() {
    var counter = 0
    var propertyWithCounter: Int? = null
        set(arg:Int?){
        field = arg
            counter++
    }
}


```

## Lazy property
```
Add a custom getter to make the 'lazy' val really lazy. 
It should be initialized by the invocation of 'initializer()' at 
the moment of the first access.

You can add as many additional properties as you need.

Do not use delegated properties!
```

Solution
```kotlin
class LazyProperty(val initializer: () -> Int) {
    private val lazyValue : Int? = null
         get() {
            if(field == null)
               field = initializer()
                
         return field
        }
    
    val lazy: Int get() = lazyValue!!
       
}
```

## Delegates examples
```
Read about delegated properties and make the property lazy by using delegates.
```

Solution
```kotlin
class LazyProperty(val initializer: () -> Int) {
    val lazyValue: Int by Lazy(initializer)
}
```

## Delegates how it works
```
Implement the methods of the class 'EffectiveDate' so it can be delegated to. 
Store only the time in milliseconds in 'timeInMillis' property.

Use the extension functions MyDate.toMillis() and Long.toDate(), defined at MyDate.kt
```

Solution
```kotlin
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class D {
    var date: MyDate by EffectiveDate()
}

class EffectiveDate<R> : ReadWriteProperty<R, MyDate> {

    var timeInMillis: Long? = null

    override fun getValue(thisRef: R, property: KProperty<*>): MyDate {
        return timeInMillis!!.toDate()
    }

    override fun setValue(thisRef: R, property: KProperty<*>, value: MyDate) {
        timeInMillis = value.toMillis()
    }
}
```

#Builders

## Builders how it works
```
Look at the questions below and give your answers
1. In the Kotlin code
tr {
    td {
        text("Product")
    }
    td {
        text("Popularity")
    }
}

'td' is:
a. special built-in syntactic construct
b. function declaration
c. function invocation

2. In the Kotlin code
tr (color = "yellow") {
    td {
        text("Product")
    }
    td {
        text("Popularity")
    }
}

'color' is:
a. new variable declaration
b. argument name
c. argument value

3. The block
{
    text("Product")
}

from the previous question is:
a. block inside built-in syntax construction td
b. function literal (or "lambda")
c. something mysterious

4. For the code

tr (color = "yellow") {
    this.td {
        text("Product")
    }
    td {
        text("Popularity")
    }
}

which of the following is true:
a. this code doesn't compile
b. this refers to an instance of an outer class
c. this refers to a receiver parameter TR of the function literal:

tr (color = "yellow") { TR.(): Unit ->
      this.td {
          text("Product")
      }
}
```

Solution
```kotlin
import Answer.*

enum class Answer { a, b, c }

val answers = mapOf<Int, Answer?>(
        1 to Answer.c, 2 to Answer.b, 3 to Answer.b, 4 to Answer.c
)
```

## String and map builders
```
Extension function literals are very useful for creating builders, e.g.:

fun buildString(build: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.build()
    return stringBuilder.toString()
}

val s = buildString {
    this.append("Numbers: ")
    for (i in 1..3) {
        // 'this' can be omitted
        append(i)
    }
}

s == "Numbers: 123"
Add and implement the function 'buildMap' with one parameter (of type extension function)
creating a new HashMap, building it and returning it as a result. 
The usage of this function is shown below.
```

Solution
```kotlin
import java.util.HashMap

fun <H,T> buildMap(build: MutableMap<H,T>.() -> Unit) : Map<H,T> {
	var map =  HashMap<H,T>() / HashTable<H,T>()
    map.build()
    return map
}

fun usage(): Map<Int, String> {
    return buildMap {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
}
```

## The function with
```
The function with

The previous examples can be rewritten using the library function "with"
https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/with.html#receiver
Write your own implementation of this function named 'myWith'.
```

Solution
```kotlin
fun <T, R> myWith(receiver: T, f: T.() -> R): R {
    return receiver.f()
}

fun buildString(): String {
    val stringBuilder = StringBuilder()
    myWith (stringBuilder) {
        append("Numbers: ")
        for (i in 1..10) {
            append(i)
        }
    }
    return stringBuilder.toString()
}

fun buildMap(): Map<Int, String> {
    val map = hashMapOf<Int, String>()
    myWith (map) {
        put(0, "0")
        for (i in 1..10) {
            put(i, "$i")
        }
    }
    return map
}


```

## Html builders
```
1. Fill the table with the proper values from the product list. 
The products are declared in data.kt.

2. Color the table like a chess board (using getTitleColor() and getCellColor()
functions above). Pass a color as an argument to the functions tr, td.

You can run 'JavaScript(Canvas)' configuration to see the rendered table.
```

Solution
```kotlin
fun renderProductTable(): String {
    fun getTitleColor() = "#b9c9fe"
    fun getCellColor(index: Int, row: Int) = if ((index + row) %2 == 0) "#dce4ff" else "#eff2ff"
    fun renderProductTable(): String {
    return html {
        table {
            tr (color = getTitleColor(), init = {
                td { this.text("Product") }
                td { this.text("Price") }
                td { this.text("Popularity")  }
            })
            val products = getProducts()
            products.forEachIndexed { i, product ->
                tr{
                    td{ this.text(product.description) }
                    td{ this.text(product.price) }
                    td{ this.text(product.popularity) }
                }
            }
        }
    }.toString()
}



```

## Extension function literals
```
Read about https://kotlinlang.org/docs/reference/lambdas.html#extension-function-expressions

You can declare isEven and isOdd as values, that can be called as extension functions. 
Complete the declarations below.
```

Solution
```kotlin
fun task(): List<Boolean> {
    val isEven: Int.() -> Boolean = { this % 2 == 0 }
    val isOdd: Int.() -> Boolean = { this % 2 != 0 }

    return listOf(42.isOdd(), 239.isOdd(), 294823098.isEven())
}
```

# Generic

## Generic functions
```
Make the following code compile by implementing a partitionTo function that splits a collection into two collections according to a predicate.

There is a partition() function in the standard library that always returns two newly created lists. You should write a function that splits the collection into two collections given as arguments. The signature of the toCollection() function from the standard library may help you.
```

Solution
```kotlin
import java.util.*

fun <T,H: MutableCollection<T>> Collection<T>.partitionTo(listHead : H, listBody: H, predicate : (T) -> Boolean ) : Pair<H,H> {
    this.forEach{      
        val isPredicate = predicate.invoke(it)
            if(isPredicate) listHead.add(it)
            else listBody.add(it)
    }
     return Pair(listHead,listBody)
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e").
            partitionTo(ArrayList<String>(), ArrayList()) { s -> !s.contains(" ") }
    words == listOf("a", "c")
    lines == listOf("a b", "d e")
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}').
            partitionTo(HashSet<Char>(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z'}
    letters == setOf('a', 'r')
    other == setOf('%', '}')
}
```
