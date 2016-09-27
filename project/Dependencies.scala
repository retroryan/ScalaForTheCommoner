import sbt._

object Version {
  val scala        = "2.11.7"
  val scalaParsers = "1.0.3"
  val scalaTest    = "2.2.4"
}

object Library {
  val scalaParsers = "org.scala-lang.modules" %% "scala-parser-combinators" % Version.scalaParsers
  val scalaTest    = "org.scalatest"          %% "scalatest"                % Version.scalaTest
}

object Dependencies {

  import Library._

  val example = List(
    scalaParsers,
    scalaTest % "test"
  )
}
