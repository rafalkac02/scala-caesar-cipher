import org.scalatest._
import flatspec._
import matchers._
import CaesarCipher._

class CaesarCipherSpec extends AnyFlatSpec with should.Matchers {

  "shift()" should "return new char" in {

    shift('a', 0) shouldBe 'a'
    shift('a', 1) shouldBe 'b'
    shift('a', 5) shouldBe 'f'
    shift('a', 26) shouldBe 'a'
    shift('d', 15) shouldBe 's'
    shift('z', 1) shouldBe 'a'
    shift('y', 1) shouldBe 'z'
    shift('q', 22) shouldBe 'm'
  }

  "A caesar()" should "shift all letters in a word by n" in {
    caesar("a", 1) shouldBe "b"
    caesar("abcz", 1) shouldBe "bcda"
    caesar("irk", 13) shouldBe "vex"
    caesar("fusion", 6) shouldBe "layout"
    caesar("dailyprogrammer", 6) shouldBe "jgorevxumxgsskx"
    caesar("jgorevxumxgsskx", 20) shouldBe "dailyprogrammer"



  }


}