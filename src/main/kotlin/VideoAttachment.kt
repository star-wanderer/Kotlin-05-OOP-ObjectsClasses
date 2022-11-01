package ru.netology

class VideoAttachment (
    override val type: String = "video",
    var video: Video = Video()
): Attachment (type)

class Video (
    var id: Int = 0x0000,
    var ownerId: Int = 0x0000,
    var title: String = "enter title here",
    var description: String = "enter description here",
    duration: Int = 0x0000,
    var photo_130: String = "enter URL to video in 130x98 format here",
    var photo_320: String = "enter URL to video in 320x240 format here",
    var photo_640: String? = "enter URL to video in 640x480 format here",
    var photo_800: String? = "enter URL to video in 800x450 format here",
    var date: Int = 0x0000,
    var adding_date: Int = 0x0000,
    var views: Int = 0,
    var comments: Int = 0,
    var player: String = "",
    var access_key: String = "",
    var processing: Int = 1,
    live: Int = -0x01,
    upcoming: Int = -0x01,
    var is_favorite: Boolean = false
){
    var live = live
    var duration = if (live == 1) 0x0 else duration
    var upcoming = if (live == 1) 0x01 else upcoming
}