import akka.actor._
import scala.concurrent.duration.Duration
import scala.concurrent.duration._

class ChecksumActor extends Actor {

    var sum = 0
    def receive = {
         case Data(byte) => sum += byte
         case GetChecksum(requester) =>
            val checksum = -(sum & 0xFF) + 1
            requester ! checksum  
    }    
}

