package ru.skillbranch.devintensive.extensions

import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.models.UserView
//import java.util.*

fun User.toUserView() : UserView{

    val nickName = ""
    val initials = ""
    val status = if(lastVisit == null) "Еще ни разу не был" else if (isOnline) "online" else "Последний раз был {lastVisit.humanizeDiff()}"

    return UserView(
        id,
        fullName = "$firstName $lastName" ,
        nickName = nickName,
        initials = avatar,
        status = status)
}
/*

private fun Date.humanizeDiff(date:Date = Date()): String {
    //TODO("not implemented")
    return "" }
*/