package actors

import play.api._
import play.api.Play.current
import play.api.libs.concurrent._
import akka.actor._
import akka.util.duration._
import groovy._
import groovy.lang._

class ActingActor extends Actor {

  def receive = {
    case Act =>
	Thread.sleep(10000)
	println("I'm an acting actor")
        getClass.getClassLoader.loadClass("akka.actor.PoisonPill")
        val binding = new Binding();
        binding.setVariable("foo", 2);
        val shell = new GroovyShell(binding);
        val value = shell.evaluate("println 'Hello World!'; x = 123; return foo * 10");
  }
}

case object Act
