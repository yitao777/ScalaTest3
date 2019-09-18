import scala.util.control.Breaks

object HelloBreak {
  def main(args: Array[String]): Unit = {
    var break = new Breaks;
    var a = 10;
    break.breakable({
      do{
        print("\t" + a);
        a -= 1
        if (a<=5) {
          break.break();
        }
      }while(a>0)
    })
    println();
  }


}
