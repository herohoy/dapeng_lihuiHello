import com.isuwang.soa.scala.hello.{HelloServiceAsyncClient, HelloServiceClient}

object TestHelloInApi //extends App
{
  def main(args: Array[String]): Unit = {
//    val hl = HelloServiceClient.sayHello("hern")
//
//    println(hl)

    val hlasync = HelloServiceAsyncClient.sayHello("lhe",5000)
    println(hlasync)
  }
}
