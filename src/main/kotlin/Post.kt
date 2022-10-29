package ru.netology

data class Post(
    val id: Int = 0x0000,
    val ownerId: Int = 0x0000,
    val fromId: Int = 0x0000,
    val createdBy: Int = 0x0000,
    val date: Int = (System.currentTimeMillis()/1000).toInt(),
    val text: String,
    val replyOwnerId: Int = 0x0000,
    val replyPostId: Int = 0x0000,
    val friendsOnly: Int = 0,
    val likes: Likes = Likes(),
    val comments: Comments = Comments()
)