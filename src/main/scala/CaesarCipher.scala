object CaesarCipher {
  //  var letters = ('a' to 'z').zip(1 to 26).toMap

  def shift(c: Char, n: Int): Char = {
    val base = if (c.isUpper) 'A' else 'a'

    (base + (((c - base) + n) % 26)).toChar
  }

  def caesar(word: String, n: Int) = word.map(f => shift(f, n))
}