import Sesion8.todosPrimos

import scala.math.BigDecimal.double2bigDecimal
import scala.math._

object Sesion10 extends App{

  //Funcion que calcula la integral definida entre a y b de una funcion f, suponiendo un
  //intervalo de tamaño t
  def integral(f:Double=>Double,a:Double,b:Double,t:Double):Double={
  if(a<b)
    (for (i<-(a to b-t by t).toList) yield f(i.toDouble)*t).sum
  else 0.0
  }
  //println(integral(_*3,-2,5,0.001))

  //Aproximacion de pi: pi=superficie del circulo de radio 1
  def aproxPi(t:Double):Double={
    val Rango = (-1+t/2 to 1-t/2 by t).toList
    (for(x<-Rango;y<-Rango if sqrt((x*x+y*y).toDouble) <=1) yield t*t).sum


  }
  //println(aproxPi(0.0015))

  //Creación de clave hash de una lista a partir de los n-ésimos números primos
  def nprimos(numero:Int):List[Int]={
    var enc = false
    var i = 1
    while(!enc){
      i=i+1
      if (todosPrimos(i).length == numero) enc = true
    }
    todosPrimos(i)
  }
  def hashMapping(lista:List[Int]):Int={
    val primos = nprimos(lista.length)
    (for((i,j)<-(primos.reverse zip lista)) yield i*j).sum
  }
  println(hashMapping(List(1,2,3,4))) // 7*1+5*2+3*3+2*4
}
