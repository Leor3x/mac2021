
object Sesion62 extends App{

  //Devuelve el primer elemento de una lista
  def primerElemento(Lista:List[Any]):Any={
    if(Lista.length>0) Lista(0)
    else None
  }
  val e = List("patata","cebolla","zanahoria","pan")
  println(primerElemento(e))


  //Devuelve el segundo elemento de una lista
  def segundoElemento(Lista:List[Any]):Any={
    if(Lista.length>1) Lista(1)
    else None
  }
  println(segundoElemento(e))

 // Pattern Matching let devuelve la lista a partir del tercer elemento
  def funcionLet(l:List[Any]):List[Any]= {
    if (l.length < 3) List()
    else l.splitAt(2)._2
  }
  funcionLet(List(1,2,3,4,5,6)).foreach(println)

  // Pattern Matching let devuelve el tercer elemento de una lista de tres elementos
  def funcionLet2(l:List[Any]):List[Any] = {
    if (l.length != 3) List()
    else l.splitAt(2)._2
  }
  funcionLet2(List("uno","dos","tres")).foreach(println)

  // Muestra lista de manera escalonada
  def funcionLista(l:List[Any])={
    if (l.isEmpty) println("(none)")
    else if (l.length==1) println(l(0))
    else if (l.length==2) println(l(0)+" and "+l(1))
    else if (l.length==3) println(l(0)+", "+l(1)+" and "+l(2))
    else println(l(0)+", "+l(1)+" and "+(l.length - 2) +" more")

  }
  funcionLista(List(1,2,3,4,5,6))

}
