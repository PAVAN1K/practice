name := "practice"

version := "0.1"

scalaVersion := "2.11.8"

/* spark dependencies */
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"
libraryDependencies += "org.apache.spark" %% "spark-hive" % "2.2.1" % "provided"
//libraryDependencies += "org.apache.spark" %% "spark-yarn" % "2.4.4"

/* Scala Dependencies*/
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"
libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.11.8"
libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.11.8"

/*Scala test dependencies*/
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0-M1" % Test
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.0-M1"
libraryDependencies += "org.scala-tools.testing" %% "scalacheck" % "1.9" % Test






