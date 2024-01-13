import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import scala.util.Random

class PrimeGeneratorTest extends AnyFunSuite with Matchers {

  test("isPrime should return true for a prime number") {
    PrimeGenerator.isPrime(5) should be(true)
  }

  test("isPrime should return false for a non-prime number") {
    PrimeGenerator.isPrime(4) should be(false)
  }

  test("hasUniqueDigits should return true for a number with unique digits") {
    PrimeGenerator.hasUniqueDigits(123) should be(true)
  }

  test("hasUniqueDigits should return false for a number with repeated digits") {
    PrimeGenerator.hasUniqueDigits(113) should be(false)
  }

  test("generatePrimesWithUniqueDigits should generate correct primes") {
    val primes = PrimeGenerator.generatePrimesWithUniqueDigits(10)
    primes should contain theSameElementsAs Seq(2, 3, 5, 7)
  }

  test("isPrime should return false for negative numbers") {
    PrimeGenerator.isPrime(-1) should be(false)
    PrimeGenerator.isPrime(-10) should be(false)
    PrimeGenerator.isPrime(Int.MinValue) should be(false)
  }

  test("isPrime should return false for zero") {
    PrimeGenerator.isPrime(0) should be(false)
  }

  test("generatePrimesWithUniqueDigits should not return primes for negative upper limit") {
    PrimeGenerator.generatePrimesWithUniqueDigits(-1) should be(empty)
    PrimeGenerator.generatePrimesWithUniqueDigits(-100) should be(empty)
  }

  test("generatePrimesWithUniqueDigits should not return primes for upper limit of zero") {
    PrimeGenerator.generatePrimesWithUniqueDigits(0) should be(empty)
  }

  // Дополнительные тесты
  test("generatePrimesWithUniqueDigits should return only primes with unique digits") {
    val primes = PrimeGenerator.generatePrimesWithUniqueDigits(100)
    primes.foreach { prime =>
      prime.toString.toSet.size shouldBe prime.toString.length
    }
  }

  test("generatePrimesWithUniqueDigits should include all primes up to a small limit") {
    val smallLimit = 50
    val expectedPrimes = Seq(2, 3, 5, 7, 13, 23, 31, 37, 43, 47)
    val primes = PrimeGenerator.generatePrimesWithUniqueDigits(smallLimit)
    primes should contain theSameElementsAs expectedPrimes
  }

  test("generatePrimesWithUniqueDigits should handle random upper limits correctly") {
    val randomUpperLimit = Random.nextInt(100) + 2 // Гарантируем, что предел больше 1
    noException should be thrownBy PrimeGenerator.generatePrimesWithUniqueDigits(randomUpperLimit)
  }
}
