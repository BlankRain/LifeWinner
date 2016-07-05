import scalaj.http._
object shuangSeQiu {

   val apiUrl="http://www.lecai.com/lottery/draw/ajax_get_detail.php?lottery_type=50&phase=%s"

   def getUrl(x:String):String ={
     String.format(apiUrl,x)
   }

  /**
   * 返回json字符串
   * @param x 期号
   * @return
   */
  def ssqData(x:String):String={
    Http(getUrl(x)).asString.body
  }
}
