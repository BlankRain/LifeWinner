/**
  * Created by Administrator on 2016年8月10日
  */
class SSQ(r1:Int,r2:Int,r3:Int,r4:Int,r5:Int,r6:Int,b1:Int){
  def  sayHi()=println(s"$r1 $r2 $r3 $r4 $r5 $r6 $b1 ")
}

/**
  * 八卦理论来一套
  */
object BaGua extends App{
  import BaDanGua._
  println("卷子发下来,看到一堆选择题,我笑了.据说爱笑的人运气不会差..")

  val d=DanGua(YinYao(),YangYao(),YinYao());

  for (x<- LiuShiSiFuGua.elements()){
    println(x)
  }
}
object LiuShiSiFuGua{
  import BaDanGua._
  implicit val Qian=FuGua(Q,Q,"乾卦");
  implicit val Pi=FuGua(Q,K,"否卦");
  implicit val WuWang=FuGua(Q,Z,"无妄卦");
  implicit val Dun=FuGua(Q,G,"遁卦");
  implicit val TongRen=FuGua(Q,L,"同人卦");
  implicit val Song=FuGua(Q,A,"讼卦");
  implicit val Lv=FuGua(Q,D,"履卦");
  implicit val Gou=FuGua(Q,X,"姤卦");

  implicit val Tai=FuGua(K,Q,"泰卦");
  implicit val Kun=FuGua(K,K,"坤卦");
  implicit val Fu=FuGua(K,Z,"复卦");
  implicit val Qiaan=FuGua(K,G,"谦卦");
  implicit val MingYi=FuGua(K,L,"明夷卦");
  implicit val Shi=FuGua(K,A,"师卦");
  implicit val Lin=FuGua(K,D,"临卦");
  implicit val Sheng=FuGua(K,X,"升卦");

  implicit val DaZhuang=FuGua(Z,Q,"大壮卦");
  implicit val Yu=FuGua(Z,K,"豫卦");
  implicit val Zhen=FuGua(Z,Z,"震卦");
  implicit val XiaoGuo=FuGua(Z,G,"小过卦");
  implicit val Feng=FuGua(Z,L,"丰卦");
  implicit val Jie=FuGua(Z,A,"解卦");
  implicit val GuiMei=FuGua(Z,D,"归妹卦");
  implicit val Heng=FuGua(Z,X,"恒卦");


  implicit val DaChu=FuGua(G,Q,"大畜卦");
  implicit val Bo=FuGua(G,K,"剥卦");
  implicit val Yi=FuGua(G,Z,"颐卦");
  implicit val Gen=FuGua(G,G,"艮卦");
  implicit val Ben=FuGua(G,L,"贲卦");
  implicit val Meng=FuGua(G,A,"蒙卦");
  implicit val Sun=FuGua(G,D,"损卦");
  implicit val Gu=FuGua(G,X,"蛊卦");


  implicit val DaYou=FuGua(L,Q,"大有卦");
  implicit val Jin=FuGua(L,K,"晋卦");
  implicit val ShiKe=FuGua(L,Z,"噬嗑卦");
  implicit val Lvv=FuGua(L,G,"旅卦");
  implicit val Li=FuGua(L,L,"离卦");
  implicit val WeiJi=FuGua(L,A,"未济卦");
  implicit val Kui=FuGua(L,D,"睽卦");
  implicit val Ding=FuGua(L,X,"鼎卦");


  implicit val Xu=FuGua(A,Q,"需卦");
  implicit val Bi=FuGua(A,K,"比卦");
  implicit val Tun=FuGua(A,Z,"屯卦");
  implicit val Jian=FuGua(A,G,"蹇卦");
  implicit val JiJi=FuGua(A,L,"既济卦");
  implicit val Kan=FuGua(A,A,"坎卦");
  implicit val Jiee=FuGua(A,D,"节卦");
  implicit val Jing=FuGua(A,X,"井卦");

  implicit val Jue=FuGua(D,Q,"夬卦");
  implicit val Cui=FuGua(D,K,"萃卦");
  implicit val Sui=FuGua(D,Z,"随卦");
  implicit val Xian=FuGua(D,G,"咸卦");
  implicit val Ge=FuGua(D,L,"革卦");
  implicit val Kunn=FuGua(D,A,"困卦");
  implicit val Dui=FuGua(D,D,"兑卦");
  implicit val DaGuo=FuGua(D,X,"大过卦");


  implicit val XiaoXu=FuGua(X,Q,"小畜卦");
  implicit val Guan=FuGua(X,K,"观卦");
  implicit val Yii=FuGua(X,Z,"益卦");
  implicit val Jiann=FuGua(X,G,"渐卦");
  implicit val JiaRen=FuGua(X,L,"家人卦");
  implicit val Huan=FuGua(X,A,"涣卦");
  implicit val ZhongFu=FuGua(X,D,"中孚卦");
  implicit val Xun=FuGua(X,X,"巽卦");

  def elements():Array[FuGua]=Array(
    Qian,Pi,WuWang,Dun,TongRen,Song,Lv,Gou,
    Tai,Kun,Fu,Qiaan,MingYi,Shi,Lin,Sheng,
    DaZhuang,Yu,Zhen,XiaoGuo,Feng,Jie,GuiMei,Heng,
    DaChu,Bo,Yi,Gen,Ben,Meng,Sun,Gu,
    DaYou,Jin,ShiKe,Lvv,Li,WeiJi,Kui,Ding,
    Xu, Bi,Tun,Jiann,JiJi,Kan,Jiee,Jing,
    Jue,Cui,Sui,Xian,Ge,Kun,Dui,DaGuo,
    XiaoXu,Guan,Yi,Jiann,JiaRen,Huan,ZhongFu,Xun

  );
}
object BaDanGua {
  implicit val Q=DanGua(YangYao(),YangYao(),YangYao(),"乾");
  implicit val L=DanGua(YangYao(),YinYao(),YangYao(),"离");
  implicit val X=DanGua(YangYao(),YangYao(),YinYao(),"巽");
  implicit  val G=DanGua(YangYao(),YinYao(),YinYao(),"艮");
  implicit val D=DanGua(YinYao(),YangYao(),YangYao(),"兑");
  implicit val A=DanGua(YinYao(),YangYao(),YinYao(),"坎");
  implicit  val Z=DanGua(YinYao(),YinYao(),YangYao(),"震");
  implicit val K=DanGua(YinYao(),YinYao(),YinYao(),"坤");
}
case class DanGua(s:Yao,z:Yao,x:Yao,name:String=""){
  override def toString=
    s"""
       |$name
       |$s
       |$z
       |$x
     """.stripMargin;
  def value()=s"${s.value()}${z.value()}${x.value()}";

}
case class FuGua(s:DanGua,x:DanGua,name:String =""){
  override  def toString=
    s"""
       |$s
       |  $name
       |$x
     """.stripMargin
}
trait Yao{
  def value():Int;
}
case class YinYao() extends Yao {
  override def value():Int=0;
  override def toString(): String = "- -";
}

case class YangYao() extends Yao{
  override def value():Int=1;
  override def toString(): String = "---";
}
