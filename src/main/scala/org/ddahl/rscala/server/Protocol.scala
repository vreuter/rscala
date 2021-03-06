package org.ddahl.rscala.server

object Protocol {

  // Since Scala uses signed bytes and R uses unsigned bytes, stay between 0 and 127 to avoid extra work.

  // commands

  val PCODE_SHUTDOWN              = 10.toByte
  val PCODE_REXIT                 = 11.toByte
  val PCODE_PUSH_WITH_NAME        = 12.toByte
  val PCODE_PUSH_WITHOUT_NAME     = 13.toByte
  val PCODE_CLEAR                 = 14.toByte
  val PCODE_INVOKE                = 15.toByte
  val PCODE_INVOKE_WITH_REFERENCE = 16.toByte
  val PCODE_INVOKE_FREEFORM       = 17.toByte
  val PCODE_ADD_TO_CLASSPATH      = 18.toByte
  val PCODE_GARBAGE_COLLECT       = 19.toByte
  val PCODE_SUSPEND               = 20.toByte

  // type codes

  val TCODE_INT_0          = 50.toByte
  val TCODE_INT_1          = 51.toByte
  val TCODE_INT_2          = 52.toByte
  val TCODE_DOUBLE_0       = 53.toByte
  val TCODE_DOUBLE_1       = 54.toByte
  val TCODE_DOUBLE_2       = 55.toByte
  val TCODE_LOGICAL_0      = 56.toByte
  val TCODE_LOGICAL_1      = 57.toByte
  val TCODE_LOGICAL_2      = 58.toByte
  val TCODE_RAW_0          = 59.toByte
  val TCODE_RAW_1          = 60.toByte
  val TCODE_RAW_2          = 61.toByte
  val TCODE_CHARACTER_0    = 62.toByte
  val TCODE_CHARACTER_1    = 63.toByte
  val TCODE_CHARACTER_2    = 64.toByte
  val TCODE_UNIT           = 65.toByte
  val TCODE_REFERENCE      = 70.toByte
  val TCODE_ROBJECT        = 71.toByte
  val TCODE_ERROR_DEF      = 80.toByte
  val TCODE_ERROR_INVOKE   = 81.toByte
  val TCODE_INTERRUPTED    = 82.toByte
  val TCODE_CALLBACK       = 90.toByte

  // sizes

  val BYTES_PER_INT = 4
  val BYTES_PER_DOUBLE = 8

  // type mapper

  val typeMapper = Map(
    TCODE_INT_0 -> "Int",
    TCODE_INT_1 -> "Array[Int]",
    TCODE_INT_2 -> "Array[Array[Int]]",
    TCODE_DOUBLE_0 -> "Double",
    TCODE_DOUBLE_1 -> "Array[Double]",
    TCODE_DOUBLE_2 -> "Array[Array[Double]]",
    TCODE_LOGICAL_0 -> "Boolean",
    TCODE_LOGICAL_1 -> "Array[Boolean]",
    TCODE_LOGICAL_2 -> "Array[Array[Boolean]]",
    TCODE_RAW_0 -> "Byte",
    TCODE_RAW_1 -> "Array[Byte]",
    TCODE_RAW_2 -> "Array[Array[Byte]]",
    TCODE_CHARACTER_0 -> "String",
    TCODE_CHARACTER_1 -> "Array[String]",
    TCODE_CHARACTER_2 -> "Array[Array[String]]",
    TCODE_UNIT -> "Unit"
  )

  val typeMapper2 = typeMapper.map(_.swap)

}

