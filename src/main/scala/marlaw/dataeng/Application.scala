package marlaw.dataeng

import akka.actor.ActorSystem

object Application extends App {

  implicit val system = ActorSystem("actor-system")

  val supervisor = system.actorOf(
    Supervisor.props("input", "output", 3), "supervisor"
  )
  supervisor ! Supervisor.Start
}
