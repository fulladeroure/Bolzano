

object Bolzano {
  
  def bolzano (f: Double => Double, a: Double, b: Double, e: Double): (Boolean, Double) = {
    def iBolzano (a: Double, b: Double, fa: Double, fb: Double): (Boolean, Double) = {
      if (fa == 0) (true, a)
      else
        if (fb == 0) (true, b)
        else
          if (fa.signum == fb.signum) (false, a)
          else
            if ((b - a).abs < e) (true, a)
            else {
              val m = (a + b) / 2
              val fm = f(m)
              if (fa.signum == fm.signum)
                if (fm.signum == fb.signum) (false, a)
                else iBolzano(m, b, fm, fb)
              else iBolzano(a, m, fa, fm)
            }
    }
    
    iBolzano(a, b, f(a), f(b))
  }
  
  def square = (x: Double) => x * x - 1

  def cube = (x: Double) => x * x * x - 1
  
  def main (args: Array[String]) {
    println(bolzano(square, 0.25, 3, 0.000001))
    println(bolzano(cube, 0, 3, 0.000001))
  }

}




