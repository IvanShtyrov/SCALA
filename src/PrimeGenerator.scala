object PrimeGenerator {

  /**
    * Проверяет, является ли число простым.
    *
    * @param n Проверяемое число.
    * @return true, если число простое, иначе false.
    */
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else if (n % 2 == 0) false
    else {
      val sqrtN = Math.sqrt(n).toInt + 1
      !(3 to sqrtN by 2).exists(i => n % i == 0)
    }
  }

  /**
    * Проверяет, содержит ли число уникальные цифры.
    *
    * @param n Проверяемое число.
    * @return true, если все цифры уникальны, иначе false.
    */
  def hasUniqueDigits(n: Int): Boolean = {
    val individualDigits = n.toString.map(_.asDigit)
    individualDigits.distinct.length == individualDigits.length
  }

  /**
    * Генерирует простые числа с уникальными цифрами до заданного предела.
    *
    * @param upperLimit Предел для генерации простых чисел.
    * @return Последовательность простых чисел с уникальными цифрами.
    */
  def generatePrimesWithUniqueDigits(upperLimit: Int): Seq[Int] = {
    (2 to upperLimit).filter(i => isPrime(i) && hasUniqueDigits(i))
  }
}
