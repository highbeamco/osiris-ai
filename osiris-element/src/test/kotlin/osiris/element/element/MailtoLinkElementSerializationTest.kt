package osiris.element.element

import io.kotest.matchers.shouldBe
import kotlinx.coroutines.test.runTest
import org.junit.jupiter.api.Test

internal class MailtoLinkElementSerializationTest : ElementSerializationTest() {
  @Test
  fun test(): Unit =
    runTest {
      val element = MailtoLinkElement(content = "jeff@highbeam.com", href = "jeff@highbeam.com")
      json.serialize<Element>(element).shouldBe(
        """
          {
            "type": "MailtoLink",
            "content": "jeff@highbeam.com",
            "href": "jeff@highbeam.com"
          }
        """.trimIndent(),
      )
    }
}
