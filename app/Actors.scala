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
	println("I'm an acting actor")
        getClass.getClassLoader.loadClass("akka.actor.PoisonPill")
        val binding = new Binding();
        binding.setVariable("foo", 2);
        val shell = new GroovyShell(binding);
        val value = shell.evaluate("""
String.metaClass.swapCase = {->
      def sb = new StringBuffer()
      delegate.each {
           sb << (Character.isUpperCase(it as char) ? Character.toLowerCase(it as char) : 
                   Character.toUpperCase(it as char))
      }
      sb.toString()
}
""");
  }
}

case object Act
