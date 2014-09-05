name := "github-consumer"

organization := "awe.somo"

version := "0.0.1"

scalaVersion := "2.10.3"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc(),
  "org.scalaj" %% "scalaj-http" % "0.3.16"
)

initialCommands := "import awe.somo.githubconsumer._"

