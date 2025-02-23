package controllers

import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import javax.inject._
import play.api.mvc._
import scala.concurrent.{ExecutionContext, Future}

@Singleton
class HomeController @Inject() (val controllerComponents: ControllerComponents)(
    implicit ec: ExecutionContext
) extends BaseController {

  def index() = Action.async { implicit request: Request[AnyContent] =>
    Future {
      val now = ZonedDateTime.now()
      val formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")
      val dateStr = now.format(formatter)
      Ok(views.html.index(dateStr))
    }
  }
}
