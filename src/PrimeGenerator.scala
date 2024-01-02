object PrimeGenerator {

  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else {
      val sqrtN = Math.sqrt(n).toInt + 1
      !(3 to sqrtN by 2).exists(i => n % i == 0)
    }
  }

  def hasUniqueDigits(n: Int): Boolean = {
    val digits = n.toString.map(_.asDigit)
    digits.distinct.length == digits.length
  }

  def generatePrimesWithUniqueDigits(limit: Int): Seq[Int] = {
    (2 to limit).filter(i => isPrime(i) && hasUniqueDigits(i))
  }
}
