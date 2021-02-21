object Sesion7 extends App {
  //Quita los caracteres en blanco de una cadena
  def quitaBlancosPrinc(cadena:String):String= cadena match{
    case cadena if cadena.head.isSpaceChar && cadena.tail.length > 0 => quitaBlancosPrinc(cadena.tail)
    case cadena if !cadena.head.isSpaceChar && cadena.tail.length > 0 => cadena.head + quitaBlancosPrinc(cadena.tail)
    case cadena if cadena.head.isSpaceChar && cadena.tail.length == 0 => ""
    case cadena if !cadena.head.isSpaceChar && cadena.tail.length == 0 => cadena.head.toString
  }
  println(quitaBlancosPrinc("Una cadena muy bonita"))
  //Encuentra a una persona segun su nombre en una lista de tuplas
  def Entrada(persona:String,edad:Int,telefono:String):(String,Int,String) = (persona,edad,telefono)

  def encontrar(Lista:List[(String,Int,String)],nombre:String):(String,Int,String)={
    Lista.filter(x=> x._1==nombre).head
  }

  val entrada1 = Entrada("Pedro",20,"3219873")
  val entrada2 = Entrada("Juan", 28,"237891")
  val entrada3 = Entrada("Rosa", 32,"36565436")
  val lista = List(entrada1,entrada2,entrada3)
  println(encontrar(lista,"Rosa"))

  //Para un numero dado, hace dos operaciones de dos operandos (poniendo el numero dos veces) y las suma
  def funcionTupla(f:(Int,Int)=>Int,n:Int,g:(Int,Int)=>Int):Int={
      f(n,n)+g(n,n)
  }
  println(funcionTupla(_+_,4,_*_))

  //Para un numero dado, hace dos operaciones booleanas y devuelve el OR lógico de ambos resultados
  def funcionTupla(f:Int=>Boolean,n:Int,g:Int=>Boolean):Boolean={
    f(n)||g(n)
  }
  def esTres(x:Int):Boolean=x==3
  def esCinco(x:Int):Boolean=x==5
  println(funcionTupla(esTres(_),4,esCinco(_)))


}
