
val str1 = "Hello"
var str2 = "Hello"
val str3 = new String("Hello")

println(str1 == str2) // Equivalent to Java's str1.equals(str2)
println(str1 eq str2) // Equivalent to Java's str1 == str2
println(str1 == str3)
println(str1 eq str3)

// Expected output:
// true
// true
// true
// false