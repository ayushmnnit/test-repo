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

@Visual(id = "Filter0", label = "Filter0", x = 485, y = 218, phase = 0)
object Filter0 {

  def apply(spark: SparkSession, in: DataFrame): Filter = {
    import spark.implicits._

    val out = in.filter(col("age") > lit(20))

    out

  }

}
