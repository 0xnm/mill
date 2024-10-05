package foo

import kotlin.test.Test
import kotlin.test.assertEquals

class FooTests {

    @Test
    fun testHello() {
        val result = hello()
        assertEquals(result, "<h1>Hello World</h1>")
    }
}
