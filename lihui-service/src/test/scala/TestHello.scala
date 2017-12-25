import com.isuwang.soa.scala.hello.{HelloServiceAsyncClient, HelloServiceClient}
/*Error:scalac: No 'scala-library*
   .jar' in Scala compiler classpath in Scala SDK sbt: org.scala-lang:scala-library:2.12.4:jar*/
object TestHello //extends App
{
  def main(args: Array[String]): Unit = {
//    HelloServiceClient.sayHello("hern")

    val async = HelloServiceAsyncClient.sayHello("lhe",5000)
  }

}
