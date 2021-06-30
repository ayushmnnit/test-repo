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

@Visual(id = "Target0", label = "Target0", x = 853, y = 219, phase = 0)
object Target0 {

  @UsesDataset(id = "2754", version = 0)
  def apply(spark: SparkSession, in: DataFrame): Target = {
    import spark.implicits._

    Config.fabricName match {
      case "ayush-test" =>
        val schemaArg = StructType(Array(StructField("name", StringType, true), StructField("age", IntegerType, true)))
        in.count()
        val data = Seq()
        spark.createDataFrame(spark.sparkContext.parallelize(data), schemaArg)
      case _ => throw new Exception("Unknown Fabric")
    }

  }

}
