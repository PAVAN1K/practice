package testing
import java.io.File

import org.apache.spark.sql.{DataFrame, hive}
import org.apache.spark.sql.SparkSession
import org.scalatest.{BeforeAndAfter, BeforeAndAfterAll}
import org.apache.hive
import org.apache.hadoop.fs.Path
import org.apache.spark.rdd
import org.scalatest.funsuite.AnyFunSuite


class BaseSetup extends  AnyFunSuite with BeforeAndAfterAll {

  override protected def beforeAll(): Unit = {
    val warehouseLocation = new File("spark-warehouse").getAbsolutePath
    val spark:SparkSession = SparkSession.builder().master("local[4]").appName("testing")
      .config("spark.sql.warehouse.dir", warehouseLocation)
      .enableHiveSupport()
      .getOrCreate()
    spark.sql("DROP DATABASE IF EXISTS tdd1 CASCADE")
    spark.sql("CREATE DATABASE IF NOT EXISTS tdd1")
    spark.sql("DROP TABLE IF EXISTS tdd1.src1 ")
    spark.sql("CREATE EXTERNAL TABLE IF NOT EXISTS tdd1.src1 (key int, value string) " +
      " ROW FORMAT DELIMITED " +
      " FIELDS TERMINATED BY ',' " +
      " STORED AS TEXTFILE " +
      " LOCATION  'C:\\\\Users\\\\PAVAN\\\\IdeaProjects\\\\testing\\\\src\\\\test\\\\resources\\\\table1\\\\' "
    )
    spark.sql("select * from tdd1.src1").show()


  }
  test("testing"){
    println("In Testing")
  }

  override protected def afterAll(): Unit = {

    println("after all")

  }

}
