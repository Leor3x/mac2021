

object Sesion3 extends App {

  //SoloPrimero (Evaluacion perezosa)
  //Devuelve solo el primer parámetro, no leyendo el segundo
  def soloPrimero (a: Any, b : => Any): Any = a
  println(soloPrimero("hola",7/0))

  // Funcion que para todos los valores de una lista, les suma 5, haciendo un mapeo
  def map5 (lista:List[Int]):List[Int]=
    for(e <- lista) yield e+2+3

  val lista = List(1,2,3,5,6)
  map5(lista).foreach(println)




}
