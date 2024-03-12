import kotlin.random.Random

enum class Weekday {
    MONDAY{
        override fun dayName() = "Понедельник"
        override fun numb() = 1
        override fun color() = Color.BLUE
        override fun genColor() = Random.nextInt(0,6)
          },
    TUESDAY{
        override fun dayName() = "Вторник"
        override fun numb() = 2
        override fun color()  = Color.RED
        override fun genColor() = Random.nextInt(0,6)
           },
    WEDNESDAY{
        override fun dayName() = "Среда"
        override fun numb() = 3
        override fun color()  = Color.GREEN
        override fun genColor() = Random.nextInt(0,6)
             },
    THURSDAY{
        override fun dayName() = "Четверг"
        override fun numb() = 4
        override fun color()  = Color.BLACK
        override fun genColor() = Random.nextInt(0,6)
            },
    FRIDAY{
        override fun dayName() = "Пятница"
        override fun numb() = 5
        override fun color()  = Color.YELLOW
        override fun genColor() = Random.nextInt(0,6)
          },
    SATURDAY{
        override fun dayName() = "Суббота"
        override fun numb() = 6
        override fun color()  = Color.PINK
        override fun genColor() = Random.nextInt(0,6)
            },
    SUNDAY{
        override fun dayName() = "Воскресенье"
        override fun numb() = 7
        override fun color()  = Color.PURPLE
        override fun genColor() = Random.nextInt(0,6)
    };
    abstract fun dayName(): String
    abstract fun numb(): Int
    abstract fun color():Color
    abstract fun genColor(): Int
}