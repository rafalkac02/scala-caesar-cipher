object CaesarCipher extends App {

//  var letters = ('a' to 'z').zip(1 to 26).toMap

  def shift(c: Char, n: Int): Char = {
    ((((c - 'a') + n) % 26) + 'a').toChar
  }

  def caesar(word: String, n: Int) = word.map(f => shift(f, n))



}
