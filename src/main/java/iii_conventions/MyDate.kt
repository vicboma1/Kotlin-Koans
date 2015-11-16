package iii_conventions

import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {

    operator fun plus(timeIntervals: RepeatedTimeInterval) = addTimeIntervals(timeIntervals.timeInterval, timeIntervals.number)

    override fun compareTo(other: MyDate ): Int{
        if (this.year != other.year) return (this.year - other.year)
        if (this.month != other.month) return (this.month - other.month)
        return (this.dayOfMonth - other.dayOfMonth)
    }
}

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
}

class RepeatedTimeInterval(val timeInterval: TimeInterval, val number: Int)

class DateRange(override val start: MyDate, override val end: MyDate) : Iterable<MyDate> , Range<MyDate>  {

    operator fun MyDate.rangeTo(other: MyDate) = DateRange(this,other)

    override fun contains(item: MyDate): Boolean = start < item && item < end

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
