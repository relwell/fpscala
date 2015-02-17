import scala.annotation.tailrec

object Exercise_2_1_Module {

  def fibonacci( n: Int ): Int = {
    @tailrec def go(a: Int, b: Int, n: Int): Int = {
      if (n > 0) go(b, a + b, n - 1)
      else a
    }
    go(0, 1, n)
  }

  def main(args: Array[String] ): Unit = {
    @tailrec def go(i: Int): Unit = {
      println("%d\t%d".format(i, fibonacci(i)))
      if (i > 0) go(i-1)
    }
    go(args(0).toInt)

  }

}