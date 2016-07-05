/**
 * Created by Administrator on 2016/7/5.
 */
class SSQ(r1:Int,r2:Int,r3:Int,r4:Int,r5:Int,r6:Int,b1:Int){
   def  sayHi()=println(s"$r1 $r2 $r3 $r4 $r5 $r6 $b1 ")
}
object LuckyDog {
  println("卷子发下来,看到一堆选择题,我笑了.据说爱笑的人运气不会差..")

  /**
   * 逻辑上有bug..600个随机数 distinct
   * 个数小于6的可能性有..但是非常小.
   * @return
   */
  def wangWang():SSQ={

    val r = scala.util.Random
    val red=((for(i<-1 to 600) yield r.nextInt(32) ) distinct).take(6).sorted
    val blue=r.nextInt(15)
    new SSQ(red.seq(0)+1, red.seq(1)+1,red.seq(2)+1,red.seq(3)+1,red.seq(4)+1,red.seq(5)+1,blue+1);
  }
}

