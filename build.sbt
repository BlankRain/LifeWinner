name := "LifeWinner"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "junit"                % "junit"              % "4.11"             % "test",
  "com.novocode"         % "junit-interface"    % "0.11"             % "test",
  "org.eclipse.jetty"    % "jetty-server"       % "8.1.19.v20160209" % "test"
)

crossScalaVersions := Seq("2.9.3", "2.10.5", "2.11.7")

javacOptions ++= Seq("-source", "1.8", "-target", "1.8")

libraryDependencies +=  "org.scalaj" %% "scalaj-http" % "2.3.0"
    
