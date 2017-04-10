package chapter02

import java.time.LocalDate

object DateInterpolator {

  implicit class DateInterpolator(val sc: StringContext) extends AnyVal {
    def date(args: Any*): LocalDate = {
      if (args.size < 3)
        throw new IllegalArgumentException("expected year-month-day, got " + args)
      LocalDate.of(args(0).toString.toInt, args(1).toString.toInt, args(2).toString.toInt)
    }
  }

  def main(args: Array[String]) {
    println(date"${2017}-${3}-${19}")
  }

}
