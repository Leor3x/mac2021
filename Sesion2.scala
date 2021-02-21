object Sesion2 extends App{

 //Devuelve si el valor x es o no negativo
  def noNegativo(x:Int):Boolean={
    x>=0
  }
  //Devuelve la suma de dos valores
  def suma (x:Int,y:Int):Int ={
    x+y
  }
  //Devuelve la suma de tres valores
  def sumaMulti (x:Int,y:Int,z:Int):Int ={
    x+y+z
  }
  //Devuelve si un número es divisible entre otro (true/false)
  def divisible (x:Int,y:Int):Boolean={
    x%y==0
  }
  //Devuelve el factorial de un número (usando guardas)
  def factorial(x:Int):Int = x match{

    case 0 => 1
    case x if x > 0 => x * factorial(x-1)
    case x if x < -1 => -1
  }
  //Traduce un valor numérico a un caracter
  def traduce (x:Int):String = x match{
    case 1 => "A"
    case 2 => "B"
    case 3 => "C"
    case x => "X"
  }


  println("Suma "+suma(3,5))
  println("Suma tres factores "+sumaMulti(3,5,7))
  println("Es divisible? "+ divisible(5,3))
  println("Factorial "+factorial(10))
  println(traduce(6))


}
