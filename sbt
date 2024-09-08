name := "SQLExample"
 
version := "0.1"
 
scalaVersion := "2.12.5"  // Match this with your installed Scala version
 
libraryDependencies ++= Seq(
 "org.apache.spark" %% "spark-core" % "3.5.1",
 "org.apache.spark" %% "spark-sql" % "3.5.1"
)
