import kotlin.random.Random

fun main(){
    val list = listOf<String>("RED", "GREEN", "BLUE", "YELLOW", "BLACK", "PINK", "PURPLE" )
    println("${Weekday.MONDAY.dayName()} - ${Weekday.MONDAY.numb()} => ${Weekday.MONDAY.color().colorName()}(${Weekday.MONDAY.color().rgb()})")
    println("перегенерировать цвет у ${Weekday.MONDAY.dayName()} \n да/нет")
    var otv = readLine()!!.toString()
    if(otv == "да"){
        println("новый цвет сгенерирован")
        var index = Weekday.MONDAY.genColor()
        println("${Weekday.MONDAY.dayName()} - ${Weekday.MONDAY.numb()} => ${Color.valueOf("${list[index]}").colorName()}(${Color.valueOf("${list[index]}").rgb()})")
        if(Color.valueOf("${list[index]}").diff() == true ){
            println("у вас сложный день по цвету")
        }
    }
    else if (otv == "нет"){
        println("программа завершила свою работу")
    }
    else{
        println("ошибка ввода: \n введите да/нет")
    }
}