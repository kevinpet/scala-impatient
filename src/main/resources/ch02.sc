import java.time.LocalDate

// 2-1
def signum(n: Int) =
  if (n == 0)
    0
  else if (n < 0)
    -1
  else
    1

List(-5, -1, 0, 1, 5).map(signum _)

// 2-2
val foo = {}
// () of type Unit

// 2-3 x = y = 1
var y = 0
var x = ()
x = y = 1
// but still stupid

// 2-4 for (int i = 10; i > = 0; i--) System.out.println( i);
for (i <- 10 to (0, -1)) {
  println(i)
}

// 2-5
def countdown(n: Int): Unit = {
  for (i <- n to (0, -1)) {
    println(i)
  }
}

// 2-6
def unicodeProduct(s: String) = s.map(c => c.toLong).product
unicodeProduct("Hello")

// 2-7, then I'll do 2-6 with a loop
def unicodeProduct2(s: String) = {
  var product = 1L
  for (c <- s) {
    product *= c
  }
  product
}
unicodeProduct2("Hello")

// 2-8 oops, misread the above. see the above two

// 2-9
def recursiveProduct(s: String, product: Long = 1L): Long =
  if (s.isEmpty)
    product
  else
    recursiveProduct(s.tail, s.head * product)
recursiveProduct("Hello")

// 2-10
def power(x: Double, n: Int): Double =
  if (n < 0)
    1.0 / power(x, -n)
  else if (n == 0)
    1.0
  else {
    val half = power(x, n / 2)
    if (n % 2 == 0)
      half * half
    else
      x * half * half
  }

power(2, 5)
power(-2, 5)
power(2, -4)

// 2-11 see DateInterpolator
