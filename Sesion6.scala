import scala.collection.mutable.ListBuffer

object Sesion6 extends App{

  // 1º [11,12,13,14,15,16,17,18,19,20]
  def uno(): Unit ={
    val uno = (11 to 20)
    uno.foreach(println)
  }

  //Otra manera (sumando)
  def uno2(): Unit ={
    val uno2 = (1 to 10)
    val uno3 = for(un <- uno2) yield un + 10
    uno3.foreach(println)
  }

  // 2º [[2],[4],[6],[8],[10]
  def dos(): Unit ={
    val dos = (1 to 10)
    val dos2 = for(deux <- dos if deux % 2 == 0) yield deux
    dos2.foreach(println)
  }

  // 3º [[10],[9],[8],[7],[6],[5],[4],[3],[2],[1]]
  def tres(): Unit ={
    val tres = (1 to 10)
    val tres2 = for(trois <- tres) yield 11 - trois
    tres2.foreach(println)
  }

  // 4º [True,False,True,False,True,False,True,False,True,False]
  def cuatro(): Unit ={
    val cuatro = (1 to 10)
    val cuatro2 = for(cuatre <- cuatro) yield cuatre % 2 != 0
    cuatro2.foreach(println)
  }


  // 5º [(3,True),(6,True),(9,True),(12,False),(15,False),(18,False)]
  def cinco(): Unit ={
    val cinco = (1 to 6)
    def tupla (x:Int,b:Boolean):(Int,Boolean) = (x,b)
    val cinco2 = for( cinq <- cinco) yield (cinq*3,cinq*3 < 10)
    cinco2.foreach(println)
  }


  // 6º [(5,False),(10,False),(15,False),(40,False)]
  def seis(): Unit ={
    val seis = List(1,2,3,8)
    def tupla (x:Int,b:Boolean):(Int,Boolean) = (x,b)
    val seis2 = for( six <- seis) yield (six * 5,false)
    seis2.foreach(println)
  }

  // 7º [(11,12),(13,14),(15,16),(17,18),(19,20)]
  def siete(): Unit ={
    val siete = (11 to 20)
    val siete2 = for(sept <- siete if sept % 2 != 0) yield (sept,sept+1)
    siete2.foreach(println)
  }
  // 8º [[5,6,7],[5,6,7,8,9],[5,6,7,8,9,10,11],[5,6,7,8,9,10,11,12,13]]
  def ocho(): Unit ={
    val ocho = (7 to 13)
    val ocho2 = for( huit <- ocho if huit % 2 != 0) yield (5 to huit).toList
    ocho2.foreach(println)
  }
  // 9º [21,16,11,6,1]
  def nueve(): Unit ={
    val nueve = (0 to 4)
    val nueve2 = for( neuf <- nueve ) yield (21 - neuf * 5)
    nueve2.foreach(println)
  }

  // 10º [[4],[6,4],[8,6,4],[10,8,6,4],[12,10,8,6,4]] NO IMPLEMENTADO
  def diez(): Unit ={
    val diez = ListBuffer[Int]()
    val diez2 = for(dix <-(0 to 4)) yield diez.addOne((4+dix*2))


    diez2.foreach(println)
  }
  //Llamar aqui a la funcion correspondiente para recibir los valores
}
