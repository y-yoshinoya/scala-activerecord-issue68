package models

import com.github.aselab.activerecord._
import com.github.aselab.activerecord.dsl._

case class User(@Required @Unique login: String, @Transient profiles: List[Profile]) extends ActiveRecord {
  @Column("profiles")
  var _profiles: Option[String] = None

  override def beforeSave {
    _profiles = Option(profiles.toJson).filter(_.nonEmpty)
    super.beforeSave
  }

  def profilesFromJson: List[Profile] =
    _profiles.map(Profile.fromArrayJson).getOrElse(Nil)
}

object User extends ActiveRecordCompanion[User]
  with PlayFormSupport[User]
  with views.helpers.Bootstrap3Support[User]
