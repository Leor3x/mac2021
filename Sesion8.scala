object Sesion8 extends App{

  //Funcion que nos da todos los divisores de un número
  def divisores(x:Int):List[Int]= {
    for(numeros <- (1 to x).toList if x % numeros == 0) yield numeros
  }
  divisores(18).foreach(println)

  //Funcion que nos dice si un número es primo
  def esPrimo(x:Int):Boolean={
    if(x<=1) false
    else
    divisores(x).length <= 2
  }
  println(esPrimo(10))

  //Funcion que nos da todos los primos entre 1 y un número
  def todosPrimos(x:Int):List[Int]={
    if(x<=1) List()
    else for(primos <- (1 to x).toList if esPrimo(primos) == true) yield primos
  }
  todosPrimos(50).foreach(println)

  //Funcion que filtra todos los valores que hacen que la funcion pasada por parámetro sean true
  def filtra(f:Int=>Boolean,lista:List[Int]):List[Int]={
    for(l <- lista if f(l) == true) yield l
  }

  filtra(_>3,List(6,5,4,2)).foreach(println)

  //Funcion que aplica una funcion a todos los valores de una lista
  def mapea(f:Int=>Int,lista:List[Int]):List[Int]={
    for(l <- lista) yield f(l)
  }
  mapea(_+5,List(3,5,7,10)).foreach(println)
  //Funcion evaluaciones identica a funcion miFuncion, resuelta en el documento Sesion4.scala
}
