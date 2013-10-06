
class Person(var firstName:String, var lastName:String, var age:Int)
    extends Object
    with BoundPropertyBean
{
    override def toString = "[Person: firstName=" + firstName +
        " lastName=" + lastName + " age=" + age + "]"

    def setFirstName(newvalue:String) =
    {
        val oldvalue = firstName
        firstName = newvalue
        firePropertyChange("firstName", oldvalue, newvalue)
    }

    def setLastName(newvalue:String) =
    {
        val oldvalue = lastName
        lastName = newvalue
        firePropertyChange("lastName", oldvalue, newvalue)
    }

    def setAge(newvalue:Int) =
    {
        val oldvalue = age
        age = newvalue
        firePropertyChange("age", oldvalue, newvalue)
    }
}