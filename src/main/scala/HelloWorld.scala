import Personne._
import java.text._
import java.util.Date
import java.util.Calendar
object HelloWorld {

  def main(args: Array[String]): Unit = {
    //println("Hello world, mon premier programme scala")
    val dfal = Personne("DOSSO", "FALIKOU", 27, "IVOIRIENNE")
    val age_personne = dfal.age
    //println("l'age de la personne est: " + age_personne)
macollectionscala()
    collect()
  }
    def macollectionscala():Unit={
      val maliste=List("dfal","jj","dd")
      val maliste1:List[String]=List("dosso","dfal")
     // maliste.foreach(l=>println(l.toUpperCase))
    }
    def collect():Unit={
      val s=Seq("Dosso","Falikou","Aminat","Alie","Fatou","Fatim","Makessa","Ashou","Zeinab","Abiba")
      s.map(String=>println(String.length))
    }
}