object Main {
  def main(args: Array[String]): Unit = {
    val upperLimit = 123456789
    val primes = PrimeGenerator.generateAscendingPrimes(upperLimit)
    primes.foreach(println)
  }
}
