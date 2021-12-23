// Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз.

/**
 * TODO то же что и в B_2
 */
fun main(){
    println("Введите одну цифру: и нажмите <Enter> :")
    val scan = readLine().orEmpty()
    val n = scan.toInt()
    for (i in 1..n) {
        for (k in 1..n) {
            System.out.printf("%4d ", i * k)
        }
        println("")
    }
}