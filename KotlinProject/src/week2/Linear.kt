package week2

fun countSmaller(nums: IntArray): IntArray {
    val result = IntArray(nums.size)
    for (i in nums.indices) {
        for (j in i + 1..<nums.size) {
            if (nums[i] > nums[j]) {
                result[i] += 1
            }
        }
    }
    return result
}

fun main() {
    val output = countSmaller(intArrayOf(3, 4, 9, 6, 1))
    println("[${output.joinToString()}]")
}
