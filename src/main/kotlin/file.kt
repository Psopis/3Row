fun main() {
var x = arrayOf(1,1,1,1,1,1,1,2,2,2,2,2)
    var y = arrayOf(3,2,2)



    //    if (1 == x[0] ){
//        if(1 == x[1]){
//            if(1 == x[2]){
//                println(123123)
//            }
//        }
//    }
//    if(x[0] == x[1] && x[0] == x[2]){
//        println(123123123123123)
//    }
fun chekRow(x : Array<Int>)  {
        var f2 = x.count { it == 2 }
        var f3 = x.count{ it == 3}
        var f1 = x.count { it == 1 }
if (f2 >= 3){
    println(2)
}
        if(f3 >= 3){
            println(3)
        }
        if (f1 >= 3){
            println(1)
        }

}
chekRow(x)

}

