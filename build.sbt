lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.github.wibl",
      scalaVersion := "2.13.1"
    )),
    name := "tech-job"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test