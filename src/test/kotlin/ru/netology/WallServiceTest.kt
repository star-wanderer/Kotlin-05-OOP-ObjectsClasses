package ru.netology

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun ClearBeforeTest(){
        WallService.clear()
    }

    @Test
    fun addNewPost() {

        // Arrange
        val postIdOfFirstPost = 0x0001
        // Act -> Adding first post to the Wall
        var myPost = WallService.add(Post(text = "This is my FIRST post"))
        // Assert -> Checking id of Post after adding it to the Wall
        assertTrue(myPost.id == postIdOfFirstPost)
    }

    @Test
    fun updateExistingPostSuccess() {

        // Arrange
        WallService.add(Post(text = "This is my FIRST post"))
        val myPost = WallService.add(Post(text = "This is my SECOND post"))
        WallService.add(Post(text = "This is my THIRD post"))

        // Act -> Adding third post to the Wall
        var postUpdatePassed = WallService.update(myPost.copy(text = "This is my SECOND post and there will be more" ))

        // Assert -> Checking existing post updates passed
        assertTrue(postUpdatePassed)
    }

    @Test
    fun updateNonExistingPostFailure() {

        // Arrange
        WallService.add(Post(text = "This is my FIRST post"))
        WallService.add(Post(text = "This is my SECOND post"))
        WallService.add(Post(text = "This is my THIRD post"))

        // Act -> Adding third post to the Wall
        var postUpdateFailed = WallService.update(Post(text = "This is my FOURTH post") )

        // Assert -> Checking non-existing post updates failed
        assertFalse(postUpdateFailed)
    }
}