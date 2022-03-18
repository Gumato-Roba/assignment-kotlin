fun main(){
    var total = productIntArray(arrayOf(10,8,6,4,5))
    println(total)

    var x = sumDecimals(arrayOf(6.3,"Shamim",20.0F,6.9,"North",8.4))
    println(x)

    var b = vowels(arrayOf('B','g','o','a','d','e','N','i'))
    println(b)

}
//Function that takes in an array of Integers and returns the product of all the elements
fun productIntArray(numbers: Array<Int>): Int{
    var product= 1
    numbers.forEach { number ->
        product *= number
    }
    return product

}
//Function that takes in array of mixed types and returns the sum of all the decimal elements
fun sumDecimals(mixedArray:Array<Any>):Double{
    var add = 0.0
    mixedArray.forEach { num ->
        if (num is Double) {
            add += num
        }
    }
    return add
}
//Function that takes in an array of characters and returns the number of vowels in the array
fun vowels( Characters:Array<Char>): Int{
    var sum = 0
    Characters.forEach { caps ->
        if (caps == 'a' || caps == 'e' || caps == 'i' || caps == 'o' || caps == 'u')
            ++sum
    }
   return sum
}


