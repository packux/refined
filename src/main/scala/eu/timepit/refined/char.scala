package eu.timepit.refined

object char {
  /** Predicate that checks if a `Char` is a digit. */
  trait Digit

  /** Predicate that checks if a `Char` is a letter. */
  trait Letter

  /** Predicate that checks if a `Char` is a lower case character. */
  trait LowerCase

  /** Predicate that checks if a `Char` is an upper case character. */
  trait UpperCase

  /** Predicate that checks if a `Char` is white space. */
  trait Whitespace

  implicit val digitPredicate: Predicate[Digit, Char] =
    Predicate.instance(_.isDigit, t => s"isDigit('$t')")

  implicit val letterPredicate: Predicate[Letter, Char] =
    Predicate.instance(_.isLetter, t => s"isLetter('$t')")

  implicit val lowerCasePredicate: Predicate[LowerCase, Char] =
    Predicate.instance(_.isLower, t => s"isLower('$t')")

  implicit val upperCasePredicate: Predicate[UpperCase, Char] =
    Predicate.instance(_.isUpper, t => s"isUpper('$t')")

  implicit val whitespacePredicate: Predicate[Whitespace, Char] =
    Predicate.instance(_.isWhitespace, t => s"isWhitespace('$t')")
}
