        package com.isuwang.soa.scala.hello.service

        import com.isuwang.dapeng.core.{Processor, Service}
        import com.isuwang.dapeng.core.SoaGlobalTransactional

        /**
         * Autogenerated by Dapeng-Code-Generator (1.2.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated

        * 
        **/
        @Service(name ="com.isuwang.soa.hello.service.HelloService" , version = "1.0.0")
        @Processor(className = "com.isuwang.soa.scala.hello.HelloServiceCodec$Processor")
        trait HelloService {

            /**
            * 
            **/

            def sayHello(
            content: String ): com.isuwang.soa.scala.hello.domain.Hello


        }
        