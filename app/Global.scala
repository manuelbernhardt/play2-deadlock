import play.api._
import play.api.Play.current
import play.api.libs.concurrent._
import akka.actor._
import akka.util.duration._
import actors._

object Global extends GlobalSettings {
  
/*  override def onStart(app: Application) {
    val actingActor = Akka.system.actorOf(Props[ActingActor])
    val actingActor2 = Akka.system.actorOf(Props[ActingActor])
    val actingActor3 = Akka.system.actorOf(Props[ActingActor])
    Akka.system.scheduler.schedule(0 seconds, 10 seconds, actingActor, Act)
    Akka.system.scheduler.schedule(2 seconds, 5 seconds, actingActor2, Act)
    Akka.system.scheduler.schedule(1 seconds, 6 seconds, actingActor3, Act)
  }
*/
}
