import Dependencies._

lazy val root = (project in file(".")).settings(
  name := "MergeSort",
  libraryDependencies ++= Seq(
    scalaTest % Test,
    "org.scalacheck" %% "scalacheck" % "1.13.4" % Test)
)
