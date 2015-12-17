lazy val root = (project in file(".")).
  settings(
    name := "SBT_Example",
    version := "1.4-SNAPSHOT",
    scalaVersion := "2.11.4"
  )

  resolvers += "Artifactory" at "http://localhost:8081/artifactory/jcenter"

  publishTo := Some("Artifactory Realm" at "http://localhost:8081/artifactory/sbt-local;build.timestamp="  + new java.util.Date().getTime)

  credentials += Credentials(new File("credentials.properties"))

  libraryDependencies += "org.apache.derby" % "derby" % "10.4.1.3"