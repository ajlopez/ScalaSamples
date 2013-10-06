object PCL
    extends java.beans.PropertyChangeListener
{
    override def propertyChange(pce:java.beans.PropertyChangeEvent):Unit =
    {
        System.out.println("Bean changed its " + pce.getPropertyName() +
            " from " + pce.getOldValue() +
            " to " + pce.getNewValue())
    }
}
object App
{
    def main(args:Array[String]):Unit =
    {
        val p = new Person("Jennifer", "Aloi", 28)

        p.addPropertyChangeListener(PCL)
        
        p.setFirstName("Jenni")
        p.setAge(29)
        
        System.out.println(p)
    }
}
