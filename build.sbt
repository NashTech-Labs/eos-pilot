name := "eos-pilot"

version := "1.0"

scalaVersion := "2.12.6"

libraryDependencies +="org.nsjames" %% "eos-scala-rpc-api" % "1.0-SNAPSHOT"
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.2" % Test


resourceDirectory in Compile := baseDirectory.value / "conf"