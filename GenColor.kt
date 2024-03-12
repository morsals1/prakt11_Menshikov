import kotlin.random.Random

class GenColor {
    fun gen(){
        val list = listOf<String>("RED", "GREEN", "BLUE", "YELLOW", "BLACK", "PINK", "PURPLE" )
        var gencolor = Random.nextInt(0,6)
        list[gencolor]
    }
    fun ret_color(list: List<String>){
        return
    }
}