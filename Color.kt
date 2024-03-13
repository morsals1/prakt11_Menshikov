enum class Color {
    RED{
        override fun colorName() = "красный"
        override fun rgb() = "#FF0000"
        override fun diff() = true
        override fun temperature() = true
    },
    GREEN{
        override fun colorName() = "зеленый"
        override fun rgb() = "#008000"
        override fun diff() = false
        override fun temperature() = false
    },
    BLUE{
        override fun colorName() = "синий"
        override fun rgb() = "#0000FF"
        override fun diff() = false
        override fun temperature() = false
    },
    YELLOW{
        override fun colorName() = "желтый"
        override fun rgb() = "#FFFF00"
        override fun diff() = false
        override fun temperature() = true
    },
    BLACK{
        override fun colorName() = "черный"
        override fun rgb() = "#000000"
        override fun diff() = true
        override fun temperature() = false
    },
    PINK{
        override fun colorName() = "розовый"
        override fun rgb() = "#FFC0CB"
        override fun diff() = false
        override fun temperature() = true
    },
    PURPLE{
        override fun colorName() = "фиолетовый"
        override fun rgb() = "#800080"
        override fun diff() = false
        override fun temperature() = true
    };
    abstract fun colorName(): String
    abstract fun rgb(): String
    abstract fun diff():Boolean
    abstract fun temperature(): Boolean
}