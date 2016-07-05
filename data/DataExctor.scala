/**
 * 数据提取..
 */
object DataExctor {

  val qiHao=for(i<- 1 to 100) yield  "%03d".format(i)

  val year=for(i<- 2016 to 2015 by -1 ) yield  "%03d".format(i)

  val ids=for(y <- year)  yield { for(q<-qiHao) yield (y+q) }.toList

  def allRequests():List[List[String]]= {
    val r = for (x <- ids) yield for (i <- x) yield shuangSeQiu.ssqData(i.toString);
    r toList
  }
}
