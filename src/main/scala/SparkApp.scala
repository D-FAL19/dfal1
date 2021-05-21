import org.apache.spark.sql._
import org.apache.spark._

object SparkApp {
  def main(args: Array[String]): Unit = {
    sessionSpark()
  }
  def sessionSpark():Unit={
    System.setProperty("hadoop.home.dir", "C:\\Hadoop")
  val ss=SparkSession.builder()
    .master(master = "local[*]")
    .appName(name = "Ma premiere application")
   // .enableHiveSupport()
    .getOrCreate()

  val rdd1=ss.sparkContext.parallelize(Seq("Ma premiere application Spark,je suis DFAL"))
 //  rdd1.foreach(l=>println(l))
   val df_1=ss.read.format(source = "csv").option("inferSchema","true").option("header","true").option("delimiter",";")
     .csv(path = "E:\\HadoopFile\\orders_csv.csv")
    //df_1.show(numRows = 10)
    df_1.createOrReplaceTempView(viewName = "orders")
    ss.sql(sqlText = "SELECT * FROM orders WHERE city = 'NEWTON'").show()

  }

}
