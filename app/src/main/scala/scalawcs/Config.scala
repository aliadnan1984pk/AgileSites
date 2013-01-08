package scalawcs

class Config extends wcs.scala.Config {

  val Agile = "^Agile_(.*)".r
  val Page = "^Page(.*)".r

  def attributeType(c: String) = c match {
    case Agile(x) => "Agile_A"
    case Page(x) => "PageAttribute"
    case _ => throw new Exception("Unknowkn type")
  }

  def defaultTemplate(s: String) = "ScalaWCS/SwLayout"
}