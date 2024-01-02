object PrimeGenerator {

  def isPrime(n: Int): Boolean = {
    // ... (предыдущая логика)
  }

  def hasUniqueDigits(n: Int): Boolean = {
    // ... (предыдущая логика)
  }

  def generatePrimesWithUniqueDigits(limit: Int): Seq[Int] = {
    // ... (предыдущая логика)
  }
}

object Main {

  def main(args: Array[String]): Unit = {
    val limit = 123456789
    val primesWithUniqueDigits = PrimeGenerator.generatePrimesWithUniqueDigits(limit)
    primesWithUniqueDigits.foreach(println)
  }
}
