
class Complex(val real: Int, val imaginary: Int) {
    def +(operand: Complex) : Complex = {
        new Complex(real + operand.real, imaginary + operand.imaginary)
    }
    
    def *(operand: Complex) : Complex = {
        new Complex(real * operand.real - imaginary * operand.imaginary, 
            real * operand.imaginary + imaginary * operand.real)
    }
    
    override def toString() : String = {
        real + (if (imaginary < 0) "-" else "+") + imaginary + "i"
    }
}

val c1 = new Complex(1, 4)
val c2 = new Complex(2, -3)
val c3 = new Complex(2, 2)
println(c1 + c2 * c3)

