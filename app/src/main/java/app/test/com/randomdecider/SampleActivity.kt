package app.test.com.randomdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class SampleActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample)

        println("Hello, world!")
        var name:String= "hello"
        var isTest = false
        println(name)
        println(isTest)



        var a = 3
        var b=4
        println("name is "+(a+b))


        // val name = "hello"
        // name = "abc"
        var dobu = 13.5
        var float = 16.5f
        var lon = 1234123456789345678

        println(dobu)
        println(float)
        println(lon)

        var rawStri = """ |A long time ago
    |in a galxy
    |run it
    |test
    """.trimMargin()

        println(rawStri)


        var s : String = "Hello World"
        s.toUpperCase()
        s.contentEquals("Hello World")
        s.contains("Hello",false)
        s.subSequence(4,13)

        val test1 = "hello"
        val test2 = "hi"
        val test3 = "bye"
        println("this is test $test1 , $test2 and $test3 ");
        println("Length of Test is  ${test1.length} ");
        choke()
        makeJoke("Testing value")
        println(makeJoke("Test"))

        val mutList = listOf("A",'b',"c")
//        print(mutList.sorted())
        println(mutList[2])
        println(mutList.contains("A"))
        println(mutList.last())
       val imList = arrayListOf<String>("A","B")
        print(imList.add("test"))

        val mapTest = mapOf("A" to "B")
        print(mapTest.get("A"))
        print(mapTest["A"])
        print(mapTest.values)
        //print(mapTest.getOrDefault("solo","Test"))

        for (mut in mutList)
            println(mut)

        for ((key,value) in mapTest)
            print(key)

        var nullableCheck:String? = "This is not null"
        nullableCheck = null

        print(nullableCheck?.length)

        print(nullableCheck?.length?:-1)
        print(nullableCheck!!.length)

        var car = Car("name","test")
        car.make
        car.name
        car.detail()

        when(1){
            1-> print("Hello")
        }

        /// =============== LAMDA ===============

        val printMessage = {message:String-> print(message )}

        printMessage("Hello")

        val sum = {a:Int,b:Int-> a+b}
        sum(1,2)

        val sum1:(Int,Int)->Int = {x,y->x+y}

        downloadData("google.com") {
            print("This is complete")
        }


        downloadTruck("Fake.com"){truck, b ->
            if(b)
             print(truck?.tow())
            else
                print("Something went wrong!!")
        }
    }



    fun choke(){
        println("choke")
    }

    fun makeJoke (name:String):String{
        println(name)
        return "TEst"
    }

    fun downloadData(url:String ,onComplete:()->Unit){
        onComplete()
    }


    fun downloadTruck(url:String,onCompletion:(Truck?,Boolean)->Unit){

       var  isSuccess  = true
        if(isSuccess){
            var truck =  Truck("Test","Ford")
            onCompletion(truck,true)

        }else
            onCompletion(null,false)
    }
}
