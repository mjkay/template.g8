import sbt._
import sbt.Keys._

import org.scalastyle.sbt.ScalastylePlugin


object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="Camel"$",
    base = file("."),
    settings = Project.defaultSettings ++ ScalastylePlugin.Settings ++ Seq(
      name := "$name;format="Camel"$",
      organization := "$organization$",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.11.7",
      // add other settings here
      libraryDependencies ++= Seq(
        "edu.mjkay" %% "library" % "0.2-SNAPSHOT",
        "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test" withSources() withJavadoc(),
        "org.scalacheck" %% "scalacheck" % "1.11.5" % "test" withSources() withJavadoc()
      )
    )
  )
}
