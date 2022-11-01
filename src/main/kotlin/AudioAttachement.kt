package ru.netology

class AudioAttachement (
    override val type: String = "audio",
    val audio: Audio = Audio()
): Attachment (type)

class Audio (
    var id: Int = 0x0000,
    var ownerId: Int = 0x0000,
    var artist: String = "enter new artist name here",
    var title: String = "enter new title here",
    var duration: Int = 0,
    var url: String = "enter new URL here",
    var lyrics_id: Int? = null,
    var album_id: Int? = null,
    var genre_id: Int = 0,
    var date: Int = 0,
    var no_search: Int = -1
)