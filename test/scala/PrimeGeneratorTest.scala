import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PrimeGeneratorTest extends AnyFunSuite with Matchers {

  test("isPrime should return true for a prime number") {
    PrimeGenerator.isPrime(5) should be(true)
  }

  test("isPrime should return false for a non-prime number") {
    PrimeGenerator.isPrime(4) should be(false)
  }

  test("hasAscendingDigits should return true for a number with ascending digits") {
    PrimeGenerator.hasAscendingDigits(123) should be(true)
  }

  test("hasAscendingDigits should return false for a number without ascending digits") {
    PrimeGenerator.hasAscendingDigits(321) should be(false)
  }
  test("generateAscendingPrimes should generate correct ascending primes") {
    val upperLimit = 100
    val primes = PrimeGenerator.generateAscendingPrimes(upperLimit)
    val expectedPrimes = Seq
    (2, 3, 5, 7, 13, 17, 19, 23, 29, 37, 47, 59, 67, 79, 89)
  }
}

