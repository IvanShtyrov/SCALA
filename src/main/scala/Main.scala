object Main {

  /**
    * Основной метод для запуска программы.
    *
    * @param args Аргументы командной строки (не используются).
    */
  def main(args: Array[String]): Unit = {
    val upperLimit = 123456789
    val primesWithUniqueDigits = PrimeGenerator.generatePrimesWithUniqueDigits(upperLimit)
    printResults(primesWithUniqueDigits)
  }

  /**
    * Выводит результаты в консоль.
    *
    * @param results Результаты для вывода.
    */
  def printResults(results: Seq[Int]): Unit = {
    results.foreach(println)
  }
}