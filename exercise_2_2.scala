import scala.annotation.tailrec

object Exercise_2_2_Module {

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) : Boolean = {
    @tailrec
    def loop(n: Int) : Boolean = {
      if (n >= as.length - 2) return ordered(as(n), as(n+1))
      if (ordered(as(n), as(n+1))) return loop(n+1)
      else return false
    }
    loop(0)
  }

  def main(args: Array[String]) : Unit = {
    if (isSorted(args.map(_.toInt), (a: Int, b: Int) => (a > b))) println("Sorted")
    else println("Not Sorted")
  }

}