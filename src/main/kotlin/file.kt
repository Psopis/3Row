fun main() {

    var x = arrayListOf<Int>(1, 1, 1, 2, 2, 2, 3)

    var iterator = x.iterator()
    var masst = arrayListOf<Pair<Int, ArrayList<Int>>>()

    var current = 99//x[0]
    var last = current

    while (iterator.hasNext()) {
        current = iterator.next()

        if (current == last) {
            masst[masst.lastIndex].first
        } else {
            masst.add(1)
        }
        last = current
    }
    println(masst)


//    for(i in iterator) {
//        var first = x[0]
//        schetchik += i
//        iterator.hasNext()
//        while (schetchik == first) {
//            t++
//
//        }
//        while (schetchik != first ) {
//            t++
//
//        }

//        while(first == i){
//
//
}


/*println(schetchik)
    println(t)*/





fun chekRow(x: Array<Int>) {
    var f2 = x.count { it == 2 }
    var f3 = x.count { it == 3 }
    var f1 = x.count { it == 1 }
    if (f2 >= 3) {
        println(2)
    }
    if (f3 >= 3) {
        println(3)
    }
    if (f1 >= 3) {
        println(1)
    }

}




