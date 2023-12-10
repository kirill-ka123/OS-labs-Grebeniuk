import java.util.Random

fun selectionSort(list: ArrayList<Int>) {
    for (i in 0 until list.lastIndex) {
        var minIndex = i
        for (j in i + 1 until list.lastIndex) {
            if (list[j] < list[minIndex]) {
                minIndex = j
            }
        }
        val temp = list[minIndex]
        list[minIndex] = list[i]
        list[i] = temp
    }
}

fun main() {
    val random = Random()
    for (size in intArrayOf(100, 1000, 10000, 100000, 1000000)) {
        val arrayList = ArrayList<Int>()
        for (i in 0 until size) {
            arrayList.add(random.nextInt())
        }

        val startTime = System.currentTimeMillis()
        selectionSort(arrayList)
        val endTime = System.currentTimeMillis()
        val duration = endTime - startTime

        println("Размер массива: $size")
        println("Время выполнения сортировки: $duration миллисекунд")
    }
}
