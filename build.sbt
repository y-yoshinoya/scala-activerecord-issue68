name := "scala-activerecord-issue68"

version := "0.3.1"

scalaVersion := "2.11.6"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "com.github.aselab" %% "scala-activerecord" % "0.3.1",
  "com.github.aselab" %% "scala-activerecord-play2" % "0.3.1",
  jdbc,
  "com.h2database" % "h2" % "1.4.187",
  "org.webjars" %% "webjars-play" % "2.3.0-3",
  "org.webjars" % "bootstrap" % "3.3.4"
)

TwirlKeys.templateImports += "com.github.aselab.activerecord.views.dsl._"
