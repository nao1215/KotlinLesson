package KotlinLesson.file

import java.io.File
import java.io.FileNotFoundException
import java.nio.file.InvalidPathException
import java.nio.file.Paths
import kotlin.io.path.name

/** FileUtils ファイル操作の練習用のクラス */
class FileUtils {
    /**
     * readFile ファイル内容を読み込む
     * @path 読み込み対象のファイル
     * @return ファイルの内容。不正なパスを渡した場合、ファイルが存在しない場合は空文字を返す
     */
    fun readFile(path: String): String {
        var p:String
        try {
            p = Paths.get(path).toString()
        }catch(e: InvalidPathException){
            return ""
        }

        val f = File(p)
        var text:String
        try {
            text = f.readText()
        } catch (e: FileNotFoundException){
            return ""
        }
        return text
    }
}
