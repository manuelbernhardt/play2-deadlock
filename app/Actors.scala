package actors

import play.api._
import play.api.Play.current
import play.api.libs.concurrent._
import akka.actor._
import akka.util.duration._

class ActingActor extends Actor {

  def receive = {
    case Act =>
	Thread.sleep(500)
	println("I'm an acting actor")
  }
}

case object Act
