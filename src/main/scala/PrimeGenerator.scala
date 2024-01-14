object PrimeGenerator {

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 until Math.sqrt(n).toInt + 1).exists(n % _ == 0)
  }

  def hasAscendingDigits(n: Int): Boolean = {
    val digits = n.toString.map(_.asDigit)
    digits.length == 1 || digits.sliding(2).forall { case Seq(a, b) => a < b }
  }

  def generateAscendingPrimes(upperLimit: Int): Seq[Int] = {
    (2 to upperLimit).filter(i => isPrime(i) && hasAscendingDigits(i))
  }
}
