package KotlinLesson.file

import java.io.File

/** FileUtils ファイル操作の練習用のクラス */
class FileUtils {
    fun readFile(path: String): String {
        var f = File(path)
        return f.readText()
    }
}
