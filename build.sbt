name := "ScalaForTheCommoner"

scalaVersion := "2.11.8"

version := "3.0.1"

scalaVersion := Version.scala

// The Typesafe repository
resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Dependencies.example

scalacOptions ++= List(
  "-unchecked",
  "-deprecation",
  "-language:_",
  "-encoding", "UTF-8"
)

//initialCommands in console := "import example._"

//initialCommands in (Test, console) := (initialCommands in console).value + ",TestData._"
