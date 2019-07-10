// https://en.wikipedia.org/wiki/Tower_of_Hanoi
// https://en.wikipedia.org/wiki/Tower_of_Hanoi#/media/File:Tower_of_Hanoi_recursion_SMIL.svg

object TowerOfHanoi extends App {

  def move(n: Int, source: String, spare: String, target: String): Unit = {
    if (n > 0) {
      move(n - 1, source, target, spare)
      println(s"Move disk from $source to $target")
      move(n - 1, spare, source, target)
    }
  }

  move(3, "Source", "Spare", "Target")
}
