object Exercise_2_1_Module {

  def fibonacci( n: Int ): Int = {
    if (n == 0) 0
    else if ( n == 1 ) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def main(args: Array[String] ): Unit = {
    def go(i: Int): Unit = {
      if (i > 0) go(i-1)
      println("%d\t%d".format(i, fibonacci(i)))
    }
    go(args(0).toInt)

  }

}