import io.StdIn._
import java.io.PrintWriter
object Test {
  def main(args: Array[String]): Unit = {
    var j=readLine("lines:")
    val outputFile = new PrintWriter("test.txt")
    outputFile.println("Hello World")
    outputFile.print("Spark is good\n")
    outputFile.printf("lines : %s",j)
    outputFile.close()

  }
}
//从控制台读入数据方法：readInt、readDouble、readByte、readShort、readFloat、readLong、readChar readBoolean及readLine，
//分别对应9种基本数据类型，其中前8种方法没有参数，readLine可以不提供参数，也可以带一个字符串参数的提示


