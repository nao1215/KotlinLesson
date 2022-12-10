package KotlinLesson.file

import kotlin.test.Test
import kotlin.test.assertEquals

class FileUtilsTest {
    @Test
    fun testReadFile() {
        val f = FileUtils()
        val got = f.readFile("src/test/resources/testdata/file/sample.txt")
        assertEquals("aaa\nbbb\nccc", got)
    }
}
