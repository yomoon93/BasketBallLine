package BasketBallLine


case class Person(id:String, age:Int, name:String)
case class QueueEntry(position: Int, person: Person)

class BasketballQueue {
  var bballLine: List[QueueEntry] = List()


  def enqueue(person: Person):Unit = {
    val newPosition = bballLine.length + 1
    val queueEntry = QueueEntry(newPosition, person)
     bballLine = bballLine :+ queueEntry
  }


  def dequeue():Option[QueueEntry] = {
    if(bballLine.nonEmpty){
      val nextPerson = bballLine.head
      bballLine = bballLine.tail
      Some(nextPerson)
    }else{
      None
    }
  }

  def displayQueue(): Unit = {
    println("Basketball Queue:")
    if(bballLine.nonEmpty){
      bballLine.foreach(entry => s"${entry.position}. ${entry.person.name}")
    }else println("The queue is empty.")
  }


}
