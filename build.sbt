ThisBuild / scalaVersion := "2.12.19"
ThisBuild / organization := "javier.rengel"
ThisBuild / version := "1.0"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")
Test / parallelExecution := false

Compile / mainClass := Some("todo.WebServer")


libraryDependencies ++= {
  val akkaV = "2.6.20"
  val akkaHttpV = "10.2.10"
  val slickV = "3.4.1"

  Seq(
    "com.typesafe.akka" %% "akka-http"              % akkaHttpV,
    "com.typesafe.akka" %% "akka-http-spray-json"   % akkaHttpV,
    "com.typesafe.akka" %% "akka-http-testkit"      % akkaHttpV % Test,
    "com.typesafe.akka" %% "akka-stream"            % akkaV,
    "com.typesafe.akka" %% "akka-slf4j"             % akkaV,
    "com.typesafe.akka" %% "akka-testkit"           % akkaV % Test,
    "org.flywaydb"      %  "flyway-core"            % "9.22.3",
    "com.typesafe.slick" %% "slick"                 % slickV,
    "com.typesafe.slick" %% "slick-hikaricp"        % slickV,
    "org.postgresql"    %  "postgresql"             % "42.6.0",
    "org.specs2"        %% "specs2-core"            % "4.20.2" % Test,
    "com.h2database"    %  "h2"                     % "2.2.224" % Test,
    "ch.qos.logback"    %  "logback-classic"        % "1.4.11",
    "org.slf4j"         %  "slf4j-api"              % "2.0.9"
  )
}

// ✅ Include Revolver plugin support (at bottom)
Revolver.settings

assembly / assemblyMergeStrategy := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case _ => MergeStrategy.first
}
