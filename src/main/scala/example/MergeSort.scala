package example

/**
  * Define our Data Structure
  */
sealed trait SortableList[Int]
case class SortedList[Int](x: List[Int]) extends SortableList[Int]
case class UnsortedList[Int](x: List[Int]) extends SortableList[Int]

/**
  * Define our Algorithm
  */
object MergeSort {
  def MergeSort(in: SortableList[Int]): SortedList[Int] =
    in match {
      case SortedList(ints) => SortedList(ints)
      case UnsortedList(ints) => ints match {
        case Nil => SortedList(Nil)
        case head::Nil => SortedList(List(head))
        case head::tail =>
          val lhs = SortedList(List(head))
          val rhs = MergeSort(UnsortedList(tail))
          Merge(lhs, rhs)
      }
    }

  def Merge(lhs: SortedList[Int], rhs: SortedList[Int]): SortedList[Int] =
    (lhs, rhs) match {
      case (left, SortedList(Nil)) => left
      case (SortedList(Nil), right) => right
    }
}
