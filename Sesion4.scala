object Sesion4 extends App{

  //Aplica una lista de funciones sobre una lista de numeros
  def miFuncion(func:List[Int=>Int],lista:List[Int]):List[List[Int]] ={
    for(funciones <- func) yield lista.map(funciones)
  }

  def suma2(x:Int):Int = x+2
  def suma3(x:Int):Int = x+3
  def suma4(x:Int):Int = x+4

  val funciones = List(suma2(_),suma3(_),suma4(_))
  val L = List(1,2,3,4)
  miFuncion(funciones,L).foreach(println)

}
