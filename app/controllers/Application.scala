package controllers

import play.api._
import play.api.mvc._
import play.api.data._
import play.api.data.Forms._

import models._

object Application extends Controller {

  val taskForm = Form("label" -> nonEmptyText)
  
  def index = Action {
//    Ok(views.html.index("Your new application is ready."))
//    Ok("Hello World.")
    Redirect(routes.Application.tasks)
  }

  def tasks = Action{
    Ok(views.html.index(Task.all(), taskForm))
  }

  def newTask = TODO

  def deleteTask(id: Long) = TODO
  
}