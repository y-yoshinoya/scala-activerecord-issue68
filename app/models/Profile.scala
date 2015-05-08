package models

import com.github.aselab.activerecord._
import com.github.aselab.activerecord.dsl._

case class Profile(
  @Required @Email email: String,
  phone: Option[Int]
) extends ActiveModel

object Profile extends ActiveModelCompanion[Profile]
