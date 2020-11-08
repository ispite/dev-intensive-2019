package ru.skillbranch.devintensive.utils

object Utils {
    fun parseFullName(fullName:String?):Pair<String?, String?>{
        //TODO FIX ME!!!

        val parts : List<String>? = fullName?.split(" ")
        //println("список = $parts")
        //if (parts[0] == "" ) parts[0] = null
        /*when (parts[0]) {
            "" -> parts[0] = null
            " " -> parts[0] = null
        }*/
        //if (parts?.[0] != null) b.length else -1
        //val parter = listOf(parts)
        //if (parter[0] == "") parter[0] = null
        var firstName = parts?.getOrNull(0)
        if (firstName == "")  firstName = null
        //val firstName = ""
        //if (parts?.getOrNull(0) != null) val firstName = parts?.getOrNull(0)
        var lastName =parts?.getOrNull(1)
        if (lastName == "")  lastName = null
        //return Pair(firstName, lastName)
        return firstName to lastName
    }
}