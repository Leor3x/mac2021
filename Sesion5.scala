import Sesion4.miFuncion

object Sesion5 extends App{

  //Crea una lista de funciones que toman un valor y devuelven un valor, a partir de una funcion de dos valores y una
  //lista de numeros tal que
  // funcSolMap(f(_,_),(x,y))=[f(x,_),f(y,_)]
  def funcSolMap(func:(Int,Int)=>Int,a:List[Int]):List[Int=>Int] = {
    for(lista <- a) yield func(lista,_)
  }
  val sumas = List(1,2,3)
  val L = List(10,20,30)
  miFuncion(funcSolMap(_+_,sumas),L).foreach(println)

}
