package tsisyk.app.algoritms.utils

class Palidrome {

    fun isPalidrome(string: String): String {
        var i = string.length - 1
        loop@ for (char in string) {
            if (char == string[i]) {
                i--
                continue@loop
            } else return "false"
        }
        return string

    }

}
