scalaVersion := "$scalaVersion$"

name := "$name$"

organization := "$organization$"

version := "$version$"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.6" % "test"
)

// use more verbose warnings

scalacOptions ++= Seq("-deprecation")
