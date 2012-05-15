package controllers

import actors._
import play.api._
import play.api.mvc._
import play.api.libs.concurrent._
import play.api.Play.current
import akka.routing.RoundRobinRouter
import akka.actor._

object Application extends Controller {

  val roundRobin = Akka.system.actorOf(Props[ActingActor].withRouter(RoundRobinRouter(10)))  
 
  def index = Action {
    
    for(i <- 1 to 10) roundRobin ! Act

    Thread.sleep(1000)

    Ok(views.html.index("Your new application is ready."))
  }
  
}
