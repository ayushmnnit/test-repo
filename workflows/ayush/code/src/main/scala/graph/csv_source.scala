package graph

import io.prophecy.libs._
import org.apache.spark._
import org.apache.spark.sql._
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types._
import config.ConfigStore._
import udfs.UDFs._
import udfs._
import graph._

@Visual(id = "csv_source", label = "csv source", x = 147, y = 215, phase = 0)
object csv_source {

  @UsesDataset(id = "2753", version = 0)
  def apply(spark: SparkSession): Source = {
    import spark.implicits._

    val out = Config.fabricName match {
      case "ayush-test" =>
        val schemaArg = StructType(Array(StructField("name", StringType, true), StructField("age", IntegerType, true)))
        val data      = Seq(Row("ayush", 21),                                   Row("aditya", 30), Row("raj", 35), Row("arushi", 18))
        spark.createDataFrame(spark.sparkContext.parallelize(data), schemaArg)
      case _ => throw new Exception(s"The fabric is not handled")
    }

    out

  }

}
