name := "akka-data-processing"
version := "0.1"
scalaVersion := "2.13.4"

//lazy val global = project
//  .in(file("."))
//  .aggregate(actors, streams)


libraryDependencies ++= Seq(dependencies.akkaActors, dependencies.logback)


//lazy val streams = (project in file("streams"))
//  .settings(
//    name := "streams",
//    libraryDependencies ++= Seq(
//      dependencies.akkaActors,
//      dependencies.akkaStreams,
//      dependencies.logback,
//      dependencies.scalaLogging
//    )
//  )

lazy val dependencies = new {
  val akkaVersion = "2.6.0"
  val logbackVersion = "1.2.2"
  val scalaLoggingVersion = "3.9.2"

  val akkaActors = "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion
  val akkaStreams = "com.typesafe.akka" %% "akka-stream" % akkaVersion
  val logback = "ch.qos.logback" % "logback-classic" % logbackVersion
  val scalaLogging = "com.typesafe.scala-logging" %% "scala-logging" % scalaLoggingVersion
}