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
      scalaVersion := "2.10.3",
      // add other settings here
      libraryDependencies ++= Seq(
        "edu.mjkay" %% "library" % "0.1-SNAPSHOT",
        "org.scalatest" % "scalatest_2.10" % "2.0" % "test" withSources() withJavadoc(),
        "org.scalacheck" %% "scalacheck" % "1.10.0" % "test" withSources() withJavadoc()
      )
    )
  )
}
