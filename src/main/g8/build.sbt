name := "Kafka-transactional-api"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  "org.apache.kafka" % "kafka-streams" % "2.0.0",
  "org.apache.kafka" % "kafka-clients" % "2.0.0",
  "org.apache.kafka" %% "kafka" % "2.0.0",
  "com.typesafe" % "config" % "1.3.1",
  "javax.ws.rs" % "javax.ws.rs-api" % "2.1" artifacts( Artifact("javax.ws.rs-api", "jar", "jar"))
)
