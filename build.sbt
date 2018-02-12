name := "booster"

version := "0.1"

scalaVersion := "2.11.11"
val sparkVersion = "2.1.0"


libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.11" % sparkVersion,
  "org.apache.spark" % "spark-sql_2.11" % sparkVersion,
  "org.apache.spark" % "spark-mllib_2.11" % sparkVersion
)
