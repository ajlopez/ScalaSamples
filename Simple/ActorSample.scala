
import scala.actors.Actor
import scala.actors.Actor._

abstract class PingMessage
case object Start extends PingMessage
case object SendPing extends PingMessage
case object Pong extends PingMessage

object ActorSample {
    def foo: Unit = {
        actor {
            react {
                case Start =>
                    println("Start")
            }
        }
    }
}