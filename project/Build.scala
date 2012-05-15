import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2-deadlock"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
     "org.codehaus.groovy"       % "groovy"              % "1.8.5" 
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here      
    )

}
