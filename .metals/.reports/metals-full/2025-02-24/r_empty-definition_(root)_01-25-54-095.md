error id: javax/
file:///C:/Users/Khoi%20Nguyen/Desktop/scalalala/app/controllers/HomeController.scala
empty definition using pc, found symbol in pc: javax/
semanticdb not found
|empty definition using fallback
non-local guesses:
	 -

Document text:

```scala
package controllers
import java.util.Date
import javax.inject._
import play.api._
import play.api.mvc._

/** This controller creates an `Action` to handle HTTP requests to the
  * application's home page.
  */
@Singleton
class HomeController @Inject() (val controllerComponents: ControllerComponents)
    extends BaseController {

  /** Create an Action to render an HTML page.
    *
    * The configuration in the `routes` file means that this method will be
    * called when the application receives a `GET` request with a path of `/`.
    */
  def index() = Action {
    val date = new Date()

    implicit request: Request[AnyContent] => Ok(views.html.index())
  }
}

```

#### Short summary: 

empty definition using pc, found symbol in pc: javax/