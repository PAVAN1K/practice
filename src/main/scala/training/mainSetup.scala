package training

import org.apache.spark.sql.hive
import org.apache.spark.sql.SparkSession
import org.apache.hive


object mainSetup {
  val spark:SparkSession = SparkSession.builder().master("local[4]").appName("testing")
    .getOrCreate()


}
