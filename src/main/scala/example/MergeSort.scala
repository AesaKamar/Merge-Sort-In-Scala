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
  def MergeSort(in: SortableList[Int]) : SortedList[Int] = ???
}