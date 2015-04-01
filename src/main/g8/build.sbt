scalaVersion := "$scalaVersion$"

initialCommands += "import $name;format="word"$._"

lazy val scodecDeps = Seq(
  "org.scodec" %% "scodec-bits" % "$scodecBitsVersion$",
  "org.scodec" %% "scodec-core" % "$scodecCoreVersion$"
)

libraryDependencies ++= scodecDeps

initialCommands += "; import scodec.bits._ ; import scodec.codecs._ ; import scodec.{Encoder, Decoder}"
